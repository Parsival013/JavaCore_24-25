package laba6;
import java.util.Arrays;
import java.util.Scanner;
public class Example6 {
    public static int[] getArrayPart(int[] array, int k) {
        if (k >= array.length) {
            return Arrays.copyOf(array, array.length);
        }
        return Arrays.copyOf(array, k);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Ошибка: размер массива должен быть больше 0.");
            return;
        }

        int[] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Введите число k (количество элементов для возврата):");
        int k = scanner.nextInt();
        if (k <= 0) {
            System.out.println("Ошибка: k должно быть больше 0.");
            return;
        }

        int[] result = getArrayPart(array, k);
        System.out.println("Результирующий массив: " + Arrays.toString(result));
    }
}
