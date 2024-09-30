package lessons.spring.third.service;

import lessons.spring.third.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepositoryService {
    Optional<Product> getElementInRepositoryById(int id);
    List<Product> getAllElementsInRepository();
    void save(Product product);
}
