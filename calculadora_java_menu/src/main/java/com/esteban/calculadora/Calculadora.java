package com.esteban.calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        Integer op = 0;
        Integer num = 0;
        Integer num2 = 0;
        Integer selection = 0;

        do {
            System.out.println("*****************Menu**************");
            System.out.println("1. Sum");
            System.out.println("2. Subtract");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.print("Ingrese su seleccion: ");
            selection = scan.nextInt();
            System.out.println("***********************************");
            System.out.println();

            System.out.println("***********************************");
            System.out.print("Ingrese su primer numero para calcular: ");
            num = scan.nextInt();
            System.out.print("Ingrese su segundo numero para calcular: ");
            num2 = scan.nextInt();
            System.out.println("***********************************");

            Menu.menuMethod(num, num2, selection);
        } while (op != 5);
    }
}
