package com.pb.kocherga.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Введите 10 элементов массива:");
        Scanner scan = new Scanner(System.in);
        int[] k = new int[10];
        int sum = 0;
        int count = 0;
        boolean sort = false;
        int r;
        for (int i = 0; i < k.length; i++) {
            k[i] = scan.nextInt();
        }
        System.out.println("Заполненный массив:");
        for (int j : k) {
            sum = sum + j;
            System.out.print(j + " ");
            if (j >= 0) {
                count++;
            }
        }
        while (!sort) {
            sort = true;
            for (int i = 0; i < k.length - 1; i++) {
                if (k[i] > k[i + 1]) {
                    sort = false;

                    r = k[i];
                    k[i] = k[i + 1];
                    k[i + 1] = r;
                }
            }
        }
        System.out.println("\nСумма элеменов массива равна:\n" + sum);
        System.out.println("Количество положительных элементов массива равно:\n" + count);
        System.out.println("Отсортированный Пузырьком массив:");
        for (int j : k) {
            System.out.print(j + " ");
        }
    }
}