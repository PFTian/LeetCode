package test.java.com.hk.gargameleo.leetcode.amazon;

import main.java.com.hk.gargameleo.leetcode.amazon.TwuSumSolution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TwuSumSolutionTests {

    TwuSumSolution solution;

    @BeforeEach
    void setUp() {
        solution = new TwuSumSolution();
    }

    @Test
    @DisplayName("Example 1: [2,7,11,15] target 9")
    public void testTwoSumExample1() {

        //given
        int[] inputNumbers = new int[]{2, 7, 11, 15};
        int target = 9;

        //when
        int[] actualOutput = solution.twoSum(inputNumbers, target);
        int[] expectedOutput = new int[]{0, 1};

        //then
        assertArrayEquals(expectedOutput, actualOutput, "Two sum function returns the correct answer");

    }

    @Test
    @DisplayName("Example 2: [3, 2, 4] target 6")
    public void testTwoSumExample2() {

        //given
        int[] inputNumbers = new int[]{3, 2, 4};
        int target = 6;

        //when
        int[] actualOutput = solution.twoSum(inputNumbers, target);
        int[] expectedOutput = new int[]{1, 2};

        //then
        assertArrayEquals(expectedOutput, actualOutput, "Two sum function returns the correct answer");

    }

    @Test
    @DisplayName("Example 3: [3,3] target 6")
    public void testTwoSumExample3() {

        //given
        int[] inputNumbers = new int[]{3, 3};
        int target = 6;

        //when
        int[] actualOutput = solution.twoSum(inputNumbers, target);
        int[] expectedOutput = new int[]{0, 1};

        //then
        assertArrayEquals(expectedOutput, actualOutput, "Two sum function returns the correct answer");

    }

}