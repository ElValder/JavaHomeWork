package com.pb.kocherga.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = console.nextInt();
        if (x >= 0 && x < 15) {
            System.out.println("Интервал [0 - 14]");
        } else if (x >= 15 && x < 36) {
            System.out.println("Интервал [15 - 35]");
        } else if (x >= 36 && x < 51) {
            System.out.println("Интервал [36 - 50]");
        } else if (x >= 51 && x < 101) {
            System.out.println("Интервал [51 - 100]");
        } else {
            System.out.println("Число не попадает в один из имеющихся интервалов");
        }
    }
}