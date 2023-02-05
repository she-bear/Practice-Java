// Создать LinkedList целых чисел (заполнить случайными числами).
// Реализуйте метод, который вернет “перевернутый” список.
package Seminar_4;

import java.util.LinkedList;
import java.util.Random;

public class hometask_1 {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }

        System.out.println(list);
        System.out.println(turnOver(list));
    }

    public static LinkedList<Integer> turnOver(LinkedList<Integer> llist) {
        LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
        for (int i = llist.size() - 1; i >= 0; i--) { 
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;
    }
}
