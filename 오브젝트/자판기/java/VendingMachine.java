import bevarage.Beverage;

import java.util.List;

// 자판기
public class VendingMachine {
    private int balance;
    private List<Beverage> beverages;

    public VendingMachine() {
        this.balance = 0;
//        this.beverages = List.of(new Coke(), new )
    }

    public void pushMoney(int money) {
        this.balance += money;
    }

    public Beverage select(String name) {
        Beverage beverage = Beverage.select(name);
        checkBalance(beverage);
        beverage.checkStock();
        beverage.subtract();
        subtractBalance(beverage);
        return beverage;
    }

    private void subtractBalance(Beverage beverage) {
        this.balance -= beverage.getPrice();
    }

    private void checkBalance(Beverage beverage) {
        if (this.balance < beverage.getPrice()) {
            throw new IllegalArgumentException("잔액이 부족합니다.");
        }
    }
}
