package laba3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел для суммирования: ");
        int count = scanner.nextInt();

        System.out.println("\nРезультат с циклом for:");
        versionWithFor(count);

        System.out.println("\nРезультат с циклом while:");
        versionWithWhile(count);

        System.out.println("\nРезультат с циклом do-while:");
        versionWithDoWhile(count);
    }

    public static void versionWithFor(int count) {
        int sum = 0;
        int foundNumbers = 0;

        for (int i = 1; foundNumbers < count; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
                foundNumbers++;
            }
        }
        System.out.println("\nСумма чисел: " + sum);
    }

    public static void versionWithWhile(int count) {
        int sum = 0;
        int foundNumbers = 0;
        int i = 1;

        while (foundNumbers < count) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
                foundNumbers++;
            }
            i++;
        }
        System.out.println("\nСумма чисел: " + sum);
    }

    public static void versionWithDoWhile(int count) {
        int sum = 0;
        int foundNumbers = 0;
        int i = 1;

        do {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
                foundNumbers++;
            }
            i++;
        } while (foundNumbers < count);

        System.out.println("\nСумма чисел: " + sum);
    }
}
