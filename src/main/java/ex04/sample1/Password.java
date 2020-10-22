package ex04.sample1;

import lombok.Getter;

@Getter
public class Password {
    private String value;

    public Password(String value) {
        this.value = value;
    }

    public boolean match(String currentPassword) {
        return false;
    }
}
