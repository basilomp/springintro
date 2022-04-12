package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shopbuilder {

    private List<Product> productList;

    public List<Product> prepareProducts() {
        productList = new ArrayList<>(Arrays.asList(
                new Product(1, "Chocolate bar", 99),
                new Product(2, "Bacon-flavored crisps", 107),
                new Product(3, "Sparkling water", 75),
                new Product(4, "Canned tuna", 201),
                new Product(5, "Instant coffee", 412),
                new Product(6, "Cauliflower", 119),
                new Product(7, "Tomatoes", 596),
                new Product(8, "Milk", 105),
                new Product(9, "Butter", 209),
                new Product(10, "Cat food", 269)));
        return productList;
    }
}
