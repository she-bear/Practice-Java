package Seminar_6;

import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class hometask_1 {
    public static void main(String[] args) throws ParseException, IOException {
        JSONParser parser = new JSONParser();

        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\laptop_db.json");
        FileReader reader = new FileReader(pathFile);

        JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

        JSONArray laptopsJsonArray = (JSONArray) rootJsonObject.get("laptops");

        HashSet<laptop> laptopSet = new HashSet<laptop>();

        for(Object it: laptopsJsonArray) {
            JSONObject laptopJsonObject = (JSONObject) it;

            laptop laptop_item = new laptop((int) (long) laptopJsonObject.get("id"), (String) laptopJsonObject.get("brand"));
            laptopSet.add(laptop_item);
        }

        Scanner iScanner = new Scanner(System.in);
        
        System.out.print("Добро пожаловать в каталог ноутбуков! Выберите действие:");

        int userInput = 100;
        while (userInput != 0) {
            System.out.println("""
                \n1 - печать всех товаров
                2 - поиск по каталогу
                0 - выход""");
                System.out.print("Ваш выбор: ");
                userInput = iScanner.nextInt();

            switch (userInput) {
                case 1:
                for (laptop item : laptopSet) {
                    System.out.println(item.brand);
                }
            }
        }
    }
}
