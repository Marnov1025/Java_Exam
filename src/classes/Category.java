package classes;

public class Category {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Product[] getProducts() {
        return products;
    }

    private Product[] products;
}
