package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLeetCode2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-6, 2, 5, -2, -7, -1, 3));

        countPairs(numbers, -2);
    }

    //    Leetcode 2824 - Count Pairs Whose Sum is Less than Target
    private static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }

        }
        return count;
    }

    // Leetcode 1295 - Find Numbers with Even Number of Digits

    private int findNumbers(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0) {
                a++;
            }
        }
        return a;
    }
}
