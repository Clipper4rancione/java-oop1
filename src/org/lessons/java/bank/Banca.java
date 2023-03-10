package org.lessons.java.bank;

public class Banca {
    public static void main(String[] args) {

        // Grazie per lo spunto del ciclo WHILE!

        Conto myAccount = new Conto("Ciro Meluziis");
        System.out.println("*************");
        System.out.println("Benvenuto nel tuo account " + myAccount.getUserName() + "!");
        System.out.println("*************");
        System.out.println();
        System.out.println("Il tuo saldo disponibile è di: " + myAccount.formatBalance() + "€");

    }
}
