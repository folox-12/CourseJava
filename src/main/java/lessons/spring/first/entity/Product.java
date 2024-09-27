package lessons.spring.first.entity;

public class Product {
    private String name;
    private Integer id, cost;

    public Product(String name, Integer id, Integer cost) {
        this.name = name;
        this.id = id;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cost=" + cost +
                '}';
    }
}
