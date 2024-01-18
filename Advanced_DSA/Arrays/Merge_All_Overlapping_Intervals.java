package Advanced_DSA.Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Merge_All_Overlapping_Intervals {
    public static ArrayList<ArrayList<Integer>> merge(ArrayList<ArrayList<Integer>> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        intervals.sort(Comparator.comparingInt(interval -> interval.get(0)));
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        List<Integer> currentInterval = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            List<Integer> nextInterval = intervals.get(i);
            if (currentInterval.get(1) >= nextInterval.get(0)) {
                currentInterval.set(1, Math.max(currentInterval.get(1), nextInterval.get(1)));
            } else {
                result.add(new ArrayList<>(currentInterval));
                currentInterval = new ArrayList<>(nextInterval);
            }
        }
        result.add(new ArrayList<>(currentInterval));
        return result;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> intervals = new ArrayList<>();
        intervals.add(new ArrayList<>(List.of(1, 3)));
        intervals.add(new ArrayList<>(List.of(2, 6)));
        intervals.add(new ArrayList<>(List.of(8, 10)));
        intervals.add(new ArrayList<>(List.of(15, 18)));
        List<ArrayList<Integer>> mergedIntervals = merge(intervals);
        System.out.println("Merged Intervals:");
        for (List<Integer> interval : mergedIntervals) {
            System.out.println("[" + interval.get(0) + "," + interval.get(1) + "]");
        }
    }  
}
