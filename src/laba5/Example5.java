package laba5;

import java.util.Scanner;

public class Example5 {
    private int value;

    public Example5(int value) {
        setValue(value);
    }

    public void setValue() {
        this.value = 0;
    }

    public void setValue(int value) {
        this.value = Math.min(value, 100);
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите способ создания объекта:");
        System.out.println("1. Ввести значение вручную");
        System.out.println("2. Использовать значение по умолчанию (0)");

        int choice = scanner.nextInt();

        Example5 obj;

        switch (choice) {
            case 1:
                System.out.print("Введите значение (если ничего не введено, будет 0): ");
                scanner.nextLine();
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    obj = new Example5(0);
                } else {
                    int value = Integer.parseInt(input);
                    obj = new Example5(value);
                }
                break;
            case 2:
            default:
                obj = new Example5(0);
                break;
        }

        System.out.println("Значение поля объекта: " + obj.getValue());

        System.out.print("Хотите изменить значение? (да/нет): ");
        String response = scanner.next();
        if (response.equalsIgnoreCase("да")) {
            System.out.print("Введите новое значение (если ничего не введено, будет 0): ");
            scanner.nextLine();
            String newValue = scanner.nextLine();
            if (newValue.isEmpty()) {
                obj.setValue();
            } else {
                obj.setValue(Integer.parseInt(newValue));
            }
            System.out.println("Новое значение поля объекта: " + obj.getValue());
        } else {
            System.out.println("Значение поля осталось без изменений: " + obj.getValue());
        }

        scanner.close();
    }
}
