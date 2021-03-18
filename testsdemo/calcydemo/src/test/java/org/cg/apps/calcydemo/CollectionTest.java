package org.cg.apps.calcydemo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class CollectionTest {

    @Test
    public void testList(){
        List<Integer> list= Mockito.mock(List.class);
        Mockito.when(list.get(0)).thenReturn(10);
        Mockito.when(list.get(1)).thenReturn(20);

        int index0Value=list.get(0);
        int index1Value=list.get(1);
        System.out.println(index0Value +" "+index1Value);
        Mockito.verify(list).get(0);
        Mockito.verify(list).get(1);
    }
}
