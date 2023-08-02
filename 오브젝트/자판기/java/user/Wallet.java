package user;

public class Wallet {
    private int cashCount;
    private int coinCount;

    public Wallet(int cashCount, int coinCount) {
        this.cashCount = cashCount;
        this.coinCount = coinCount;
    }

    public int getTotalAmount() {
        return calculateCashAmount(cashCount) + calculateCoinAmount(coinCount);
    }

    public int takeCashOut(int count) {
        if (cashCount < count) {
            throw new IllegalArgumentException("Cash 가 부족합니다.");
        }

        this.cashCount -= count;
        return calculateCashAmount(count);
    }

    public int takeCoinOut(int count) {
        if (coinCount < count) {
            throw new IllegalArgumentException("Coin 이 부족합니다.");
        }

        this.coinCount -= count;
        return calculateCoinAmount(count);
    }

    private int calculateCashAmount(int count) {
        return count * 1000;
    }

    private int calculateCoinAmount(int count) {
        return count * 500;
    }

    public void putCoin(int coinCount) {
        this.coinCount += coinCount;
    }

    public int getCashCount() {
        return cashCount;
    }

    public int getCoinCount() {
        return coinCount;
    }
}
