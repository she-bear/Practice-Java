// Реализуйте очередь с помощью LinkedList со следующими методами:
//  - enqueue() - помещает элемент в конец очереди,
//  - dequeue() - возвращает первый элемент из очереди и удаляет его,
//  - first() - возвращает первый элемент из очереди, не удаляя.


package Seminar_4;

import java.util.LinkedList;

public class hometask_2 {
    public static void main(String[] args) {
        LinkedList<Integer> llQueue = new LinkedList<Integer>();

        // добавили элементы
        enqueue(llQueue, 55);
        enqueue(llQueue, 77);
        enqueue(llQueue, 99);
        System.out.println(llQueue);

        // вернули и удалили первый
        System.out.println(denqueue(llQueue));
        System.out.println(llQueue);

        // вернули первый, но не удалили
        System.out.println(getFirst(llQueue));
        System.out.println(llQueue);
    }

    public static LinkedList<Integer> enqueue (LinkedList<Integer> llist, int element) {
        
        llist.add(element);
        
        return llist;  
    }

    public static int denqueue (LinkedList<Integer> llist) {
        int first = llist.getFirst();
        llist.removeFirst();
        return first;
    }

    public static int getFirst(LinkedList<Integer> llist) {
        int first = llist.getFirst();
        return first;
    }
}
