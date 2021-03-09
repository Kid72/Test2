package com.company.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Program[] programs = {new BankSystem(new CppDeveloper()), new StockExchange(new JavaDeveloper())};

        for(Program program : programs){
            program.developProgram();
        }
    }
}
