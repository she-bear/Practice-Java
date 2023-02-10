// Пусть дан список сотрудников:
// ...
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
// Указание с семинара: можно считать, что набор фамилий уникален
package Seminar_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hometask_2 {
    public static void main(String[] args) {
        String[] workersList = {"Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Иван Савин", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                                "Иван Мечников", "Петр Петин", "Иван Ежов"};

        // здесь будем хранить неотсортированный словарь
        HashMap<String, Integer> workersNames = new HashMap<String, Integer>();

        ArrayList<Integer> list = new ArrayList<>();
        // отсортированный словарь
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        for (String item : workersList) {
            // имя + фамилия
            String[] splitName = item.split(" ");
            // проверяем, если такое имя в списке
            if (workersNames.containsKey(splitName[0])) {
                workersNames.put(splitName[0], workersNames.get(splitName[0]) + 1);
            } else {
                workersNames.put(splitName[0], 1);
            }
        }

        // переместим частоты в отдельный список
        for (Map.Entry<String, Integer> entry: workersNames.entrySet()) {
            list.add(entry.getValue());
        }
        // отсортируем
        list.sort(Collections.reverseOrder());
        for (int num : list) {
            for (Entry<String, Integer> entry : workersNames.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }

        System.out.println(sortedMap);
    }
}
