package QuaternaryCalculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Calculator {
    public static Integer calculate(int quartNumber, String operand) {
        switch (operand) {
            case "square":
                return square(quartNumber);
            case "sqroot":
                return sqroot(quartNumber);
            default:
                System.out.println("error");
                return null;
        }
    }
    public static Integer calculate(int quartNumber, String operand, int quartNumber2) {
        switch (operand) {
            case "add":
                return add(quartNumber, quartNumber2);
            case "sub":
                return sub(quartNumber, quartNumber2);
            case "mul":
                return mult(quartNumber, quartNumber2);
            case "div":
                return div(quartNumber, quartNumber2);
            default:
                System.out.println("error");
                return null;
        }
    }

    public static Integer decToQuart(int decimalNumber) {
        List<String> quartList = new ArrayList<>();
        boolean negative = false;
        if (decimalNumber < 0) {
            negative = true;
            decimalNumber = Math.abs(decimalNumber);
        }

        while (decimalNumber > 0) {
            quartList.add(Integer.toString(decimalNumber%4));
            decimalNumber = decimalNumber/4;
        }
        Collections.reverse(quartList);

        if (negative) {
            return (-1)*Integer.parseInt(String.join("", quartList));
        }
        else {
            return Integer.parseInt(String.join("", quartList));
        }
    }

    public static Integer quartToDec(int quartNumber) {
        LinkedList<Integer> stack = new LinkedList<>();
        List<Integer> addList = new ArrayList<>();
        boolean negative = false;
        if (quartNumber < 0) {
            negative = true;
            quartNumber = Math.abs(quartNumber);
        }

        int total = 0;
        while (quartNumber > 0) {
            stack.push( quartNumber % 10 );
            quartNumber = quartNumber / 10;
        }

        while (stack.size() > 0) {
            addList.add((int) (stack.pop()*(Math.pow(4, stack.size()))));
        }

        for (Integer integer : addList) {
            total = total + integer;
        }

        if (negative) {
            return (-1)*total;
        }
        else {
            return total;
        }
    }

    public static Integer add(int quart1, int quart2) {
        return decToQuart(quartToDec(quart1) + quartToDec(quart2));
    }
    public static Integer sub(int quart1, int quart2) {
        return decToQuart(quartToDec(quart1) - quartToDec(quart2));
    }
    public static Integer mult(int quart1, int quart2) {
        return decToQuart(quartToDec(quart1) * quartToDec(quart2));
    }
    public static Integer div(int quart1, int quart2) {
        return decToQuart(quartToDec(quart1) / quartToDec(quart2));
    }
    public static Integer sqroot(int quart) {
        return decToQuart((int) Math.sqrt(quartToDec(quart)));
    }
    public static Integer square(int quart) {
        return decToQuart((quartToDec(quart))*quartToDec(quart));
    }

}
