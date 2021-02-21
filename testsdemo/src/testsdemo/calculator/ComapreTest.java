package testsdemo.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * if num1 > num2 return +1
 * if num2>num1 return -1
 * if num1 ==num2 return 0
 */
public class ComapreTest {

    /**
     * num1 >num2
     */
    @Test
    public void testCompare_1() {
        Compare compare = new Compare();
        int result = compare.compare(10, 5);
        assertEquals(1, result);
    }

    @Test
    public void testCompare_2() {
        Compare compare = new Compare();
        int result = compare.compare(6, 10);
        assertEquals(-1, result);

    }

    @Test
    public void testCompare_3() {
        Compare compare = new Compare();
        int result = compare.compare(10, 10);
        assertEquals(0, result);

    }

}
