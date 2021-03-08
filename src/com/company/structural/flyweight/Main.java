package com.company.structural.flyweight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        DeveloperFactory developerFactory = new DeveloperFactory();

        ArrayList<Developer> developers = new ArrayList<>();

        developers.add(DeveloperFactory.getDeveloperBySpecialty("java"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("java"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("java"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("java"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("java"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("java"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("java"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("java"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("c++"));
        developers.add(DeveloperFactory.getDeveloperBySpecialty("c++"));


    }
}
