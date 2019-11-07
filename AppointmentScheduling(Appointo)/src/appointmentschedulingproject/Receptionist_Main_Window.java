package appointmentschedulingproject;

import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Receptionist_Main_Window extends javax.swing.JFrame {

    DataBaseManager db = new DataBaseManager();
    Main_Login_Window mlw;
    DefaultTableModel def;

    public Receptionist_Main_Window() {
        initComponents();

        // freecomboDentist(); 
        fillcomboDentistapp();

        fillcomboPatient();

    }

    private void freecomboDentist() {
        combopatientid.removeAllItems();
        combodentistidSearch.removeAllItems();
        combodentistidSearchPatient.removeAllItems();
        didCombo.removeAllItems();
    }

    private void fillcomboDentistapp() {
        ArrayList<String> d = db.getDentist();

        for (int j = 0; j < d.size(); j++) {
            combodentistid.addItem(d.get(j));
            combodentistidSearch.addItem(d.get(j));
            combodentistidSearchPatient.addItem(d.get(j));
            didCombo.addItem(d.get(j));
        }
    }

    private void fillcomboPatient() {
        try {
            db.rs = db.statement.executeQuery("select * from Patient");
            while (db.rs.next()) {
                combosearchp.addItem(db.rs.getString(1));
                combopatientid.addItem(db.rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Receptionist_Main_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendarPopup1 = new org.jbundle.thin.base.screen.jcalendarbutton.JCalendarPopup();
        slidePanel = new javax.swing.JPanel();
        jButtonManagePatient2 = new javax.swing.JButton();
        jButtonManageApp2 = new javax.swing.JButton();
        lablelogout = new javax.swing.JLabel();
        jButtonViewdentistTime = new javax.swing.JButton();
        jButtonchangepassword = new javax.swing.JButton();
        Container = new javax.swing.JPanel();
        managePatientPanel = new javax.swing.JPanel();
        PatientManaging = new javax.swing.JTabbedPane();
        addpatient = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        textemail = new javax.swing.JTextField();
        textaddress = new javax.swing.JTextField();
        ButtonAddPatient = new javax.swing.JButton();
        editPatient = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        textid1 = new javax.swing.JTextField();
        searchPatient = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lname1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        phone1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        textemail1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        textaddress1 = new javax.swing.JTextField();
        updatePatient = new javax.swing.JButton();
        deletepatient = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        textid2 = new javax.swing.JTextField();
        searchPatienttodelete = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        fname2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        lname2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        phone2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        textemail2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        textaddress2 = new javax.swing.JTextField();
        deletePatient = new javax.swing.JButton();
        viewpatients = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        labelUserId7 = new javax.swing.JLabel();
        combodentistidSearchPatient = new javax.swing.JComboBox<>();
        viewpatientapp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        labelUserId8 = new javax.swing.JLabel();
        searchp = new javax.swing.JButton();
        combosearchp = new javax.swing.JComboBox<>();
        manageAppointmentPanel = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        bookappointment = new javax.swing.JPanel();
        book = new javax.swing.JPanel();
        labelUserId1 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        labelUserId2 = new javax.swing.JLabel();
        combodentistid = new javax.swing.JComboBox<>();
        labelUserId3 = new javax.swing.JLabel();
        combopatientid = new javax.swing.JComboBox<>();
        labelUserId4 = new javax.swing.JLabel();
        combostarttime = new javax.swing.JComboBox<>();
        period = new javax.swing.JLabel();
        comboperiod = new javax.swing.JComboBox<>();
        buttonBook = new javax.swing.JButton();
        searchAppointment = new javax.swing.JPanel();
        labelUserId5 = new javax.swing.JLabel();
        combodentistidSearch = new javax.swing.JComboBox<>();
        labelUserId6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AppointmentsJtable = new javax.swing.JTable();
        DateChooserSearch = new com.toedter.calendar.JDateChooser();
        searchapp = new javax.swing.JButton();
        deleteappointment = new javax.swing.JPanel();
        labelUserId11 = new javax.swing.JLabel();
        ApptoCancel = new javax.swing.JTextField();
        searchapp1 = new javax.swing.JButton();
        checkAvailableDentistPanel = new javax.swing.JPanel();
        daysPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        labelsun = new javax.swing.JLabel();
        sundtoggle = new javax.swing.JToggleButton();
        PanelSunday = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        labeltues = new javax.swing.JLabel();
        tuestoggle = new javax.swing.JToggleButton();
        PanelTuesday = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        labelmond = new javax.swing.JLabel();
        mondtoggle = new javax.swing.JToggleButton();
        PanelMonday = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        labelwed = new javax.swing.JLabel();
        wedtoggle = new javax.swing.JToggleButton();
        PanelWednesday = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        labelthur = new javax.swing.JLabel();
        thurtoggle = new javax.swing.JToggleButton();
        PanelThursday = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        labelfrid = new javax.swing.JLabel();
        fridtoggle = new javax.swing.JToggleButton();
        PanelFriday = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        labelsat = new javax.swing.JLabel();
        sattoggle = new javax.swing.JToggleButton();
        PanelSaturday = new javax.swing.JPanel();
        labelUserId10 = new javax.swing.JLabel();
        didCombo = new javax.swing.JComboBox<>();
        labelUserId9 = new javax.swing.JLabel();
        labeldentistname = new javax.swing.JLabel();
        changepasword = new javax.swing.JPanel();
        labelUserId12 = new javax.swing.JLabel();
        labelUserId13 = new javax.swing.JLabel();
        labelUserId14 = new javax.swing.JLabel();
        newpass1 = new javax.swing.JPasswordField();
        newpass2 = new javax.swing.JPasswordField();
        oldpass = new javax.swing.JPasswordField();
        showpasswordlabel = new javax.swing.JLabel();
        changepasswordbtn = new javax.swing.JButton();

        javax.swing.GroupLayout jCalendarPopup1Layout = new javax.swing.GroupLayout(jCalendarPopup1);
        jCalendarPopup1.setLayout(jCalendarPopup1Layout);
        jCalendarPopup1Layout.setHorizontalGroup(
            jCalendarPopup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jCalendarPopup1Layout.setVerticalGroup(
            jCalendarPopup1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(200, 224, 220));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slidePanel.setBackground(new java.awt.Color(150, 220, 220));
        slidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonManagePatient2.setBackground(new java.awt.Color(150, 220, 220));
        jButtonManagePatient2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonManagePatient2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonManagePatient2.setText("Manage Patient");
        jButtonManagePatient2.setBorder(null);
        jButtonManagePatient2.setBorderPainted(false);
        jButtonManagePatient2.setFocusPainted(false);
        jButtonManagePatient2.setRolloverEnabled(false);
        jButtonManagePatient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManagePatient2ActionPerformed(evt);
            }
        });
        slidePanel.add(jButtonManagePatient2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 160, 60));

        jButtonManageApp2.setBackground(new java.awt.Color(150, 220, 220));
        jButtonManageApp2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonManageApp2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonManageApp2.setText("Manage Appointments");
        jButtonManageApp2.setBorder(null);
        jButtonManageApp2.setBorderPainted(false);
        jButtonManageApp2.setFocusPainted(false);
        jButtonManageApp2.setRequestFocusEnabled(false);
        jButtonManageApp2.setRolloverEnabled(false);
        jButtonManageApp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageApp2ActionPerformed(evt);
            }
        });
        slidePanel.add(jButtonManageApp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 160, 60));

        lablelogout.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lablelogout.setForeground(new java.awt.Color(255, 255, 255));
        lablelogout.setText("logout");
        lablelogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lablelogoutMouseClicked(evt);
            }
        });
        slidePanel.add(lablelogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jButtonViewdentistTime.setBackground(new java.awt.Color(150, 220, 220));
        jButtonViewdentistTime.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonViewdentistTime.setForeground(new java.awt.Color(255, 255, 255));
        jButtonViewdentistTime.setText("View Dentist time");
        jButtonViewdentistTime.setBorder(null);
        jButtonViewdentistTime.setFocusPainted(false);
        jButtonViewdentistTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewdentistTimeActionPerformed(evt);
            }
        });
        slidePanel.add(jButtonViewdentistTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 160, 60));

        jButtonchangepassword.setBackground(new java.awt.Color(150, 220, 220));
        jButtonchangepassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButtonchangepassword.setForeground(new java.awt.Color(255, 255, 255));
        jButtonchangepassword.setText("Change Password");
        jButtonchangepassword.setBorder(null);
        jButtonchangepassword.setFocusPainted(false);
        jButtonchangepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonchangepasswordActionPerformed(evt);
            }
        });
        slidePanel.add(jButtonchangepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 160, 60));

        getContentPane().add(slidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 493));

        Container.setLayout(new java.awt.CardLayout());

        managePatientPanel.setBackground(new java.awt.Color(200, 224, 220));
        managePatientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PatientManaging.setBackground(new java.awt.Color(200, 224, 220));
        PatientManaging.setForeground(new java.awt.Color(0, 51, 51));
        PatientManaging.setToolTipText("");
        PatientManaging.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        addpatient.setBackground(new java.awt.Color(200, 224, 220));

        jPanel4.setBackground(new java.awt.Color(200, 224, 220));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Patient ID");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("First Name");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Last Name");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Phone");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Email");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Address");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        textid.setForeground(new java.awt.Color(0, 51, 51));

        fname.setForeground(new java.awt.Color(0, 51, 51));

        lname.setForeground(new java.awt.Color(0, 51, 51));

        phone.setForeground(new java.awt.Color(0, 51, 51));

        textemail.setForeground(new java.awt.Color(0, 51, 51));
        textemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textemailActionPerformed(evt);
            }
        });

        textaddress.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(textid)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phone, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(lname)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textemail)
                            .addComponent(textaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textid)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ButtonAddPatient.setBackground(new java.awt.Color(150, 220, 220));
        ButtonAddPatient.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ButtonAddPatient.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAddPatient.setText("Add");
        ButtonAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addpatientLayout = new javax.swing.GroupLayout(addpatient);
        addpatient.setLayout(addpatientLayout);
        addpatientLayout.setHorizontalGroup(
            addpatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addpatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonAddPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(addpatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        addpatientLayout.setVerticalGroup(
            addpatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addpatientLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(ButtonAddPatient)
                .addGap(35, 35, 35))
        );

        PatientManaging.addTab("Add", addpatient);

        editPatient.setBackground(new java.awt.Color(200, 224, 220));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Enter  PatientID");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        textid1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        textid1.setForeground(new java.awt.Color(0, 51, 51));
        textid1.setBorder(null);
        textid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textid1MouseClicked(evt);
            }
        });

        searchPatient.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        searchPatient.setForeground(new java.awt.Color(255, 255, 255));
        searchPatient.setText("Search");
        searchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(200, 224, 220));
        jPanel5.setLayout(new java.awt.GridLayout(5, 2, 20, 20));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("First Name");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jLabel17);

        fname1.setBackground(new java.awt.Color(200, 224, 220));
        fname1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        fname1.setForeground(new java.awt.Color(0, 51, 51));
        fname1.setBorder(null);
        fname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fname1MouseClicked(evt);
            }
        });
        jPanel5.add(fname1);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Last Name");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jLabel18);

        lname1.setBackground(new java.awt.Color(200, 224, 220));
        lname1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lname1.setForeground(new java.awt.Color(0, 51, 51));
        lname1.setBorder(null);
        lname1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lname1MouseClicked(evt);
            }
        });
        jPanel5.add(lname1);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Phone");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jLabel19);

        phone1.setBackground(new java.awt.Color(200, 224, 220));
        phone1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        phone1.setForeground(new java.awt.Color(0, 51, 51));
        phone1.setBorder(null);
        phone1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phone1MouseClicked(evt);
            }
        });
        jPanel5.add(phone1);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Email");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jLabel20);

        textemail1.setBackground(new java.awt.Color(200, 224, 220));
        textemail1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        textemail1.setForeground(new java.awt.Color(0, 51, 51));
        textemail1.setBorder(null);
        textemail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textemail1MouseClicked(evt);
            }
        });
        jPanel5.add(textemail1);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Address");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.add(jLabel21);

        textaddress1.setBackground(new java.awt.Color(200, 224, 220));
        textaddress1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        textaddress1.setForeground(new java.awt.Color(0, 51, 51));
        textaddress1.setBorder(null);
        jPanel5.add(textaddress1);

        updatePatient.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        updatePatient.setForeground(new java.awt.Color(255, 255, 255));
        updatePatient.setText("Update");
        updatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editPatientLayout = new javax.swing.GroupLayout(editPatient);
        editPatient.setLayout(editPatientLayout);
        editPatientLayout.setHorizontalGroup(
            editPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPatientLayout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textid1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(searchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(editPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(editPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(editPatientLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(121, Short.MAX_VALUE)))
        );
        editPatientLayout.setVerticalGroup(
            editPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPatientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textid1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addComponent(updatePatient)
                .addGap(19, 19, 19))
            .addGroup(editPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(editPatientLayout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        PatientManaging.addTab("Edit", editPatient);

        deletepatient.setBackground(new java.awt.Color(200, 224, 220));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Enter  PatientID");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        textid2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        textid2.setForeground(new java.awt.Color(0, 51, 51));
        textid2.setBorder(null);
        textid2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textid2MouseClicked(evt);
            }
        });

        searchPatienttodelete.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        searchPatienttodelete.setForeground(new java.awt.Color(255, 255, 255));
        searchPatienttodelete.setText("Search");
        searchPatienttodelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatienttodeleteActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(200, 224, 220));
        jPanel10.setLayout(new java.awt.GridLayout(5, 2, 20, 20));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("First Name");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.add(jLabel23);

        fname2.setBackground(new java.awt.Color(200, 224, 220));
        fname2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        fname2.setForeground(new java.awt.Color(0, 51, 51));
        fname2.setBorder(null);
        fname2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fname2MouseClicked(evt);
            }
        });
        jPanel10.add(fname2);

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Last Name");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.add(jLabel24);

        lname2.setBackground(new java.awt.Color(200, 224, 220));
        lname2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 14)); // NOI18N
        lname2.setForeground(new java.awt.Color(0, 51, 51));
        lname2.setBorder(null);
        lname2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lname2MouseClicked(evt);
            }
        });
        jPanel10.add(lname2);

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Phone");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.add(jLabel25);

        phone2.setBackground(new java.awt.Color(200, 224, 220));
        phone2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        phone2.setForeground(new java.awt.Color(0, 51, 51));
        phone2.setBorder(null);
        phone2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phone2MouseClicked(evt);
            }
        });
        jPanel10.add(phone2);

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Email");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.add(jLabel26);

        textemail2.setBackground(new java.awt.Color(200, 224, 220));
        textemail2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        textemail2.setForeground(new java.awt.Color(0, 51, 51));
        textemail2.setBorder(null);
        textemail2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textemail2MouseClicked(evt);
            }
        });
        jPanel10.add(textemail2);

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Address");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel10.add(jLabel27);

        textaddress2.setBackground(new java.awt.Color(200, 224, 220));
        textaddress2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        textaddress2.setForeground(new java.awt.Color(0, 51, 51));
        textaddress2.setBorder(null);
        jPanel10.add(textaddress2);

        deletePatient.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        deletePatient.setForeground(new java.awt.Color(255, 255, 255));
        deletePatient.setText("delete");
        deletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletepatientLayout = new javax.swing.GroupLayout(deletepatient);
        deletepatient.setLayout(deletepatientLayout);
        deletepatientLayout.setHorizontalGroup(
            deletepatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletepatientLayout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textid2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(searchPatienttodelete, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(deletepatientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletepatientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(deletepatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletepatientLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(121, Short.MAX_VALUE)))
        );
        deletepatientLayout.setVerticalGroup(
            deletepatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletepatientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deletepatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textid2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPatienttodelete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addComponent(deletePatient)
                .addGap(19, 19, 19))
            .addGroup(deletepatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deletepatientLayout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        PatientManaging.addTab("Delete", deletepatient);

        viewpatients.setBackground(new java.awt.Color(200, 224, 220));

        PatientTable.setBackground(new java.awt.Color(200, 224, 220));
        PatientTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PatientTable.setForeground(new java.awt.Color(0, 51, 51));
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        PatientTable.setRowHeight(25);
        jScrollPane1.setViewportView(PatientTable);

        labelUserId7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId7.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId7.setText("select Dentist id ");
        labelUserId7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        combodentistidSearchPatient.setBackground(new java.awt.Color(200, 224, 220));
        combodentistidSearchPatient.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combodentistidSearchPatient.setForeground(new java.awt.Color(0, 51, 51));
        combodentistidSearchPatient.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combodentistidSearchPatientItemStateChanged(evt);
            }
        });
        combodentistidSearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodentistidSearchPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewpatientsLayout = new javax.swing.GroupLayout(viewpatients);
        viewpatients.setLayout(viewpatientsLayout);
        viewpatientsLayout.setHorizontalGroup(
            viewpatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
            .addGroup(viewpatientsLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(labelUserId7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(combodentistidSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewpatientsLayout.setVerticalGroup(
            viewpatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewpatientsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(viewpatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserId7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combodentistidSearchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        PatientManaging.addTab("view patient", viewpatients);

        viewpatientapp.setBackground(new java.awt.Color(200, 224, 220));

        table.setBackground(new java.awt.Color(200, 224, 220));
        table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table.setForeground(new java.awt.Color(0, 51, 51));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setRowHeight(25);
        jScrollPane2.setViewportView(table);

        labelUserId8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId8.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId8.setText("select Patient id ");
        labelUserId8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        searchp.setBackground(new java.awt.Color(0, 0, 204));
        searchp.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        searchp.setForeground(new java.awt.Color(255, 255, 255));
        searchp.setText("search");
        searchp.setFocusPainted(false);
        searchp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchpActionPerformed(evt);
            }
        });

        combosearchp.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout viewpatientappLayout = new javax.swing.GroupLayout(viewpatientapp);
        viewpatientapp.setLayout(viewpatientappLayout);
        viewpatientappLayout.setHorizontalGroup(
            viewpatientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
            .addGroup(viewpatientappLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(labelUserId8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(combosearchp, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(searchp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewpatientappLayout.setVerticalGroup(
            viewpatientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewpatientappLayout.createSequentialGroup()
                .addGroup(viewpatientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewpatientappLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(viewpatientappLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUserId8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchp)))
                    .addGroup(viewpatientappLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(combosearchp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        PatientManaging.addTab("patient appointments", viewpatientapp);

        managePatientPanel.add(PatientManaging, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 500));

        Container.add(managePatientPanel, "card2");

        manageAppointmentPanel.setBackground(new java.awt.Color(200, 224, 220));

        jTabbedPane1.setBackground(new java.awt.Color(200, 224, 220));
        jTabbedPane1.setForeground(new java.awt.Color(0, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        bookappointment.setBackground(new java.awt.Color(200, 224, 220));

        book.setBackground(new java.awt.Color(200, 224, 220));

        labelUserId1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId1.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId1.setText("Date");
        labelUserId1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        DateChooser.setBackground(new java.awt.Color(255, 255, 255));
        DateChooser.setForeground(new java.awt.Color(0, 51, 51));

        labelUserId2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId2.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId2.setText("Dentist Id");
        labelUserId2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        combodentistid.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combodentistid.setForeground(new java.awt.Color(0, 51, 51));

        labelUserId3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId3.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId3.setText("Patient Id");
        labelUserId3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        combopatientid.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combopatientid.setForeground(new java.awt.Color(0, 51, 51));

        labelUserId4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId4.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId4.setText("Start Time");
        labelUserId4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        combostarttime.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combostarttime.setForeground(new java.awt.Color(0, 51, 51));
        combostarttime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 AM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM" }));
        combostarttime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combostarttimeActionPerformed(evt);
            }
        });

        period.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        period.setForeground(new java.awt.Color(255, 255, 255));
        period.setText("period");
        period.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        comboperiod.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        comboperiod.setForeground(new java.awt.Color(0, 51, 51));
        comboperiod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30 minutes", "1 hour" }));

        javax.swing.GroupLayout bookLayout = new javax.swing.GroupLayout(book);
        book.setLayout(bookLayout);
        bookLayout.setHorizontalGroup(
            bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(period, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelUserId4, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(labelUserId1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelUserId2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelUserId3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(combodentistid, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combostarttime, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboperiod, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                    .addComponent(combopatientid, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        bookLayout.setVerticalGroup(
            bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookLayout.createSequentialGroup()
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUserId1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bookLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(labelUserId2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bookLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(combodentistid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserId3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combopatientid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserId4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combostarttime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(period, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboperiod, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buttonBook.setBackground(new java.awt.Color(0, 0, 204));
        buttonBook.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        buttonBook.setForeground(new java.awt.Color(255, 255, 255));
        buttonBook.setText("Book");
        buttonBook.setFocusPainted(false);
        buttonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookappointmentLayout = new javax.swing.GroupLayout(bookappointment);
        bookappointment.setLayout(bookappointmentLayout);
        bookappointmentLayout.setHorizontalGroup(
            bookappointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookappointmentLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookappointmentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonBook, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        bookappointmentLayout.setVerticalGroup(
            bookappointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookappointmentLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(buttonBook, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jTabbedPane1.addTab("Book Appointment", bookappointment);

        searchAppointment.setBackground(new java.awt.Color(200, 224, 220));

        labelUserId5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId5.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId5.setText("select date");
        labelUserId5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        combodentistidSearch.setBackground(new java.awt.Color(200, 224, 220));
        combodentistidSearch.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        combodentistidSearch.setForeground(new java.awt.Color(0, 51, 51));

        labelUserId6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId6.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId6.setText("select Dentist id");
        labelUserId6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AppointmentsJtable.setBackground(new java.awt.Color(200, 224, 220));
        AppointmentsJtable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AppointmentsJtable.setForeground(new java.awt.Color(0, 51, 51));
        AppointmentsJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "sadsad", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AppointmentsJtable.setRowHeight(25);
        jScrollPane3.setViewportView(AppointmentsJtable);

        DateChooserSearch.setForeground(new java.awt.Color(0, 51, 51));

        searchapp.setBackground(new java.awt.Color(0, 0, 204));
        searchapp.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        searchapp.setForeground(new java.awt.Color(255, 255, 255));
        searchapp.setText("search");
        searchapp.setFocusPainted(false);
        searchapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchAppointmentLayout = new javax.swing.GroupLayout(searchAppointment);
        searchAppointment.setLayout(searchAppointmentLayout);
        searchAppointmentLayout.setHorizontalGroup(
            searchAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchAppointmentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUserId6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combodentistidSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUserId5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DateChooserSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchAppointmentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchapp)
                .addContainerGap())
        );
        searchAppointmentLayout.setVerticalGroup(
            searchAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchAppointmentLayout.createSequentialGroup()
                .addGroup(searchAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchAppointmentLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(searchAppointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combodentistidSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUserId5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUserId6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(searchAppointmentLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(DateChooserSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(searchapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(76, 76, 76))
        );

        jTabbedPane1.addTab("Search Appointment", searchAppointment);

        deleteappointment.setBackground(new java.awt.Color(200, 224, 220));

        labelUserId11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId11.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId11.setText("Enter Appointment Id to cancel");
        labelUserId11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ApptoCancel.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        ApptoCancel.setForeground(new java.awt.Color(0, 51, 51));
        ApptoCancel.setBorder(null);
        ApptoCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApptoCancelMouseClicked(evt);
            }
        });

        searchapp1.setBackground(new java.awt.Color(0, 0, 204));
        searchapp1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        searchapp1.setForeground(new java.awt.Color(255, 255, 255));
        searchapp1.setText("Delete");
        searchapp1.setFocusPainted(false);
        searchapp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchapp1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteappointmentLayout = new javax.swing.GroupLayout(deleteappointment);
        deleteappointment.setLayout(deleteappointmentLayout);
        deleteappointmentLayout.setHorizontalGroup(
            deleteappointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteappointmentLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(labelUserId11)
                .addGap(54, 54, 54)
                .addGroup(deleteappointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchapp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ApptoCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        deleteappointmentLayout.setVerticalGroup(
            deleteappointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteappointmentLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(deleteappointmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserId11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApptoCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(searchapp1)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete Appointment", deleteappointment);

        javax.swing.GroupLayout manageAppointmentPanelLayout = new javax.swing.GroupLayout(manageAppointmentPanel);
        manageAppointmentPanel.setLayout(manageAppointmentPanelLayout);
        manageAppointmentPanelLayout.setHorizontalGroup(
            manageAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        manageAppointmentPanelLayout.setVerticalGroup(
            manageAppointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        Container.add(manageAppointmentPanel, "card3");

        checkAvailableDentistPanel.setBackground(new java.awt.Color(200, 224, 220));

        daysPanel.setBackground(new java.awt.Color(200, 224, 220));

        jPanel6.setBackground(new java.awt.Color(200, 224, 220));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        labelsun.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelsun.setForeground(new java.awt.Color(255, 255, 255));
        labelsun.setText("Sunday");
        labelsun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sundtoggle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sundtoggle.setForeground(new java.awt.Color(255, 255, 255));
        sundtoggle.setText("On");
        sundtoggle.setFocusPainted(false);
        sundtoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sundtoggleActionPerformed(evt);
            }
        });

        PanelSunday.setBackground(new java.awt.Color(200, 224, 220));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelsun)
                .addGap(18, 18, 18)
                .addComponent(PanelSunday, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addGap(76, 76, 76)
                .addComponent(sundtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sundtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(labelsun)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelSunday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(200, 224, 220));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        labeltues.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labeltues.setForeground(new java.awt.Color(255, 255, 255));
        labeltues.setText("Tuesday");
        labeltues.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tuestoggle.setForeground(new java.awt.Color(255, 255, 255));
        tuestoggle.setText("On");
        tuestoggle.setFocusPainted(false);
        tuestoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tuestoggleActionPerformed(evt);
            }
        });

        PanelTuesday.setBackground(new java.awt.Color(200, 224, 220));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeltues)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTuesday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addComponent(tuestoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tuestoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(labeltues)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelTuesday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(200, 224, 220));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        labelmond.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelmond.setForeground(new java.awt.Color(255, 255, 255));
        labelmond.setText("Monday");
        labelmond.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mondtoggle.setForeground(new java.awt.Color(255, 255, 255));
        mondtoggle.setText("On");
        mondtoggle.setFocusPainted(false);
        mondtoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mondtoggleActionPerformed(evt);
            }
        });

        PanelMonday.setBackground(new java.awt.Color(200, 224, 220));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelmond)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMonday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(76, 76, 76)
                .addComponent(mondtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mondtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(labelmond)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelMonday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(200, 224, 220));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        labelwed.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelwed.setForeground(new java.awt.Color(255, 255, 255));
        labelwed.setText("Wednesday");
        labelwed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        wedtoggle.setForeground(new java.awt.Color(255, 255, 255));
        wedtoggle.setText("On");
        wedtoggle.setFocusPainted(false);
        wedtoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wedtoggleActionPerformed(evt);
            }
        });

        PanelWednesday.setBackground(new java.awt.Color(200, 224, 220));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelwed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelWednesday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addComponent(wedtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wedtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(labelwed)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelWednesday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(200, 224, 220));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));

        labelthur.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelthur.setForeground(new java.awt.Color(255, 255, 255));
        labelthur.setText("Thursday");
        labelthur.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        thurtoggle.setForeground(new java.awt.Color(255, 255, 255));
        thurtoggle.setText("On");
        thurtoggle.setFocusPainted(false);
        thurtoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thurtoggleActionPerformed(evt);
            }
        });

        PanelThursday.setBackground(new java.awt.Color(200, 224, 220));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelthur)
                .addGap(18, 18, 18)
                .addComponent(PanelThursday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addComponent(thurtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(thurtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                        .addComponent(labelthur)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelThursday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(200, 224, 220));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel18.setForeground(new java.awt.Color(255, 255, 255));

        labelfrid.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelfrid.setForeground(new java.awt.Color(255, 255, 255));
        labelfrid.setText("Friday");
        labelfrid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fridtoggle.setForeground(new java.awt.Color(255, 255, 255));
        fridtoggle.setText("On");
        fridtoggle.setFocusPainted(false);
        fridtoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fridtoggleActionPerformed(evt);
            }
        });

        PanelFriday.setBackground(new java.awt.Color(200, 224, 220));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelfrid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelFriday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(fridtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fridtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                        .addComponent(labelfrid)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelFriday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(200, 224, 220));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel20.setForeground(new java.awt.Color(255, 255, 255));

        labelsat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelsat.setForeground(new java.awt.Color(255, 255, 255));
        labelsat.setText("Saturday");
        labelsat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        sattoggle.setForeground(new java.awt.Color(255, 255, 255));
        sattoggle.setText("On");
        sattoggle.setFocusPainted(false);
        sattoggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sattoggleActionPerformed(evt);
            }
        });

        PanelSaturday.setBackground(new java.awt.Color(200, 224, 220));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelsat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelSaturday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(sattoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sattoggle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(labelsat)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelSaturday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout daysPanelLayout = new javax.swing.GroupLayout(daysPanel);
        daysPanel.setLayout(daysPanelLayout);
        daysPanelLayout.setHorizontalGroup(
            daysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, daysPanelLayout.createSequentialGroup()
                .addGroup(daysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(daysPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        daysPanelLayout.setVerticalGroup(
            daysPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daysPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelUserId10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId10.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId10.setText("Dentist Id");
        labelUserId10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        didCombo.setForeground(new java.awt.Color(0, 51, 51));
        didCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                didComboItemStateChanged(evt);
            }
        });
        didCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                didComboActionPerformed(evt);
            }
        });

        labelUserId9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId9.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId9.setText("Dentist :");
        labelUserId9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labeldentistname.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        labeldentistname.setForeground(new java.awt.Color(0, 51, 51));
        labeldentistname.setText("........................................");
        labeldentistname.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout checkAvailableDentistPanelLayout = new javax.swing.GroupLayout(checkAvailableDentistPanel);
        checkAvailableDentistPanel.setLayout(checkAvailableDentistPanelLayout);
        checkAvailableDentistPanelLayout.setHorizontalGroup(
            checkAvailableDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(daysPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 560, Short.MAX_VALUE)
            .addGroup(checkAvailableDentistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUserId10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(didCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(labelUserId9)
                .addGap(18, 18, 18)
                .addComponent(labeldentistname, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        checkAvailableDentistPanelLayout.setVerticalGroup(
            checkAvailableDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkAvailableDentistPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(checkAvailableDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserId10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(didCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUserId9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeldentistname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daysPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        Container.add(checkAvailableDentistPanel, "card4");

        changepasword.setBackground(new java.awt.Color(200, 224, 220));

        labelUserId12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId12.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId12.setText("Enter new password");
        labelUserId12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelUserId13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId13.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId13.setText("Renter new password");
        labelUserId13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelUserId14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId14.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId14.setText("Enter old password");
        labelUserId14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        newpass1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        newpass2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        oldpass.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        showpasswordlabel.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        showpasswordlabel.setForeground(new java.awt.Color(200, 224, 220));
        showpasswordlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Eye_30px_2.png"))); // NOI18N
        showpasswordlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpasswordlabelMouseClicked(evt);
            }
        });

        changepasswordbtn.setBackground(new java.awt.Color(150, 220, 220));
        changepasswordbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        changepasswordbtn.setForeground(new java.awt.Color(255, 255, 255));
        changepasswordbtn.setText("submit");
        changepasswordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasswordbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changepaswordLayout = new javax.swing.GroupLayout(changepasword);
        changepasword.setLayout(changepaswordLayout);
        changepaswordLayout.setHorizontalGroup(
            changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changepaswordLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelUserId12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelUserId13, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addComponent(labelUserId14, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(changepasswordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newpass2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(changepaswordLayout.createSequentialGroup()
                        .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(showpasswordlabel)))
                .addGap(44, 44, 44))
        );
        changepaswordLayout.setVerticalGroup(
            changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changepaswordLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserId14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showpasswordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changepaswordLayout.createSequentialGroup()
                        .addComponent(newpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUserId13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newpass2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelUserId12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(changepasswordbtn)
                .addGap(65, 65, 65))
        );

        Container.add(changepasword, "card5");

        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 560, 500));

        setSize(new java.awt.Dimension(736, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonManagePatient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManagePatient2ActionPerformed
        setbuttonColor(jButtonManagePatient2);
        resetbuttonColor(jButtonViewdentistTime);
        resetbuttonColor(jButtonManageApp2);
        resetbuttonColor(jButtonchangepassword);
        Container.removeAll();
        Container.add(managePatientPanel);
        Container.repaint();
        Container.validate();
    }//GEN-LAST:event_jButtonManagePatient2ActionPerformed

    private void jButtonManageApp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageApp2ActionPerformed
        setbuttonColor(jButtonManageApp2);
        resetbuttonColor(jButtonManagePatient2);
        resetbuttonColor(jButtonViewdentistTime);
        resetbuttonColor(jButtonchangepassword);
        Container.removeAll();
        Container.add(manageAppointmentPanel);
        Container.repaint();
        Container.validate();
    }//GEN-LAST:event_jButtonManageApp2ActionPerformed

    private void buttonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBookActionPerformed

        // Date date = (Date) DateChooser.getDate();
        //java.sql.Date sqldate = new java.sql.Date(date.getTime());
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateformat.format(DateChooser.getDate());
        String did = (String) combodentistid.getSelectedItem();
        String pid = (String) combopatientid.getSelectedItem();
        String start = (String) combostarttime.getSelectedItem();
        String period = (String) comboperiod.getSelectedItem();
        String end = "";
        if (period.equals("30 minutes")) {
            if (start.equals("8:00 AM")) {
                end = "8:30 AM";
            } else if (start.equals("8:30 AM")) {
                end = "9:00 AM";
            } else if (start.equals("9:00 AM")) {
                end = "9:30 AM";
            } else if (start.equals("9:30 AM")) {
                end = "10:00 AM";
            } else if (start.equals("10:00 AM")) {
                end = "10:30 AM";
            } else if (start.equals("10:30 AM")) {
                end = "11:00 AM";
            } else if (start.equals("11:00 AM")) {
                end = "11:30 AM";
            } else if (start.equals("11:30 AM")) {
                end = "12:00 PM";
            } else if (start.equals("12:00 PM")) {
                end = "12:30 PM";
            } else if (start.equals("12:30 PM")) {
                end = "1:00 PM";
            } else if (start.equals("1:00 PM")) {
                end = "1:30 PM";
            } else if (start.equals("1:30 PM")) {
                end = "2:00 PM";
            } else if (start.equals("2:00 PM")) {
                end = "2:30 PM";
            } else if (start.equals("2:30 PM")) {
                end = "3:00 PM";
            } else if (start.equals("3:00 PM")) {
                end = "3:30 PM";
            } else if (start.equals("3:30 PM")) {
                end = "4:00 PM";
            } else if (start.equals("4:00 PM")) {
                end = "4:30 PM";
            } else if (start.equals("4:30 PM")) {
                end = "5:00 PM";
            } else if (start.equals("5:00 PM")) {
                end = "5:30 PM";
            } else if (start.equals("5:30 PM")) {
                end = "6:00 PM";
            }
        } else if (period.equals("1 hour")) {
            if (start.equals("8:00 AM")) {
                end = "9:00 AM";
            } else if (start.equals("9:00 AM")) {
                end = "10:00 AM";
            } else if (start.equals("10:00 AM")) {
                end = "11:00 AM";
            } else if (start.equals("11:00 AM")) {
                end = "12:00 PM";
            } else if (start.equals("12:00 PM")) {
                end = "1:00 PM";
            } else if (start.equals("1:00 PM")) {
                end = "2:00 PM";
            } else if (start.equals("2:00 PM")) {
                end = "3:00 PM";
            } else if (start.equals("3:00 PM")) {
                end = "4:00 PM";
            } else if (start.equals("4:00 PM")) {
                end = "5:00 PM";
            } else if (start.equals("5:00 PM")) {
                end = "6:00 PM";
            } else if (start.equals("8:30 AM")) {
                end = "9:30 AM";
            } else if (start.equals("9:30 AM")) {
                end = "10:30 AM";
            } else if (start.equals("10:30 AM")) {
                end = "11:30 AM";
            } else if (start.equals("11:30 AM")) {
                end = "12:30 PM";
            } else if (start.equals("12:30 PM")) {
                end = "1:30 PM";
            } else if (start.equals("1:30 PM")) {
                end = "2:30 PM";
            } else if (start.equals("2:30 PM")) {
                end = "3:30 PM";
            } else if (start.equals("3:30 PM")) {
                end = "4:30 PM";
            } else if (start.equals("4:30 PM")) {
                end = "5:30 PM";
            }

        }
        //gets the name of the dte selected and checks i dtabase if
        //the dentist is avaiilable on this day
        String dayname = new SimpleDateFormat("EEEE").format(DateChooser.getDate());
        int test = 0;
        try {
            db.rs = db.statement.executeQuery("select Available  from AvailableDay where Day_name='" + dayname + "'");

            while (db.rs.next()) {
                if (db.rs.getBoolean(1) == true) {
                    test = 1;
                }

            }

            if (test == 1) {
                Appointment p = new Appointment(pid, did, start, end, false, date, period);
                boolean added = db.addAppointment(p);
                if (added == true) {
                    JOptionPane.showMessageDialog(null, " added successfuly");
                } else {
                    JOptionPane.showMessageDialog(null, " adding failed");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Dentist not available on " + dayname);
            }

        } catch (SQLException ex) {

            Logger.getLogger(Receptionist_Main_Window.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_buttonBookActionPerformed

    private void combostarttimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combostarttimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combostarttimeActionPerformed

    private void searchappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchappActionPerformed
        try {
            SimpleDateFormat dateformat2 = new SimpleDateFormat("yyyy-MM-dd");
            String date2 = dateformat2.format(DateChooserSearch.getDate());
            String did = (String) combodentistidSearch.getSelectedItem();
            db.rs = db.statement.executeQuery("select * from appointmentsofdentistDATE('" + did + "','" + date2 + "')");

            DefaultTableModel def = new DefaultTableModel();
            def = new DefaultTableModel(new Object[][]{},
                    new String[]{"AppID", "Patient Id", "Patient name", "Start Time", "End Time"});
            {
                while (db.rs.next()) {

                    def.addRow(new Object[]{db.rs.getString(1), db.rs.getString(2), db.rs.getString(3) + " " + db.rs.getString(4), db.rs.getString(5), db.rs.getString(6)});
                }

            };

            AppointmentsJtable.setModel(def);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "enter coorect date");
            Logger.getLogger(View_Dentist.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchappActionPerformed

    private void jButtonViewdentistTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewdentistTimeActionPerformed
        setbuttonColor(jButtonViewdentistTime);
        resetbuttonColor(jButtonManagePatient2);
        resetbuttonColor(jButtonManageApp2);
        resetbuttonColor(jButtonchangepassword);
        Container.removeAll();
        Container.add(checkAvailableDentistPanel);
        Container.repaint();
        Container.validate();
    }//GEN-LAST:event_jButtonViewdentistTimeActionPerformed

    private void sundtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sundtoggleActionPerformed

    }//GEN-LAST:event_sundtoggleActionPerformed

    private void tuestoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuestoggleActionPerformed

    }//GEN-LAST:event_tuestoggleActionPerformed

    private void mondtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondtoggleActionPerformed


    }//GEN-LAST:event_mondtoggleActionPerformed

    private void wedtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wedtoggleActionPerformed


    }//GEN-LAST:event_wedtoggleActionPerformed

    private void thurtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thurtoggleActionPerformed

    }//GEN-LAST:event_thurtoggleActionPerformed

    private void fridtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridtoggleActionPerformed

    }//GEN-LAST:event_fridtoggleActionPerformed

    private void sattoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sattoggleActionPerformed

    }//GEN-LAST:event_sattoggleActionPerformed

    private void didComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_didComboItemStateChanged

        filldentistname();
        resetToggles();
        toggles();
        try {
            resetPanels();
            fillpanelhours();
        } catch (SQLException ex) {
            Logger.getLogger(Receptionist_Main_Window.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_didComboItemStateChanged
    private void filldentistname() {

        String did = (String) didCombo.getSelectedItem();
        try {

            db.rs = db.statement.executeQuery("select firstname , lastname  from Dentist where Dentist_id='" + did + "'");
            while (db.rs.next()) {
                labeldentistname.setText(db.rs.getString(1) + "  " + db.rs.getString(2));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Receptionist_Main_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void resetToggles() {
        /*     mondtoggle.setSelected(true);
        tuestoggle.setSelected(true);
        wedtoggle.setSelected(true);
        fridtoggle.setSelected(true);
        sattoggle.setSelected(true);
        sundtoggle.setSelected(true);
        thurtoggle.setSelected(true);*/
        mondtoggle.setText("On");
        mondtoggle.setText("On");
        tuestoggle.setText("On");
        wedtoggle.setText("On");
        thurtoggle.setText("On");
        fridtoggle.setText("On");
        sattoggle.setText("On");
        sundtoggle.setText("On");
        labelmond.setForeground(Color.white);
        labeltues.setForeground(Color.white);
        labelwed.setForeground(Color.white);
        labelthur.setForeground(Color.white);
        labelfrid.setForeground(Color.white);
        labelsat.setForeground(Color.white);
        labelsun.setForeground(Color.white);
    }

    private void toggles() {

        try {
            String did = (String) didCombo.getSelectedItem();
            db.rs = db.statement.executeQuery("select Day_name , Available from AvailableDay where Dentist_id='" + did + "'");

            while (db.rs.next()) {

                if (db.rs.getString(1).equalsIgnoreCase("Monday")) {
                    if (db.rs.getBoolean(2) == true) {
                        mondtoggle.setSelected(false);
                        mondtoggle.setEnabled(false);
                    } else {
                        mondtoggle.setSelected(true);
                        labelmond.setForeground(Color.gray);
                        mondtoggle.setText("Off");

                        mondtoggle.setEnabled(false);
                    }
                }
                if (db.rs.getString(1).equalsIgnoreCase("Tuesday")) {
                    if (db.rs.getBoolean(2) == true) {
                        tuestoggle.setSelected(false);
                        tuestoggle.setEnabled(false);
                    } else {
                        tuestoggle.setSelected(true);
                        labeltues.setForeground(Color.gray);
                        tuestoggle.setText("Off");

                        tuestoggle.setEnabled(false);
                    }
                }
                if (db.rs.getString(1).equalsIgnoreCase("Wednesday")) {
                    if (db.rs.getBoolean(2) == true) {
                        wedtoggle.setSelected(false);
                        wedtoggle.setEnabled(false);
                    } else {
                        wedtoggle.setSelected(true);
                        labelwed.setForeground(Color.gray);
                        wedtoggle.setText("Off");
                        wedtoggle.setEnabled(false);
                    }
                }
                if (db.rs.getString(1).equalsIgnoreCase("Thursday")) {
                    if (db.rs.getBoolean(2) == true) {
                        thurtoggle.setSelected(false);
                        thurtoggle.setEnabled(false);
                    } else {
                        thurtoggle.setSelected(true);
                        labelthur.setForeground(Color.gray);
                        thurtoggle.setText("Off");
                        thurtoggle.setEnabled(false);
                    }
                }
                if (db.rs.getString(1).equalsIgnoreCase("Friday")) {
                    if (db.rs.getBoolean(2) == true) {
                        fridtoggle.setSelected(false);
                        fridtoggle.setEnabled(false);
                    } else {
                        fridtoggle.setSelected(true);
                        labelfrid.setForeground(Color.gray);
                        fridtoggle.setText("Off");
                        fridtoggle.setEnabled(false);
                        fridtoggle.setEnabled(false);
                    }
                }
                if (db.rs.getString(1).equalsIgnoreCase("Saturday")) {
                    if (db.rs.getBoolean(2) == true) {
                        sattoggle.setSelected(false);
                        sattoggle.setEnabled(false);
                    } else {
                        sattoggle.setSelected(true);
                        labelsat.setForeground(Color.gray);
                        sattoggle.setText("Off");
                        sattoggle.setEnabled(false);
                    }
                }
                if (db.rs.getString(1).equalsIgnoreCase("Sunday")) {
                    if (db.rs.getBoolean(2) == true) {
                        sundtoggle.setSelected(false);
                        sundtoggle.setEnabled(false);
                    } else {
                        sundtoggle.setSelected(true);
                        labelsun.setForeground(Color.gray);
                        sundtoggle.setText("Off");
                        sundtoggle.setEnabled(false);
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(View_Dentist.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void fillpanelhours() throws SQLException {

        ArrayList<String> mon = new ArrayList<>();
        ArrayList<String> tues = new ArrayList<>();
        ArrayList<String> wed = new ArrayList<>();
        ArrayList<String> thur = new ArrayList<>();
        ArrayList<String> frid = new ArrayList<>();
        ArrayList<String> sat = new ArrayList<>();
        ArrayList<String> Sun = new ArrayList<>();

        String s;
        String did = (String) didCombo.getSelectedItem();
        db.rs = db.statement.executeQuery("select * from GetAllDays('" + did + "')");
        while (db.rs.next()) {

            if (mondtoggle.getText().equalsIgnoreCase("On")) {
                if (db.rs.getString(1).equals("Monday")) {

                    s = "";
                    s += db.rs.getString(2) + "--" + db.rs.getString(3);
                    mon.add(s);
                    JLabel l;
                    l = new JLabel();
                    l.setText(s);
                    l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                    PanelMonday.add(l);

                }
            }
            if (tuestoggle.getText().equalsIgnoreCase("On")) {
                if (db.rs.getString(1).equals("Tuesday")) {
                    s = "";
                    s += db.rs.getString(2) + "--" + db.rs.getString(3);
                    tues.add(s);
                    JLabel l;
                    l = new JLabel();
                    l.setText(s);
                    l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                    PanelTuesday.add(l);
                }
            }
            if (wedtoggle.getText().equalsIgnoreCase("On")) {
                if (db.rs.getString(1).equals("Wednesday")) {
                    s = "";
                    s += db.rs.getString(2) + "--" + db.rs.getString(3);
                    wed.add(s);
                    JLabel l;
                    l = new JLabel();
                    l.setText(s);
                    l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                    PanelWednesday.add(l);
                }
            }
            if (thurtoggle.getText().equalsIgnoreCase("On")) {
                if (db.rs.getString(1).equals("Thursday")) {
                    s = "";
                    s += db.rs.getString(2) + "--" + db.rs.getString(3);
                    thur.add(s);
                    JLabel l;
                    l = new JLabel();
                    l.setText(s);
                    l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                    PanelThursday.add(l);
                }
            }
            if (fridtoggle.getText().equalsIgnoreCase("On")) {
                if (fridtoggle.getText().equalsIgnoreCase("On")) {
                    if (db.rs.getString(1).equals("Friday")) {
                        s = "";
                        s += db.rs.getString(2) + "--" + db.rs.getString(3);
                        frid.add(s);
                        JLabel l;
                        l = new JLabel();
                        l.setText(s);
                        l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                        PanelFriday.add(l);
                    }
                }
            }
            if (sattoggle.getText().equalsIgnoreCase("On")) {
                if (db.rs.getString(1).equals("Saturday")) {
                    s = "";
                    s += db.rs.getString(2) + "--" + db.rs.getString(3);
                    sat.add(s);
                    JLabel l;
                    l = new JLabel();
                    l.setText(s);
                    l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                    PanelSaturday.add(l);
                }
            }
            if (sundtoggle.getText().equalsIgnoreCase("On")) {
                if (db.rs.getString(1).equals("Sunday")) {
                    s = "";
                    s += db.rs.getString(2) + "--" + db.rs.getString(3);
                    Sun.add(s);
                    JLabel l;
                    l = new JLabel();
                    l.setText(s);
                    l.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                    PanelSunday.add(l);
                }
            }
        }

    }

    public void resetPanels() {
        PanelFriday.removeAll();
        PanelMonday.removeAll();
        PanelTuesday.removeAll();
        PanelThursday.removeAll();
        PanelSaturday.removeAll();
        PanelWednesday.removeAll();
        PanelSunday.removeAll();

//panel.revalidate();
//panel.repaint(); 
    }
    private void ApptoCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApptoCancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ApptoCancelMouseClicked

    private void searchapp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchapp1ActionPerformed
        if (!ApptoCancel.getText().isEmpty()) {
            int i = Integer.parseInt(ApptoCancel.getText());
            try {
                int count = 0;
                db.rs = db.statement.executeQuery("select Appointment_id  from Appointment");
                while (db.rs.next()) {
                    if (db.rs.getInt(1) == i) {
                        boolean deleted = db.cancelAppointment(i);
                        if (deleted == true) {
                            JOptionPane.showMessageDialog(null, "Appointment canceled successfuly");
                        } else {
                            JOptionPane.showMessageDialog(null, "Appointment canceled failed");
                        }

                        count++;
                    }
                }
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "please enter a correct id");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Receptionist_Main_Window.class.getName()).log(Level.SEVERE, null, ex);
            }

            ApptoCancel.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "please enter an appointment id to cancel");
        }
    }//GEN-LAST:event_searchapp1ActionPerformed

    private void lablelogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lablelogoutMouseClicked
        Main_Login_Window mlw = new Main_Login_Window();
        mlw.setVisible(true);
        mlw.pack();
        mlw.setLocationRelativeTo(null);
        mlw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lablelogoutMouseClicked

    private void jButtonchangepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonchangepasswordActionPerformed

        setbuttonColor(jButtonchangepassword);
        resetbuttonColor(jButtonViewdentistTime);
        resetbuttonColor(jButtonManagePatient2);
        resetbuttonColor(jButtonManageApp2);
        Container.removeAll();
        Container.add(changepasword);
        Container.repaint();
        Container.validate();
    }//GEN-LAST:event_jButtonchangepasswordActionPerformed

    private void changepasswordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasswordbtnActionPerformed
        String old = oldpass.getText();
        String new1 = newpass1.getText();
        String new2 = newpass2.getText();

        try {
            db.rs = db.statement.executeQuery("select Password from Login where UserId='" + mlw.userid + "' and Role='Receptionist'");
            int count = 0;
            while (db.rs.next()) {

                if (old.equals(db.rs.getString("Password"))) {
                    count++;
                }
            }
            if (count != 0) {
                if (new1.equals(new2)) {

                    if (db.statement.executeUpdate("update  login set Password='" + new1 + "' where UserId='" + mlw.userid + "'") == 1) {
                        JOptionPane.showMessageDialog(null, "password was changed successfuly");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "new password dont match");
                }
            } else {
                JOptionPane.showMessageDialog(null, "please enter correct password");
            }

        } catch (Exception ex) {
            Logger.getLogger(Main_Login_Window.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_changepasswordbtnActionPerformed

    private void showpasswordlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpasswordlabelMouseClicked
        if (showpasswordlabel.getText().equals("")) {
            oldpass.setEchoChar((char) 0);
            showpasswordlabel.setText("set");
        } else {

            oldpass.setEchoChar('*');
            showpasswordlabel.setText("");
        }


    }//GEN-LAST:event_showpasswordlabelMouseClicked

    private void searchpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchpActionPerformed

        String s = (String) combosearchp.getSelectedItem();
        try {
            db.rs = db.statement.executeQuery("select * from GetPatientsAppointments('" + s + "')");
            SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");

            def = new DefaultTableModel();

            def = new DefaultTableModel(new Object[][]{},
                    new String[]{"Dentist ID", "Date", "Start", "End"});
            {

                while (db.rs.next()) {
                    // JOptionPane.showMessageDialog(null,db.rs.getDate(1) );
                    def.addRow(new Object[]{db.rs.getString(1), dateformat.format(db.rs.getDate(2)), db.rs.getString(3), db.rs.getString(4)});
                }

            };

            table.setModel(def);
        } catch (SQLException ex) {
            Logger.getLogger(View_Dentist.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchpActionPerformed

    private void combodentistidSearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodentistidSearchPatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combodentistidSearchPatientActionPerformed

    private void combodentistidSearchPatientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combodentistidSearchPatientItemStateChanged

        String s = (String) combodentistidSearchPatient.getSelectedItem();
        try {
            db.rs = db.statement.executeQuery("select * from DentistPatients ('" + s + "')");

            def = new DefaultTableModel();
            def = new DefaultTableModel(new Object[][]{},
                    new String[]{"Id", "first name", "last name", "phone", "email", "adress"});
            {

                while (db.rs.next()) {

                    def.addRow(new Object[]{db.rs.getString(1), db.rs.getString(2), db.rs.getString(3), db.rs.getString(4), db.rs.getString(5), db.rs.getString(6)});
                }

            };

            PatientTable.setModel(def);
        } catch (SQLException ex) {
            Logger.getLogger(View_Dentist.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_combodentistidSearchPatientItemStateChanged

    private void deletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientActionPerformed

        String id = textid2.getText();
        boolean deleted = db.deletePatient(id);
        if (deleted = true) {
            JOptionPane.showMessageDialog(null, "Appointment added successfuly");
        } else {
            JOptionPane.showMessageDialog(null, "Appointment adding failed");
        }

        combopatientid.removeAllItems();
        combosearchp.removeAllItems();
        fillcomboPatient();
    }//GEN-LAST:event_deletePatientActionPerformed

    private void textemail2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textemail2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textemail2MouseClicked

    private void phone2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phone2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_phone2MouseClicked

    private void lname2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lname2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lname2MouseClicked

    private void fname2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fname2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fname2MouseClicked

    private void searchPatienttodeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatienttodeleteActionPerformed
        String id = textid2.getText();
        Patient r = db.searchPatient(id);
        fname2.setText(r.getfirst());
        lname2.setText(r.getlast());
        phone2.setText(r.getPhone());
        textemail2.setText(r.getEmail());
        textaddress2.setText(r.getAddress());
    }//GEN-LAST:event_searchPatienttodeleteActionPerformed

    private void textid2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textid2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textid2MouseClicked

    private void updatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePatientActionPerformed
        String id = textid1.getText();
        String first = fname1.getText();
        String last = lname1.getText();
        String phone = phone1.getText();
        String mail = textemail1.getText();
        String address = textaddress1.getText();
        boolean up = db.updatePatient(id, first, last, mail, phone, address);
        if (up == true) {
            JOptionPane.showMessageDialog(null, "Patient updated successfuly");
        } else {
            JOptionPane.showMessageDialog(null, "updating patient failed");
        }

    }//GEN-LAST:event_updatePatientActionPerformed

    private void textemail1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textemail1MouseClicked

        textemail1.setText("");
        settextColor(textemail1);
    }//GEN-LAST:event_textemail1MouseClicked

    private void phone1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phone1MouseClicked
        phone1.setText("");

        settextColor(phone1);
    }//GEN-LAST:event_phone1MouseClicked

    private void lname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lname1MouseClicked
        lname1.setText("");
        settextColor(lname1);
    }//GEN-LAST:event_lname1MouseClicked

    private void fname1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fname1MouseClicked
        fname1.setText("");

        settextColor(fname1);
    }//GEN-LAST:event_fname1MouseClicked

    private void searchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientActionPerformed

        String id = textid1.getText();
        Patient r = db.searchPatient(id);
        fname1.setText(r.getfirst());
        lname1.setText(r.getlast());
        phone1.setText(r.getPhone());
        textemail1.setText(r.getEmail());
        textaddress1.setText(r.getAddress());
    }//GEN-LAST:event_searchPatientActionPerformed

    private void textid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textid1MouseClicked

    }//GEN-LAST:event_textid1MouseClicked

    private void ButtonAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddPatientActionPerformed
        if (!fname.getText().isEmpty() && !lname.getText().isEmpty() && !textid.getText().isEmpty()
                && !textemail.getText().isEmpty() && !textaddress.getText().isEmpty()) {
            String first = fname.getText();
            String last = lname.getText();
            String id = textid.getText();
            String phon = this.phone.getText();
            String mail = textemail.getText();
            String address = textaddress.getText();
            Patient p = new Patient(id, first, last, mail, phon, address);
            boolean added = db.addPatient(p);
            if (added == true) {
                JOptionPane.showMessageDialog(null, " added successfuly");
                textid.setText("");
                fname.setText("");
                lname.setText("");
                phone.setText("");
                textemail.setText("");

                textaddress.setText("");
            } else {
                JOptionPane.showMessageDialog(null, " adding failed");
            }
        } else {
            JOptionPane.showMessageDialog(null, "please fill all the textfields");
        }
        combopatientid.removeAllItems();
        combosearchp.removeAllItems();
        fillcomboPatient();
    }//GEN-LAST:event_ButtonAddPatientActionPerformed

    private void textemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textemailActionPerformed

    private void didComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_didComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_didComboActionPerformed

    public void setbuttonColor(JButton b) {
        b.setBackground(new Color(150, 212, 220));
    }

    public void resetbuttonColor(JButton b) {
        b.setBackground(new Color(150, 219, 220));
    }

    public void settextColor(JTextField t) {
        t.setForeground(new Color(255, 255, 255));
    }

    public void resettextColor(JTextField t) {
        t.setForeground(new Color(150, 212, 220));
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receptionist_Main_Window().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentsJtable;
    private javax.swing.JTextField ApptoCancel;
    private javax.swing.JButton ButtonAddPatient;
    private javax.swing.JPanel Container;
    private com.toedter.calendar.JDateChooser DateChooser;
    private com.toedter.calendar.JDateChooser DateChooserSearch;
    private javax.swing.JPanel PanelFriday;
    private javax.swing.JPanel PanelMonday;
    private javax.swing.JPanel PanelSaturday;
    private javax.swing.JPanel PanelSunday;
    private javax.swing.JPanel PanelThursday;
    private javax.swing.JPanel PanelTuesday;
    private javax.swing.JPanel PanelWednesday;
    private javax.swing.JTabbedPane PatientManaging;
    private javax.swing.JTable PatientTable;
    private javax.swing.JPanel addpatient;
    private javax.swing.JPanel book;
    private javax.swing.JPanel bookappointment;
    private javax.swing.JButton buttonBook;
    private javax.swing.JButton changepasswordbtn;
    private javax.swing.JPanel changepasword;
    private javax.swing.JPanel checkAvailableDentistPanel;
    private javax.swing.JComboBox<String> combodentistid;
    private javax.swing.JComboBox<String> combodentistidSearch;
    private javax.swing.JComboBox<String> combodentistidSearchPatient;
    private javax.swing.JComboBox<String> combopatientid;
    private javax.swing.JComboBox<String> comboperiod;
    private javax.swing.JComboBox<String> combosearchp;
    private javax.swing.JComboBox<String> combostarttime;
    private javax.swing.JPanel daysPanel;
    private javax.swing.JButton deletePatient;
    private javax.swing.JPanel deleteappointment;
    private javax.swing.JPanel deletepatient;
    private javax.swing.JComboBox<String> didCombo;
    private javax.swing.JPanel editPatient;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fname1;
    private javax.swing.JTextField fname2;
    private javax.swing.JToggleButton fridtoggle;
    private javax.swing.JButton jButtonManageApp2;
    private javax.swing.JButton jButtonManagePatient2;
    private javax.swing.JButton jButtonViewdentistTime;
    private javax.swing.JButton jButtonchangepassword;
    private org.jbundle.thin.base.screen.jcalendarbutton.JCalendarPopup jCalendarPopup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelUserId1;
    private javax.swing.JLabel labelUserId10;
    private javax.swing.JLabel labelUserId11;
    private javax.swing.JLabel labelUserId12;
    private javax.swing.JLabel labelUserId13;
    private javax.swing.JLabel labelUserId14;
    private javax.swing.JLabel labelUserId2;
    private javax.swing.JLabel labelUserId3;
    private javax.swing.JLabel labelUserId4;
    private javax.swing.JLabel labelUserId5;
    private javax.swing.JLabel labelUserId6;
    private javax.swing.JLabel labelUserId7;
    private javax.swing.JLabel labelUserId8;
    private javax.swing.JLabel labelUserId9;
    private javax.swing.JLabel labeldentistname;
    private javax.swing.JLabel labelfrid;
    private javax.swing.JLabel labelmond;
    private javax.swing.JLabel labelsat;
    private javax.swing.JLabel labelsun;
    private javax.swing.JLabel labelthur;
    private javax.swing.JLabel labeltues;
    private javax.swing.JLabel labelwed;
    private javax.swing.JLabel lablelogout;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField lname1;
    private javax.swing.JTextField lname2;
    private javax.swing.JPanel manageAppointmentPanel;
    private javax.swing.JPanel managePatientPanel;
    private javax.swing.JToggleButton mondtoggle;
    private javax.swing.JPasswordField newpass1;
    private javax.swing.JPasswordField newpass2;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JLabel period;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField phone1;
    private javax.swing.JTextField phone2;
    private javax.swing.JToggleButton sattoggle;
    private javax.swing.JPanel searchAppointment;
    private javax.swing.JButton searchPatient;
    private javax.swing.JButton searchPatienttodelete;
    private javax.swing.JButton searchapp;
    private javax.swing.JButton searchapp1;
    private javax.swing.JButton searchp;
    private javax.swing.JLabel showpasswordlabel;
    private javax.swing.JPanel slidePanel;
    private javax.swing.JToggleButton sundtoggle;
    private javax.swing.JTable table;
    private javax.swing.JTextField textaddress;
    private javax.swing.JTextField textaddress1;
    private javax.swing.JTextField textaddress2;
    private javax.swing.JTextField textemail;
    private javax.swing.JTextField textemail1;
    private javax.swing.JTextField textemail2;
    private javax.swing.JTextField textid;
    private javax.swing.JTextField textid1;
    private javax.swing.JTextField textid2;
    private javax.swing.JToggleButton thurtoggle;
    private javax.swing.JToggleButton tuestoggle;
    private javax.swing.JButton updatePatient;
    private javax.swing.JPanel viewpatientapp;
    private javax.swing.JPanel viewpatients;
    private javax.swing.JToggleButton wedtoggle;
    // End of variables declaration//GEN-END:variables
}
