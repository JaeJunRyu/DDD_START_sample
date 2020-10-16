package ex02.sample1;

public class CancelOrderService {

    public void cancelOrder(String orderId) throws OrderNotFoundException {
        Order order = findOrderById(orderId);
        if(order == null) {
            throw new OrderNotFoundException(orderId);
        }
        order.cancel();
    }

    private Order findOrderById(String orderId) {
        return new Order();
    }
}
