package bevarage;

public class Coke extends Beverage {
    @Override
    public int getPrice() {
        return 1500;
    }

    @Override
    public String getName() {
        return "콜라";
    }
}
