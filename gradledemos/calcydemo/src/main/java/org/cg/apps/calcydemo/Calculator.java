package org.cg.apps.calcydemo;

public class Calculator {

   private Adder adder;

   public Calculator(Adder adder){
       this.adder=adder;
   }

  public int add(int num1, int num2){
       int result=adder.add(num1,num2);
       return result;
  }

}
