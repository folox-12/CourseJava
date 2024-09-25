package lessons.spring;

import lessons.spring.entity.Cart;
import lessons.spring.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("lessons")
public class AppConfig {
    @Bean(name="ProductRepository")
    public List<Product> products() {
        return new ArrayList<>();
    }

    @Scope("prototype")
    @Bean
    public Cart cart() {
        return new Cart();
    }
}
