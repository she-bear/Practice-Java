// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.
package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10));
        }

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
