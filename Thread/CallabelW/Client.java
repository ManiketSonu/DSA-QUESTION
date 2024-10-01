package Thread.CallabelW;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(7, 3, 4, 1, 9, 8, 2, 6);

        // s.1 create executor service
        ExecutorService executorService = Executors.newFixedThreadPool(12);

        //s.2 create task for mergesort
        MergeSorter mergeSorter = new MergeSorter(list, executorService);

        //s.3 passing the task to executor service
        Future<List<Integer>> sortedListFuture = executorService.submit(mergeSorter);

        // S4. from future, untill you do `get()` you will not get data.
        // If thread is still WIP, then this will wait -- BLOCKING call.
        List<Integer> sortedList = sortedListFuture.get();

        System.out.println(sortedList);

        // S5. once work is done, shutdown the executor service
        executorService.shutdown();
    }
}
