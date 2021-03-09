package com.company.structural.proxy;

public class Main {
    public static void main(String[] args) {
        ProxyService proxyService = new ProxyService(123);
        proxyService.operation();
    }
}
