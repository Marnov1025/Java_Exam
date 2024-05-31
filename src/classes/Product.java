package classes;

public class Product {
    private String name;
    private int price;
    private float rating;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public float getRating() {
        return rating;
    }


}
