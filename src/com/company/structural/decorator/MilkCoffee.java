package com.company.structural.decorator;

public class MilkCoffee implements Coffee {
    Coffee coffee;


    MilkCoffee(SimpleCoffee simpleCoffee){
        coffee = simpleCoffee;
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with milk";
    }

}