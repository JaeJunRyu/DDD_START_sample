package sample6;

public class BadOrder {

    private BadOrderState state;

    public void changeShippingInfo(ShippingInfo newShippingInfo) {
        verifyStep1OrStep2();
        setShippingInfo(newShippingInfo);
    }

    private void setShippingInfo(ShippingInfo newShippingInfo) {

    }

    private void verifyStep1OrStep2() {
        if(state != BadOrderState.STEP1 && state != BadOrderState.STEP2){
            throw new IllegalArgumentException("aleady shipped");
        }
    }

}
