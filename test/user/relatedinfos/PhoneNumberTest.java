package user.relatedinfos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {
    @Test
    void getDataNotEqual() {
        PhoneNumber phoneNumber = new PhoneNumber("122121212");
        String expected = "03-9226-0046";
        String result = phoneNumber.getData();
        assertNotEquals(expected, result);
    }

    @Test
    void getDataEqual() {
        PhoneNumber phoneNumber = new PhoneNumber("03-9226-0046");
        String expected = "03-9226-0046";
        String result = phoneNumber.getData();
        assertEquals(expected, result);
    }

    @Test
    void setData() {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setData("01-3444-2132");
        String expected = "01-3444-2132";
        String result = phoneNumber.getData();
        assertEquals(expected, result);
    }

    @Test
    void isMatchRegexFail() {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setData("011-2222-1245");
        assertFalse(phoneNumber.isMatchRegex());
    }

    @Test
    void isMatchRegexPass() {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setData("01-2222-1235");
        assertTrue(phoneNumber.isMatchRegex());
    }

}