package laba6;

public class Example2 {
    private static int counter = 0;

    public static void showAndIncrement() {
        System.out.println("Текущее значение: " + counter);
        counter++;
    }

    public static void main(String[] args) {
        System.out.println("Запуск программы");

        for (int i = 0; i < 5; i++) {
            Example2.showAndIncrement();
        }
    }
}
