package laba2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение: ");
        int num = scanner.nextInt();

        if (num % 5 == 2 && num % 7 == 1) {
            System.out.printf("Число %d делится и удовлетворяет критериям", num);
        } else {
            System.out.printf("Число %d не проходит критериям", num);
        }

        scanner.close();
    }
}
