package laba6;
import java.util.Scanner;
public class Example5 {
    public static long sumOfSquares(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Число должно быть натуральным (больше 0).");
        }

        return (long) n * (n + 1) * (2L * n + 1) / 6;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите натуральное число n для вычисления суммы квадратов чисел от 1 до n:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: Введено некорректное значение. Число должно быть натуральным (больше 0).");
            return;
        }

        long result = sumOfSquares(n);
        System.out.println("Сумма квадратов чисел от 1 до " + n + " равна: " + result);
    }
}
