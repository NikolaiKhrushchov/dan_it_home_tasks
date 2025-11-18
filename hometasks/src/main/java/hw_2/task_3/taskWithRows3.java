package hw_2.task_3;

public class taskWithRows3 {

    public static void main(String[] args) {
        String text = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
        char charToCount = 'a';
        String lowerCaseString = text.toLowerCase();
        String[] parts = lowerCaseString.split(String.valueOf(charToCount));
        int count = parts.length - 1;
        System.out.println("Кількість входжень символу 'a' в рядок:" + count);
    }
}

