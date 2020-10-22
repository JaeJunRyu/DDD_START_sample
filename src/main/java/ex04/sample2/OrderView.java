package ex04.sample2;

public class OrderView {
    private Order order;
    private Customer customer;
    private Product product;

    public OrderView(Order order, Customer customer, Product product) {
        this.order = order;
        this.customer = customer;
        this.product = product;
    }
}
