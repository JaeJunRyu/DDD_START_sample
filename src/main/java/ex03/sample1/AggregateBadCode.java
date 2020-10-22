package ex03.sample1;

public class AggregateBadCode {

//    ShippingInfo si = order.getShippingInfo();
//    si.setAddress(newAddress);

//    ShippingInfo si = order.getShippingInfo();
//
//    //주요 도메인 로직이 중복되는 문제
//    if(state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING ){
//        throw new IllegalArgumentException();
//    }
//    si.setAddress(newAddress);

//도메인 모델에서 공개 set 메서드는 가급적 피해야 한다.
//    public void setName(String name){
//        this.name = name;
//    }

//    ShippingInfo si = order.getShippingInfo();
//    si.setAddress(newAddress);  //ShippingInfo 밸류 객체가 불변이면, 이 코드는 컴파일 에러!

}
