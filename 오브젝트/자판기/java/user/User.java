package user;

import bevarage.Item;

public class User {
    private Bag bag;
    private Wallet wallet;

    public void initMoney(int cashCount, int coinCount) {
        wallet = new Wallet(cashCount, coinCount);
    }

    public int getBalance() {
        return wallet.getTotalAmount();
    }

    public int takeCashOutOfWallet(int count) {
        return wallet.takeCashOut(count);
    }

    public int takeCoinOutOfWallet(int count) {
        return wallet.takeCoinOut(count);
    }

    public void putInBag(Item item) {
        bag.put(item);
    }
}
