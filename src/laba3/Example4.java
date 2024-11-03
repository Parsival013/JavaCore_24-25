package laba3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int firstNum = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int secondNum = scanner.nextInt();

        int min = Math.min(firstNum, secondNum);
        int max = Math.max(firstNum, secondNum);

        System.out.println("\nВывод чисел с использованием цикла for:");
        versionWithFor(min, max);

        System.out.println("\nВывод чисел с использованием цикла while:");
        versionWithWhile(min, max);

        System.out.println("\nВывод чисел с использованием цикла do-while:");
        versionWithDoWhile(min, max);

        scanner.close();
    }

    public static void versionWithFor(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void versionWithWhile(int min, int max) {
        int i = min;
        while (i <= max) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static void versionWithDoWhile(int min, int max) {
        int i = min;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= max);
        System.out.println();
    }
}
