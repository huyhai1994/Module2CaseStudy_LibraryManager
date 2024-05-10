package regexTest;

import org.junit.jupiter.api.Test;
import regex.RegexUserChoise;

import static junit.framework.TestCase.assertEquals;
class RegexUserChoiseTest {
    @Test
    public void isMatchTestNumber1(){
       boolean expected = true;
       RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
       boolean result = regexUserChoiseTest.isMatch("1");
       assertEquals(expected,result);
    }

    @Test
    public void isMatchTestNumber2(){
        boolean expected = true;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("2");
        assertEquals(expected,result);
    }
    @Test
    public void isMatchTestNumber10(){
        boolean expected = false;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("10");
        assertEquals(expected,result);
    }
    @Test
    public void isMatchTestNumberMinus1(){
        boolean expected = false;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("-1");
        assertEquals(expected,result);
    }
    @Test
    public void isMatchTestNumber5(){
        boolean expected = false;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("5");
        assertEquals(expected,result);
    }
    @Test
    public void isMatchTestRandomChar(){
        boolean expected = false;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("a");
        assertEquals(expected,result);
    }
    public void isMatchTestRandomString(){
        boolean expected = false;
        RegexUserChoise regexUserChoiseTest = new RegexUserChoise();
        boolean result = regexUserChoiseTest.isMatch("asdawdawdw");
        assertEquals(expected,result);

    }
}