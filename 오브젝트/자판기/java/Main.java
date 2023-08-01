import bevarage.Beverage;
import user.User;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        User user = new User();
        user.initMoney(5, 1);
        user.getBalance();

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.pushMoney(user.takeCashOutOfWallet(2));
        vendingMachine.pushMoney(user.takeCoinOutOfWallet(1));

        Beverage beverage = vendingMachine.select("콜라");


    }
}
