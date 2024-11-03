package laba3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(51);
        }

        System.out.print("Содержимое массива: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int min = array[0];
        List<Integer> minIndex = new ArrayList<>();

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                minIndex.add(i);
            }
        }

        System.out.println("Минимальное значение: " + min);
        System.out.println("Индексы элементов с минимальным значением: " + minIndex);
    }
}
