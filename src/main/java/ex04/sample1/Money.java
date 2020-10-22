package ex04.sample1;

import lombok.Getter;

@Getter
public class Money {
    private Integer value;

    public Money() {
    }

    public Money(Integer value) {
        this.value = value;
    }
}
