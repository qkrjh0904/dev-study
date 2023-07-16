public class SequenceCondition3 implements DiscountCondition3 {

    private int sequence;

    public SequenceCondition3(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening3 screening) {
        return screening.isSequence(sequence);
    }

}
