package hw_11.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringPeople {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Ivan", "Ivanov", 22, 70000));
        persons.add(new Person("Petro", "Petrov", 72, 7000));
        persons.add(new Person("Anton", "Antonov", 34, 76000));
        persons.add(new Person("Igor", "Igorev", 75, 8000));
        persons.add(new Person("Stepan", "Stepanenko", 41, 42000));

        System.out.println("Initial list:");
        for (Person people : persons) {
            System.out.println(people);
        }
        List<String> youngNames = persons.stream()
                .filter(people -> people.getAge() < 70)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("\nNames of people under 70 years old:");
        System.out.println(youngNames);
    }
}
