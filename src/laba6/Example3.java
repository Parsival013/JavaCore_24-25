package laba6;
import java.util.Arrays;
import java.util.Scanner;
public class Example3 {
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив чисел пуст!");
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив чисел пуст!");
        }
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double findAverage(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив чисел пуст!");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Количество чисел должно быть больше нуля.");
            return;
        }

        int[] numbers = new int[n];
        System.out.println("Введите числа:");

        for (int i = 0; i < n; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nМассив чисел: " + Arrays.toString(numbers));
        System.out.println("Максимальное значение: " + findMax(numbers));
        System.out.println("Минимальное значение: " + findMin(numbers));
        System.out.println("Среднее значение: " + findAverage(numbers));
    }
}
