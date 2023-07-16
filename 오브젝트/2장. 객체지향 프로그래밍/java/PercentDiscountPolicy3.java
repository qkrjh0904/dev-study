import java.util.List;

public class PercentDiscountPolicy3 extends DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy3(double percent, List<DiscountCondition3> conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money3 getDiscountAmount(Screening3 screening) {
        return screening.getMovieFee().times(percent);
    }
}
