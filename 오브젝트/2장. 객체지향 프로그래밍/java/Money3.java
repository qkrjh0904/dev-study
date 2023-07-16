import java.math.BigDecimal;

public class Money3 {

    public static final Money3 ZERO = Money3.wons(0);

    private final BigDecimal amount;

    public Money3(BigDecimal amount) {
        this.amount = amount;
    }

    public static Money3 wons(long amount) {
        return new Money3(BigDecimal.valueOf(amount));
    }

    public Money3 plus(Money3 money) {
        return new Money3(this.amount.add(money.amount));
    }

    public Money3 minus(Money3 money) {
        return new Money3(this.amount.subtract(money.amount));
    }

    public Money3 times(double percent) {
        return new Money3(this.amount.multiply(BigDecimal.valueOf(percent)));
    }

    public boolean isLessThan(Money3 money) {
        return amount.compareTo(money.amount) < 0;
    }

    public boolean isGreaterThanOrEqual(Money3 money) {
        return amount.compareTo(money.amount) >= 0;
    }

}