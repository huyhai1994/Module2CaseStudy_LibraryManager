package regex;

import org.junit.jupiter.api.Test;

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
        assertTrue(regexEmail.isNotMatch("codeGy"));
    }

    @Test
    void testRegexEmailTest6to32CodeGym() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("CodeGym"));
    }

    @Test
    void testRegexEmailTest6to32CodeGymRaisingTheBarHanoiCenter() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter"));
    }

    @Test
    void testRegexEmailTest6to32CodeGymRaisingTheBarHanoiCenter1() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter1"));
    }

    @Test
    void testRegexEmailTest6to32CodeGymRaisingTheBarHanoiCenter12() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter12"));
    }

    @Test
    void testRegexEmailAtSigncodeG() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("codeG@"));
    }

    @Test
    void testRegexEmailAtSigncodeGy() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("codeGy@"));
    }

    @Test
    void testRegexEmailAtSignCodeGym() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("CodeGym@"));
    }

    @Test
    void testRegexEmailAtSignCodeGymRaisingTheBarHanoiCenter() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter@"));
    }

    @Test
    void testRegexEmailAtSignCodeGymRaisingTheBarHanoiCenter1() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter1@"));
    }

    @Test
    void testRegexEmailAtSignCodeGymRaisingTheBarHanoiCenter12() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter12@"));
    }

    @Test
    void testRegexEmailAtSigncodeGgmail() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("codeG@gmail.com"));
    }

    @Test
    void testRegexEmailAtSigncodeGygmail() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("codeGy@gmail.com"));
    }

    @Test
    void testRegexEmailAtSignCodeGymgmail() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("CodeGym@gmail.com"));
    }

    @Test
    void testRegexEmailAtSignCodeGymRaisingTheBarHanoiCentergmail() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter@gmail.com"));
    }

    @Test
    void testRegexEmailAtSignCodeGymRaisingTheBarHanoiCenter1gmail() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter1@gmail.com"));
    }

    @Test
    void testRegexEmailAtSignCodeGymRaisingTheBarHanoiCenter12gmail() {
        RegexEmail regexEmail = new RegexEmail();
        assertFalse(regexEmail.isMatch("CodeGymRaisingTheBarHanoiCenter12@gmail.com"));
    }

    @Test
    void testRegexEmailAtSignCodeGymVn() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("NguyenVanA123@CodeGym.vn"));
    }

    @Test
    void testRegexEmailAtSignEduVn() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("NguyenVanA123@edu.vn"));
    }

    @Test
    void testRegexEmailDotAtSignEduVn() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("A.Nguyen1992@edu.vn"));
    }

    @Test
    void testRegexEmailSpecialCaseAtSignEduVn() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("A.Nguyen~1997@edu.vn"));
    }

    @Test
    void testRegexEmailSpecialCaseAtSignBeautyVn() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("HaLinh@Beauty.vn"));
    }

    @Test
    void testRegexEmailSpecialCaseAtSignBeautyVn1() {
        RegexEmail regexEmail = new RegexEmail();
        assertTrue(regexEmail.isMatch("Spa.HN123@Beauty.vn"));
    }

    @Test
    void printTest() {
        RegexEmail regexEmail = new RegexEmail();
        regexEmail.printGuideLine();
        regexEmail.printNotMatch();
    }
}