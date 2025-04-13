package laba11;
import java.util.List;
import java.util.stream.Collectors;
public class Example9 {
    public static void main(String[] args) {

        String string = "Lorem ipsum dolor sit a5met, consectetur adi/piscing elit, s13ed d32o eius3mod tempor incidi44dunt ut labo643re e3t dolore ma//gna ali54qua.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");

        for(String e : strings) {
            System.out.println(e);
        }

        List<String> stringAfter = StringFilter(strings);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringAfter) {
            System.out.println(e);
        }
    }

    public static List<String> StringFilter (List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
