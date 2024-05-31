package classes;

public class User {
    private String login;
    private String password;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_basket(Basket user_basket) {
        this.user_basket = user_basket;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getUser_basket() {
        return user_basket;
    }

    public void print() {
        System.out.println("\nUser(\""+this.getLogin() + "\")");
        for (Product product : this.user_basket.getPurchased()) {
            System.out.println(product.getName() + " - " + product.getPrice() + "руб. Рейтинг: " + product.getRating());
        }
    }
    private Basket user_basket;
}
