// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
package Seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class task_0 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        // Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>(10000);
        
        for (int i = 0; i < 1000000; i++) {
            list.add(1);
        }

        System.out.println(System.currentTimeMillis() - s);

        s = System.currentTimeMillis();
        LinkedList<Integer> llist = new LinkedList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            llist.add(1);
        }

        System.out.println(System.currentTimeMillis() - s);
    }
}
