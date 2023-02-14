package Seminar_6;

import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class hometask_1 {

    static HashSet<laptop> laptopSet = new HashSet<laptop>();

    public static void main(String[] args) throws ParseException, IOException {
        JSONParser parser = new JSONParser();

        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\laptop_db.json");
        FileReader reader = new FileReader(pathFile);

        JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

        JSONArray laptopsJsonArray = (JSONArray) rootJsonObject.get("laptops");

        for(Object it: laptopsJsonArray) {
            JSONObject laptopJsonObject = (JSONObject) it;

            laptop laptop_item = new laptop((int) (long) laptopJsonObject.get("id"),
                                            (String) laptopJsonObject.get("brand"),
                                            (String) laptopJsonObject.get("model"),
                                            (int) (long) laptopJsonObject.get("RAM"),
                                            (int) (long) laptopJsonObject.get("SSD"),
                                            (String) laptopJsonObject.get("color"),
                                            (String) laptopJsonObject.get("system"),
                                            (int) (long) laptopJsonObject.get("price"));
            laptopSet.add(laptop_item);
        }

        Scanner iScanner = new Scanner(System.in);

        System.out.print("Добро пожаловать в каталог ноутбуков! Выберите действие:");

        int userInput = 200;
        while (userInput != 0) {
            try {
                System.out.println("""
                    \n1 - печать всех товаров
                    2 - поиск по каталогу
                    0 - выход""");
                System.out.print("Ваш выбор: ");

                userInput = iScanner.nextInt();

                switch (userInput) {
                    case 0:
                        break;
                    case 1:
                        for (laptop item : laptopSet) {
                            System.out.println(item);
                        }
                        break;
                    case 2:
                        findLaptopItem(iScanner);
                        break;
                    default:
                        System.out.print("Неверный ввод типа операции, повторите:");
                }
            } catch (InputMismatchException ex) {
                iScanner.next();
                System.out.println("Неверный ввод, повторите:");
            }
        }
        iScanner.close();
    }

    public static void findLaptopItem(Scanner iScanner){
        System.out.print("Начинаем искать! Выберите критерий поиска:");

        int userInput = 200;
        while (userInput != 0) {
            try {
                System.out.println("""
                        \n1 - по производителю
                        2 - по объему RAM
                        3 - по объему SSD
                        4 - по цвету
                        0 - возврат в главное меню""");

                System.out.print("Ваш выбор: ");

                userInput = iScanner.nextInt();

                switch (userInput) {
                    case 0:
                        break;
                    case 1:
                        System.out.print("Введите производителя: ");
                        String choiceBrand = iScanner.next();
                        printSearchResults(laptop.findBrand(laptopSet, choiceBrand.toUpperCase()));
                        break;
                    case 2:
                        System.out.print("Введите объем RAM: ");
                        int choiceRam = iScanner.nextInt();
                        printSearchResults(laptop.findRAM(laptopSet, choiceRam));
                        break;
                    case 3:
                        System.out.print("Введите объем SSD: ");
                        int choiceSSD = iScanner.nextInt();
                        printSearchResults(laptop.findSSD(laptopSet, choiceSSD));
                        break;
                    case 4:
                        System.out.print("Введите цвет: ");
                        String choiceColor = iScanner.next();
                        printSearchResults(laptop.findColor(laptopSet, choiceColor));
                        break;
                    default:
                        System.out.print("Неверный ввод критерия поиска, повторите:");
                }
            } catch (InputMismatchException ex) {
                iScanner.next();
                System.out.println("Неверный ввод, повторите:");
            }
        }
    }

    // вывод результатов поиска
    public static void printSearchResults(List<laptop> printList){
        if (printList.size() == 0) {
            System.out.println("По Вашему запросу ничего не найдено...");
            return;
        }
        for (laptop item : printList) {
            System.out.println(item);
        }
    }
}
