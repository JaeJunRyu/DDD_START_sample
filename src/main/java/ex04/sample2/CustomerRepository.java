package ex04.sample2;

public interface CustomerRepository {
    Customer findById(CustomerId customerId);

    Customer findById(OrdererId ordererId);
}
