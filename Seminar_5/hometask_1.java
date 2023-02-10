// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package Seminar_5;

import java.util.HashMap;
import java.util.LinkedList;

public class hometask_1 {
    public static HashMap<String, LinkedList<String>> phoneBook = new HashMap<>();

    public static void addRecord(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phone);
        } else {
            LinkedList<String> phoneNumbers = new LinkedList<>();
            phoneNumbers.add(phone);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public static LinkedList<String> findRecord(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return null;
    }

    public static void main(String[] args) {
        
        addRecord("Василькова Елена", "+79216789099");
        addRecord("Василькова Елена", "+79102445989");
        addRecord("Василькова Елена", "+78464500087");

        addRecord("Березов Денис", "+79111356609");

        addRecord("Ромашкина Лидия", "+79183436009");
        addRecord("Ромашкина Лидия", "+78459901255");

        System.out.println(findRecord("Василькова Елена"));

        System.out.println(findRecord("Боярышников Владислав"));
    }
}
