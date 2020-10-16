package ex02.sample2;

public class MutableMoney {
    private int value;

    public MutableMoney(int value) {
        this.value = value;
    }

    public Money toImmutableMoney() {
        return new Money();
    }
}
