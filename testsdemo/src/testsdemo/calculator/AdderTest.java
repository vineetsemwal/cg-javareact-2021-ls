package testsdemo.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdderTest {

    @Test
    public void testAdd_1(){
        Adder adder=new Adder();
        int result=adder.add(3,4);
         assertEquals(7,result);
    }
   
}
