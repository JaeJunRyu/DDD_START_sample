package ex01.sample5;

public class Money {

    private int value;

    public Money(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Money add(Money money){
        return new Money(this.value + money.value);
    }

    public Money multiply(int multiplier){
        return new Money(value * multiplier);
    }
}
