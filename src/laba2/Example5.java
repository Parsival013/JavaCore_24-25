package laba2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение: ");
        int num = scanner.nextInt();

        int thousands = (num / 1000) % 10;

        System.out.println("В Вашем числе тысяч: " + Math.abs(thousands));

        scanner.close();
    }
}
