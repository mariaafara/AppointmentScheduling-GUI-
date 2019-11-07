/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentschedulingproject;

/**
 *
 * @author lenovo
 */
public class Receptionist {

    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;

    public Receptionist(String id, String fname, String lname, String email, String phone) {
        this.id = id;
        this.firstname = fname;
        this.lastname = lname;
        this.email = email;
        this.phone = phone;

    }

    public Receptionist() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
