package ex01.sample5;

public class Sample5Main {

    public static void main(String[] args) {
        Product product = new Product();
        Money price = new Money(1000);
        OrderLine line = new OrderLine(product, price, 2);
        price.setValue(2000);

        System.out.println("line.getPrice() = " + line.getPrice().getValue());
        System.out.println("line.getQuantity() = " + line.getQuantity());
        System.out.println("line.getAmounts() = " + line.getAmounts().getValue());

    }
}
