package com.advanced.arrayfunctions;

import java.util.Arrays;

public class ArrayProblems {

    public static int[] plusTwo(int[] a, int[] b) {
        int[] newArray = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            newArray[a.length + j] = b[j];
        }
        return newArray;

        // System.arraycopy(a, 0, newArray, 0, a.length);
        // System.arraycopy(b, 0, newArray, a.length , b.length);
    }

    public static int[] swapAll(int[] nums) {
//        int[] swapNewArray =  new int[nums.length];
//        for(int i=0; i<nums.length; i++) {
//            swapNewArray[i] = nums[nums.length - i -1];
//        }
//        return swapNewArray;

        int l = nums.length;
        for (int i = 0; i < l / 2; i++) {
            int s = nums[i];
            nums[i] = nums[l - i - 1];
            nums[l - i - 1] = s;
        }
        return nums;
    }

    /*
    Given an array of ints, swap the first and last elements in the array.
    Return the modified array. The array length will be at least 1.
     */
    public static int[] swapEnds(int[] nums) {
        int[] swapNewArray = new int[nums.length];
//        for(int i=0; i<nums.length; i++) {
//            swapNewArray[i] = nums[i];
//        }
        swapNewArray = Arrays.copyOf(nums, nums.length);
        swapNewArray[0] = nums[nums.length - 1];
        swapNewArray[swapNewArray.length - 1] = nums[0];
        return swapNewArray;

    }

    /*
    Given an array of ints of odd length, return a new array length 3 containing
    the elements from the middle of the array. The array length will be at least 3
     */
    public static int[] midThree(int[] nums) {
        if (nums.length % 2 != 0) {
            int[] newArray = new int[3];
            newArray[0] = nums[nums.length / 2 - 1];
            newArray[1] = nums[nums.length / 2];
            newArray[2] = nums[nums.length / 2 + 1];
            return newArray;
        } else {
            throw new RuntimeException("The length of the array must be odd ");
        }
    }

    /*
    Given an array of ints of odd length, look at the first, last, and middle values in the array and
    return the largest. The array length will be a least 1.
    maxTriple([1, 2, 3]) → 3
    maxTriple([1, 5, 3]) → 5
    maxTriple([5, 2, 3]) → 5
     */
    public static int maxTriple(int[] nums) throws Exception {
        if (nums.length % 2 != 0) {
            int larger = nums[0];

            if (larger < nums[nums.length - 1]) {
                larger = nums[nums.length - 1];
            }

            if (larger < nums[nums.length / 2]) {
                larger = nums[nums.length / 2];
            }
            return larger;
        } else {
            throw new Exception("The length of the array must be odd");
        }
    }

    /*
    Given an int array of any length, return a new array of its first 2 elements.
    If the array is smaller than length 2, use whatever elements are present.

    frontPiece([1, 2, 3]) → [1, 2]
    frontPiece([1, 2]) → [1, 2]
    frontPiece([1]) → [1]
    */

    public static int[] frontPiece(int[] nums) {
        int[] frontArray = new int[2];
        if(nums.length < 2) {
            return nums;
        } else {
            frontArray[0] = nums[0];
            frontArray[1] = nums[1];
            return frontArray;
        }
    }


}
