package Thread.Executor;


import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {
    public static void main(String args[])
    {
        ExecutorService service = Executors.newFixedThreadPool(10); 
        
        Date currTime = new Date();
        for(int i=0;i<10;i++)
        {
            if(i==5)
            {
                System.out.println("between");
            }
            service.submit(new StringPrinterTask(String.valueOf(i)));
        }

        Date endTime = new Date();

        service.shutdown();
        System.out.println(endTime.getTime()-currTime.getTime());
    }
}
