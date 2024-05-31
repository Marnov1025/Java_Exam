package classes;

import java.util.ArrayList;

public class Basket {
    public Basket() {
        this.purchased = new ArrayList<>();
    }
    public void addPurchase(Product purchase) {
        this.purchased.add(purchase);
    }

    public Product[] getPurchased() {
        Product[] products = new Product[purchased.size()];
        purchased.toArray(products);
        return products;
    }

    private ArrayList<Product> purchased;
}
