package laba1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 1ое значение: ");
        int a = in.nextInt();
        System.out.println("Введите 2ое значение: ");
        int b = in.nextInt();
        int c=a;
        int d=b;
        a=a+b;
        c=c-d;
        System.out.println("Сумма:"+a);
        System.out.println("Разность:"+ c);
        in.close();
    }
}
