package testsdemo.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdderTest {

    @Test
    public void  testAdd_1(){
        Adder adder=new Adder();
        int result=adder.add(1,2);
        Assertions.assertEquals(3,result);
    }
}
