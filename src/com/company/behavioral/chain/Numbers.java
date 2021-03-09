package com.company.behavioral.chain;

public class Numbers {
    private int firstNum;
    private int secondNum;
    private String operation;

    public Numbers(int firstNum, int secondNum, String operation) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operation = operation;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
