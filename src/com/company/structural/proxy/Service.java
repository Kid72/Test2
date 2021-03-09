package com.company.structural.proxy;

public class Service implements ServiceInterface{
    @Override
    public void operation() {
        System.out.println("Operation is proceeding...");
    }
}
