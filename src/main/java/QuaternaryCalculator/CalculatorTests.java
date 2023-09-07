package QuaternaryCalculator;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    @Test
    public void checkFiveWorks() {
        Integer res = Calculator.quartToDec(-11);
        assertEquals(res, Integer.valueOf(-5) );
    }
    @Test
    public void testConvertToFromQ() {
        ArrayList<Integer> decValues = new ArrayList<>();
        ArrayList<Integer> qValues = new ArrayList<>();
        decValues.add(5);
        decValues.add(1);
        decValues.add(10);
        decValues.add(-5);
        decValues.add(-1);
        decValues.add(15);
        decValues.add(100);
        decValues.add(1000);
        qValues.add(11);
        qValues.add(1);
        qValues.add(22);
        qValues.add(-11);
        qValues.add(-1);
        qValues.add(33);
        qValues.add(1210);
        qValues.add(33220);


        for (int i = 0; i < decValues.size(); i++){
            assertEquals(Calculator.decToQuart(decValues.get(i)), qValues.get(i));
            assertEquals(decValues.get(i), Calculator.quartToDec(qValues.get(i)));
        }
    }

    @Test
    public void testAdd() {
        assertEquals(Integer.valueOf(22), Calculator.add(11,11));
        assertEquals(Integer.valueOf(-1), Calculator.add(11,-12));
        assertEquals(Integer.valueOf(0), Calculator.add(11, -11));
        assertEquals(Integer.valueOf(110), Calculator.add(22,22));
        assertEquals(Integer.valueOf(13), Calculator.add(3, 10));
    }
    @Test
    public void testSubtract() {
        assertEquals(Integer.valueOf(0), Calculator.sub(11, 11));
        assertEquals(Integer.valueOf(1), Calculator.sub(12, 11));
        assertEquals(Integer.valueOf(-1), Calculator.sub(11, 12));
        assertEquals(Integer.valueOf(1012), Calculator.sub(1210, 132));
        assertEquals(Integer.valueOf(-11), Calculator.sub(11, 22));
        assertEquals(Integer.valueOf(-1203), Calculator.sub(1, 1210));
    }

    @Test
    public void testMult() {
        assertEquals(Integer.valueOf(0), Calculator.mult(0, 12));
        assertEquals(Integer.valueOf(121), Calculator.mult(11, 11));
        assertEquals(Integer.valueOf(30), Calculator.mult(3, 10));
        assertEquals(Integer.valueOf(1), Calculator.mult(-1, -1));
        assertEquals(Integer.valueOf(-1), Calculator.mult(-1, 1));
        assertEquals(Integer.valueOf(33220), Calculator.mult(1210, 22));
    }

    @Test
    public void testDiv() {
        assertEquals(Integer.valueOf(11), Calculator.div(121, 11));
        assertEquals(Integer.valueOf(10), Calculator.div(30, 3));
        assertEquals(Integer.valueOf(20), Calculator.div(200, 10));
        assertEquals(Integer.valueOf(22), Calculator.div(1210, 22));
    }

    @Test
    public void testSqrt() {
        assertEquals(Integer.valueOf(2), Calculator.sqroot(11));
        assertEquals(Integer.valueOf(1), Calculator.sqroot(3));
        assertEquals(Integer.valueOf(1), Calculator.sqroot(2));
        assertEquals(Integer.valueOf(2), Calculator.sqroot(12));
    }

    @Test
    public void testSq() {
        assertEquals(Integer.valueOf(10), Calculator.square(2));
        assertEquals(Integer.valueOf(21), Calculator.square(3));
        assertEquals(Integer.valueOf(210), Calculator.square(12));
        assertEquals(Integer.valueOf(1210), Calculator.square(22));
    }
}
