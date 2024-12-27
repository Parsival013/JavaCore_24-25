package Timus;
import java.util.Scanner;
public class Task_1924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        if(sum % 2 == 0) {
            System.out.print("black");
        } else {
            System.out.print("grimy");
        }
    }
}
