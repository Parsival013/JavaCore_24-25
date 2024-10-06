package laba1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите месяц: ");
        String mou = in.nextLine();
        String okb="Октябрь";
        System.out.println("Введите сколько дней в этом месяце: ");
        int dateNed = in.nextInt();
        if (dateNed==31){
            System.out.println("Вы ответили правильно");
        }
        in.close();
    }
}
