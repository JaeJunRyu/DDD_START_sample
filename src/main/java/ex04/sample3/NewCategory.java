package ex04.sample3;

import java.util.List;
import java.util.Set;

public class NewCategory {

    private Set<Product> products;

    public List<Product> getProducts(int page, int size){
        List<Product> sortedProducts = sortById(products);
        return sortedProducts.subList((page - 1) * size, page * size);
    }

    private List<Product> sortById(Set<Product> products) {
        return null;
    }
}
