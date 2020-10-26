package ex04.sample3;

import lombok.Getter;

import java.util.Set;

@Getter
public class Category {

    private Long id;
    private Set<Product> products; //다른 애그리거트에 대한 1:N 연관

}