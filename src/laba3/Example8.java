package laba3;

public class Example8 {
    public static void main(String[] args) {
        int size = 10;
        char[] array = new char[size];

        char letter = 'B';
        int index = 0;

        while (index < size) {
            if (letter != 'A' && letter != 'E' && letter != 'I' && letter != 'O' && letter != 'U') {
                array[index] = letter;
                index++;
            }
            letter++;
        }

        System.out.print("Содержимое массива: ");
        for (char ch : array) {
            System.out.print(ch + " ");
        }
    }
}
