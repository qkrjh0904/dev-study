package bevarage;

public class Water extends Beverage {
    @Override
    public int getPrice() {
        return 500;
    }

    @Override
    public String getName() {
        return "물";
    }
}
