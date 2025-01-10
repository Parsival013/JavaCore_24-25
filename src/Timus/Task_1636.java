package Timus;
import java.util.Scanner;
public class Task_1636 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qxx = in.nextInt();
        int zzz = in.nextInt();

        int[] tries = new int[10];
        int penalty = 0;
        for (int i = 0; i < tries.length; i++) {
            tries[i] = in.nextInt();
            penalty += tries[i];
        }

        int time = 20;
        time *= penalty;
        zzz -= time;

        if(zzz == qxx || zzz > qxx) {
            System.out.print("No chance.");
        } else {
            System.out.print("Dirty debug :(");
        }
    }
}
