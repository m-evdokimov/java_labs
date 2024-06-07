package src.lab8.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class MyJsonCreator {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        JSONArray tasks = new JSONArray();

        JSONObject task1 = new JSONObject();
        task1.put("song", "Ява");
        task1.put("singer", "Сектор Газа");

        JSONObject task2 = new JSONObject();
        task2.put("song", "Группа крови");
        task2.put("singer", "Кино");

        tasks.add(task1);
        tasks.add(task2);

        jsonObject.put("songs", tasks);

        try (FileWriter file = new FileWriter("src/lab8/example2/my-json.json")) {
            file.write(jsonObject.toJSONString());
            System.out.println("JSON-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}