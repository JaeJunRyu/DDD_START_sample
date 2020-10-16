package ex02.sample2;

import java.util.List;

public class DroolsRuleEngine {
    private KieContainer kContainer;

    public DroolsRuleEngine() {
        KieService ks = KieService.Factory.get();
        kContainer = ks.getKieClasspathContainer();
    }

    public void evalute(String sessionName, List<?> facts) {
        KieSession kSession = kContainer.newKieSession(sessionName);

        try {
            facts.forEach(x -> kSession.insert(x));
            kSession.findAllRules();
        } finally {
            kSession.dispose();
        }
    }
}
