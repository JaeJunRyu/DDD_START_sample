package sample5;

import java.util.Objects;

public class Order {
    private String orderNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(orderNumber, order.orderNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber);
    }
}
