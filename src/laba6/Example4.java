package laba6;
import java.util.Scanner;
public class Example4 {
    public static long doubleFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определён только для неотрицательных чисел.");
        }
        long result = 1;

        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое неотрицательное число для вычисления двойного факториала:");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Ошибка: Факториал определён только для неотрицательных чисел.");
            return;
        }

        long result = doubleFactorial(n);
        System.out.println("Двойной факториал числа " + n + " равен: " + result);
    }
}
