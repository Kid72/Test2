package com.company.structural.decorator;

public class Main {
    public static void main(String[] args) {

        SimpleCoffee simpleCoffee = new SimpleCoffee();
        System.out.println("Simple Coffee cost: " + simpleCoffee.getCost());
        System.out.println("Simple Coffee description: " + simpleCoffee.getDescription());

        MilkCoffee milkCoffee = new MilkCoffee(simpleCoffee);
        System.out.println("Simple Coffee cost: " + milkCoffee.getCost());
        System.out.println("Simple Coffee description: " + milkCoffee.getDescription());



    }
}
