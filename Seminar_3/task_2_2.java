// Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class task_2_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>(20);

        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(10));
        }

        System.out.println(list);

        // перед частотным подсчетом нужно предварительно выполнить сортировку
        Collections.sort(list);
        System.out.println(list);

        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i+1)) {
                count++;
            } else {
                System.out.printf("%s - %s", list.get(i), count);
                System.out.println();
                count = 1;
            }
        }

        System.out.printf("%s - %s", list.get(list.size() - 1), count);

        Set<Integer> numbers = new TreeSet<Integer>(list);
        System.out.println(numbers);
    }
    
}
