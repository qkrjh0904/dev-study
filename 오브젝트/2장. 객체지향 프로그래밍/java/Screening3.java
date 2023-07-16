import java.time.LocalDateTime;

public class Screening3 {

    // 외부에서는 객체 속성에 접근할 수 없도록 private으로 설정
    private Movie3 movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening3(Movie3 movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    // public 메서드를 통해서만 내부 속성에 접근할 수 있다.
    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money3 getMovieFee() {
        return movie.getFee();
    }

    public Reservation3 reserve(Customer3 customer, int audienceCount) {
        return new Reservation3(customer, this, calculateFee(audienceCount), audienceCount);
    }

    public Money3 calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }
}