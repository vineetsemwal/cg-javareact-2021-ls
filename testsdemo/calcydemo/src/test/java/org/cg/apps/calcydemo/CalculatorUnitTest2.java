package org.cg.apps.calcydemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorUnitTest2 {


    Calculator calculator;
    @Mock
    Adder adder;

    @Spy
    @InjectMocks
    Calculator spy;


    @BeforeEach
    public void setup() {
        calculator=new Calculator(adder);
    }


    /**
     * scanario num1=3, num2=5
     * expectation : result is 8
     */
    @Test
    public void testAdd_2(){
        when(adder.add(3,5)).thenReturn(8);
        int result=calculator.add(3,5);
        Assertions.assertEquals(8,result);
        verify(adder).add(3,5);
    }

    @Test
    public void testAdd_3(){
        //Mockito.when(spy.add(4,10)).thenReturn(14);
        doReturn(14).when(spy).add(4,10);
        int result=spy.addBy10(4);
        Assertions.assertEquals(14,result);
    }


}
