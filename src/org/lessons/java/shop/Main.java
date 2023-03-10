package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Product firstProduct = new Product("Red Bull", "Energy Drink", 2.00, 0.2);
        System.out.println("Nome: " + firstProduct.productName);
        System.out.println("Descrizione: " + firstProduct.productDescription);
        System.out.println("Prezzo: " + firstProduct.price);
        System.out.println("Prezzo comprensivo di iva: " + firstProduct.priceWithIva());
        System.out.println("iva: " + firstProduct.iva);


    }
}
