package appointmentschedulingproject;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DataBaseManager {

    Connection con;
    Statement statement;
    ResultSet rs;
    public static String Daynamefromdb;
    CallableStatement cs;

    public DataBaseManager() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-GB2S5V2:1433;databaseName=AppointmentScheduling;integratedSecurity=true;");
            statement = con.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//stored procedure
    public void altercanceleddays(String did, String day,Integer i) 
    {/*
        try {
            cs= con.prepareCall("{call alterappointment( '"+did+"','"+day+"',"+i+")}");
             cs.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
         try {
            statement.executeUpdate("exec alterappointment  @did='"+did+"', @dayname='"+day+"', @on=0");
           
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     
     public ArrayList<String> getDentist()
    { 
    ArrayList<String> d=new ArrayList<>();
        try {
            rs=statement.executeQuery("select Dentist_id from Dentist");
            while(rs.next()){
               
                
                d.add(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }
    public boolean addDentist(Dentist dent, Login log) {

        try {

            if (statement.executeUpdate("insert into Dentist values('" + dent.getId() + "','" + dent.getfirst()
                    + "','" + dent.getlast() + "','" + dent.getEmail() + "','" + dent.getPhone() + "','" + dent.getSpeciality()
                    + "','" + dent.getAddress() + "')") == 1) {
                statement.executeUpdate("insert into Login values('" + log.getId() + "','" + log.getPassword()
                        + "','" + log.getRole() + "')");
                return true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "please enter correct phone number or email");
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Dentist searchDentist(String id) {
        Dentist d = new Dentist();
        try {

            rs = statement.executeQuery("select firstName,lastName,email,phone,address ,Speciality from Dentist where Dentist_id ='" + id + "'");
            while (rs.next()) {
                d = new Dentist(id, rs.getString(1),
                        rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dentist entered not found");
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;

    }

    public boolean addReceptionist(Receptionist recp, Login log) {

        try {

            if (statement.executeUpdate("insert into Receptionist values('" + recp.getId() + "','" + recp.getfirst()
                    + "','" + recp.getlast() + "','" + recp.getEmail() + "','" + recp.getPhone() + "')") == 1) {
                statement.executeUpdate("insert into Login values('" + log.getId() + "','" + log.getPassword()
                        + "','" + log.getRole() + "')");
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "please enter correct phone number or email");
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateReceptionist(String id, String fname, String lname, String email, String phone) {

        try {

            if (statement.executeUpdate("update Receptionist set firstName='" + fname + "', lastName='" + lname
                    + "',email='" + email + "',phone='" + phone + "'where Receptionist_id='" + id + "'") == 1) {
                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateDentist(String id, String fname, String lname, String email, String phone, String address, String Speciality) {

        try {

            if (statement.executeUpdate("update Dentist set firstName='" + fname + "', lastName='" + lname
                    + "',email='" + email + "',phone='" + phone + "',address='" + address + "',Speciality='" + Speciality + "'where Dentist_id='" + id + "'") == 1) {
                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Receptionist searchReceptionist(String id) {
        Receptionist r = new Receptionist();
        try {

            rs = statement.executeQuery("select firstName,lastName,email,phone from Receptionist where Receptionist_id ='" + id + "'");
            while (rs.next()) {
                r = new Receptionist(id, rs.getString(1),
                        rs.getString(2), rs.getString(3), rs.getString(4));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Receptionist entered not found");
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;

    }

    public Patient searchPatient(String id) {
        Patient p = new Patient();
        try {

            rs = statement.executeQuery("select firstName,lastName,email,phone,address from Patient where Patient_id ='" + id + "'");
            while (rs.next()) {
                p = new Patient(id, rs.getString(1),
                        rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "patient entered not found");
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;

    }

    public boolean updatePatient(String id, String fname, String lname, String email, String phone, String address) {

        try {

            if (statement.executeUpdate("update Patient set firstName='" + fname + "', lastName='" + lname
                    + "',email='" + email + "',phone='" + phone + "',address='" + address + "'where Patient_id='" + id + "'") == 1) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deletePatient(String id) {

        try {

            if (statement.executeUpdate("delete from Patient where Patient_id='" + id + "'") == 1) {
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteDentist(String id) {

        try {

            if (statement.executeUpdate("delete from Dentist where Dentist_id='" + id + "'") == 1) {
                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteReceptionist(String id) {

        try {

            if (statement.executeUpdate("delete from Receptionist where REceptioinst_id='" + id + "'") == 1) {
                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean addPatient(Patient p) {

        try {

            if (statement.executeUpdate("insert into Patient values('" + p.getId() + "','" + p.getfirst()
                    + "','" + p.getlast() + "','" + p.getEmail() + "','" + p.getPhone() + "','" + p.getAddress() + "')") == 1) {
                return true;
            }

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "please enter coorect phone number or email");

            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void addAvailable(Available a) {

        try {

            statement.executeUpdate("insert into Available  values('" + a.getId() + "','" + a.getDayname()
                    + "','" + a.getFrom() + "','" + a.getTo() + "')");//,'" + av + "')");

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteAvailable(String did, String Day) {

        try {

            statement.executeUpdate("delete from Available where Day_name='" + Day + "' and Dentist_id='" + did + "'");

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addAvailableDay(AvailableDay a) {

        try {

            int av = 1;
            if (a.getAvailable() == false) {
                av = 0;
            }
            statement.executeUpdate("insert into AvailableDay  values('" + a.getId() + "','" + a.getDayname() + "','" + av + "')");

        } catch (SQLException ex) {
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean editAvailableDay(String did, String day, boolean a) {

        try {

            int av = 1;
            if (a == false) {
                av = 0;
            }
            if (statement.executeUpdate("update  AvailableDay  set Available= " + av + "  where Dentist_id='" + did + "' and Day_name='" + day + "'") == 1) {
                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean addAppointment(Appointment p) {

        try {

            if (statement.executeUpdate("insert into Appointment values('" + p.getpatientId() + "','" + p.getdentistId()
                    + "','" + p.getStartTime() + "','" + p.getEndTime() + "','" + p.getCanceled() + "','" + p.getDate()
                    + "','" + p.getPeriod() + "')") == 1) {
                return true;
            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.toString());
            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;

    }

    public boolean cancelAppointment(int id) {

        try {

            if (statement.executeUpdate("update  Appointment set Canceled=1 where Appointment_id=" + id) == 1) {
                return true;
            }

        } catch (SQLException ex) {

            Logger.getLogger(DataBaseManager.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;

    }

}
