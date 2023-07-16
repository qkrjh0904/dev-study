import java.util.List;

public class ReservationAgency {
    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Movie movie = screening.getMovie();

        boolean discountable = false;

        List<DiscountCondition> discountConditions = movie.getDiscountConditions();
        for (DiscountCondition discountCondition : discountConditions) {
            if (discountCondition.getType().equals(DiscountConditionType.PERIOD)) {
                discountable = screening.getWhenScreened().getDayOfWeek().equals(discountCondition.getDayOfWeek()) &&
                        discountCondition.getStartTime().isBefore(screening.getWhenScreened().toLocalTime()) &&
                        discountCondition.getEndTime().isAfter(screening.getWhenScreened().toLocalTime());
            } else {
                discountable = discountCondition.getSequence() == screening.getSequence();
            }

            if (discountable) {
                break;
            }
        }

        Money fee;
        if (discountable) {
            Money discountAmount = Money.ZERO;
            switch (movie.getMovieType()) {
                case AMOUNT_DISCOUNT:
                    discountAmount = movie.getDiscountAmount();
                    break;
                case PERCENT_DISCOUNT:
                    discountAmount = movie.getFee().times(movie.getDiscountPercent());
                    break;
                case NONE_DISCOUNT:
                    break;
            }
            fee = movie.getFee().minus(discountAmount);
        } else {
            fee = movie.getFee();
        }

        return new Reservation(customer, screening, fee, audienceCount);

    }
}
