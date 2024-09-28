package Thread.ThreadExample;

public class Driver {
    public static void main(String[] args) {
        PrintAutoCorrectTask task1 = new PrintAutoCorrectTask();
        PrintGrammerCheckTask task2 = new PrintGrammerCheckTask();

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}
