package hw_6.task_1;

public class Fish extends Animal {

    public String swim = "I swimming";

    @Override
    public String toString() {
        return "Fish{" +
                "sleep='" + sleep + '\'' +
                ", eat='" + eat + '\'' +
                ", swim='" + swim + '\'' +
                '}';
    }
}
