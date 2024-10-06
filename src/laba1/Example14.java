package laba1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите значение: ");
        int a = in.nextInt();
        int b=a;
        int c=a;
        int d=a;
        b--;
        c++;
        d=(a+b+c)*2;
        System.out.println("Последовательность:" +" "+ b+" "+ a +" "+ c+" "+d);
        in.close();
    }
}
