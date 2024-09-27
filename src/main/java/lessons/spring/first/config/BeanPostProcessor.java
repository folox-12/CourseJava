package lessons.spring.first.config;

import lessons.spring.first.entity.Product;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BeanPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        List<Product> products = (List<Product>) configurableListableBeanFactory.getBean("ProductRepository");

        for (int i = 1; i <= 5; i++) {
            Product product = new Product("ProductName" + i, i, i*10);
            products.add(product);
        }
    }
}
