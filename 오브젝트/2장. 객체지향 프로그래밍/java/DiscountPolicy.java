import java.util.ArrayList;
import java.util.List;

public abstract class DiscountPolicy {

    private List<DiscountCondition3> conditions = new ArrayList<>();

    public DiscountPolicy(List<DiscountCondition3> discountConditions) {
        this.conditions = discountConditions;
    }

    public Money3 calculateDiscountAmount(Screening3 screening) {
        for (DiscountCondition3 condition : conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money3.ZERO;
    }

    abstract protected Money3 getDiscountAmount(Screening3 screening);
}
