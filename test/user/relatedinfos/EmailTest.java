package user.relatedinfos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    void getData() {
        Email email = new Email("codeGym123@gmail.com");
        String expected = "codeGym123@gmail.com";
        String result = email.getData();
        assertEquals(expected, result);
    }

    @Test
    void setData() {
        Email email = new Email();
        email.setData("codeGym123@gmail.com");
        String expected = "codeGym123@gmail.com";
        String result = email.getData();
        assertEquals(expected, result);
    }

    @Test
    void setDataFailIsTrue() {
        Email email = new Email();
        email.setData("aaaa");
        String expected = "codeGym123@gmail.com";
        String result = email.getData();
        assertNotEquals(expected, result);
    }

    @Test
    void isMatchRegexFail() {
        Email email = new Email();
        email.setData("aaaa");
        assertFalse(email.isMatchRegex());
    }

    @Test
    void isMatchRegexPass() {
        Email email = new Email();
        email.setData("CodeGym123@gmail.com");
        assertTrue(email.isMatchRegex());
    }
}