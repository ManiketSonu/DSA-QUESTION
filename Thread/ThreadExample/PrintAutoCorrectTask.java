package Thread.ThreadExample;

public class PrintAutoCorrectTask implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Autocorrect " + Thread.currentThread().getName());
    }
    
}
