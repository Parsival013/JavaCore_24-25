package laba3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        while (true) {
            System.out.print("Введите размер массива: ");
            try {
                size = Integer.parseInt(scanner.nextLine());
                if (size > 0) {
                    break;
                } else {
                    throw new IllegalArgumentException("Размер массива должен быть положительным числом.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        int[] array = new int[size];
        int number = 2;

        for (int i = 0; i < size; i++) {
            array[i] = number;
            number += 5;
        }

        System.out.print("Результат: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
