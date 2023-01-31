// Создать список целых чисел (заполнить случайными числами).
// Найти минимальное, максимальное и среднее из этого списка.
package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class hometask_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }

        System.out.println(list);
        
        // max и min найдем через коллекции
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        // ищем среднее
        Integer sum = 0;
        for (Integer num: list) {
            sum += num;
        }

        System.out.println(sum.doubleValue() / list.size());

        // непонятное, но очень красивое решение со StackOverflow, просто, чтобы сравнить результат
        System.out.println(list.stream().mapToDouble(d -> d).average().orElse(0.0));
    }
}
