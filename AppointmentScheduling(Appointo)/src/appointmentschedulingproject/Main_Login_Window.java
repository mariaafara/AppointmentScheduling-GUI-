package appointmentschedulingproject;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main_Login_Window extends javax.swing.JFrame {

    public static String userid;
    private static int count = 0;

    public Main_Login_Window() {

        // this.setUndecorated(true);//remove the title bar
        //this.setAlwaysOnTop(true);//this interface is always on top
        this.setResizable(false);//not resizable now
        this.setVisible(true);
        initComponents();
        /*Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize - 250, ysize - 250);*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PANEL2 = new javax.swing.JPanel();
        labelPassword1 = new javax.swing.JLabel();
        labelUserId1 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        textpassword = new javax.swing.JPasswordField();
        textuserId = new javax.swing.JTextField();
        buttonsignIn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PANEL2.setBackground(new java.awt.Color(200, 224, 220));
        PANEL2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PANEL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PANEL2MouseClicked(evt);
            }
        });

        labelPassword1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelPassword1.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword1.setText("Password");
        labelPassword1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelUserId1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        labelUserId1.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId1.setText("UserID");
        labelUserId1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));

        textpassword.setBackground(new java.awt.Color(200, 224, 220));
        textpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textpassword.setForeground(new java.awt.Color(0, 51, 51));
        textpassword.setBorder(null);

        textuserId.setBackground(new java.awt.Color(200, 224, 220));
        textuserId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textuserId.setForeground(new java.awt.Color(0, 51, 51));
        textuserId.setBorder(null);

        buttonsignIn.setBackground(new java.awt.Color(0, 0, 204));
        buttonsignIn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonsignIn.setForeground(new java.awt.Color(255, 255, 255));
        buttonsignIn.setText("SignIn");
        buttonsignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsignInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PANEL2Layout = new javax.swing.GroupLayout(PANEL2);
        PANEL2.setLayout(PANEL2Layout);
        PANEL2Layout.setHorizontalGroup(
            PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL2Layout.createSequentialGroup()
                .addGroup(PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PANEL2Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(buttonsignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PANEL2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator12)
                                .addComponent(labelUserId1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textuserId, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                            .addComponent(textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        PANEL2Layout.setVerticalGroup(
            PANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(labelUserId1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textuserId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPassword1)
                .addGap(1, 1, 1)
                .addComponent(textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(buttonsignIn)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        getContentPane().add(PANEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 400, 520));

        jPanel1.setBackground(new java.awt.Color(150, 220, 220));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 395, 178, 15));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 374, 241, 15));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Appointo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 37, 196, 125));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Schedule_50px_1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 241, 97, 115));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 520));

        setSize(new java.awt.Dimension(709, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    DataBaseManager db = new DataBaseManager();
    private void buttonsignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsignInActionPerformed

     
        
       // String role = (String) ComboRole.getSelectedItem();

        if(!textuserId.getText().isEmpty() && !textpassword.getText().isEmpty() )
        {
        try {
            userid = textuserId.getText();
        String password = textpassword.getText();
            
            db.rs = db.statement.executeQuery("select Password ,Role from Login where UserId='" + userid + "'");
            while (db.rs.next()) {
                if (password.equals(db.rs.getString("Password")) ) {
                    if (db.rs.getString("Role").equals("Admin")) {
                        Admin_Main_Window amw = new Admin_Main_Window();
                        amw.setVisible(true);
                        amw.pack();
                        amw.setLocationRelativeTo(null);
                        amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                    } else if (db.rs.getString("Role").equals("Receptionist")) {
                        Receptionist_Main_Window rmw = new Receptionist_Main_Window();
                        rmw.setVisible(true);
                        rmw.pack();
                        rmw.setLocationRelativeTo(null);
                        rmw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                    } else if (db.rs.getString("Role").equals("Dentist")) {
                        if (count == 0) {
                            Dentist_Availability_Window amw = new Dentist_Availability_Window();
                            amw.setVisible(true);
                            amw.pack();
                            amw.setLocationRelativeTo(null);
                            amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            this.dispose();
                            count++;
                        } 
                        else{
                            Dentist_Main_Window amw = new Dentist_Main_Window();
                            amw.setVisible(true);
                            amw.pack();
                            amw.setLocationRelativeTo(null);
                            amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            this.dispose();
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "please REnter correct informations");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Main_Login_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else JOptionPane.showMessageDialog(null, "please fill id and password");
    }//GEN-LAST:event_buttonsignInActionPerformed

    private void PANEL2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PANEL2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_PANEL2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Login_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PANEL2;
    private javax.swing.JButton buttonsignIn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelPassword1;
    private javax.swing.JLabel labelUserId1;
    private javax.swing.JPasswordField textpassword;
    private javax.swing.JTextField textuserId;
    // End of variables declaration//GEN-END:variables
}
