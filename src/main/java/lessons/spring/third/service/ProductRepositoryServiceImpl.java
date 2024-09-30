package lessons.spring.third.service;

import lessons.spring.third.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductRepositoryServiceImpl implements ProductRepositoryService {
    private List<Product> products = new ArrayList<>();

    {
        for (int i = 1; i <= 5; i++) {
            Product product = new Product("ProductName" + i, i, i*10);
            products.add(product);
        }
    }

    @Override
    public void save(Product product) {
        product.setId(products.size() + 1);
        products.add(product);
    }

    @Override
    public List<Product> getAllElementsInRepository() {
        return products;
    }

    @Override
    public Optional<Product> getElementInRepositoryById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
