package laba11;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите делитель:");
        int divider = in.nextInt();

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++){
            integers.add(random.nextInt(10));
            System.out.println(integers.get(i));
        }

        List<Integer> resultList = DivideListByDivider(integers, divider);

        System.out.println("\n" + "Список после: " + "\n");
        for(Integer n : resultList) {
            System.out.println(n);
        }
    }

    public static List<Integer> DivideListByDivider(List<Integer> list, int divider) {
        return list.stream()
                .filter(x -> x % divider == 0)
                .collect(Collectors.toList());
    }
}
