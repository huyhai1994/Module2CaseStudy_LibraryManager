package regex;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

class RegexUserChoiseTest {
    @Test
    public void isMatchTestNumber1() {
        boolean expected = true;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("1");
        assertEquals(expected, result);
    }

    @Test
    public void isMatchTestNumber2() {
        boolean expected = true;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("2");
        assertEquals(expected, result);
    }

    @Test
    public void isMatchTestNumber10() {
        boolean expected = false;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("10");
        assertEquals(expected, result);
    }

    @Test
    public void isMatchTestNumberMinus1() {
        boolean expected = false;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("-1");
        assertEquals(expected, result);
    }

    @Test
    public void isMatchTestNumber5() {
        boolean expected = false;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("5");
        assertEquals(expected, result);
    }

    @Test
    public void isMatchTestRandomChar() {
        boolean expected = false;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("a");
        assertEquals(expected, result);
    }

    @Test
    public void isMatchTestRandomString() {
        boolean expected = false;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("asdawdawdw");
        assertEquals(expected, result);
    }

    @Test
    void NotMatchTestPass() {
        RegexUserChoise regexUserChoise = new RegexUserChoise();
        assertTrue(regexUserChoise.isNotMatch("aaa"));
        assertTrue(regexUserChoise.isNotMatch("111"));
        assertTrue(regexUserChoise.isNotMatch("-1"));
    }

    @Test
    void NotMatchTestFail() {
        RegexUserChoise regexUserChoise = new RegexUserChoise();
        assertFalse(regexUserChoise.isNotMatch("1"));
        assertFalse(regexUserChoise.isNotMatch("2"));
    }
}