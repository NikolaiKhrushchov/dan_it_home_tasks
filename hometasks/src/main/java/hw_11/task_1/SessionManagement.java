package hw_11.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class SessionManagement {
    public static void main(String[] args) {
        MyBrowser browser = new MyBrowser();
        MyFile file = new MyFile();

        List<CanBeClosed> sessionList = new ArrayList<>();
        sessionList.add(browser);
        sessionList.add(file);

        SessionCloser closer = elements -> {
            for (CanBeClosed element : elements) {
                element.close();
            }
        };
        closer.closeSession(sessionList);
    }
}