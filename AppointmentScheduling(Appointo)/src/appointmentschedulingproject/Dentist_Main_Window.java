package appointmentschedulingproject;

import javax.swing.RowFilter;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Dentist_Main_Window extends javax.swing.JFrame {

    DataBaseManager db = new DataBaseManager();
    private static int sunavail = 0;
    private static int mondavail = 0;
    private static int tuesavail = 0;
    private static int wedavail = 0;
    private static int thuravail = 0;
    private static int fridavail = 0;
    private static int satavail = 0;

    ////////////////////////////////////////////////offf
    private static int sunchange = 0;
    private static int mondchange = 0;
    private static int tueschange = 0;
    private static int wedchange = 0;
    private static int thurchange = 0;
    private static int fridchange = 0;
    private static int satchange = 0;

    ///////////////////////////////////////////////////onn
    private static int sunchangeON = 0;
    private static int mondchangeON = 0;
    private static int tueschangeON = 0;
    private static int wedchangeON = 0;
    private static int thurchangeON = 0;
    private static int fridchangeON = 0;
    private static int satchangeON = 0;

    Main_Login_Window mlw;
    DefaultTableModel def;

    public Dentist_Main_Window() {
        //showpasswordlabel.setVisible(false);
        initComponents();
        updateTable();//view ppointments of today
        toggles();
        patienttable();
    }

    private void filterpatienttable(String query) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(def);
        PatientTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(query));
    }

    private void patienttable() {

        try {
            db.rs = db.statement.executeQuery("select * from DentistPatients ('" + mlw.userid + "')");

            def = new DefaultTableModel();
            def = new DefaultTableModel(new Object[][]{},
                    new String[]{"Id", "First Name", "Last Name", "phone", "email", "adress"});
            {

                while (db.rs.next()) {

                    def.addRow(new Object[]{db.rs.getString(1), db.rs.getString(2), db.rs.getString(3), db.rs.getString(4), db.rs.getString(5), db.rs.getString(6)});
                }

            };

            PatientTable.setModel(def);
        } catch (SQLException ex) {
            Logger.getLogger(View_Dentist.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    private void toggles() {

        try {
            db.rs = db.statement.executeQuery("select Day_name , Available from AvailableDay where Dentist_id='" + mlw.userid + "'");

            while (db.rs.next()) {

                if (db.rs.getString(1).equalsIgnoreCase("Monday")) {
                    if (db.rs.getBoolean(2) == true) {
                        mondtoggle.setSelected(false);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dent = new javax.swing.JTabbedPane();
        ViewappPanel = new javax.swing.JPanel();
        slidePanel = new javax.swing.JPanel();
        CanceledAppbtn = new javax.swing.JButton();
        SearchByDatebtn = new javax.swing.JButton();
        TodayAppBtn = new javax.swing.JButton();
        lablelogout = new javax.swing.JLabel();
        appContainer = new javax.swing.JPanel();
        TodayPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TodayTable = new javax.swing.JTable();
        CanceledPanel = new javax.swing.JPanel();
        labelUserId8 = new javax.swing.JLabel();
        DateChoosecancel = new com.toedter.calendar.JDateChooser();
        searchcanceled = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        canceledtable = new javax.swing.JTable();
        DatePanel = new javax.swing.JPanel();
        labelUserId7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datetable = new javax.swing.JTable();
        DateChoose = new com.toedter.calendar.JDateChooser();
        searchapp = new javax.swing.JButton();
        EditAvailabilityPanel = new javax.swing.JPanel();
        days = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        labelsun = new javax.swing.JLabel();
        sundtoggle = new javax.swing.JToggleButton();
        PanelSunday = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        labeltues = new javax.swing.JLabel();
        tuestoggle = new javax.swing.JToggleButton();
        PanelTuesday = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        labelmond = new javax.swing.JLabel();
        mondtoggle = new javax.swing.JToggleButton();
        PanelMonday = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
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
        submit = new javax.swing.JButton();
        patientviewpanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        filterPatienttext = new javax.swing.JTextField();
        changepasword = new javax.swing.JPanel();
        labelUserId12 = new javax.swing.JLabel();
        labelUserId13 = new javax.swing.JLabel();
        labelUserId14 = new javax.swing.JLabel();
        newpass1 = new javax.swing.JPasswordField();
        newpass2 = new javax.swing.JPasswordField();
        oldpass = new javax.swing.JPasswordField();
        ll = new javax.swing.JLabel();
        changepasswordbtn = new javax.swing.JButton();
        showpasswordlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dent.setBackground(new java.awt.Color(200, 224, 220));
        dent.setForeground(new java.awt.Color(0, 51, 51));
        dent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ViewappPanel.setBackground(new java.awt.Color(200, 224, 220));
        ViewappPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slidePanel.setBackground(new java.awt.Color(150, 220, 220));
        slidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CanceledAppbtn.setBackground(new java.awt.Color(150, 220, 220));
        CanceledAppbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CanceledAppbtn.setForeground(new java.awt.Color(255, 255, 255));
        CanceledAppbtn.setText("Canceled Appointments");
        CanceledAppbtn.setBorder(null);
        CanceledAppbtn.setBorderPainted(false);
        CanceledAppbtn.setFocusPainted(false);
        CanceledAppbtn.setRolloverEnabled(false);
        CanceledAppbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanceledAppbtnActionPerformed(evt);
            }
        });
        slidePanel.add(CanceledAppbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 160, 60));

        SearchByDatebtn.setBackground(new java.awt.Color(150, 220, 220));
        SearchByDatebtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SearchByDatebtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchByDatebtn.setText("Search By Date ");
        SearchByDatebtn.setBorder(null);
        SearchByDatebtn.setBorderPainted(false);
        SearchByDatebtn.setFocusPainted(false);
        SearchByDatebtn.setRolloverEnabled(false);
        SearchByDatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByDatebtnActionPerformed(evt);
            }
        });
        slidePanel.add(SearchByDatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 160, 60));

        TodayAppBtn.setBackground(new java.awt.Color(150, 220, 220));
        TodayAppBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TodayAppBtn.setForeground(new java.awt.Color(255, 255, 255));
        TodayAppBtn.setText("Today Appointments");
        TodayAppBtn.setBorder(null);
        TodayAppBtn.setBorderPainted(false);
        TodayAppBtn.setFocusPainted(false);
        TodayAppBtn.setRolloverEnabled(false);
        TodayAppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayAppBtnActionPerformed(evt);
            }
        });
        slidePanel.add(TodayAppBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 160, 60));

        lablelogout.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lablelogout.setForeground(new java.awt.Color(255, 255, 255));
        lablelogout.setText("logout");
        lablelogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lablelogoutMouseClicked(evt);
            }
        });
        slidePanel.add(lablelogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 68, -1));

        ViewappPanel.add(slidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 60));

        appContainer.setLayout(new java.awt.CardLayout());

        TodayPanel.setBackground(new java.awt.Color(200, 224, 220));

        TodayTable.setBackground(new java.awt.Color(200, 224, 220));
        TodayTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TodayTable.setForeground(new java.awt.Color(255, 255, 255));
        TodayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TodayTable.setRowHeight(40);
        jScrollPane3.setViewportView(TodayTable);

        javax.swing.GroupLayout TodayPanelLayout = new javax.swing.GroupLayout(TodayPanel);
        TodayPanel.setLayout(TodayPanelLayout);
        TodayPanelLayout.setHorizontalGroup(
            TodayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TodayPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TodayPanelLayout.setVerticalGroup(
            TodayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        appContainer.add(TodayPanel, "card2");

        CanceledPanel.setBackground(new java.awt.Color(200, 224, 220));

        labelUserId8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId8.setForeground(new java.awt.Color(0, 51, 51));
        labelUserId8.setText("choose Date ");
        labelUserId8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        DateChoosecancel.setForeground(new java.awt.Color(0, 51, 51));
        DateChoosecancel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateChoosecancelPropertyChange(evt);
            }
        });

        searchcanceled.setBackground(new java.awt.Color(0, 0, 204));
        searchcanceled.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        searchcanceled.setForeground(new java.awt.Color(255, 255, 255));
        searchcanceled.setText("search");
        searchcanceled.setFocusPainted(false);
        searchcanceled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcanceledActionPerformed(evt);
            }
        });

        canceledtable.setBackground(new java.awt.Color(200, 224, 220));
        canceledtable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        canceledtable.setForeground(new java.awt.Color(0, 51, 51));
        canceledtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Name", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        canceledtable.setRowHeight(25);
        jScrollPane2.setViewportView(canceledtable);

        javax.swing.GroupLayout CanceledPanelLayout = new javax.swing.GroupLayout(CanceledPanel);
        CanceledPanel.setLayout(CanceledPanelLayout);
        CanceledPanelLayout.setHorizontalGroup(
            CanceledPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CanceledPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(labelUserId8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DateChoosecancel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(searchcanceled, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(CanceledPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CanceledPanelLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );
        CanceledPanelLayout.setVerticalGroup(
            CanceledPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CanceledPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CanceledPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelUserId8, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addGroup(CanceledPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(CanceledPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateChoosecancel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(searchcanceled, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(413, 413, 413))
            .addGroup(CanceledPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CanceledPanelLayout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        appContainer.add(CanceledPanel, "card4");

        DatePanel.setBackground(new java.awt.Color(200, 224, 220));

        labelUserId7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId7.setForeground(new java.awt.Color(0, 51, 51));
        labelUserId7.setText("choose Date ");
        labelUserId7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        datetable.setBackground(new java.awt.Color(200, 224, 220));
        datetable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        datetable.setForeground(new java.awt.Color(0, 51, 51));
        datetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Patient Id", "Name", "Time"
            }
        ));
        datetable.setRowHeight(25);
        jScrollPane1.setViewportView(datetable);

        DateChoose.setForeground(new java.awt.Color(0, 51, 51));
        DateChoose.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateChoosePropertyChange(evt);
            }
        });

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

        javax.swing.GroupLayout DatePanelLayout = new javax.swing.GroupLayout(DatePanel);
        DatePanel.setLayout(DatePanelLayout);
        DatePanelLayout.setHorizontalGroup(
            DatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(DatePanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(labelUserId7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(DateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchapp, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        DatePanelLayout.setVerticalGroup(
            DatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DateChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUserId7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchapp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        appContainer.add(DatePanel, "card3");

        ViewappPanel.add(appContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 710, 470));

        dent.addTab("View Appointments", ViewappPanel);

        EditAvailabilityPanel.setBackground(new java.awt.Color(200, 224, 220));

        days.setBackground(new java.awt.Color(200, 224, 220));

        jPanel5.setBackground(new java.awt.Color(200, 224, 220));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelsun)
                .addGap(18, 18, 18)
                .addComponent(PanelSunday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(76, 76, 76)
                .addComponent(sundtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sundtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(labelsun)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelSunday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(200, 224, 220));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeltues)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTuesday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addComponent(tuestoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tuestoggle, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labeltues)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelTuesday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(200, 224, 220));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelmond)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMonday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(76, 76, 76)
                .addComponent(mondtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mondtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(labelmond)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelMonday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(200, 224, 220));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelwed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelWednesday, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addGap(77, 77, 77)
                .addComponent(wedtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wedtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(labelwed)
                        .addGap(0, 8, Short.MAX_VALUE)))
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
                        .addGap(0, 8, Short.MAX_VALUE)))
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
                        .addGap(0, 8, Short.MAX_VALUE)))
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
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sattoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                        .addComponent(labelsat)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(PanelSaturday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        submit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout daysLayout = new javax.swing.GroupLayout(days);
        days.setLayout(daysLayout);
        daysLayout.setHorizontalGroup(
            daysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daysLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(daysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, daysLayout.createSequentialGroup()
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        daysLayout.setVerticalGroup(
            daysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daysLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout EditAvailabilityPanelLayout = new javax.swing.GroupLayout(EditAvailabilityPanel);
        EditAvailabilityPanel.setLayout(EditAvailabilityPanelLayout);
        EditAvailabilityPanelLayout.setHorizontalGroup(
            EditAvailabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditAvailabilityPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        EditAvailabilityPanelLayout.setVerticalGroup(
            EditAvailabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditAvailabilityPanelLayout.createSequentialGroup()
                .addComponent(days, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dent.addTab("Edit Availability", EditAvailabilityPanel);

        patientviewpanel.setBackground(new java.awt.Color(200, 224, 220));

        PatientTable.setBackground(new java.awt.Color(200, 224, 220));
        PatientTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PatientTable.setForeground(new java.awt.Color(0, 51, 51));
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "phone", "email", "address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        PatientTable.setRowHeight(30);
        jScrollPane4.setViewportView(PatientTable);

        filterPatienttext.setForeground(new java.awt.Color(0, 51, 51));
        filterPatienttext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterPatienttextKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout patientviewpanelLayout = new javax.swing.GroupLayout(patientviewpanel);
        patientviewpanel.setLayout(patientviewpanelLayout);
        patientviewpanelLayout.setHorizontalGroup(
            patientviewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientviewpanelLayout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(filterPatienttext, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(patientviewpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );
        patientviewpanelLayout.setVerticalGroup(
            patientviewpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientviewpanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(filterPatienttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        dent.addTab("View Patient", patientviewpanel);

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
        newpass1.setForeground(new java.awt.Color(0, 51, 51));

        newpass2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        newpass2.setForeground(new java.awt.Color(0, 51, 51));

        oldpass.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        oldpass.setForeground(new java.awt.Color(0, 51, 51));

        ll.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        ll.setForeground(new java.awt.Color(200, 224, 220));
        ll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Eye_30px_2.png"))); // NOI18N
        ll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llMouseClicked(evt);
            }
        });

        changepasswordbtn.setBackground(new java.awt.Color(0, 0, 204));
        changepasswordbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        changepasswordbtn.setForeground(new java.awt.Color(255, 255, 255));
        changepasswordbtn.setText("submit");
        changepasswordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasswordbtnActionPerformed(evt);
            }
        });

        showpasswordlabel.setForeground(new java.awt.Color(200, 224, 220));

        javax.swing.GroupLayout changepaswordLayout = new javax.swing.GroupLayout(changepasword);
        changepasword.setLayout(changepaswordLayout);
        changepaswordLayout.setHorizontalGroup(
            changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changepaswordLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(labelUserId12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelUserId13, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addComponent(labelUserId14, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changepaswordLayout.createSequentialGroup()
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
                                .addComponent(ll))))
                    .addGroup(changepaswordLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(showpasswordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        changepaswordLayout.setVerticalGroup(
            changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changepaswordLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(showpasswordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserId14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ll, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changepaswordLayout.createSequentialGroup()
                        .addComponent(newpass1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(changepaswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelUserId13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newpass2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelUserId12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(changepasswordbtn)
                .addGap(65, 65, 65))
        );

        dent.addTab("change Password", changepasword);

        getContentPane().add(dent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 496));

        setSize(new java.awt.Dimension(734, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private void CanceledAppbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanceledAppbtnActionPerformed
        setbuttonColor(CanceledAppbtn);
        resetbuttonColor(TodayAppBtn);
        resetbuttonColor(SearchByDatebtn);
        appContainer.removeAll();
        appContainer.add(CanceledPanel);
        appContainer.repaint();
        appContainer.validate();
    }//GEN-LAST:event_CanceledAppbtnActionPerformed

    private void SearchByDatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByDatebtnActionPerformed
        setbuttonColor(SearchByDatebtn);
        resetbuttonColor(CanceledAppbtn);
        resetbuttonColor(TodayAppBtn);
        appContainer.removeAll();
        appContainer.add(DatePanel);
        appContainer.repaint();
        appContainer.validate();
    }//GEN-LAST:event_SearchByDatebtnActionPerformed

    private void TodayAppBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayAppBtnActionPerformed

        setbuttonColor(TodayAppBtn);
        resetbuttonColor(CanceledAppbtn);
        resetbuttonColor(SearchByDatebtn);
        appContainer.removeAll();
        appContainer.add(TodayPanel);
        appContainer.repaint();
        appContainer.validate();

    }//GEN-LAST:event_TodayAppBtnActionPerformed

    private void sundtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sundtoggleActionPerformed
        if (sundtoggle.isSelected()) {//ana kbset ltoggele
            if (sunavail == 0)//iza kenet on
            {//hye on saret off
                labelsun.setForeground(Color.gray);
                db.editAvailableDay(mlw.userid, "Sunday", false);
                sundtoggle.setText("Off");
                tueschange++;//y3ne sar off
                db.altercanceleddays(mlw.userid, "Sunday", 1);
            }
        } else {//ekbesa werj3 8yer 8yer r2ye werj3 ekbesa
            if (sunchange != 0)//kent off
            { //saret on
                labelsun.setForeground(Color.white);
                sundtoggle.setText("On");
                db.editAvailableDay(mlw.userid, "Sunday", true);
                db.altercanceleddays(mlw.userid, "Sunday", 0);
            }

        }
        updateTable();
    }//GEN-LAST:event_sundtoggleActionPerformed

    private void tuestoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuestoggleActionPerformed
        if (tuestoggle.isSelected()) {//ana kbset ltoggele
            if (tuesavail == 0)//iza kenet on
            {//hye on saret off
                labeltues.setForeground(Color.gray);
                db.editAvailableDay(mlw.userid, "Tuesday", false);
                tuestoggle.setText("Off");
                tueschange++;//y3ne sar off
                db.altercanceleddays(mlw.userid, "Tuesday", 1);

                // JOptionPane.showMessageDialog(null, "*********");
            }
        } else {//ekbesa werj3 8yer 8yer r2ye werj3 ekbesa
            if (tueschange != 0)//kent off
            { //saret on
                labeltues.setForeground(Color.white);
                tuestoggle.setText("On");
                db.editAvailableDay(mlw.userid, "Tuesday", true);
                db.altercanceleddays(mlw.userid, "Tuesday", 0);
            }

        }
        updateTable();
    }//GEN-LAST:event_tuestoggleActionPerformed

    private void mondtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondtoggleActionPerformed

        if (mondtoggle.isSelected()) {//ana kbset ltoggele
            if (mondavail == 0)//iza kenet on
            {//hye on saret off
                labelmond.setForeground(Color.gray);
                db.editAvailableDay(mlw.userid, "Monday", false);
                mondtoggle.setText("Off");
                mondchange++;//y3ne sar off
                db.altercanceleddays(mlw.userid, "Monday", 1);
                //   JOptionPane.showMessageDialog(null, "*********");

            }
        } else {//ekbesa werj3 8yer 8yer r2ye werj3 ekbesa
            if (mondchange != 0)//kent off
            { //saret on
                labelmond.setForeground(Color.white);
                mondtoggle.setText("On");
                db.editAvailableDay(mlw.userid, "Monday", true);
                db.altercanceleddays(mlw.userid, "Monday", 0);
                //   JOptionPane.showMessageDialog(null, "*********");
            }

        }
        updateTable();

    }//GEN-LAST:event_mondtoggleActionPerformed

    private void wedtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wedtoggleActionPerformed

        if (wedtoggle.isSelected()) {//ana kbset ltoggele
            if (wedavail == 0)//iza kenet off
            {//hye on saret off
                labelwed.setForeground(Color.gray);
                db.editAvailableDay(mlw.userid, "Wednesday", false);
                wedtoggle.setText("Off");
                wedchange++;//y3ne sar off
                db.altercanceleddays(mlw.userid, "Wednesday", 1);

                //  JOptionPane.showMessageDialog(null, "*********");
            }
        } else {//ekbesa werj3 8yer 8yer r2ye werj3 ekbesa
            if (wedchange != 0)//kent off
            { //saret on
                labelwed.setForeground(Color.white);
                wedtoggle.setText("On");
                db.editAvailableDay(mlw.userid, "Wednesday", true);
                db.altercanceleddays(mlw.userid, "Wednesday", 0);
            }

        }
        updateTable();

    }//GEN-LAST:event_wedtoggleActionPerformed

    private void thurtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thurtoggleActionPerformed
        if (thurtoggle.isSelected()) {//ana kbset ltoggele
            if (thuravail == 0)//iza kenet off
            {//hye on saret off
                labelthur.setForeground(Color.gray);
                db.editAvailableDay(mlw.userid, "Thursday", false);
                thurtoggle.setText("Off");
                thurchange++;//y3ne sar off
                db.altercanceleddays(mlw.userid, "Thursday", 1);
            }
        } else {//ekbesa werj3 8yer 8yer r2ye werj3 ekbesa
            if (thurchange != 0)//kent off
            { //saret on
                labelthur.setForeground(Color.white);
                db.editAvailableDay(mlw.userid, "Thursday", true);
                thurtoggle.setText("On");
                db.altercanceleddays(mlw.userid, "Thursday", 0);
            }

        }
    }//GEN-LAST:event_thurtoggleActionPerformed

    private void fridtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridtoggleActionPerformed
        if (fridtoggle.isSelected()) {//ana kbset ltoggele
            if (fridavail == 0)//iza kenet on
            {//hye on saret off
                labelfrid.setForeground(Color.gray);
                db.editAvailableDay(mlw.userid, "Friday", false);
                fridtoggle.setText("Off");
                fridchange++;//y3ne sar off
                db.altercanceleddays(mlw.userid, "Friday", 1);
            }
        } else {//ekbesa werj3 8yer 8yer r2ye werj3 ekbesa
            if (fridchange != 0)//kent off
            { //saret on
                labelfrid.setForeground(Color.white);
                fridtoggle.setText("On");
                db.editAvailableDay(mlw.userid, "Friday", true);
                db.altercanceleddays(mlw.userid, "Friday", 0);
            }

        }
        updateTable();
    }//GEN-LAST:event_fridtoggleActionPerformed

    private void sattoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sattoggleActionPerformed
        if (sattoggle.isSelected()) {//ana kbset ltoggele
            if (satavail == 0)//iza kenet on
            {//hye on saret off
                labelsat.setForeground(Color.white);
                db.editAvailableDay(mlw.userid, "Saturday", false);
                sattoggle.setText("Off");
                satchange++;//y3ne sar off

                db.altercanceleddays(mlw.userid, "Saturday", 1);
            }
        } else {//ekbesa werj3 8yer 8yer r2ye werj3 ekbesa
            if (satchange != 0)//kent off
            { //saret on
                labelsat.setForeground(Color.white);
                sattoggle.setText("On");
                db.editAvailableDay(mlw.userid, "Saturday", true);
                db.altercanceleddays(mlw.userid, "Saturday", 0);
            }

        }
        updateTable();
    }//GEN-LAST:event_sattoggleActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        Dentist_Main_Window amw = new Dentist_Main_Window();
        amw.setVisible(true);
        amw.pack();
        amw.setLocationRelativeTo(null);
        amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_submitActionPerformed

    private void DateChoosePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateChoosePropertyChange


    }//GEN-LAST:event_DateChoosePropertyChange

    private void searchappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchappActionPerformed

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateformat.format(DateChoose.getDate());
        datetable.setBackground(new Color(200, 224, 220));
        try {
            db.rs = db.statement.executeQuery("select  * from getDateApp('" + mlw.userid + "',' " + date + " ')");

            def = new DefaultTableModel();

            def = new DefaultTableModel(new Object[][]{},
                    new String[]{"Patient Id", "Name", "Time"});
            {
                while (db.rs.next()) {

                    def.addRow(new Object[]{db.rs.getString(1), db.rs.getString(2) + " " + db.rs.getString(3), "from " + db.rs.getString(4) + " to " + db.rs.getString(5)});//
                }

            };

            datetable.setModel(def);

        } catch (SQLException ex) {
            Logger.getLogger(View_Dentist.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_searchappActionPerformed


    private void DateChoosecancelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateChoosecancelPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_DateChoosecancelPropertyChange

    private void searchcanceledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcanceledActionPerformed
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateformat.format(DateChoosecancel.getDate());
        System.out.println(date);
        try {
            db.rs = db.statement.executeQuery("select  * from getCanceledApp('" + mlw.userid + "',' " + date + " ')");
            def = new DefaultTableModel();

            def = new DefaultTableModel(new Object[][]{},
                    new String[]{"Patient Id", "Name", "Time"});
            {
                while (db.rs.next()) {

                    //System.out.println(db.rs.getString(1));
                    def.addRow(new Object[]{db.rs.getString(1), db.rs.getString(2) + " " + db.rs.getString(3), "from " + db.rs.getString(4) + " to " + db.rs.getString(5)});//
                }

            };

            canceledtable.setModel(def);

        } catch (SQLException ex) {
            Logger.getLogger(View_Dentist.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchcanceledActionPerformed

    private void lablelogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lablelogoutMouseClicked
        Main_Login_Window mlw = new Main_Login_Window();
        mlw.setVisible(true);
        mlw.pack();
        mlw.setLocationRelativeTo(null);
        mlw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_lablelogoutMouseClicked

    private void filterPatienttextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterPatienttextKeyReleased

        String query = filterPatienttext.getText().toLowerCase();

        filterpatienttable(query);

    }//GEN-LAST:event_filterPatienttextKeyReleased

    private void llMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llMouseClicked
        if (ll.getText().equals("")) {
            oldpass.setEchoChar((char) 0);
            ll.setText("set");
        } else {

            oldpass.setEchoChar('*');
            ll.setText("");
        }

    }//GEN-LAST:event_llMouseClicked

    private void changepasswordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasswordbtnActionPerformed
        String old = oldpass.getText();
        String new1 = newpass1.getText();
        String new2 = newpass2.getText();

        try {
            db.rs = db.statement.executeQuery("select Password from Login where UserId='" + mlw.userid + "' and Role='Dentist'");
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

    private void updateTable() {

        try {
            db.rs = db.statement.executeQuery("select  * from getTodyaApp('" + mlw.userid + "')");

            def = new DefaultTableModel();

            def = new DefaultTableModel(new Object[][]{},
                    new String[]{"Patient Id", "Name", "Time"});
            {
                while (db.rs.next()) {

                    def.addRow(new Object[]{db.rs.getString(1), db.rs.getString(2) + " " + db.rs.getString(3), "from " + db.rs.getString(4) + " to " + db.rs.getString(5)});//
                }

            };

            TodayTable.setModel(def);

        } catch (SQLException ex) {
            Logger.getLogger(View_Dentist.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dentist_Main_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CanceledAppbtn;
    private javax.swing.JPanel CanceledPanel;
    private com.toedter.calendar.JDateChooser DateChoose;
    private com.toedter.calendar.JDateChooser DateChoosecancel;
    private javax.swing.JPanel DatePanel;
    private javax.swing.JPanel EditAvailabilityPanel;
    private javax.swing.JPanel PanelFriday;
    private javax.swing.JPanel PanelMonday;
    private javax.swing.JPanel PanelSaturday;
    private javax.swing.JPanel PanelSunday;
    private javax.swing.JPanel PanelThursday;
    private javax.swing.JPanel PanelTuesday;
    private javax.swing.JPanel PanelWednesday;
    private javax.swing.JTable PatientTable;
    private javax.swing.JButton SearchByDatebtn;
    private javax.swing.JButton TodayAppBtn;
    private javax.swing.JPanel TodayPanel;
    private javax.swing.JTable TodayTable;
    private javax.swing.JPanel ViewappPanel;
    private javax.swing.JPanel appContainer;
    private javax.swing.JTable canceledtable;
    private javax.swing.JButton changepasswordbtn;
    private javax.swing.JPanel changepasword;
    private javax.swing.JTable datetable;
    private javax.swing.JPanel days;
    private javax.swing.JTabbedPane dent;
    private javax.swing.JTextField filterPatienttext;
    private javax.swing.JToggleButton fridtoggle;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelUserId12;
    private javax.swing.JLabel labelUserId13;
    private javax.swing.JLabel labelUserId14;
    private javax.swing.JLabel labelUserId7;
    private javax.swing.JLabel labelUserId8;
    private javax.swing.JLabel labelfrid;
    private javax.swing.JLabel labelmond;
    private javax.swing.JLabel labelsat;
    private javax.swing.JLabel labelsun;
    private javax.swing.JLabel labelthur;
    private javax.swing.JLabel labeltues;
    private javax.swing.JLabel labelwed;
    private javax.swing.JLabel lablelogout;
    private javax.swing.JLabel ll;
    private javax.swing.JToggleButton mondtoggle;
    private javax.swing.JPasswordField newpass1;
    private javax.swing.JPasswordField newpass2;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JPanel patientviewpanel;
    private javax.swing.JToggleButton sattoggle;
    private javax.swing.JButton searchapp;
    private javax.swing.JButton searchcanceled;
    private javax.swing.JLabel showpasswordlabel;
    private javax.swing.JPanel slidePanel;
    private javax.swing.JButton submit;
    private javax.swing.JToggleButton sundtoggle;
    private javax.swing.JToggleButton thurtoggle;
    private javax.swing.JToggleButton tuestoggle;
    private javax.swing.JToggleButton wedtoggle;
    // End of variables declaration//GEN-END:variables
}
