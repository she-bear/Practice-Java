// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.
package Seminar_5;

import java.util.HashMap;

public class task_0 {
    public static void main(String[] args) {
        HashMap<Integer, String> userData = new HashMap<>();
        userData.put(123456, "Иванов");
        userData.put(321456, "Васильев");
        userData.put(234561, "Петрова");
        userData.put(234432, "Иванов");
        userData.put(654321, "Петрова");
        userData.put(345678, "Иванов");

        System.out.println(userData);

        for (Integer user : userData.keySet()) {
            if (userData.get(user) == "Иванов") {
                System.out.println(user);
            }
        }
    }
}
