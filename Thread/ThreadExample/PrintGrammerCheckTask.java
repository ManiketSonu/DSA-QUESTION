package Thread.ThreadExample;

public class PrintGrammerCheckTask implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("GrammerCheck " + Thread.currentThread().getName());
    }
    
}
