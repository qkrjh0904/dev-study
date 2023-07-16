import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Movie3 avatar = new Movie3("아바타", Duration.ofMinutes(120), Money3.wons(10000),
                new AmountDiscountPolicy3(Money3.wons(800),
                        List.of(new SequenceCondition3(1),
                                new SequenceCondition3(10),
                                new PeriodCondition3(DayOfWeek.MONDAY, LocalTime.of(10, 0), LocalTime.of(11, 59)),
                                new PeriodCondition3(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(20, 59))
                        )
                )
        );

        Movie3 titanic = new Movie3("타이타닉", Duration.ofMinutes(180), Money3.wons(11000),
                new PercentDiscountPolicy3(0.1,
                        List.of(new SequenceCondition3(1),
                                new SequenceCondition3(10),
                                new PeriodCondition3(DayOfWeek.TUESDAY, LocalTime.of(14, 0), LocalTime.of(16, 59)),
                                new PeriodCondition3(DayOfWeek.THURSDAY, LocalTime.of(10, 0), LocalTime.of(13, 59))
                        )
                )
        );

        new Movie3("스타워즈", Duration.ofMinutes(210), Money3.wons(10000),
                new NoneDiscountPolicy3());
    }

}
