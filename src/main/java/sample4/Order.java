package sample4;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> orderLines = new ArrayList<OrderLine>();
    private Moeny totalAmounts;
    private ShippingInfo shippingInfo;
    private OrderState state;

    public Order(List<OrderLine> orderLines, ShippingInfo shippingInfo) {
        setOrderLines(orderLines);
        setShippingInfo(shippingInfo);
    }

    private void setShippingInfo(ShippingInfo shippingInfo) {
        if(shippingInfo == null){
            throw new IllegalArgumentException("no ShippingInfo");
        }
        this.shippingInfo = shippingInfo;
    }


    public void setOrderLines(List<OrderLine> orderLines) {
        verifyAtLeastOneOrMoreOrderLines(orderLines);
        this.orderLines = orderLines;
        calculateTotalAmounts();
    }

//    private void calculateTotalAmounts() {
//        this.totalAmounts = new Moeny(orderLines.stream().mapToInt(x -> x.getAmounts().getValue()).sum();
//    }

    private void calculateTotalAmounts() {
        final int sum = orderLines.stream().mapToInt(x -> x.getAmounts()).sum();
        this.totalAmounts = new Moeny(sum);
    }

    private void verifyAtLeastOneOrMoreOrderLines(List<OrderLine> orderLines) {
        if(orderLines == null || orderLines.isEmpty()){
            throw new IllegalArgumentException("no OrderLine");
        }
    }

    public void changeShippingInfo(ShippingInfo newShippingInfo){
        verifyNotYetShipped();
        setShippingInfo(newShippingInfo);
    }

    public void cancel(){
        verifyNotYetShipped();
        this.state = OrderState.CANCELED;
    }

    private void verifyNotYetShipped() {
        if(state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING ){
            throw new IllegalStateException("aleady shipped");
        }
    }


}
