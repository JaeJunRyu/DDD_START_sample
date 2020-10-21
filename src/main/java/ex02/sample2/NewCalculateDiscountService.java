package ex02.sample2;

import java.util.List;

public class NewCalculateDiscountService {

    private CustomerRepository customerRepository;
    private RuleDiscounter ruleDiscounter;

    public NewCalculateDiscountService(CustomerRepository customerRepository, RuleDiscounter ruleDiscounter) {
        this.customerRepository = customerRepository;
        this.ruleDiscounter = ruleDiscounter;
    }

    public Money calculateDiscount(List<OrderLine> orderLines, String customerId) throws NoCustomerException {
        Customer customer = findCustomer(customerId);
        return ruleDiscounter.applyRules(customer, orderLines);
    }

    private Customer findCustomer(String customerId) throws NoCustomerException {
        Customer customer = customerRepository.findById(customerId);
        if(customer == null) {
            throw new NoCustomerException();
        }

        return customer;
    }
}
