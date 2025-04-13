package laba11;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int sizeArr = in.nextInt();

        Random random = new Random();

        int[] integers = new int[sizeArr];

        System.out.println("Исходный массив:");
        for(int i = 0; i < sizeArr; i++){
            integers[i] = random.nextInt(200);
            System.out.println(integers[i]);
        }

        int[] evenArr = filterEvenNumbers(integers);
        System.out.println("Полученный массив:");
        System.out.println(Arrays.toString(evenArr));
    }

    public static int[] filterEvenNumbers (int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}
