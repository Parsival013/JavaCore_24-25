package laba1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели: ");
        String nedelia = in.nextLine();
        System.out.println("Введите месяц: ");
        String mesiac = in.nextLine();
        System.out.println("Введите дату: ");
        int dateNed = in.nextInt();

        System.out.println("Сегодня" +" "+ nedelia +" "+ dateNed +" "+ mesiac + "!");
        in.close();
    }
}
