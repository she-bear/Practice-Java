// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
package Seminar_4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class task_3 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        Stack<Integer> newStack = turnToStack(array);
        
        System.out.println(newStack);

        System.out.println(newStack.pop());

        Queue<Integer> newQueue = turnToQueue(array);
        System.out.println(newQueue);
        for (int i = 0; i < array.length; i++) {
            System.err.println(newQueue.poll());
        }
        System.out.println(newQueue);
    }

    public static Stack<Integer> turnToStack(Integer[] array) {
        Stack<Integer> stack = new Stack<Integer>();
        for (Integer item: array) {
            stack.push(item);
        }
        return stack;
    }
    
    public static Queue<Integer> turnToQueue(Integer[] array) {
        Queue<Integer> Queue_input = new LinkedList<Integer>();
        for (Integer item: array) {
            Queue_input.add(item);
        }
        return Queue_input;
    }
}
