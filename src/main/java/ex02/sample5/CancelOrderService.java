package ex02.sample5;

public class CancelOrderService {

    private OrderRepository orderRepository;

//    @Transaction //응용 서비스는 트랜잭션을 관리 한다.
    public void cancel(OrderNumber number) throws NoOrderException {
        Order order = orderRepository.findByNumber(number);
        if(order == null) {
            throw new NoOrderException(number);
        }
        order.cancel();
    }
    //DI 등의 방식으로 OrderRepository 객체 전달
}
