package Timus;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class Task_1126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Deque<Integer> deque = new LinkedList<>();
        LinkedList<Integer> maxValues = new LinkedList<>();
        int index = 0;

        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();

            while (!deque.isEmpty() && deque.peekFirst() <= index - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && value >= maxValues.get(deque.peekLast())) {
                deque.pollLast();
            }

            deque.addLast(index);
            maxValues.add(value);

            if (index >= k - 1) {
                System.out.println(maxValues.get(deque.peekFirst()));
            }
            index++;
        }
    }
}
