package appointmentschedulingproject;

/**
 *
 * @author lenovo
 */
public class Patient {

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String address;

    public Patient(String id, String fname, String lname, String email, String phone, String address) {
        this.id = id;
        this.firstname = fname;
        this.lastname = lname;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    Patient() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getfirst() {
        return firstname;
    }

    public void setfirst(String first) {
        this.firstname = first;
    }

    public String getlast() {
        return lastname;
    }

    public void setlast(String last) {
        this.lastname = last;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
