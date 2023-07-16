import java.util.List;

public class AmountDiscountPolicy3 extends DiscountPolicy {

    private Money3 discountAmount;

    public AmountDiscountPolicy3(Money3 discountAmount, List<DiscountCondition3> conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money3 getDiscountAmount(Screening3 screening) {
        return discountAmount;
    }
}
