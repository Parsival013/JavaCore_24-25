package laba11;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int sizeArr = in.nextInt();

        Random random = new Random();

        int[] firstArr = new int[sizeArr];
        int[] secondArr = new int[sizeArr];

        System.out.println("Исходныe массивы:");
        for(int i = 0; i < sizeArr; i++){
            firstArr[i] = random.nextInt(10);
            secondArr[i] = random.nextInt(10);
        }
        System.out.println("Первый массив: " + Arrays.toString(firstArr) + "\nВторой массив: " + Arrays.toString(secondArr));

        int[] resultArr = FindCommonElements(firstArr, secondArr);
        System.out.println("Полученный массив:");
        System.out.println(Arrays.toString(resultArr));
    }

    public static int[] FindCommonElements (int[] firstArr, int[] secondArr) {
        return Arrays.stream(firstArr)
                .filter(x -> Arrays.stream(secondArr)
                        .anyMatch(y -> y == x))
                .toArray();
    }
}
