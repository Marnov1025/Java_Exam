import classes.Category;
import classes.Product;
import classes.User;
import classes.Basket;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User Levik = new User();
        Levik.setLogin("johnnormis");
        Levik.setPassword("polnaref");

        User Marnov = new User();
        Marnov.setLogin("akiraueda");
        Marnov.setPassword("flamestorm");

        User Timoxa = new User();
        Timoxa.setLogin("saimondice");
        Timoxa.setPassword("lubluozon");

        User Mahov = new User();
        Mahov.setLogin("prepodavatel");
        Mahov.setPassword("lublumacbook");

        User Lyoha = new User();
        Lyoha.setLogin("fari::mode");
        Lyoha.setPassword("povorotnikvirubi");

        Product milk = new Product();
        milk.setName("Простоквашино");
        milk.setPrice(100);
        milk.setRating(4.5f);

        Product cake = new Product();
        cake.setName("Шоколадни");
        cake.setPrice(400);
        cake.setRating(4.8f);

        Product fork = new Product();
        fork.setName("Вылка");
        fork.setPrice(60);
        fork.setRating(5.0f);

        Category cakes = new Category();
        cakes.setName("Тортики:");
        Product[] meals = new Product[1];
        for(int i = 0; i < 1; i++) {
            meals[i] = cake;
        }
        cakes.setProducts(meals);

        Category sorts_of_milk = new Category();
        sorts_of_milk.setName("Виды молока:");
        Product[] milks = new Product[1];
        Arrays.fill(milks, milk);
        sorts_of_milk.setProducts(milks);

        Category cutlery = new Category();
        cutlery.setName("Столовые приборы:");
        Product[] forks = new Product[1];
        Arrays.fill(forks, fork);
        cutlery.setProducts(forks);


        Basket levik = new Basket();
        levik.addPurchase(cake);
        levik.addPurchase(fork);
        Levik.setUser_basket(levik);

        Basket marnov = new Basket();
        marnov.addPurchase(cake);
        marnov.addPurchase(fork);
        marnov.addPurchase(milk);
        Marnov.setUser_basket(marnov);

        Basket timoxa = new Basket();
        timoxa.addPurchase(fork);
        Timoxa.setUser_basket(timoxa);

        Basket mahov = new Basket();
        mahov.addPurchase(cake);
        Mahov.setUser_basket(mahov);

        Basket lyoha = new Basket();
        lyoha.addPurchase(milk);
        lyoha.addPurchase(fork);
        Lyoha.setUser_basket(lyoha);

        System.out.println("\nТортике:");
        for (Product product : cakes.getProducts()) {
            System.out.println(product.getName() + " - " + product.getPrice() + "руб. Рейтинг: " + product.getRating());
        }
        System.out.println("\nМолоко:");
        for (Product product : sorts_of_milk.getProducts()) {
            System.out.println(product.getName() + " - " + product.getPrice() + "руб. Рейтинг: " + product.getRating());
        }

        System.out.println("\nСтоловые приборы:");
        for (Product product : cutlery.getProducts()) {
            System.out.println(product.getName() + " - " + product.getPrice() + "руб. Рейтинг: " + product.getRating());
        }


        System.out.println("\nПокупки поситителей:");
        Levik.print();
        Marnov.print();
        Timoxa.print();
        Mahov.print();
        Lyoha.print();

    }
}