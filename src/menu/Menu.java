package menu;

public class Menu {
    private static int numberOfMenuObject = 0;
    private static Menu menu;
    private  Menu(){
    }
    public static synchronized Menu getInstance(){
        boolean isMenuObjectNotExist = numberOfMenuObject ==0;
       if (isMenuObjectNotExist){
           numberOfMenuObject++;
           menu = new Menu();
           return menu;
       }
    return  menu;
    }

    public static int getNumberOfMenuObject() {
        return numberOfMenuObject;
    }



}
