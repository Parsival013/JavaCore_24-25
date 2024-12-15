package laba6;
import java.util.Scanner;
public class Example10 {
    public static int[] findMinMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив чисел не может быть пустым.");
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int count = scanner.nextInt();
        if (count <= 0) {
            System.out.println("Число элементов должно быть больше нуля!");
            return;
        }

        int[] numbers = new int[count];
        System.out.println("Введите числа:");

        for (int i = 0; i < count; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int[] minMax = findMinMax(numbers);

        System.out.println("Минимальное значение: " + minMax[0]);
        System.out.println("Максимальное значение: " + minMax[1]);
    }
}
