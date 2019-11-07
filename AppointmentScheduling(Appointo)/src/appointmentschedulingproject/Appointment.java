
package appointmentschedulingproject;

public class Appointment {

    private String patientid;
    private String dentistid;
    private String startTime;
    private String EndTime;
    private boolean canceled;
    private String date;
    private String period;

    public Appointment(String pid, String did, String start, String end, boolean can, String date, String period) {
        this.dentistid = did;
        this.patientid = pid;
        this.startTime = start;
        this.EndTime = end;
        this.date = date;
        this.canceled = can;
        this.period = period;
    }

    public String getdentistId() {
        return dentistid;
    }

    public void setdentistId(String id) {
        this.dentistid = dentistid;
    }

    public String getpatientId() {
        return patientid;
    }

    public void setpatienttId(String id) {
        this.patientid = dentistid;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String from) {
        this.startTime = from;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String to) {
        this.EndTime = to;
    }

    public boolean getCanceled() {
        return canceled;
    }

    public void setCanceled(boolean c) {
        this.canceled = c;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String d) {
        this.date = d;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String p) {
        this.period = p;
    }
}
