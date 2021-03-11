package com.company.behavioral.iterator;

public class DeveloperClient {

    public static void main(String[] args) {


        String[] skills = new String[]{"Java", "PostgreSQL", "Oracle"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Rauf", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println(javaDeveloper.getName());

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

    }

}
