package hw_8.task_3.QueueCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        Queue<String> queue = new LinkedList<>();
        queue.offer("One");
        queue.offer("Two");
        queue.offer("Three");
        queue.offer("Four");
        queue.offer("Five");


        System.out.println("We output the 3rd element:");
        System.out.println(list.get(2));

        System.out.println("\nWe output the last element:");
        System.out.println(list.get(list.size() -1));

        System.out.println("\nWe display the element, but do not remove it from the collection.If the collection is empty, it will return an exception:");
        System.out.println(queue);
        System.out.println(queue.element());

        System.out.println("\nWe display the element, but do not remove it from the collection. If the collection is empty, it will return null:");
        System.out.println(queue);
        System.out.println(queue.peek());

        System.out.println("\nTakes the first element and removes it from the collection. If the collection is empty, it will return null:");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());

        System.out.println("\nIt does the same as poll, but if the collection is empty it will throw an exception:");
        System.out.println(queue);
        System.out.println(queue.remove());
    }
}
