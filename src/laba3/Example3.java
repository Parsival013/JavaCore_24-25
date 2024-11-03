package laba3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности Фибоначчи: ");
        int count = scanner.nextInt();

        System.out.println("\nПоследовательность Фибоначчи с использованием цикла for:");
        versionWithFor(count);

        System.out.println("\nПоследовательность Фибоначчи с использованием цикла while:");
        versionWithWhile(count);

        System.out.println("\nПоследовательность Фибоначчи с использованием цикла do-while:");
        versionWithDoWhile(count);

        scanner.close();
    }

    public static void versionWithFor(int count) {
        int first = 1, second = 1;
        System.out.print(first + " " + second);

        for (int i = 3; i <= count; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void versionWithWhile(int count) {
        int first = 1, second = 1;
        System.out.print(first + " " + second);
        int i = 3;

        while (i <= count) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
            i++;
        }

        System.out.println();
    }

    public static void versionWithDoWhile(int count) {
        int first = 1, second = 1;
        System.out.print(first + " " + second);
        int i = 3;

        do {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
            i++;
        } while (i <= count);

        System.out.println();
    }
}
