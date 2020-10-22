package ex04.sample2;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class IdReferenceCode {
    private CustomerRepository customerRepository;
    private OrderRepository orderRepository;
    private ProductRepository productRepository;

    public void referenceTestMethod(){
        OrdererId ordererId = null;

        Customer customer = customerRepository.findById(ordererId);
        List<Order> orders = orderRepository.findByOrderer(ordererId);
        List<OrderView> dtos = orders.stream()
                .map(order -> {
                    ProductId prodId = order.getOrderLines().get(0).getProductId();
                    //각 주문마다 첫 번째 주문 상품 정보 로딩 위한 쿼리 실행
                    Product product = productRepository.findById(prodId);
                    return new OrderView(order, customer, product);
                }).collect(toList());
    }
}
