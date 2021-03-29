package org.cg.apps.calcydemo;

import org.junit.jupiter.api.*;

public class AdderTest {

    Adder adder ;

    @BeforeEach
    public void setup(){
        adder=new Adder();
    }

    /**
     * scenario, num1 =0 , num2=0
     * expectation : result is 0
     */
    @Test
    public void testAdd_1(){
       int result= adder.add(0,0);
       Assertions.assertEquals(0,result);
    }

    /**
     * scenario, num1 =0 , num2=0
     * expectation : result is 0
     */
    @Test
    public void testAdd_2(){
        int result=adder.add(5,8);
        Assertions.assertEquals(13,result);
    }

    /**
     * scenario, num1 =-5, num2=-7
     * expectation : result is -12
     */
    @Test
    public void testAdd_3(){
        int result=adder.add(-5,-7);
        Assertions.assertEquals(-12,result);
    }




}
