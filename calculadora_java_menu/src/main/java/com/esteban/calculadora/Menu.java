package com.esteban.calculadora;

public class Menu {

    public static void menuMethod(Integer num, Integer num2, Integer caseValue) {
        switch (caseValue) {
            case 1:
                Integer sum = Aritmetic.sum(num, num2);
                System.out.println("Your sum is: " + sum);
                break;
            case 2:
                Integer res = Aritmetic.res(num, num2);
                System.out.println("Your subtract is: " + res);
                break;
            case 3:
                 Integer multiplication = Aritmetic.multiplication(num, num2);
                 System.out.println("Your multiplication is: " + multiplication);
                break;
            case 4:
                Integer div = Aritmetic.div(num, num2);
                System.out.println("Your division is: " + div);
                break;
            default:
                throw new AssertionError("This case doesn´t exist");
        }
    }

}
