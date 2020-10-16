package ex02.sample2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DroolsRuleDiscounter implements RuleDiscounter {

    private KieContainer kContainer;

    public DroolsRuleDiscounter() {
        KieService ks = KieService.Factory.get();
        kContainer = ks.getKieClasspathContainer();
    }

    @Override
    public Money applyRules(Customer customer, List<OrderLine> orderLines) {
        KieSession kieSession = kContainer.newKieSession("discountSession");

        MutableMoney money = new MutableMoney(0);

        try {
            kieSession.findAllRules();

        } finally {
            kieSession.dispose();
        }
        return money.toImmutableMoney();
    }
}
