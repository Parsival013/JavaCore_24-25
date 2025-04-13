package laba11;
import java.util.List;
import java.util.stream.Collectors;
public class Example3 {
    public static void main(String[] args) {

        String string = "Напишите Функцию, Которая принимает На вход список строк и\n" +
                "Возвращает новый Список, содержащий Только те Строки, которые\n" +
                "начинаются С большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");

        for(String e : strings) {
            System.out.println(e);
        }

        List<String> stringAfter = filterCapitalizedStrings(strings);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for (String e : stringAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterCapitalizedStrings (List<String> list) {
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
