package ex02.sample4;

public class Order {
    private ShippingInfo shippingInfo;


    public void changeShippingInfo(ShippingInfo newInfo){
        checkShippingInfoChangeable(); //배송지 변경 가능 여부 확인
        this.shippingInfo = newInfo;
    }

    private void checkShippingInfoChangeable() {
        //배송지 정보를 변경할 수 있는지 여부를 확인하는 도메인 규칙 구현
    }
}
