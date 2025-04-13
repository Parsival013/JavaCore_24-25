package laba11;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class Example4 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++){
            integers.add(random.nextInt(10));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = SquareList(integers);

        System.out.println("\n" + "Список после возведения: " + "\n");
        for(Integer n : integersAfter) {
            System.out.println(n);
        }
    }

    public static List<Integer> SquareList(List<Integer> list) {
        return list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}
