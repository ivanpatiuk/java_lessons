package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String name = scanner.nextLine(); // Maria
        System.out.print("Введіть double: ");
        double a = scanner.nextDouble(); // 1.5
        System.out.println("Введений текст: " + name + ", введений double: " + a); // Maria1.5
    }
}