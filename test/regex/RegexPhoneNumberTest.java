package regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexPhoneNumberTest {

    @Test
    void testRegexPhoneNumber0392260046() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertTrue(regexPhoneNumber.isMatch("03-9226-0046"));
    }

    @Test
    void testRegexPhoneNumber0211111232() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertTrue(regexPhoneNumber.isMatch("02-1111-1232"));
    }

    @Test
    public void testRegexPhoneNumber011231123123() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("01 - 1231 - 123123"));
    }

    @Test
    void testRegexPhoneNumber0a1222cddd() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("0a-1222-cddd"));
    }

    @Test
    void testRegexPhoneNumberadsa1231123123() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("adsa-1231-123123"));
    }

    @Test
    void testRegexPhoneNumberff1231123123() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("ff-1231-123123"));
    }

    @Test
    void testRegexPhoneNumber000() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("0-0-0"));
    }

    @Test
    void testRegexPhoneNumber000000asdasddasd() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("000000-asdasd-dasd"));
    }

    @Test
    void testRegexPhoneNumber0001231123123() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("000-1231-123123"));
    }

    @Test
    void testRegexPhoneNumber111111231123123() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("11111-1231-123123"));
    }

    @Test
    void testRegexPhoneNumber2321311231123123() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("232131-1231-123123"));
    }

    @Test
    void testRegexPhoneNumberdsasdasd1231123123() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("dsasdasd-1231-123123"));
    }

    @Test
    void testRegexPhoneNumberasdaasdasasdasd() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("asda-asdas-asdasd"));
    }

    @Test
    void testRegexPhoneNumberfadddd123123() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("fa-dddd-123123"));
    }

    @Test
    void testRegexPhoneNumber1231123123() {
        RegexPhoneNumber regexPhoneNumber = new RegexPhoneNumber();
        assertFalse(regexPhoneNumber.isMatch("-1231-123123"));
    }
}
