/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appointmentschedulingproject;

import java.sql.Time;

/**
 *
 * @author lenovo
 */
public class Available {

    private String dentistid;
    private String dayname;
    private String from;
    private String to;
   // private boolean available;

    public Available(String dentistid, String dayname, String from, String to) {
        this.dentistid = dentistid;
        this.dayname = dayname;
        this.from = from;
        this.to = to;
      //  this.available = available;
    }

  

    public String getDayname() {
        return dayname;
    }

    public void setDayname(String day) {
        this.dayname = day;
    }

    public String getId() {
        return dentistid;
    }

    public void setId(String id) {
        this.dentistid = dentistid;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
/*
    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
*/
}
