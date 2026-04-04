package hw_6.task_1;

public class Bird extends Animal {

    public String fly = "I fly";

    @Override
    public String toString() {
        return "Bird{" +
                "fly='" + fly + '\'' +
                ", eat='" + eat + '\'' +
                ", sleep='" + sleep + '\'' +
                '}';
    }
}
