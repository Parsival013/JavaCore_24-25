package laba1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yearNow = 2024;
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.println("Введите ваш год рождения: ");
        int yearAge = in.nextInt();
        yearNow = yearNow - yearAge;
        System.out.println("Привет" + " " + name +"!" +" "+"Вам:" +" "+ yearNow);
        in.close();
    }
}
