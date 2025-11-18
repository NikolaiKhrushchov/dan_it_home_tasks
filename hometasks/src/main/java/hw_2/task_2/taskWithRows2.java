package hw_2.task_2;

public class taskWithRows2 {

    public static void main(String[] args) {
        String text = "Testing, is my favourite job";
        String[] jobs = text.split("\\s+");
        for (String job : jobs) {
            System.out.println("Слово: " + job + ",Довжина: " + job.length());
        }
        boolean isFirstLonger = true;

        if (jobs.length > 1) {
            for (int i = 1; i < jobs.length; i++) {
                if (jobs[0].length() <= jobs[i].length()) {
                    isFirstLonger = false;
                    break;
                }
            }
        } else {
            isFirstLonger = false;
        }
        System.out.println(isFirstLonger);
    }
}

