package login;

public abstract class Login {

    public Login(){

    }
    public abstract void operator();
    public abstract String getPhoneNumber();
    public abstract void  setPhoneNumber();
    public abstract String getEmail();
    public abstract void setEmail();
    public abstract boolean checkUserExist();



}
