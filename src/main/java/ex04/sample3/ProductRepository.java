package ex04.sample3;

import java.util.List;

public interface ProductRepository {
    List<Product> findByCategoryId(CategoryId id, int page, int size);

    int countsbyCategoryId(Long id);

    ProductId nextId();

    void save(Product product);
}
