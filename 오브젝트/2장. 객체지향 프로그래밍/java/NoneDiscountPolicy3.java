import java.util.ArrayList;

public class NoneDiscountPolicy3 extends DiscountPolicy {

    public NoneDiscountPolicy3() {
        super(new ArrayList<>());
    }

    @Override
    protected Money3 getDiscountAmount(Screening3 screening) {
        return Money3.ZERO;
    }

}
