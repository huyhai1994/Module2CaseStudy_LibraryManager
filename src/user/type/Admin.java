package user.type;

import user.relatedinfos.Email;
import user.relatedinfos.PhoneNumber;

public class Admin extends User {
    private Email email;
    private PhoneNumber phoneNumber;
    private String name;
    private int id;

    public Admin() {
    }

    public Admin(String name, String id) {

    }

}
