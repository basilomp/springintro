package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Shopbuilder {

    public List<Product> prepareProducts() {
        List<Product> productList = new ArrayList<>();
        Product p1 = new Product(1, "Chocolate bar", 99);
        Product p2 = new Product(2, "Bacon-flavored crisps", 107);
        Product p3 = new Product(3, "Sparkling water", 75);
        Product p4 = new Product(4, "Canned tuna", 201);
        Product p5 = new Product(5, "Instant coffee", 412);
        Product p6 = new Product(6, "Cauliflower", 119);
        Product p7 = new Product(7, "Tomatoes", 596);
        Product p8 = new Product(8, "Milk", 105);
        Product p9 = new Product(9, "Butter", 209);
        Product p10 = new Product(10, "Cat food", 269);

        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);
        productList.add(p7);
        productList.add(p8);
        productList.add(p9);
        productList.add(p10);
        return productList;
    }
 }
