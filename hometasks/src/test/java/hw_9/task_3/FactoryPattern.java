package hw_9.task_3;

public class FactoryPattern {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.createAnimal("dog");
        Animal cat = factory.createAnimal("cat");
        Animal bird = factory.createAnimal("bird");

        System.out.println("The dog say: ");
        dog.speak();

        System.out.println("\nThe cat say: ");
        cat.speak();

        System.out.println("\nThe bird say: ");
        bird.speak();
    }
}
