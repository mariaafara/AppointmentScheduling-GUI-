package appointmentschedulingproject;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class Available_Hours extends javax.swing.JFrame {

    Main_Login_Window mlw;
    Dentist_Availability_Window daw;
    DataBaseManager db = new DataBaseManager();
    public static int countforeditthenoff_mon = 0;
    public static int countforeditthenoff_tues = 0;
    public static int countforeditthenoff_wed = 0;
    public static int countforeditthenoff_thur = 0;
    public static int countforeditthenoff_frid = 0;
    public static int countforeditthenoff_sat = 0;
    public static int countforeditthenoff_sun = 0;

    public Available_Hours() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelUserId21 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        labelUserId1 = new javax.swing.JLabel();
        labelUserId2 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        fromcombo = new javax.swing.JComboBox<>();
        tocombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 224, 220));

        jPanel3.setBackground(new java.awt.Color(150, 220, 220));

        labelUserId21.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        labelUserId21.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId21.setText("Available hours");
        labelUserId21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Back_50px_5.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUserId21)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUserId21)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        labelUserId1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId1.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId1.setText("to");
        labelUserId1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelUserId2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId2.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId2.setText("from");
        labelUserId2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnadd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        fromcombo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fromcombo.setForeground(new java.awt.Color(0, 51, 51));
        fromcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 AM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM" }));

        tocombo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tocombo.setForeground(new java.awt.Color(0, 51, 51));
        tocombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 AM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUserId2)
                .addGap(30, 30, 30)
                .addComponent(fromcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(labelUserId1)
                .addGap(29, 29, 29)
                .addComponent(tocombo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUserId1)
                            .addComponent(tocombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelUserId2))
                    .addComponent(fromcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147)
                .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try {
            String from = (String) fromcombo.getSelectedItem();
            String to = (String) tocombo.getSelectedItem();

            //SimpleDateFormat timeform= new SimpleDateFormat("h:m a");
            //JOptionPane.showMessageDialog(null, "userid" + mlw.userid);
            //JOptionPane.showMessageDialog(null, "dayname" + daw.Dayname);
            //JOptionPane.showMessageDialog(null, "from" + from);
            if (daw.Dayname.equals("Monday")) {
                if (daw.monaddcount == 0) {
                    AvailableDay a = new AvailableDay(mlw.userid, "Monday", true);
                    db.addAvailableDay(a);
                    daw.monaddcount++;
                }
                countforeditthenoff_mon++;
            }
            if (daw.Dayname.equals("Tuesday")) {
                if (daw.tuesaddcount == 0) {
                    AvailableDay a = new AvailableDay(mlw.userid, "Tuesday", true);
                    db.addAvailableDay(a);
                    daw.tuesaddcount++;
                }
                countforeditthenoff_tues++;
            }
            if (daw.Dayname.equals("Wednesday")) {
                if (daw.wedaddcount == 0) {
                    AvailableDay a = new AvailableDay(mlw.userid, "Wednesday", true);
                    db.addAvailableDay(a);
                    daw.wedaddcount++;
                }
                countforeditthenoff_wed++;
            }
            if (daw.Dayname.equals("Thursday")) {
                if (daw.thuraddcount == 0) {
                    AvailableDay a = new AvailableDay(mlw.userid, "Thursday", true);
                    db.addAvailableDay(a);
                    daw.thuraddcount++;
                }
                countforeditthenoff_thur++;
            }
            if (daw.Dayname.equals("Friday")) {
                if (daw.fridaddcount == 0) {
                    AvailableDay a = new AvailableDay(mlw.userid, "Friday", true);
                    db.addAvailableDay(a);
                    daw.fridaddcount++;
                }
                countforeditthenoff_frid++;
            }
            if (daw.Dayname.equals("Saturday")) {
                if (daw.sataddcount == 0) {
                    AvailableDay a = new AvailableDay(mlw.userid, "Saturday", true);
                    db.addAvailableDay(a);
                    daw.sataddcount++;
                }
                countforeditthenoff_sat++;
            }
            if (daw.Dayname.equals("Sunday")) {
                if (daw.sunaddcount == 0) {
                    AvailableDay a = new AvailableDay(mlw.userid, "Sunday", true);
                    db.addAvailableDay(a);
                    daw.sunaddcount++;
                }
                countforeditthenoff_sun++;
            }

            Available a = new Available(mlw.userid, daw.Dayname, from, to);
            db.addAvailable(a);

            Dentist_Availability_Window amw = new Dentist_Availability_Window();
            amw.setVisible(true);
            amw.pack();
            amw.setLocationRelativeTo(null);
            amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Available_Hours.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnaddActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        try {
            Dentist_Availability_Window amw = new Dentist_Availability_Window();
            amw.setVisible(true);
            amw.pack();
            amw.setLocationRelativeTo(null);
            amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Available_Hours.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Available_Hours().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton btnadd;
    private javax.swing.JComboBox<String> fromcombo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelUserId1;
    private javax.swing.JLabel labelUserId2;
    private javax.swing.JLabel labelUserId21;
    private javax.swing.JComboBox<String> tocombo;
    // End of variables declaration//GEN-END:variables
}
