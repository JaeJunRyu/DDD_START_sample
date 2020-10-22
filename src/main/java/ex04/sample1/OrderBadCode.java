package ex04.sample1;

public class OrderBadCode {

    private Orderer orderer;

    public void shipTo(ShippingInfo newShippingInfo,
                       boolean useNewShippingAddrAsMemberAddr ){
        verifyNotYetShipped();
        setShippingInfo(newShippingInfo);
        if(useNewShippingAddrAsMemberAddr){
            //다른 애그리거트의 상태를 변경하면 안됨!
            orderer.getCustomer().changeAddress(newShippingInfo.getAddress());
        }
    }

    private void setShippingInfo(ShippingInfo newShippingInfo) {

    }

    private void verifyNotYetShipped() {
    }


}
