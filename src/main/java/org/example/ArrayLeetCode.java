package org.example;

import java.util.Arrays;

public class ArrayLeetCode {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
//    Leetcode 01 - Two sum

    private static int[] twoSum(int[] arr, int target) {
        int i = 0;
        int j;
        for (; i < arr.length; i++) {
            j = i + 1;
            while (j < arr.length) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                } else {
                    j++;
                }
            }
        }
        return new int[]{-1, -1};
    }

    //    Leetcode 26 - Remove Duplicates from Sorted Array
    //    This method returns the no of unique elements oin the array
    private static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}