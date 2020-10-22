package ex04.sample2;

import java.util.List;

public interface OrderRepository {
    Order findById(OrderId id);

    List<Order> findByOrderer(OrdererId ordererId);
}
