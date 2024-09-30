package lessons.spring.third.conrollers;

import lessons.spring.third.entity.Product;
import lessons.spring.third.service.ProductRepositoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    ProductRepositoryService productRepositoryService;

    public ProductController(ProductRepositoryService productRepositoryService) {
        this.productRepositoryService = productRepositoryService;
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable(value="id") int id, Model model) {
        Optional<Product> product = productRepositoryService.getElementInRepositoryById(id);
        if(product.isPresent()) {
            model.addAttribute("product", product.get().toString());
        } else {
            model.addAttribute("product", "Товар не найден");
        }
        return "product";
    }
    @GetMapping("/")
    public String getAllProudcts(Model model) {
        List<Product> products = productRepositoryService.getAllElementsInRepository();
        model.addAttribute("products", products);
        return "products";
    }

    @GetMapping("/form")
    public String productForm(Model model) {
        List<Product> products = productRepositoryService.getAllElementsInRepository();
        model.addAttribute("products", products);
        model.addAttribute("product",new Product());
        return "productForm";
    }

    @PostMapping(value = "form/save")
    public String saveProduct(Product product) {
        productRepositoryService.save(product);
        return "redirect:/";
    }
}
