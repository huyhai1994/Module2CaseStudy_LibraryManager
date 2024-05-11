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

}
