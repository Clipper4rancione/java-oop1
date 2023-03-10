package org.lessons.java.shop;

import java.util.Random;

public class Product {
    Random random = new Random();
    int productCode = random.nextInt(1, 100);
    String productName;
    String productDescription;
    double price;
    double iva;

    public Product(String productName, String productDescription, double price, double iva){
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.iva = iva;
    }



}
