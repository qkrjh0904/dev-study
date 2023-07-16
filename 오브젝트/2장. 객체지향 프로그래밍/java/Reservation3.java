public class Reservation3 {

    private Customer3 customer;
    private Screening3 screening;
    private Money3 fee;
    private int audienceCount;

    public Reservation3(Customer3 customer, Screening3 screening, Money3 fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }

}