package com.pb.kocherga.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите два числа:");
        int operand1 = console.nextInt();
        int operand2 = console.nextInt();
        System.out.println("Введите знак +,-,*,/");
        String sign = console.next();
        switch (sign) {
            case "+":
                System.out.println("Результат = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Результат = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Результат = " + operand1 * operand2);
                break;
            case "/":
                if (operand1 == 0)
                    System.out.println("На ноль дельть нельзя");
                else
                    System.out.println("Результат = " + operand1 / operand2);
        }
    }
}
