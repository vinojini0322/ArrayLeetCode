package org.example;

import java.util.Arrays;

public class ArrayLeetCode {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(getConcatenation(new int[]{3, 2, 4})));
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

    //    Leetcode 26 - Remove a particular element
    private static int removeValue(int[] nums, int value) {
        int j = 0;
        for (int i : nums) {
            if (i != value) {
                nums[j++] = i;
            }
        }
        return j;
    }

    //    Leetcode 35 - Search Insert Position
    private static int searchValue(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    //    Leetcode 66 - Plus One
    private static int[] plusOne(int[] digits) {
        return null;
    }

    //    Leetcode 88 - Merge Sorted Array
//    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {
//        int a = 0;
//        for (int i = 0; i < nums1.length; i++) {
//            if (nums1[i] < nums2[i]) {
//                nums1[a++] = nums1[i];
//            } else if (nums1[i] > nums2[i]) {
//                int target = nums1[i];
//                nums1[a++] = nums2[i];
//                nums2[i] = target;
//            } else {
//                nums1[a] = nums1[i];
//            }
//        }
//        return nums1;
//    }


    //    Leetcode - 1929 - Concatenation of Array
    private static int[] getConcatenation(int[] nums) {
        int[] concatArr = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            concatArr[i] = nums[i];
            concatArr[i + nums.length] = nums[i];
        }
        return concatArr;
    }

    //      Leetcode - 1920 - Build Array from Permutation
    private static int[] buildArray(int[] nums) {
        int[] ans= new int [nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}