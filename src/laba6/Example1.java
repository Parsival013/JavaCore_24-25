package laba6;
import java.util.Scanner;
public class Example1 {
    private char symbol;
    private String text;

    public void setValue(char symbol) {
        this.symbol = symbol;
    }

    public void setValue(String text) {
        this.text = text;
    }

    public void setValue(char[] symbols) {
        if (symbols.length == 1) {
            this.symbol = symbols[0];
        } else {
            this.text = new String(symbols);
        }
    }

    public void printValues() {
        System.out.println("Symbol: " + symbol);
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        Example1 task = new Example1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Присвоить символ");
            System.out.println("2. Присвоить текст");
            System.out.println("3. Присвоить массив символов");
            System.out.println("4. Показать значения");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Введите один символ: ");
                    char symbol = scanner.nextLine().charAt(0);
                    task.setValue(symbol);
                    break;

                case 2:
                    System.out.print("Введите текст: ");
                    String text = scanner.nextLine();
                    task.setValue(text);
                    break;

                case 3:
                    System.out.print("Введите массив символов (без пробелов): ");
                    String symbolsInput = scanner.nextLine();
                    task.setValue(symbolsInput.toCharArray());
                    break;

                case 4:
                    task.printValues();
                    break;

                case 5:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор, попробуйте снова.");
            }
        }
    }
}
