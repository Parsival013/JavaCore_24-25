package laba6;
import java.util.Scanner;
public class Example8 {
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым!");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов массива:");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Размер массива должен быть больше нуля!");
            return;
        }

        int[] numbers = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        double average = calculateAverage(numbers);
        System.out.printf("Среднее значение массива: %.2f%n", average);
    }
}
