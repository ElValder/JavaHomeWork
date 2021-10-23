package com.pb.kocherga.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Игра - Угадайте число от 0 до 1000\nДля выхода из программы введите" + "-1\nДля начала игры введите число");
        Random random = new Random();
        int attempt = 0;
        int x = random.nextInt(1000);
        Scanner in = new Scanner(System.in);
        int value = -1;
        while (x != value) {
            attempt++;
            value = in.nextInt();
            if (value == -1) {
                break;
            }
            if (value > x) {
                System.out.println("Это число меньше");
            }
            if (value < x) {
                System.out.println("Это число больше");
            }
            if (value != x) {
                continue;
            }
            System.out.println("Поздравляем, Вы угадали число с " + attempt + " попытки!");
            break;
        }
        System.out.println("Конец игры!");
    }
}
