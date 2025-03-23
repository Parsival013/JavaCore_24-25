package laba10.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONParserv3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить новую задачу");
            System.out.println("2. Поиск задачи");
            System.out.println("3. Удалить задачу");
            System.out.println("4. Отобразить все задачи");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = in.nextInt();
            in.nextLine();

            try {
                switch (choice) {
                    case 1:
                        AddTask(in);
                        break;
                    case 2:
                        SearchTask(in);
                        break;
                    case 3:
                        DeleteTask(in);
                        break;
                    case 4:
                        ShowJSON();
                        break;
                    case 5: {
                        System.out.println("Выход из программы.");
                        in.close();
                        return;
                    }
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static JSONObject LoadJSON() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src/laba10/JSONParser/zadanie-json.json"));
        return (JSONObject) obj;
    }

    private static void SaveJSON(JSONObject json) throws IOException {
        try (FileWriter writer = new FileWriter("src/laba10/JSONParser/zadanie-json.json")) {
            writer.write(json.toString()); // Форматирование с отступами
        }
    }

    public static void ShowJSON(){
        try {
            JSONObject jsonObject = LoadJSON();
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("employee");

            for (Object o : jsonArray){
                JSONObject employee = (JSONObject) o;
                System.out.println("\nТекущий элемент task");
                System.out.println("Название задачи: " + employee.get("taskName"));
                System.out.println("Описание задачи: " + employee.get("taskDescription"));
                System.out.println("Статус: " + employee.get("status"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void AddTask(Scanner in) throws IOException, ParseException {
        JSONObject jsonObject = LoadJSON();
        JSONArray jsonArray = (JSONArray) jsonObject.get("task");

        System.out.print("Введите название задачи: ");
        String taskName = in.nextLine();
        System.out.print("Введите описание задачи: ");
        String taskDescription = in.nextLine();
        System.out.print("Введите статус задачи: ");
        String status = in.nextLine();

        JSONObject newTask = new JSONObject();
        newTask.put("taskName", taskName);
        newTask.put("taskDescription", taskDescription);
        newTask.put("status", status);
        jsonArray.add(newTask);

        SaveJSON(jsonObject);

        System.out.println("Сотрудник успешно добавлен!");
    }

    public static void SearchTask(Scanner in) throws IOException, ParseException {
        JSONObject jsonObject = LoadJSON();
        JSONArray jsonArray = (JSONArray) jsonObject.get("task");
        System.out.print("Введите название задачи: ");
        String taskName = in.nextLine();

        System.out.println("\nРезультаты поиска:");
        jsonArray.forEach(employee -> {
            if (employee instanceof JSONObject) {
                JSONObject emp = (JSONObject) employee;
                String empName = (String) emp.get("taskName");
                if (taskName.equals(empName)) {
                    System.out.println("\nТекущий элемент: task");
                    System.out.println("Задача: " + emp.get("taskName"));
                    System.out.println("Описание: " + emp.get("taskDescription"));
                    System.out.println("Статус: " + emp.get("status"));
                }
            }
        });
    }

    public static void DeleteTask(Scanner in) throws IOException, ParseException {
        JSONObject jsonObject = LoadJSON();
        JSONArray jsonArray = (JSONArray) jsonObject.get("task");
        System.out.print("Введите задачу для удаления: ");
        String fullName = in.nextLine();

        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()){
            JSONObject task = (JSONObject) iterator.next();
            if (fullName.equals(task.get("taskName"))){
                iterator.remove();
            }
        }

        System.out.println("Задача удалена.");
        SaveJSON(jsonObject);
    }
}
