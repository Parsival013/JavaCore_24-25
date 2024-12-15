package laba6;
import java.util.Scanner;
public class Example9 {
    public static void swapArrayElements(char[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        scanner.nextLine();

        if (size <= 0) {
            System.out.println("Размер массива должен быть больше нуля!");
            return;
        }

        char[] array = new char[size];
        System.out.println("Введите элементы массива (символы):");

        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scanner.nextLine().charAt(0);
        }

        System.out.println("Исходный массив:");
        for (char c : array) {
            System.out.print(c + " ");
        }

        swapArrayElements(array);

        System.out.println("\nМассив после обмена элементов:");
        for (char c : array) {
            System.out.print(c + " ");
        }
    }
}
