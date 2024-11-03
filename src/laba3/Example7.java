package laba3;



public class Example7 {
    public static void main(String[] args) {
        int size = 10;
        char[] array = new char[size];

        char letter = 'a';
        for (int i = 0; i < size; i++) {
            array[i] = letter;
            letter += 2;
        }

        System.out.print("Массив в прямом порядке: ");
        for (char ch : array) {
            System.out.print(ch + " ");
        }

        System.out.print("\nМассив в обратном порядке: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
