package Thread.Executor;

public class StringPrinterTask implements Runnable{

    public String toBePrinted;

    public StringPrinterTask(String toBePrinted)
    {
        this.toBePrinted = toBePrinted;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Printing the input String: " + this.toBePrinted + "Thread: " + 
            Thread.currentThread().getName());
    }
    
}
