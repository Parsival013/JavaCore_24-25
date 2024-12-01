package laba5;

public class Example2 {
    private final char startChar;
    private final char endChar;

    public Example2(char startChar, char endChar) {
        this.startChar = startChar;
        this.endChar = endChar;
    }

    public void printCharRange() {
        char lower = (char) Math.min(startChar, endChar);
        char upper = (char) Math.max(startChar, endChar);

        System.out.print("Символы в диапазоне: ");
        for (char c = lower; c <= upper; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Example2 charRange = new Example2('A', 'D');

        charRange.printCharRange();

        Example2 charRange2 = new Example2('d', 'a');
        charRange2.printCharRange();
    }
}
