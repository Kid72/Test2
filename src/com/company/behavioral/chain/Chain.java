package com.company.behavioral.chain;

public interface Chain {
    void setNextChain(Chain operationInterface);
    void operate(Numbers numbers);
}
