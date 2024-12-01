package laba5;

import java.util.Scanner;

public class Example6 {
    private final int max;
    private final int min;

    public Example6() {
        this.max = 0;
        this.min = 0;
    }

    public Example6(int value) {
        this.max = value;
        this.min = 0;
    }

    public Example6(int value1, int value2) {
        if (value1 > value2) {
            this.max = value1;
            this.min = value2;
        } else {
            this.max = value2;
            this.min = value1;
        }
    }

    public void displayValues() {
        System.out.println("Минимальное значение (min): " + this.min);
        System.out.println("Максимальное значение (max): " + this.max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип создания объекта:");
        System.out.println("1 - Ввести одно значение (значение присваивается max, min = 0)");
        System.out.println("2 - Ввести два значения (меньшее присваивается min, большее max)");
        int choice = scanner.nextInt();

        Example6 obj;

        switch (choice) {
            case 1:
                System.out.println("Введите значение для max:");
                int value = scanner.nextInt();
                obj = new Example6(value);
                break;

            case 2:
                System.out.println("Введите первое число:");
                int num1 = scanner.nextInt();

                System.out.println("Введите второе число:");
                int num2 = scanner.nextInt();

                obj = new Example6(num1, num2);
                break;

            default:
                System.out.println("Некорректный выбор. Будет создан объект с значениями по умолчанию (max = 0, min = 0).");
                obj = new Example6();
                break;
        }

        System.out.println("\nЗначения полей объекта:");
        obj.displayValues();

        scanner.close();
    }
}
