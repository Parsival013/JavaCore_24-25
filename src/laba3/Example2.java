package laba3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели: ");
        String day = scanner.nextLine().toLowerCase();

        System.out.println("Выберите метод определения дня недели:");
        System.out.println("1 - Использовать if-else");
        System.out.println("2 - Использовать switch");

        int choice = scanner.nextInt();

        if (choice == 1) {
            versionWithIfElse(day);
        } else if (choice == 2) {
            versionWithSwitchCase(day);
        } else {
            System.out.println("Неверный выбор.");
        }

        scanner.close();
    }

    public static void versionWithIfElse(String day) {
        if (day.equals("понедельник")) {
            System.out.println("Понедельник: 1");
        } else if (day.equals("вторник")) {
            System.out.println("Вторник: 2");
        } else if (day.equals("среда")) {
            System.out.println("Среда: 3");
        } else if (day.equals("четверг")) {
            System.out.println("Четверг: 4");
        } else if (day.equals("пятница")) {
            System.out.println("Пятница: 5");
        } else if (day.equals("суббота")) {
            System.out.println("Суббота: 6");
        } else if (day.equals("воскресенье")) {
            System.out.println("Воскресенье: 7");
        } else {
            System.out.println("Такого дня нет.");
        }
    }

    public static void versionWithSwitchCase(String day) {
        switch (day) {
            case "понедельник":
                System.out.println("Понедельник: 1");
                break;
            case "вторник":
                System.out.println("Вторник: 2");
                break;
            case "среда":
                System.out.println("Среда: 3");
                break;
            case "четверг":
                System.out.println("Четверг: 4");
                break;
            case "пятница":
                System.out.println("Пятница: 5");
                break;
            case "суббота":
                System.out.println("Суббота: 6");
                break;
            case "воскресенье":
                System.out.println("Воскресенье: 7");
                break;
            default:
                System.out.println("Такого дня нет.");
                break;
        }
    }
}
