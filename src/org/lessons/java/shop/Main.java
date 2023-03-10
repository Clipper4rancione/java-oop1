package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Product firstProduct = new Product();

        firstProduct.productName = "Mozzarella Di Bufala";
        firstProduct.productDescription = "Mozzarella fatta con latte 100% di bufala";
        firstProduct.price = 5.99;
        firstProduct.codeGenerator();
    }
}
