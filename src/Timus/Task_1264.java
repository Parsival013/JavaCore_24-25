package Timus;

import java.util.Scanner;

public class Task_1264 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int numberOfM = m + 1;
        int result = n * numberOfM;

        System.out.println(result);
    }
}
