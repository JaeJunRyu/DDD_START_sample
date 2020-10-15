package sample5;

public class OldOrderLine {
    private Product product;
    private int price;
    private int quantity;
    private int amounts;

    public OldOrderLine(Product product, int price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.amounts = calculateAmounts();
    }

    private int calculateAmounts(){
        return price * quantity;
    }

    public int getAmounts() {
        return amounts;
    }
}
