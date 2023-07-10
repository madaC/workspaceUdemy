package com.advanced.arrayfunctions;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.advanced.arrayfunctions.ArrayProblems.*;
import static org.junit.jupiter.api.Assertions.fail;

public class ArrayProblemsTest {

    @Test
    public void plusTwoTest() {
        //plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
        //plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
        //plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
        Assertions.assertArrayEquals(
                new int[]{1, 2, 3, 4},
                plusTwo(new int[]{1, 2}, new int[]{3, 4})
        );

    }

    @Test
    public void plusTwoTestSameElements() {
        Assertions.assertArrayEquals(
                new int[]{4, 4, 4, 4},
                plusTwo(new int[]{4, 4}, new int[]{4, 4}));

    }

    @Test
    public void swapAllTest() {
//        swapAll([1, 2, 3, 4]) → [4, 3, 2, 1]
        Assertions.assertArrayEquals(
                new int[] {1, 2, 3, 4},
                swapAll(new int[] {4, 3, 2, 1})
                );

    }

    @Test
    public void swapEndsTest() {
        //  swapEnds([1, 2, 3]) → [3, 2, 1]
       //swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
        Assertions.assertArrayEquals(
                new int[] {8, 6, 7,9,5},
                swapEnds(new int[] {5, 6, 7, 9, 8})
        );
    }

    @Test
    public void midThreeTest() {
//        midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
//        midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]

        Assertions.assertArrayEquals(
              new int [] {7,5,3},
                midThree(new int[] { 8, 6, 7, 5, 3, 0, 9})
        );

    }

    @Test
    public void midThreeTestEvenLength() {
//        midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
//        midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]

        Exception e = Assertions.assertThrows(RuntimeException.class, () -> ArrayProblems.midThree(new int[]{1,2,3,4}));
        Assertions.assertEquals(
                "The length of the array must be odd.",
                e.getMessage(),
                "Exception messages don't match");
    }

    @Test
    public void maxTripleTest()  {
        //maxTriple([1, 2, 3]) → 3
        try {
            Assertions.assertEquals(5, maxTriple(new int[] { 1, 5,2, 3}));
        } catch (Exception e) {
            fail("Exception occurred");
        }
    }

    @Test
    public void frontPieceTest() {
        Assertions.assertArrayEquals(new int[] {1,2},
                frontPiece(new int[] {1,2,3,4,5}));
    }



}
