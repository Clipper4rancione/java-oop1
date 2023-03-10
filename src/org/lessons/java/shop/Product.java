package org.lessons.java.shop;

import java.util.Random;

public class Product {

    int productCode;
    String productName;
    String productDescription;
    double price;
    int iva;

    public void codeGenerator() {
        Random random = new Random();
        productCode = random.nextInt(100);
        System.out.println(productCode);
    }
}
