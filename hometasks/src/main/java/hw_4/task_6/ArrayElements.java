package hw_4.task_6;


public class ArrayElements {
    public static void main(String[] args) {

        int[] array = new int[45];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101 - 50 );
        }
        int min = array[0];
        int max = array[0];

        for (int numbers : array) {
            if (numbers < min) min = numbers;
            if (numbers > max) max = numbers;
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
