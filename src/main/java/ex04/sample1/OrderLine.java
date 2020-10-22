package ex04.sample1;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class OrderLine {
    private Integer price;
    private Integer quantity;

    private List<OrderLine> lines = new ArrayList<>();

    public Money getTotalAmounts() {
        return new Money();
    }

    public void changeOrderLines(List<OrderLine> newLines){
        this.lines = newLines;
    }
}
