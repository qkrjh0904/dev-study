import bevarage.Beverage;
import bevarage.Item;
import user.User;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        VendingMachine vendingMachine = new VendingMachine();
        User user = new User();
        user.initMoney(5, 1);
        user.getBalance();

        print(user, vendingMachine);

        vendingMachine.pushMoney(user.takeCashOutOfWallet(4));
        print(user, vendingMachine);

        vendingMachine.pushMoney(user.takeCoinOutOfWallet(1));
        print(user, vendingMachine);

        Beverage 콜라 = vendingMachine.select("콜라");
        user.putInBag(콜라);
        print(user, vendingMachine);

        Beverage 환타 = vendingMachine.select("환타");
        user.putInBag(환타);
        print(user, vendingMachine);

        Beverage 물 = vendingMachine.select("물");
        user.putInBag(물);
        print(user, vendingMachine);

        Beverage 물2 = vendingMachine.select("물");
        user.putInBag(물2);
        print(user, vendingMachine);

        user.putCoinInWallet(vendingMachine.returnTheChange());
        print(user, vendingMachine);
    }

    private static void print(User user, VendingMachine vendingMachine) {
        System.out.println("Vending Machine 잔액 : " + vendingMachine.getBalance());
        System.out.println("User 잔액 : " + user.getBalance() + " (Cash: " + user.getCashCount() + ", Coin: " + user.getCoinCount() + ")");

        List<String> itemList = user.getBagStatus().stream()
                .map(Item::getName)
                .collect(Collectors.toList());
        System.out.println("가방 상태: " + itemList);
        System.out.println();
    }
}
