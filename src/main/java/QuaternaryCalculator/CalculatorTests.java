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

}
