package lessons.spring;

/*
    1. Есть класс Product (id, название, цена). Товары хранятся в бине ProductRepository, в виде
    List<Product>
    , при старте в него нужно добавить 5 любых товаров.
    2. ProductRepository позволяет получить весь список или один товар по id. Создаем бин Cart, в
    который можно добавлять и удалять товары по id.
    3. Написать консольное приложение, позволяющее управлять корзиной.
    4. При каждом запросе корзины из контекста, должна создаваться новая корзина.
 */

import lessons.spring.entity.Cart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Cart cart = context.getBean(Cart.class);

        boolean isEnded = false;

        while (!isEnded) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - add product; 2 - remove product; 3 - create new Cart; 4 - close");

            int active = scanner.nextInt();

            if (active == 4) isEnded = true;
            else if (active == 3) {
                cart = context.getBean(Cart.class);
                System.out.println(cart);
            } else {
                System.out.println("Введите id товара от 1 - 5");
                int productsId = scanner.nextInt();

                if (active == 2) {
                    cart.deleteProduct(productsId);
                    System.out.println(cart);
                } else if (active == 1) {
                    cart.addProduct(productsId);
                    System.out.println(cart);
                }
            }
        }
    }
}
