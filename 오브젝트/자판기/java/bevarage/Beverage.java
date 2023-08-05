package bevarage;

// 음료
public abstract class Beverage implements Item {
    int count = 3;

    // TODO: 2023-08-05 전략패턴으로 수정해보기
    public static Beverage select(String name) {
        switch (name) {
            case "콜라":
                return new Coke();
            case "제로콜라":
                return new ZeroCoke();
            case "환타":
                return new Fanta();
            case "물":
                return new Water();
            case "데자와":
                return new Tejava();
            default:
                throw new IllegalArgumentException("일치하는 Beverage 가 없습니다.");
        }
    }

    public abstract int getPrice();

    public void checkStock() {
        if (count < 1) {
            throw new IllegalArgumentException("재고가 부족합니다.");
        }
    }

    public void subtract() {
        this.count -= 1;
    }

}
