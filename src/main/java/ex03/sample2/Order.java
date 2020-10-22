package ex03.sample2;

public class Order {
    private ShippingInfo shippingInfo;

    public void changeShippingInfo(ShippingInfo newShippingInfo){
        verifyNotYetShipped();
        setShippingInfo(newShippingInfo);
    }

    //set 메서드의 접근 허용 범위는 private이다.
    private void setShippingInfo(ShippingInfo newShippingInfo) {
        //밸류가 불변이면, 새로운 객체를 할당해서 값을 변경해야 한다.
        //불변 이므로 this.shippingInfo.setAddress(newShippingInfo.getAddress()); 와 같은 코드를 사용할 수 없다.
        this.shippingInfo = newShippingInfo;
    }

    private void verifyNotYetShipped() {

    }
}
