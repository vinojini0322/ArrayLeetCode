package org.example;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

    }

    private static int[] twoSumBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    private static int[] twoSumOptimised(int[] arr,int target){
        Map<Integer,Integer> mm = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(mm.containsKey((target-arr[i]))){
                return new int[]{i,mm.get(target-arr[i])};
            }
            else{
                mm.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
