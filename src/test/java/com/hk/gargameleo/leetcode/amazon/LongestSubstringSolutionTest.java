package test.java.com.hk.gargameleo.leetcode.amazon;

import main.java.com.hk.gargameleo.leetcode.amazon.LongestSubstringSolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringSolutionTest {

    LongestSubstringSolution solution;

    @BeforeEach
    void setUp() {
        solution = new LongestSubstringSolution();
    }

    @Test
    @DisplayName("Example 1: Input: s = \"abcabcbb\" Output: 3")
    void testLengthOfLongestSubstringExample1() {
        //given
        String s = "abcabcbb";

        //when
        int actualLength = solution.lengthOfLongestSubstring(s);
        int expectedLength = 3;

        //then
        Assertions.assertEquals(expectedLength, actualLength, "return result of Example 1");
    }

    @Test
    @DisplayName("Example 2: Input: s = \"bbbbb\" Output: 1")
    void testLengthOfLongestSubstringExample2() {
        //given
        String s = "bbbbb";

        //when
        int actualLength = solution.lengthOfLongestSubstring(s);
        int expectedLength = 1;

        //then
        Assertions.assertEquals(expectedLength, actualLength, "return result of Example 2");

    }

    @Test
    @DisplayName("Example 3: Input: s = \"pwwkew\" Output: 3")
    void testLengthOfLongestSubstringExample3() {
        //given
        String s = "pwwkew";

        //when
        int actualLength = solution.lengthOfLongestSubstring(s);
        int expectedLength = 3;

        //then
        Assertions.assertEquals(expectedLength, actualLength, "return result of Example 3");

    }

    @Test
    @DisplayName("Example 4: Input: s = \" \" Output: 3")
    void testLengthOfLongestSubstringExample4() {
        //given
        String s = " ";

        //when
        int actualLength = solution.lengthOfLongestSubstring(s);
        int expectedLength = 1;

        //then
        Assertions.assertEquals(expectedLength, actualLength, "return result of Example 4");

    }

    @Test
    @DisplayName("Example 5: Input: s = \"dvdf\" Output: 3")
    void testLengthOfLongestSubstringExample5() {
        //given
        String s = "dvdf";

        //when
        int actualLength = solution.lengthOfLongestSubstring(s);
        int expectedLength = 3;

        //then
        Assertions.assertEquals(expectedLength, actualLength, "return result of Example 5");

    }

}