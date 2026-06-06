package hw_6.task_1;

public class Dog extends Animal {

    public String bark = "Gav-gav";

    @Override
    public String toString() {
        return "Dog{" +
                "bark='" + bark + '\'' +
                ", eat='" + eat + '\'' +
                ", sleep='" + sleep + '\'' +
                '}';
    }
}
