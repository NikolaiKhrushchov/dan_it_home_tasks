package hw_8.task_3.DequeueCollection;

import hw_8.task_2.Person;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueCycle {
    public static void main(String[] args) {
        Person person1 = new Person("Andriy","Andriev", 34);
        Person person2 = new Person("Sergiy","Sergiev", 21);
        Person person3 = new Person("Maksum","Maksumov", 24);
        Person person4= new Person("Petro","Petrov", 42);
        Person person5 = new Person("Igor","Igorov", 23);

        Deque<Person> persons = new ArrayDeque<>();
        persons.addLast(person1);
        persons.addLast(person2);
        persons.addLast(person3);
        persons.addLast(person4);
        persons.addLast(person5);

        System.out.println("We extract the element number 3 from the list:");

        System.out.println(persons);

        System.out.println(getSpecificValue(persons, 3));
    }

    public static Person getSpecificValue(Deque<Person> deque, int index) {
        Person result = null;
        int currentIndex = 0;
        for (Person value : deque) {
            if(currentIndex == index) {
                result = value;
                break;
            }
            currentIndex++;
        }
        return  result;
    }
}
