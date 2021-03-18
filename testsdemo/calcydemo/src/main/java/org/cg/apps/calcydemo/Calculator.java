package org.cg.apps.calcydemo;

public class Calculator {

    private Adder adder;

    public Calculator(Adder adder) {
        this.adder = adder;
    }

    public int add(int num1, int num2) {
        System.out.println("inside add of caluclator");
        return adder.add(num1, num2);
    }

    public int addBy10(int num){
        System.out.println("inside addby10");
        return add(num,10);
    }

}
