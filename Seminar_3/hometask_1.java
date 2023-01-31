package Seminar_3;
// Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class hometask_1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>(20);
        
        // заполняем случайными числами
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(20));
        }

        System.out.println(list);

        Iterator<Integer> iterList = list.iterator();

        while (iterList.hasNext()) {
            //получаем следующий элемент
            Integer nextList = iterList.next();
            // более "быстрая" операция проверки на четность, чем %
            if ( (nextList & 1) == 0 ) {
                iterList.remove();
            }
        }

        System.out.println(list);
    }    
}
