package bevarage;

public class ZeroCoke extends Beverage {
    @Override
    public int getPrice() {
        return 1500;
    }

    @Override
    public String getName() {
        return "제로콜라";
    }
}
