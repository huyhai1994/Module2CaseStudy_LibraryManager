package user.type;

import user.relatedinfos.Email;
import user.relatedinfos.PhoneNumber;

public class Admin extends User {
    public static int numberOfUsers;
    private Email email = new Email();
    private PhoneNumber phoneNumber = new PhoneNumber();
    private String name;
    private int id;

    public Admin() {
        this.role = "Admin";
        numberOfUsers++;
    }

    public Admin(String name, int id) {
        this.role = "Admin";
        this.name = name;
        this.id = id;
        numberOfUsers++;
    }

    @Override
    public String getEmail() {
        return this.email.getData();
    }

    public void setEmail(String email) {
        this.email.setData(email);
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber.getData();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPhoneNumber(String number) {
        this.phoneNumber.setData(number);
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int newId) {
        this.id = newId;
    }

    @Override
    public String toString() {
        return this.role + " " + this.name + " " + this.id;
    }
}
