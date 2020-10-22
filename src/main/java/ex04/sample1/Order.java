package ex04.sample1;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private Money totalAmounts;
    private List<OrderLine> orderLines = new ArrayList<>();
    private OrderLine orderLine;
    private Orderer orderer;

    private void calculateTotalAmounts(){
        int sum = orderLines.stream()
                .mapToInt(ol -> ol.getPrice() * ol.getQuantity())
                .sum();
        this.totalAmounts = new Money(sum);
    }

    public void changeOrderLines(List<OrderLine> newLines){
        orderLine.changeOrderLines(newLines);
        this.totalAmounts = orderLine.getTotalAmounts();
    }

    public void shipTo(ShippingInfo newShippingInfo) {

    }
}
