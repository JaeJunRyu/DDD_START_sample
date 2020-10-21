package ex02.sample3;

public class Order {
    //주문 도메인 모델의 데이터
    private OrderNo number;
    private Orderer orderer;
    private ShippingInfo shippingInfo;

    //도메인 모델 엔티티는 도메인 기능도 함께 제공
    public void changeShippingInfo(ShippingInfo newShippingInfo){
        checkShippingInfoChangeable();
        setShippingInfo(newShippingInfo);
    }

    private void setShippingInfo(ShippingInfo newShippingInfo) {
        if(newShippingInfo == null){
            throw new IllegalArgumentException();
        }
        this.shippingInfo = newShippingInfo;
    }

    private void checkShippingInfoChangeable() {

    }
}
