package user.type;

public abstract class User {
    protected String role;

    public abstract String getEmail();

    public abstract String getPhoneNumber();

    public abstract void setEmail(String email);

    public abstract void setPhoneNumber(String phoneNumber);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getId();

    public abstract void setId(int newId);

}
