import java.time.Duration;
import java.util.Objects;

public class Movie3 {

    private String title;
    private Duration runningTime;
    private Money3 fee;
    private DiscountPolicy discountPolicy;

    public Movie3(String title, Duration runningTime, Money3 fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money3 getFee() {
        return fee;
    }

    public Money3 calculateMovieFee(Screening3 screening) {
        if (Objects.isNull(discountPolicy)) {
            return fee;
        }
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

}