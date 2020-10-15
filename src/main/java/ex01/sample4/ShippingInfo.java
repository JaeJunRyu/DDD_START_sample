package ex01.sample4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShippingInfo {
    private String receiverName;
    private String receiverPhoneNumber;
    private String shippingAddress1;
    private String shippingAddress2;
    private String shippingZipCode;
}
