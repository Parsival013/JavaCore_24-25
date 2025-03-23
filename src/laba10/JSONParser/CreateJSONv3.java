package laba10.JSONParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class CreateJSONv3 {
    public static void main(String[] args) {

        JSONObject tasks = new JSONObject();
        JSONArray task = new JSONArray();

        JSONObject task1 = new JSONObject();
        task1.put("taskName", "Учеба");
        task1.put("taskDescription", "Посетить 4 пары");
        task1.put("status", "Новый");


        JSONObject task2 = new JSONObject();
        task2.put("taskName", "Тест");
        task2.put("taskDescription", "Пройти тестирование");
        task2.put("status", "Завершено");

        task.add(task1);
        task.add(task2);

        tasks.put("task", task);

        try (FileWriter file = new FileWriter("src/laba10/JSONParser/zadanie-json.json")){
            file.write(tasks.toJSONString());
            System.out.println("Json файл успешно создан!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
