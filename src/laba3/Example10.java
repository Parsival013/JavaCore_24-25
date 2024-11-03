package laba3;

import java.util.Arrays;
import java.util.Random;

public class Example10 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Массив после сортировки в порядке убывания: " + Arrays.toString(array));
    }
}
