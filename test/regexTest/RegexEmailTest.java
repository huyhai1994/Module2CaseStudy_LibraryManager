package regexTest;

import org.junit.jupiter.api.Test;
import regex.RegexEmail;

import static org.junit.jupiter.api.Assertions.*;

class RegexEmailTest {
    @Test
    void testRegexEmailTest6to32codeG() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("codeG"));
    }

    @Test
    void testRegexEmailTest6to32codeGy() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("codeGy"));
    }

    @Test
    void testRegexEmailTest6to32CodeGym() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("CodeGym"));
    }

    @Test
    void testRegexEmailTest6to32CodeGymRaisingTheBarHanoiCenter() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter"));
    }

    @Test
    void testRegexEmailTest6to32CodeGymRaisingTheBarHanoiCenter1() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter1"));
    }

    @Test
    void testRegexEmailTest6to32CodeGymRaisingTheBarHanoiCenter12() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter12"));
    }
}