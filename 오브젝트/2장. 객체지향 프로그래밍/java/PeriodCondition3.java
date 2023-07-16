import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition3 implements DiscountCondition3 {

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition3(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening3 screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
                startTime.isBefore(screening.getStartTime().toLocalTime()) &&
                endTime.isAfter(screening.getStartTime().toLocalTime());

    }

}
