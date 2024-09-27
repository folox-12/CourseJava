package lessons.spring.second.service;
import lessons.spring.second.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryService {
    Optional<Product> getElementInRepositoryById(int id);
    List<Product> getAllElementsInRepository();
    void save(Product product);
}
