package regex;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexUserPhoneNumberTest {

    @Test
    @DisplayName("Truong hop nhap dung")
    void testRegexPhoneNumber0392260046() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertTrue(regexUserPhoneNumber.isMatch("03-9226-0046"));
        assertTrue(regexUserPhoneNumber.isMatch("02-1111-1234"));
    }

    @Test
    @DisplayName("Truong hop nhap sai")
    void testRegexPhoneNumber011231123123() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("01 - 1231 - 123123"));
        assertFalse(regexUserPhoneNumber.isMatch("0a-1222-cddd"));
        assertTrue(regexUserPhoneNumber.isNotMatch("0a-1222-cddd"));
        assertFalse(regexUserPhoneNumber.isMatch("-1231-123123"));
    }


    @Test
    void testRegexPhoneNumber0a1222cddd() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("0a-1222-cddd"));
    }

    @Test
    void testRegexPhoneNumberadsa1231123123() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("adsa-1231-123123"));
    }

    @Test
    void testRegexPhoneNumberff1231123123() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("ff-1231-123123"));
    }

    @Test
    void testRegexPhoneNumber000() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("0-0-0"));
    }

    @Test
    void testRegexPhoneNumber000000asdasddasd() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("000000-asdasd-dasd"));
    }

    @Test
    void testRegexPhoneNumber0001231123123() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("000-1231-123123"));
    }

    @Test
    void testRegexPhoneNumber111111231123123() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("11111-1231-123123"));
    }

    @Test
    void testRegexPhoneNumber2321311231123123() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("232131-1231-123123"));
    }

    @Test
    void testRegexPhoneNumberdsasdasd1231123123() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("dsasdasd-1231-123123"));
    }

    @Test
    void testRegexPhoneNumberasdaasdasasdasd() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("asda-asdas-asdasd"));
    }

    @Test
    void testRegexPhoneNumberfadddd123123() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("fa-dddd-123123"));
    }

    @Test
    void testRegexPhoneNumber1231123123() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        assertFalse(regexUserPhoneNumber.isMatch("-1231-123123"));
    }

    @Test
    void printTest() {
        RegexUserPhoneNumber regexUserPhoneNumber = new RegexUserPhoneNumber();
        regexUserPhoneNumber.printGuideLine();
        regexUserPhoneNumber.printNotMatch();
    }
}
