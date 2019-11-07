
package appointmentschedulingproject;

public class AvailableDay {

    private String dentistid;
    private String dayname;
    private boolean available;

    public AvailableDay(String dentistid, String dayname, boolean available) {
        this.dentistid = dentistid;
        this.dayname = dayname;
        
        this.available = available;
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

   
    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}
