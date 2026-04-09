package hw_6_2.task_2;

public class TextEditor {
    public static void main(String[] args) {

        String text = "here is no such thing as a good influence, Mr. Gray. All influence is immoral—immoral from the scientific point of view.";

        TextProcessor upper = new UpperCaseProcessor();
        TextProcessor reverse = new ReverseProcessor();
        TextProcessor trim = new TrimProcessor();

        System.out.println("\n-------RESULT-------");
        System.out.println("\nUpperCaseProcessor: " + upper.process(text));
        System.out.println("\nReverseProcessor : " + reverse.process(text));
        System.out.println("\nTrimProcessor: " + trim.process(text));

        System.out.println("\n-------DEFAULT METHOD-------");
        System.out.println("\nUpperCaseProcessor: " + upper.removeDigits(text));
        System.out.println("\nReverseProcessor: " + reverse.removeDigits(text));
        System.out.println("\nTrimProcessor: " + trim.removeDigits(text));
    }
}
