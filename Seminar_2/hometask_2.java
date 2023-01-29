// Вход: [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Выход: 
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
package Seminar_2;

import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class hometask_2 {
    public static void main(String[] args) throws ParseException, IOException {

        JSONParser parser = new JSONParser();

        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\user.json");
        FileReader reader = new FileReader(pathFile);

        JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

        StringBuilder sb = new StringBuilder();

        String name = (String) rootJsonObject.get("name");
        System.out.println(name);

        JSONArray peopleJsonArray = (JSONArray) rootJsonObject.get("people");
        
        for(Object it: peopleJsonArray) {
            JSONObject peopleJsonObject = (JSONObject) it;

            String namePeople = (String) peopleJsonObject.get("фамилия");
            String mark = (String) peopleJsonObject.get("оценка");
            String subject = (String) peopleJsonObject.get("предмет");

            sb = new StringBuilder("Студент ").append(namePeople).append(" получил ").append(mark).append(" по предмету ").append(subject);

            System.out.println(sb);
        }
    }
}