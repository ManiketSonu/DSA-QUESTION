package Demo.Math_Problem;

import java.util.Arrays;

public class UnknownPerson {
    public static void main(String[] args) {
        int[] processSize = {2,5,8};
        int[] capacity = {6,7,4};
        System.out.println(getMinimumTime(processSize, capacity));
    }
    public static int getMinimumTime(int processSize[], int[] capacity)
    {
        Arrays.sort(processSize);
        Arrays.sort(capacity);
        int n = processSize.length;
        int m = capacity.length;
        if (processSize[n - 1] > capacity[m - 1]) 
        {
            return -1;
        }
        int[] timeTaken = new int[n];
        Arrays.fill(timeTaken, Integer.MAX_VALUE);
        for (int i = 0; i < m; i++) 
        {
            int processorCapacity = capacity[i];
            int processIndex = n - 1;
            for (int j = n - 1; j >= 0; j--) 
            {
                if (processSize[j] <= processorCapacity) 
                {
                    timeTaken[j] = Math.min(timeTaken[j], i + 1);
                    processIndex = j - 1;
                } else
                {
                    break;
                }
            }
            for (int j = processIndex; j >= 0; j--) 
            {
                if (timeTaken[j] != Integer.MAX_VALUE) 
                {
                    timeTaken[j] = Math.min(timeTaken[j], timeTaken[processIndex + 1] + i + 1);
                }
            }
        }

        int minTime = Integer.MIN_VALUE;
        for (int time : timeTaken) {
            minTime = Math.max(minTime, time);
        }

        return minTime;
    }
}
