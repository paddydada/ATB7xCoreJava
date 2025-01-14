package SearchAlgo;

import java.util.*;

public class CountReversePairs {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 1};
        System.out.println("Reverse pairs count: " + countReversePairs(nums));
    }

    public static int countReversePairs(int[] nums) {
        if (nums == null || nums.length < 2) return 0;
        int[] temp = new int[nums.length];
        return mergeSort(nums, temp, 0, nums.length - 1);
    }

    private static int mergeSort(int[] nums, int[] temp, int left, int right) {
        if (left >= right) return 0;
        
        int mid = left + (right - left) / 2;
        
        int count = mergeSort(nums, temp, left, mid) + mergeSort(nums, temp, mid + 1, right);
        count += merge(nums, temp, left, mid, right);
        
        return count;
    }

    private static int merge(int[] nums, int[] temp, int left, int mid, int right) {
        int count = 0;
        
        // Count reverse pairs
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && nums[i] > 2L * nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        
        // Merge the two sorted subarrays
        int i = left, k = left, l = mid + 1;
        while (i <= mid && l <= right) {
            if (nums[i] <= nums[l]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[l++];
            }
        }
        
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        
        while (l <= right) {
            temp[k++] = nums[l++];
        }
        
        for (i = left; i <= right; i++) {
            nums[i] = temp[i];
        }
        
        return count;
    }
}
