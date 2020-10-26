package ex04.sample3;

import lombok.Getter;

@Getter
public class Store extends Member {
    private Long id;

    public boolean isBlocked() {
        return false;
    }

//    public Product createProduct(ProductId newProductId, ...생략) throws StoreBlockedException {
//        if(isBlocked()){
//            throw new StoreBlockedException();
//        }
//        return new Product(newProductId, getId(), ...생략 );
//        return new Product(newProductId, getId());
//    }

}
