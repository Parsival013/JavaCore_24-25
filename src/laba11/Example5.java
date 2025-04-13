package laba11;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите подстроку:");
        String subString = in.nextLine();
        //in.nextLine();

        String string = "Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки, которые имеют длину больше заданного значения.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");

        for(String e : strings) {
            System.out.println(e);
        }

        List<String> stringAfter = filterString(strings, subString);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterString (List<String> list, String subString) {
        return list.stream()
                .filter(s -> s.contains(subString))
                .collect(Collectors.toList());
    }
}
