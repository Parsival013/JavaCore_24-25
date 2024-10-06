package laba1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yearNow = 2024;
        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();
        yearNow = yearNow - age;
        System.out.println("Ваш год рождения:" +" "+ yearNow);
        in.close();
    }
}
