package com.pb.kocherga.hw4;

import java.util.Scanner;

public class Anagram {
    public static String sort(String x) {
        char[] content = x.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean lineCheck(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        return sort(a).equals(sort(b));
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String strA = console.nextLine();
        System.out.println("Введите вторую строку:");
        String strB = console.nextLine();
        if (lineCheck(strA, strB) == true) {
            System.out.println("Cтроки одинаковы");
        } else {
            System.out.println("Cтроки не одинаковы");
        }
    }
}