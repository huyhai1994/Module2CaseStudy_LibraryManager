package menu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MenuTest {
@Test
   public void getNumberOfMenuObjectNotCreateMenu(){
    int expected = 0;
    int result = Menu.getNumberOfMenuObject();
    assertEquals(expected,result);
}
@Test
    public void createAnMenuInstance(){
    int expected = 1;
    Menu.getInstance();
    int result = Menu.getNumberOfMenuObject();
    assertEquals(expected,result);
}
@Test
    public void createTwoInstanceOfMenu(){
    int expected = 1;
    Menu.getInstance();
    Menu.getInstance();
    int result = Menu.getNumberOfMenuObject();
    assertEquals(expected,result);
}
}