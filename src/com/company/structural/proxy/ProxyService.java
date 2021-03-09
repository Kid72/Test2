package com.company.structural.proxy;

public class ProxyService implements ServiceInterface{
    private int userId = 123;
    private int newUserId;

    ProxyService(int newUserId){
        this.newUserId = newUserId;
    }

    @Override
    public void operation() {
        if (checkAccess(newUserId)) {
            System.out.println("User checked: passed");
            System.out.println("Operation is proceeding...");
        }
    }

    private boolean checkAccess(int b){
        if(userId == b){
            return true;
        } else{
            return false;
        }

    }
}
