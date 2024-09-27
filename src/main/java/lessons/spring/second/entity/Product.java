package lessons.spring.second.entity;

public class Product {
    private String name;
    private Integer id, cost;

    public Product() {
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
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
