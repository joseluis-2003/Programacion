package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce los dos numeros que quieres dividir: ");
        try {
            System.out.println(scan.nextInt() / scan.nextInt());
            System.out.println("Fin de la division");
        } catch (ArithmeticException e) {
            System.out.println("Excepcion de tipo aritmetico");
        }
        System.out.println("FIN");

    }
}
