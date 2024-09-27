package lessons.spring.first.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class Cart {
    List<Product> currentProducts = new ArrayList<>();

    @Autowired
    private List<Product> ProductRepository;

    private Optional<Product> findElementInRepository(int id) {
        for (Product product : ProductRepository) {
            if (product.getId() == id) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    @Override
    public String toString() {
        return "Cart{" +
                currentProducts +
                '}';
    }

    private Optional<Product> findElementInCart(int id) {
        for (Product product : currentProducts) {
            if (product.getId() == id) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public void addProduct(int id) {
        Optional<Product> product = findElementInRepository(id);

        if (!product.isPresent()) {
            System.out.println("Товара с таким id нет");
            return;
        }

        currentProducts.add(product.get());
    }

    public void deleteProduct(int id) {
        Optional<Product> product = findElementInCart(id);

        if (!product.isPresent()) {
            System.out.println("Товара в корзине с таким id нет");
            return;
        }

        currentProducts.remove(product.get());
    }
}
