package ex04.sample2;

public class ChangeOrderService {
    private OrderRepository orderRepository;
    private CustomerRepository customerRepository;

    public void changeShippingInfo(OrderId id, ShippingInfo newShippingInfo,
                                   boolean useNewShippingAddrAsMemberAddr) throws OrderNotFoundException {
        Order order = orderRepository.findById(id);

        if(order == null) {
            throw new OrderNotFoundException();
        }
        order.changeShippingInfo(newShippingInfo);

        if(useNewShippingAddrAsMemberAddr){
            //ID를 이용해서 참조하는 애그리거트를 구한다.
            Customer customer = customerRepository.findById(order.getOrderer().getCustomerId());
            customer.changeAddress(newShippingInfo.getAddress());
        }
    }
}
