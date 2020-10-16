package ex02.sample2;

public class KieService {


    public KieContainer getKieClasspathContainer() {
        return new KieContainer();
    }

    public static class Factory {

        public static KieService get() {
            return new KieService();
        }
    }
}
