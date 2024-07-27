package Advanced_DSA.BinarySearch;

import java.util.List;

public class MedianOfAnArray {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4);
        System.out.println(medianSortedArray(list1, list2));
    }
    public static double medianSortedArray(final List<Integer> a, final List<Integer> b)
    {
        int n1 = a.size();
        int n2 = b.size();
        if(n1>n2)
        {
            return medianSortedArray(b, a);
        }
        int low = 0;
        int high = n1;
        while(low<=high)
        {
            int partitionX = (low+high)/2;
            int partitionY = (n1+n2+1)/2-partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : a.get(partitionX - 1);
            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : b.get(partitionY - 1);

            int minX = (partitionX == n1) ? Integer.MAX_VALUE : a.get(partitionX);
            int minY = (partitionY == n2) ? Integer.MAX_VALUE : b.get(partitionY);
            if (maxX <= minY && maxY <= minX) {
                if ((n1 + n2) % 2 == 0) {
                    return (double) (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
                } else {
                    return (double) Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        return -1;
        }
    }
    // public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int n1 = nums1.length;
    //     int n2 = nums2.length;
    //     if (n1 > n2) {
    //         return findMedianSortedArrays(nums2, nums1);
    //     }
    //     int low = 0;
    //     int high = n1;
    //     while (low <= high) {
    //         int partitionX = (low + high) / 2;
    //         int partitionY = (n1 + n2 + 1) / 2 - partitionX;

    //         int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
    //         int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];

    //         int minX = (partitionX == n1) ? Integer.MAX_VALUE : nums1[partitionX];
    //         int minY = (partitionY == n2) ? Integer.MAX_VALUE : nums2[partitionY];

    //         if (maxX <= minY && maxY <= minX) {
    //             if ((n1 + n2) % 2 == 0) {
    //                 return (double) (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
    //             } else {
    //                 return (double) Math.max(maxX, maxY);
    //             }
    //         } else if (maxX > minY) {
    //             high = partitionX - 1;
    //         } else {
    //             low = partitionX + 1;
    //         }
    //     }
    //     return -1; // Handle the case if median is not found
    // }

