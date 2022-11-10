package org.example;

public class Loops {
    public static void main(String[] args) {

        int x = 1;
        int y = 5;

        do {
            y += x; // y=y+x
            // 1 крок y = 2
            // 2 крок y = 3
            // 3 крок y = 4
            // 4 крок y = 5
        } while (y < 5);

        int z = 5;

        while (z < 5) {
            z += x;
        }

        int a = 1;

        // Написати цикл, який додасть всі числа кратні 3 або 5 в діапазоні
        // [0;100)
        // 3 5 6 9 12 15 18 21 24 27 30 33
        int sum = 0;
        for (int i = 3; i < 100; ++i) {
            if(i % 3 == 0 || i % 5 == 0){
                System.out.println("i = " + i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
