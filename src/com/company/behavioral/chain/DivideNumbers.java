package com.company.behavioral.chain;

public class DivideNumbers implements Chain{
    protected Chain nextChain;

    @Override
    public void setNextChain(Chain newChain) {
        this.nextChain = newChain;
    }

    @Override
    public void operate(Numbers numbers) {
        if(numbers.getOperation().equals("div")){
            System.out.println(numbers.getFirstNum() + " / " + numbers.getSecondNum() + " = " + (numbers.getFirstNum() / numbers.getSecondNum()));
        }else{
            System.out.println("No access");
        }
    }
}
