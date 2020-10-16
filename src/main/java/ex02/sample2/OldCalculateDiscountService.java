package ex02.sample2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OldCalculateDiscountService {
    private DroolsRuleEngine ruleEngine;

    public OldCalculateDiscountService() {
        this.ruleEngine = new DroolsRuleEngine();
    }

    public Money calculateDiscount(OrderLine orderLines, String customerId){
            Customer customer = findCustomer(customerId);

            MutableMoney money = new MutableMoney(0);

            List<?> facts = new ArrayList<>(Arrays.asList(customer, money,orderLines));
            ruleEngine.evalute("discountCalculation", facts);
            return money.toImmutableMoney();
    }


//    public Moeny old_calculateDiscount(OrderLine orderLines, String customerId){
//        Customer customer = findCustomer(customerId);
//
//        MutableMoney money = new MutableMoney(0);
//
//        List<?> facts = Arrays.asList(customer, money);
//        facts.addAll(Arrays.asList(orderLines));
//        ruleEngine.evalute("discountCalculation", facts);
//        return money.toImmutableMoney();
//
//    }

    private Customer findCustomer(String customerId) {
        return new Customer();
    }
}
