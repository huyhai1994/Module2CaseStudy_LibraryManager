package controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import user.type.Admin;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RegexControllerTest {
    private static RegexController regexController;

    @Test
    void checkRegexUserChoiseNotMatch_FalseWithInput1() throws IOException {
        regexController = RegexController.createController();
        assertFalse(regexController.checkRegexUserChoiseNotMatch(1));
    }

    @Test
    void checkRegexUserChoiseNotMatch_FalseWithInput2() throws IOException {
        regexController = RegexController.createController();
        assertFalse(regexController.checkRegexUserChoiseNotMatch(2));
    }

    @Test
    void checkRegexUserChoiseNotMatch_TrueWithInput3() throws IOException {
        regexController = RegexController.createController();
        assertTrue(regexController.checkRegexUserChoiseNotMatch(3));
    }

    @Test
    void checkRegexUserChoiseNotMatch_TrueWithInput4() throws IOException {
        regexController = RegexController.createController();
        assertTrue(regexController.checkRegexUserChoiseNotMatch(4));
    }

    @Test
    void checkRegexUserChoiseNotMatch_TrueWithInputMinus() throws IOException {
        regexController = RegexController.createController();
        assertTrue(regexController.checkRegexUserChoiseNotMatch(-1));
        assertTrue(regexController.checkRegexUserChoiseNotMatch(-2));
        assertTrue(regexController.checkRegexUserChoiseNotMatch(-3));
    }

    @Test
    void checkRegexUserChoiseNotMatch_TrueWithInputZero() throws IOException {
        regexController = RegexController.createController();
        assertTrue(regexController.checkRegexUserChoiseNotMatch(0));
    }

    @Test
    @DisplayName("Truong Hop Nguoi Dung Nhap Dung Chinh Quy")
    void getAnAdminInformationsFromMenu() throws IOException {
        Admin admin = new Admin();
        regexController = RegexController.createController();
        admin.setName("test");
        admin.setId(123);
        admin.setEmail("test@gmail.com");
        admin.setPhoneNumber("01-2345-6789");
        assertEquals("test", admin.getName());
        assertEquals(123, admin.getId());
        assertEquals("test@gmail.com", admin.getEmail());
        assertEquals("01-2345-6789", admin.getPhoneNumber());
    }

    @Test
    @DisplayName("Kiem tra nguoi dung khong nhap dung chinh quy")
    void checkRegexUserNotMatch() throws IOException {
        regexController = RegexController.createController();
        assertTrue(regexController.checkRegexUserNameNotMatch("Codegymraisingthebar123333"));
        assertTrue(regexController.checkUserPhoneNumberNotMatch("021212-2123123-31231231"));
        assertTrue(regexController.checkUserEmailNotMatch("dadawdawdaw"));
    }

    public static void main(String[] args) throws IOException {
        int userChoose = 2;
        regexController = RegexController.createController();
        regexController.navigatingTheUserAccess(userChoose);
    }


}