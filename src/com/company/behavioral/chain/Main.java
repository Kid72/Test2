package com.company.behavioral.chain;

public class Main {
    public static void main(String[] args) {

        Chain chain1 = new AddNumbers();
        Chain chain2 = new SubNumbers();
        Chain chain3 = new MultipleNumbers();
        Chain chain4 = new DivideNumbers();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        chain1.operate(new Numbers(5, 3, "tgt"));

    }
}
