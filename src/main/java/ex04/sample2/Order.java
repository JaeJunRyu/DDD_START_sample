package ex04.sample2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Order {
    private Orderer orderer;
    private List<OrderLine> orderLines = new ArrayList<>();

    public void changeShippingInfo(ShippingInfo newShippingInfo,
                                   boolean useNewShippingAddrAsMemberAddr) {

        if(useNewShippingAddrAsMemberAddr) {
            //한 애그리거트 내부에서 다른 애그리거트에 접근할 수 있으면,
            //구현이 쉬워진다는 것 때문에 다른 애그리거트의 상태를 변경하는 유혹에 빠지기 쉽다.
            orderer.getCustomer().changeAddress(newShippingInfo.getAddress());
        }
    }

    public void changeShippingInfo(ShippingInfo newShippingInfo ) {

    }
}
