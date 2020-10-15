package Case;

import java.io.Serializable;

public class Contract implements Serializable {
    private String phoneNumber;
    private int id;
    private String name;
    private String group;
    private String gender;
    private String address;
    private String dateOfBirth;
    private String emailAddress;

    public Contract() {
    }

    public Contract(String phoneNumber, int id, String name, String group, String gender, String address, String dateOfBirth, String emailAddress) {
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.name = name;
        this.group = group;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String lop) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        //return " Phone: " + getPhoneNumber() + "\n" + " ID: " + getId() + "\n" + " Name: " + getName() + "\n" + " Class: " + getLop() + "\n" + " Address: " + getAddress() + "\n";
        return " ID: " + getId() + "\n" + " Name: " + getName() + " Group: " + getGroup() + "\n" + " Date of birth: " + getDateOfBirth() + "\n" + " Gender: " + getGender() + "\n" + " Address: " + getAddress() + "\n" + " Phone: " + getPhoneNumber() + "\n" + " Email: " + getEmailAddress() + "\n";
    }
}



