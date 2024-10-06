package laba1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yearNow = 2024;
        System.out.println("Введите год рождения: ");
        int yearAge = in.nextInt();
        yearNow = yearNow - yearAge;
        System.out.println("Вам" + " " + yearNow +" "+"лет!");
    }
}
