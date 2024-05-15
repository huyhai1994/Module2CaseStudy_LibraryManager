package regex;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexUserNameTest {
    @Test
    @DisplayName("Matched cases")
    void isMatch() {
        RegexUserName regexUserName = new RegexUserName();
        assertTrue(regexUserName.isMatch("codeGym123"));
        assertTrue(regexUserName.isMatch("codeGymRaisingTheBar"));
    }

    @Test
    @DisplayName("Not matched cases")
    void isNotMatch() {
        RegexUserName regexUserName = new RegexUserName();
        assertTrue(regexUserName.isNotMatch("codeGymRaisingTheBar1"));
        assertTrue(regexUserName.isNotMatch("codeGymRaisingTheBar12"));
        assertTrue(regexUserName.isNotMatch("codeGymRaisingTheBar123"));
        assertTrue(regexUserName.isNotMatch("codeGym123@"));
        assertTrue(regexUserName.isNotMatch("codeGym123$"));
        assertTrue(regexUserName.isNotMatch("codeGym123^"));
        assertTrue(regexUserName.isNotMatch("codeGym123%"));
        assertTrue(regexUserName.isNotMatch("codeGym123#"));
        assertTrue(regexUserName.isNotMatch("codeGym123&"));
        assertTrue(regexUserName.isNotMatch("Helloadsawddiawdawdawdwadawdawwdawdawd"));
        assertTrue(regexUserName.isNotMatch("dadwawdawd32424253453&&%&^%&^$^%$^%$^%"));
        assertTrue(regexUserName.isNotMatch(" "));
    }

    @Test
    void printGuideLine() {
        RegexUserName regexUserName = new RegexUserName();
        regexUserName.printGuideLine();
    }

    @Test
    void printMatch() {
        RegexUserName regexUserName = new RegexUserName();
        regexUserName.printMatch();
    }

    @Test
    void printNotMatch() {
        RegexUserName regexUserName = new RegexUserName();
        regexUserName.printNotMatch();
    }


}