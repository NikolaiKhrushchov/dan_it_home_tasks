package java_hw_2.task_2;

public class TaskWithRows2 {
    public static void main(String[] args) {
        String text = "Testing, is my favourite job";
        String[] jobs = text.split("\\s+");
        for (String job : jobs) {
            System.out.println("Word: " + job + ",Length: " + job.length());
        }
        boolean isFirstLongest = true;

        for (int i = 1; i < jobs.length; i++) {
            if (jobs[0].length() <= jobs[i].length()) {
                isFirstLongest = false;
                break;
            }
        }
        System.out.println(isFirstLongest);
    }
}
