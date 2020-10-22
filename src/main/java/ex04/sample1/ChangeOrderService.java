package ex04.sample1;



public class ChangeOrderService {

    private OrderRepository orderRepository;
    //두 개 이상의 애그리거트를 변경해야 하면,
    //응용 서비스에서 각 애그리거트의 상태를 변경한다.
//    @Transactional
    public void changeShippinfInfo(OrderId id, ShippingInfo newShippingInfo,
                                   boolean useNewShippingAddrAsMemberAddr ) throws OrderNotFoundException {
        Order order = orderRepository.findById(id);

        if(order == null){
            throw new OrderNotFoundException();
        }
        order.shipTo(newShippingInfo);

        if(useNewShippingAddrAsMemberAddr){
            order.getOrderer().getCustomer().changeAddress(newShippingInfo.getAddress());
        }
    }
}
