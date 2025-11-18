package hw_2.task_1;

public class taskWithRows1 {

    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1);
        System.out.println("Довжина повідомлення: " + string1.length());
        System.out.println();

        String string2 = string1;
        System.out.println(string2.substring(0,35));
        System.out.println("Довжина повідомлення: " + string2.substring(0,35).  length());
        System.out.println();

        String string3 = string2 + "it is perfect";
        System.out.println(string3);
        System.out.println("Довжина повідомлення: " + string3. length());
        System.out.println();
    }
}
