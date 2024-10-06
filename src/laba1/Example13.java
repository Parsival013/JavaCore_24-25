package laba1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое значение: ");
        int a = in.nextInt();
        System.out.println("Введите второе значение: ");
        int b = in.nextInt();
        int c=a+b;
        System.out.println("Сумма равна:" +" "+ c);
        in.close();
    }
}
