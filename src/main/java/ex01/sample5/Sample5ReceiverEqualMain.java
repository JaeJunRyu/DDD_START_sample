package ex01.sample5;

public class Sample5ReceiverEqualMain {

    public static void main(String[] args) {

        Receiver receiver1 = new Receiver("A1","1");
        Receiver receiver2 = new Receiver("A1","1");
        Receiver receiver3 = receiver1;
        Receiver receiver4 = new Receiver("B1","2");

        System.out.println("receiver1 equal receiver1 = " + receiver1.equals(receiver1));
        System.out.println("receiver1 equal receiver2 = " + receiver1.equals(receiver2));
        System.out.println("receiver1 equal receiver3 = " + receiver1.equals(receiver3));
        System.out.println("receiver2 equal receiver3 = " + receiver2.equals(receiver3));
        System.out.println("receiver1 equal receiver4 = " + receiver1.equals(receiver4));

    }
}
