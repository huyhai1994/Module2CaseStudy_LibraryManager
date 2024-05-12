package user.type;

import user.relatedinfos.Email;
import user.relatedinfos.PhoneNumber;

public class Admin extends User {
    private Email email = new Email();
    private PhoneNumber phoneNumber = new PhoneNumber();
    private String name;
    private int id;

    public Admin() {
    }

    public Admin(String name, int id) {
        this.role = "Admin";
        this.name = name;
        this.id = id;
    }

    public String getEmail() {
        return this.email.getData();
    }

    public void setEmail(String email) {
        this.email.setData(email);
    }

    public String getPhoneNumber() {
        return this.phoneNumber.getData();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber.setData(number);
    }


    public int getId() {
        return this.id;
    }

    public void setId(int newId) {
        this.id = newId;
    }
}
