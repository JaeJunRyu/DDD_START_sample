package ex01.sample6;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Orderer orderer;
    private List<OrderLine> orderLines = new ArrayList<>();
    private ShippingInfo shippingInfo;
    private OrderState state;
    private int totalAmounts;

    public Order(Orderer orderer, List<OrderLine> orderLines, ShippingInfo shippingInfo, OrderState state) {
        setOrderer(orderer);
        setOrderLines(orderLines);
    }

    private void setOrderLines(List<OrderLine> orderLines) {
        verifyAtLeastOneOrMoreOrderLines(orderLines);
        this.orderLines = orderLines;
        calculateTotalAmounts();
    }

    private void calculateTotalAmounts() {
        this.totalAmounts = orderLines.stream().mapToInt(x -> x.getAmounts()).sum();
    }


    private void verifyAtLeastOneOrMoreOrderLines(List<OrderLine> orderLines) {
    }


    private void setOrderer(Orderer orderer) {
        if(orderer == null){
            throw new IllegalArgumentException("no orderer");
        }
        this.orderer = orderer;
    }



}
