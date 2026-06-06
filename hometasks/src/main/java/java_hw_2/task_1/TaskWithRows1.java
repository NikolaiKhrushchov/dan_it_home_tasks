package java_hw_2.task_1;

public class TaskWithRows1 {
    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1 + ". The length of the message: " + string1.length());

        String string2 = string1.substring(0, 35);
        System.out.println(string2 + ". The length of the message: " + string2.length());

        String string3 = string2 + "it is perfect";
        System.out.println(string3 + ". The length of the message: " + string3.length());

    }
}
