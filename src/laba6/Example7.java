package laba6;
import java.util.Scanner;
public class Example7 {
    public static int[] charToCodes(char[] charArray) {
        int[] codes = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            codes[i] = (int) charArray[i];
        }
        return codes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку символов (без пробелов):");
        String input = scanner.next();

        char[] charArray = input.toCharArray();

        int[] result = charToCodes(charArray);
        System.out.println("Коды символов:");
        for (int code : result) {
            System.out.print(code + " ");
        }
    }
}
