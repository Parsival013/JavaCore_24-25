package laba2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение: ");
        int num = scanner.nextInt();

        if (num % 3 == 0) {
            System.out.printf("Число %d делится на 0", num);
        } else {
            System.out.printf("Число %d не делится на 0", num);
        }

        scanner.close();
    }
}
