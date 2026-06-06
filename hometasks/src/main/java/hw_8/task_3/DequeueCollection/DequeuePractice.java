package hw_8.task_3.DequeueCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeuePractice {
    public static void main(String[] args) {
        Deque<String> dequeue = new ArrayDeque<String>();

        dequeue.addLast("Four");
        dequeue.addLast("Five");
        dequeue.addLast("Six");
        dequeue.addLast("Seven");
        dequeue.addLast("Nine");
        dequeue.addLast("Ten");
        dequeue.addLast("Seven");
        dequeue.addLast("Nine");
        dequeue.addLast("Five");
        dequeue.addLast("Ten");

        System.out.println("\nAdd two before one:");
        dequeue.addFirst("One");
        dequeue.addFirst("Two");
        System.out.println(dequeue);

        System.out.println("\nAdd three to the end of the collection:");
        dequeue.addLast("Three");
        System.out.println(dequeue);

        System.out.println("\nTakes the first element and does not remove it from the collection. If the collection is empty, it will print exception:");
        System.out.println(dequeue);
        System.out.println(dequeue.getFirst());

        System.out.println("\nTakes the last element and does not remove it from the collection. If the collection is empty, it will print exception:");
        System.out.println(dequeue);
        System.out.println(dequeue.getLast());

        System.out.println("\nTakes the first element and does not remove it from the collection. If the collection is empty, it will print null:");
        System.out.println(dequeue);
        System.out.println(dequeue.peekFirst());

        System.out.println("\nTakes the last element and does not remove it from the collection. If the collection is empty, it will print null:");
        System.out.println(dequeue);
        System.out.println(dequeue.peekLast());

        System.out.println("\nTakes the first element and removes it from the collection:");
        System.out.println(dequeue);
        System.out.println(dequeue.pollLast());
        System.out.println(dequeue);

        System.out.println("\nTakes the last element and removes it from the collection:");
        System.out.println(dequeue);
        System.out.println(dequeue.pollLast());
        System.out.println(dequeue);

        System.out.println("\nTakes an element and removes it from the collection. If the collection is empty, it will print exception:");
        System.out.println(dequeue);
        System.out.println(dequeue.pop());
        System.out.println(dequeue);

        System.out.println("\nTakes the first element and removes it from the collection:");
        System.out.println(dequeue);
        System.out.println(dequeue.removeFirst());
        System.out.println(dequeue);

        System.out.println("\nTakes the last element and removes it from the collection:");
        System.out.println(dequeue);
        System.out.println(dequeue.removeLast());
        System.out.println(dequeue);

        System.out.println("\nIt will return the  selected element from the collection and return true, if there are similar components further down the line, they will not be touched. Displays true on the screen:");
        System.out.println(dequeue);
        System.out.println(dequeue.removeFirstOccurrence("Seven"));
        System.out.println(dequeue);

        System.out.println("\nIt will return the selected component from the collection, reading the collection from right to left. If there is a repeating element further on, it will not touch it. Displays true on the screen:");
        System.out.println(dequeue);
        System.out.println(dequeue.removeLastOccurrence("Ten"));
        System.out.println(dequeue);
    }

}
