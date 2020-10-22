package ex03.sample1;



public class Order {

    private OrderState state;

    //애그리거트 루트는 도메인 규칙을 구현한 기능을 제공한다.
    public void changeShippingInfo(ShippingInfo newShippingInfo){
        verifyNotYetShipped();
        setShippingInfo(newShippingInfo);
    }

    private void verifyNotYetShipped() {
        if(state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING ){
            throw new IllegalStateException("aleady shipped");
        }
    }

    private void setShippingInfo(ShippingInfo newShippingInfo) {

    }
}
