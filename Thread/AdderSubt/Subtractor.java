package Thread.AdderSubt;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    private Count c;
    private Lock lock;
    public Subtractor(Count c, Lock lock)
    {
        this.c = c;
        this.lock = lock;
    }

    @Override
    public void run() {
       for(int i=1;i<=100000000;i++)
       {
            lock.lock();
            c.value -= i; 
            lock.unlock();
       }
    }
}
