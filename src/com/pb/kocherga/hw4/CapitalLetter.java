package com.pb.kocherga.hw4;

import java.util.Scanner;

public class CapitalLetter {
    static String toUpperCase(String phrase) {
        StringBuffer sb = new StringBuffer(phrase);
        for (int i = 0; i < sb.length(); i++)
            if (i == 0 || sb.charAt(i - 1) == ' ')
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку:");
        String phrase = console.nextLine();
        System.out.println(toUpperCase(phrase));
    }
}