package ua.ithilel.java.pizza;

public class Pizzeria {

    public static void main(String[] args) {

        Composition pizza1 = new Composition("large", 1, 1, 2);
        Composition pizza2 = new Composition("small", 2, 1, 1);
        Composition pizza3 = new Composition("medium", 1, 2, 1);

        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza3.getDescription());
    }
}