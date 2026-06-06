package hw_8.task_2;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        people.add(new Person("Ivan", "Ivanov", 25));
        people.add(new Person("Igor", "Igorev", 31));

        people.add(new Person("Ivan", "Ivanov", 25));
        people.add(new Person("Igor", "Igorev", 31));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Vasya", "Pupkin", 46));
        personList.add(new Person("Nadia", "Smuk", 18));


        System.out.println(people);
        System.out.println("Number of people on the list: " + people.size());
        System.out.println(people.remove(new Person("Igor", "Igorev", 31)));
        System.out.println(people.contains(new Person("Ivan", "Ivanov", 25)));

        people.addAll(personList);
        System.out.println(people);
    }
}

