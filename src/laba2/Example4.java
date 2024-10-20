package laba2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение: ");
        int num = scanner.nextInt();

        if (num >= 5 && num <= 10) {
            System.out.printf("Число %d попадает в диапазон", num);
        } else {
            System.out.printf("Число %d не проходит по диапазону", num);
        }

        scanner.close();
    }
}
