package testsdemo.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubTest {

    @Test
    public void testSub_1(){
        Subtractor subtractor=new Subtractor();
        int result=subtractor.sub(5,2);
        Assertions.assertEquals(3,result);
    }
}
