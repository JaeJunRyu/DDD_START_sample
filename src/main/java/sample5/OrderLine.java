package sample5;

public class OrderLine {

    private Product product;
    private Money price;
    private int quantity;
    private Money amounts;

    public OrderLine(Product product, Money price, int quantity) {
        this.product = product;
//        this.price = price;
        /**
         * Moeny가 불변 객체가 아니라면,
         * price 파라미터가 변경될 때 발생하는 문제를 방지하기 위해
         * 데이터를 복사한 새로운 객체를 생성해야 한다.
         */
        this.price = new Money(price.getValue());
        this.quantity = quantity;
        this.amounts = calculateAmounts();
    }

    private Money calculateAmounts(){
        return price.multiply(quantity);
    }

    public Money getAmounts() {
        return amounts;
    }

    public Product getProduct() {
        return product;
    }

    public Money getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


}
