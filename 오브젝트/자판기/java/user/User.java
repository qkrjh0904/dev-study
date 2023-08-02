package user;

import bevarage.Item;

import java.util.List;

public class User {
    private Bag bag;
    private Wallet wallet;

    public User() {
        this.bag = new Bag();
    }

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

    public void putCoinInWallet(int coinCount) {
        wallet.putCoin(coinCount);
    }

    public int getCashCount() {
        return wallet.getCashCount();
    }

    public int getCoinCount() {
        return wallet.getCoinCount();
    }

    public List<Item> getBagStatus() {
        return bag.getItems();
    }
}
