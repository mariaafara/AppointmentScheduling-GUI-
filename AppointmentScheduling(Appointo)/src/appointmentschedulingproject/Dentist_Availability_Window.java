package appointmentschedulingproject;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;

public class Dentist_Availability_Window extends javax.swing.JFrame {

    public static String Dayname;

    private static boolean sunavail = true;
    private static boolean monavail = true;
    private static boolean tuesavail = true;
    private static boolean wedavail = true;
    private static boolean thuravail = true;
    private static boolean fridavail = true;
    private static boolean satavail = true;
    private static int moncount = 0;
    private static int tuescount = 0;
    private static int wedcount = 0;
    private static int thurcount = 0;
    private static int fridcount = 0;
    private static int satcount = 0;
    private static int sundcount = 0;
    public static int monaddcount = 0;
    public static int tuesaddcount = 0;
    public static int wedaddcount = 0;
    public static int thuraddcount = 0;
    public static int fridaddcount = 0;
    public static int sataddcount = 0;
    public static int sunaddcount = 0;
    Available_Hours ah;
    Main_Login_Window mlw;
    private static int windowcount = 0;

    public Dentist_Availability_Window() throws SQLException {

        initComponents();
        showpanelhours();
        if (windowcount == 0) {
            togglesOn();
            windowcount++;
        } else {
            toggels();
        }

        ////////na2esne enooo llma ma 8yer bl toggle y3nee
        //lnhar hoe on w23me edit w7ded ltimes zidd 3l avaialbe ino hal nhar ho available
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelsun = new javax.swing.JLabel();
        sundtoggle = new javax.swing.JToggleButton();
        SundayEdit = new javax.swing.JLabel();
        labelUserId2 = new javax.swing.JLabel();
        PanelSunday = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labeltues = new javax.swing.JLabel();
        tuestoggle = new javax.swing.JToggleButton();
        TuesdayEdit = new javax.swing.JLabel();
        labelUserId4 = new javax.swing.JLabel();
        PanelTuesday = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        labelmond = new javax.swing.JLabel();
        mondtoggle = new javax.swing.JToggleButton();
        MondayEdit = new javax.swing.JLabel();
        labelUserId6 = new javax.swing.JLabel();
        PanelMonday = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        labelwed = new javax.swing.JLabel();
        wedtoggle = new javax.swing.JToggleButton();
        WednesdayEdit = new javax.swing.JLabel();
        labelUserId8 = new javax.swing.JLabel();
        PanelWednesday = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        labelthur = new javax.swing.JLabel();
        thurtoggle = new javax.swing.JToggleButton();
        ThursdayEdit = new javax.swing.JLabel();
        labelUserId16 = new javax.swing.JLabel();
        PanelThursday = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        labelfrid = new javax.swing.JLabel();
        fridtoggle = new javax.swing.JToggleButton();
        FridaayEdit = new javax.swing.JLabel();
        labelUserId18 = new javax.swing.JLabel();
        PanelFriday = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        labelsat = new javax.swing.JLabel();
        sattoggle = new javax.swing.JToggleButton();
        SaturdayEdit = new javax.swing.JLabel();
        labelUserId20 = new javax.swing.JLabel();
        PanelSaturday = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelUserId21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 224, 220));

        jPanel2.setBackground(new java.awt.Color(200, 224, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

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

        SundayEdit.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        SundayEdit.setForeground(new java.awt.Color(255, 255, 255));
        SundayEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Edit_20px_1.png"))); // NOI18N
        SundayEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SundayEditMouseClicked(evt);
            }
        });

        labelUserId2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelUserId2.setForeground(new java.awt.Color(0, 51, 204));
        labelUserId2.setText("edit");
        labelUserId2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelUserId2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUserId2MouseClicked(evt);
            }
        });

        PanelSunday.setBackground(new java.awt.Color(200, 224, 220));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelsun)
                .addGap(18, 18, 18)
                .addComponent(PanelSunday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(sundtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SundayEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUserId2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SundayEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sundtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(labelsun)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(labelUserId2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(PanelSunday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(200, 224, 220));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

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

        TuesdayEdit.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        TuesdayEdit.setForeground(new java.awt.Color(255, 255, 255));
        TuesdayEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Edit_20px_1.png"))); // NOI18N
        TuesdayEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TuesdayEditMouseClicked(evt);
            }
        });

        labelUserId4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelUserId4.setForeground(new java.awt.Color(0, 51, 204));
        labelUserId4.setText("edit");
        labelUserId4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PanelTuesday.setBackground(new java.awt.Color(200, 224, 220));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeltues)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTuesday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(tuestoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TuesdayEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUserId4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TuesdayEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tuestoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(labeltues)
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(labelUserId4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(PanelTuesday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(200, 224, 220));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

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

        MondayEdit.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        MondayEdit.setForeground(new java.awt.Color(255, 255, 255));
        MondayEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Edit_20px_1.png"))); // NOI18N
        MondayEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MondayEditMouseClicked(evt);
            }
        });

        labelUserId6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelUserId6.setForeground(new java.awt.Color(0, 51, 204));
        labelUserId6.setText("edit");
        labelUserId6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PanelMonday.setBackground(new java.awt.Color(200, 224, 220));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelmond)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMonday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(mondtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MondayEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUserId6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MondayEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mondtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(labelmond)
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(labelUserId6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        WednesdayEdit.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        WednesdayEdit.setForeground(new java.awt.Color(255, 255, 255));
        WednesdayEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Edit_20px_1.png"))); // NOI18N
        WednesdayEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WednesdayEditMouseClicked(evt);
            }
        });

        labelUserId8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelUserId8.setForeground(new java.awt.Color(0, 51, 204));
        labelUserId8.setText("edit");
        labelUserId8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addGap(18, 18, 18)
                .addComponent(wedtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WednesdayEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUserId8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(WednesdayEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wedtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(labelwed)
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(labelUserId8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        ThursdayEdit.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        ThursdayEdit.setForeground(new java.awt.Color(255, 255, 255));
        ThursdayEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Edit_20px_1.png"))); // NOI18N
        ThursdayEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThursdayEditMouseClicked(evt);
            }
        });

        labelUserId16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelUserId16.setForeground(new java.awt.Color(0, 51, 204));
        labelUserId16.setText("edit");
        labelUserId16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addGap(18, 18, 18)
                .addComponent(thurtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ThursdayEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUserId16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ThursdayEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thurtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                .addComponent(labelthur)
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(labelUserId16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        FridaayEdit.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        FridaayEdit.setForeground(new java.awt.Color(255, 255, 255));
        FridaayEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Edit_20px_1.png"))); // NOI18N
        FridaayEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FridaayEditMouseClicked(evt);
            }
        });

        labelUserId18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelUserId18.setForeground(new java.awt.Color(0, 51, 204));
        labelUserId18.setText("edit");
        labelUserId18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addGap(18, 18, 18)
                .addComponent(fridtoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FridaayEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUserId18, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FridaayEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fridtoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                                .addComponent(labelfrid)
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(labelUserId18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        SaturdayEdit.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        SaturdayEdit.setForeground(new java.awt.Color(255, 255, 255));
        SaturdayEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Edit_20px_1.png"))); // NOI18N
        SaturdayEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaturdayEditMouseClicked(evt);
            }
        });

        labelUserId20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        labelUserId20.setForeground(new java.awt.Color(0, 51, 204));
        labelUserId20.setText("edit");
        labelUserId20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addGap(18, 18, 18)
                .addComponent(sattoggle, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SaturdayEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUserId20, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SaturdayEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sattoggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel20Layout.createSequentialGroup()
                                .addComponent(labelsat)
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(labelUserId20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        jPanel3.setBackground(new java.awt.Color(150, 220, 220));

        labelUserId21.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        labelUserId21.setForeground(new java.awt.Color(255, 255, 255));
        labelUserId21.setText("Work Time");
        labelUserId21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(labelUserId21, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(316, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(labelUserId21)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submit, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(713, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void togglesOn() {
        sundtoggle.setSelected(false);
        mondtoggle.setSelected(false);
        tuestoggle.setSelected(false);
        wedtoggle.setSelected(false);
        thurtoggle.setSelected(false);
        fridtoggle.setSelected(false);
        sattoggle.setSelected(false);
    }

    private void toggels() {
        if (!sunavail) {
            sundtoggle.setSelected(true);
            labelsun.setForeground(Color.gray);
            SundayEdit.setEnabled(false);
            sundtoggle.setText("Off");
        } else {
            labelsun.setForeground(Color.white);
            SundayEdit.setEnabled(true);
            sundtoggle.setText("On");
        }

        if (!monavail) {
            mondtoggle.setSelected(true);
            labelmond.setForeground(Color.gray);
            MondayEdit.setEnabled(false);
            mondtoggle.setText("Off");
        } else {
            labelmond.setForeground(Color.white);
            MondayEdit.setEnabled(true);
            mondtoggle.setText("On");
        }

        if (!fridavail) {
            fridtoggle.setSelected(true);
            labelfrid.setForeground(Color.gray);
            FridaayEdit.setEnabled(false);
            fridtoggle.setText("Off");
        } else {
            labelfrid.setForeground(Color.white);
            FridaayEdit.setEnabled(true);
            fridtoggle.setText("On");
        }
        if (!satavail) {
            sattoggle.setSelected(true);
            labelsat.setForeground(Color.gray);
            SaturdayEdit.setEnabled(false);
            sattoggle.setText("Off");
        } else {
            labelsat.setForeground(Color.white);
            SaturdayEdit.setEnabled(true);
            sattoggle.setText("On");
        }
        if (!wedavail) {
            wedtoggle.setSelected(true);
            labelwed.setForeground(Color.gray);
            WednesdayEdit.setEnabled(false);
            wedtoggle.setText("Off");
        } else {
            labelwed.setForeground(Color.white);
            WednesdayEdit.setEnabled(true);
            wedtoggle.setText("On");
        }
        if (!thuravail) {
            thurtoggle.setSelected(true);
            labelthur.setForeground(Color.gray);
            ThursdayEdit.setEnabled(false);
            thurtoggle.setText("Off");
        } else {
            labelthur.setForeground(Color.white);
            ThursdayEdit.setEnabled(true);
            thurtoggle.setText("On");
        }
        if (!tuesavail) {
            tuestoggle.setSelected(true);
            labeltues.setForeground(Color.gray);
            TuesdayEdit.setEnabled(false);
            tuestoggle.setText("Off");
        } else {
            labeltues.setForeground(Color.white);
            TuesdayEdit.setEnabled(true);
            tuestoggle.setText("On");
        }

    }

//toggles of all days are officialyy turned on means unselected thus when first selected it will be added
//into database thus this day the dentist is off(unavailable) and if he changes his mind and decides to treat on this day 
//and turn the toggle on once again , this day will be updated in database and will be set to available
//if the dentist first edited a day and seted the ork times at the the same time this day automitically will be
    //set available . if he changed his mind and decided that this same day want it  day off means (unavailable)
    // so he would turn the toggle off at this momment this day will be turned unvaible nd the time hours will be deleted!.

    private void sundtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sundtoggleActionPerformed
        if (sundtoggle.isSelected()) {
            sunavail = false;
            labelsun.setForeground(Color.gray);
            SundayEdit.setEnabled(false);
            sundtoggle.setText("Off");
            if (sundcount == 0) {
                if (ah.countforeditthenoff_sun != 0) {
                    db.deleteAvailable(mlw.userid, "Sunday");
                    db.editAvailableDay(mlw.userid, "Sunday", false);
                } else {
                 //   JOptionPane.showMessageDialog(null, "count 0");
                    AvailableDay a = new AvailableDay(mlw.userid, "Sunday", false);
                    db.addAvailableDay(a);
                    sunaddcount++;
                }
                sundcount++;
            } else {
               //JOptionPane.showMessageDialog(null, "count not zero");

                if (ah.countforeditthenoff_sun != 0) {
                    db.deleteAvailable(mlw.userid, "Sunday");
                    db.editAvailableDay(mlw.userid, "Sunday", false);
                } else {
                    db.editAvailableDay(mlw.userid, "Sunday", true);
                }
                sundcount++;
            }

        } else {
            sunavail = true;
            labelsun.setForeground(Color.white);
            SundayEdit.setEnabled(true);
            sundtoggle.setText("On");
            db.editAvailableDay(mlw.userid, "Monday", true);
         //   JOptionPane.showMessageDialog(null, "3emel edit sund");
            if (ah.countforeditthenoff_sun != 0) {
                db.deleteAvailable(mlw.userid,"Sunday");
            }

        }

    }//GEN-LAST:event_sundtoggleActionPerformed

    private void mondtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mondtoggleActionPerformed

        if (mondtoggle.isSelected()) {
            monavail = false;
            labelmond.setForeground(Color.gray);
            MondayEdit.setEnabled(false);
            mondtoggle.setText("Off");
            if (moncount == 0) {//countforeditthenoff_mon==0
                if (ah.countforeditthenoff_mon != 0) {
                    db.deleteAvailable(mlw.userid, "Monday");
                    db.editAvailableDay(mlw.userid, "Monday", false);
                } else {
                   // JOptionPane.showMessageDialog(null, "count 0");
                    AvailableDay a = new AvailableDay(mlw.userid, "Monday", false);
                    db.addAvailableDay(a);
                    monaddcount++;
                }
                moncount++;

            } else {
              //  JOptionPane.showMessageDialog(null, "count not zero");

                if (ah.countforeditthenoff_mon != 0) {
                    db.deleteAvailable(mlw.userid, "Monday");
                    db.editAvailableDay(mlw.userid, "Monday", false);
                } else {
                    db.editAvailableDay(mlw.userid, "Monday", true);
                }
                moncount++;
            }

        } else {
          //  JOptionPane.showMessageDialog(null, "else lkbire");
            monavail = true;
            labelmond.setForeground(Color.white);
            MondayEdit.setEnabled(true);
            mondtoggle.setText("On");
            db.editAvailableDay(mlw.userid, "Monday", true);
          //  JOptionPane.showMessageDialog(null, "3emel edit mond");
            if (ah.countforeditthenoff_mon != 0) {
                db.deleteAvailable(mlw.userid, "Monday");
               // JOptionPane.showMessageDialog(null, "times deleted of mond");
            }
        }
    }//GEN-LAST:event_mondtoggleActionPerformed

    private void fridtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridtoggleActionPerformed
        if (fridtoggle.isSelected()) {
            fridavail = false;
            labelfrid.setForeground(Color.gray);
            FridaayEdit.setEnabled(false);
            fridtoggle.setText("Off");
            if (fridcount == 0) {
                if (ah.countforeditthenoff_frid != 0) {
                    db.deleteAvailable(mlw.userid, "Friday");
                    db.editAvailableDay(mlw.userid, "Friday", false);
                } else {
                 //   JOptionPane.showMessageDialog(null, "count 0");
                    AvailableDay a = new AvailableDay(mlw.userid, "Friday", false);
                    db.addAvailableDay(a);
                    fridaddcount++;//its been added y3ne
                }
                fridcount++;
            } else {
                //JOptionPane.showMessageDialog(null, "count not zero");

                if (ah.countforeditthenoff_frid != 0) {
                    db.deleteAvailable(mlw.userid, "Friday");
                  //  JOptionPane.showMessageDialog(null, "times deleted of frid");
                    db.editAvailableDay(mlw.userid, "Friday", false);
                } else {
                    db.editAvailableDay(mlw.userid, "Friday", true);
                }
                fridcount++;
            }

        } else {
            //JOptionPane.showMessageDialog(null, "else lkbire");
            fridavail = true;
            labelfrid.setForeground(Color.white);
            FridaayEdit.setEnabled(true);
            fridtoggle.setText("On");
            db.editAvailableDay(mlw.userid, "Friday", true);
            //JOptionPane.showMessageDialog(null, "3emel edit frid");
            if (ah.countforeditthenoff_frid != 0) {
                db.deleteAvailable(mlw.userid, "Friday");
              //  JOptionPane.showMessageDialog(null, "times deleted of frid");
            }
        }
    }//GEN-LAST:event_fridtoggleActionPerformed

    private void sattoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sattoggleActionPerformed
        if (sattoggle.isSelected()) {
            satavail = false;
            labelsat.setForeground(Color.gray);
            SaturdayEdit.setEnabled(false);
            sattoggle.setText("Off");
            if (satcount == 0) {
                if (ah.countforeditthenoff_sat != 0) {
                    db.deleteAvailable(mlw.userid, "Saturday");
                    db.editAvailableDay(mlw.userid, "Saturday", false);
                } else {
                //    JOptionPane.showMessageDialog(null, "count 0");
                    AvailableDay a = new AvailableDay(mlw.userid, "Saturday", false);
                    db.addAvailableDay(a);
                    sataddcount++;
                }
                satcount++;

            } else {
                //JOptionPane.showMessageDialog(null, "count not zero");

                if (ah.countforeditthenoff_sat != 0) {
                    db.deleteAvailable(mlw.userid, "Saturday");
                    db.editAvailableDay(mlw.userid, "Saturday", false);
                } else {
                    db.editAvailableDay(mlw.userid, "Saturday", true);
                }
                satcount++;
            }

        } else {
            //JOptionPane.showMessageDialog(null, "else lkbire");
            satavail = true;
            labelsat.setForeground(Color.white);
            SaturdayEdit.setEnabled(true);
            sattoggle.setText("On");
            db.editAvailableDay(mlw.userid, "Saturday", true);
           // JOptionPane.showMessageDialog(null, "3emel edit sat");
            if (ah.countforeditthenoff_sat != 0) {
                db.deleteAvailable(mlw.userid, "Saturday");
              //  JOptionPane.showMessageDialog(null, "times deleted of sat");
            }
        }
    }//GEN-LAST:event_sattoggleActionPerformed

    private void thurtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thurtoggleActionPerformed
        if (thurtoggle.isSelected()) {
            thuravail = false;
            labelthur.setForeground(Color.gray);
            ThursdayEdit.setEnabled(false);
            thurtoggle.setText("Off");
            if (thurcount == 0) {
                if (ah.countforeditthenoff_thur != 0) {
                    db.deleteAvailable(mlw.userid, "Thursday");
                    db.editAvailableDay(mlw.userid, "Thursday", false);
                } else {
                 //   JOptionPane.showMessageDialog(null, "count 0");
                    AvailableDay a = new AvailableDay(mlw.userid, "Thursday", false);
                    db.addAvailableDay(a);
                    thuraddcount++;
                }
                thurcount++;
            } else {
                //JOptionPane.showMessageDialog(null, "count not zero");

                if (ah.countforeditthenoff_thur != 0) {
                    db.deleteAvailable(mlw.userid, "Thursday");
                    db.editAvailableDay(mlw.userid, "Thursday", false);
                } else {
                    db.editAvailableDay(mlw.userid, "Thursday", true);
                }
                thurcount++;

            }

        } else {
          //  JOptionPane.showMessageDialog(null, "else lkbire");
            thuravail = true;
            labelthur.setForeground(Color.white);
            ThursdayEdit.setEnabled(true);
            thurtoggle.setText("On");
            db.editAvailableDay(mlw.userid, "Thursday", true);
          //  JOptionPane.showMessageDialog(null, "3emel edit thur");
            if (ah.countforeditthenoff_thur != 0) {
                db.deleteAvailable(mlw.userid, "Thursday");
             //   JOptionPane.showMessageDialog(null, "times deleted of thur");
            }
        }
    }//GEN-LAST:event_thurtoggleActionPerformed

    private void wedtoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wedtoggleActionPerformed
        if (wedtoggle.isSelected()) {
            wedavail = false;
            labelwed.setForeground(Color.gray);
            WednesdayEdit.setEnabled(false);
            wedtoggle.setText("Off");
            if (wedcount == 0) {
                if (ah.countforeditthenoff_wed != 0) {
                    db.deleteAvailable(mlw.userid, "Wednesday");
                    db.editAvailableDay(mlw.userid, "Wednesday", false);
                } else {
                   // JOptionPane.showMessageDialog(null, "count 0");
                    AvailableDay a = new AvailableDay(mlw.userid, "wednesday", false);
                    db.addAvailableDay(a);
                    wedaddcount++;
                }
                wedcount++;
            } else {
             //   JOptionPane.showMessageDialog(null, "count not zero");

                if (ah.countforeditthenoff_wed != 0) {
                    db.deleteAvailable(mlw.userid, "Wednesday");
                    db.editAvailableDay(mlw.userid, "Wednesday", false);
                } else {
                    db.editAvailableDay(mlw.userid, "Wednesday", true);
                }
                wedcount++;
            }

        } else {
            //JOptionPane.showMessageDialog(null, "else lkbire");
            wedavail = true;
            labelwed.setForeground(Color.white);
            WednesdayEdit.setEnabled(true);
            wedtoggle.setText("On");
            db.editAvailableDay(mlw.userid, "Wednesday", true);
           // JOptionPane.showMessageDialog(null, "3emel edit wed");
            if (ah.countforeditthenoff_wed != 0) {
                db.deleteAvailable(mlw.userid, "Wednesday");
               // JOptionPane.showMessageDialog(null, "times deleted of wed");
            }
        }
    }//GEN-LAST:event_wedtoggleActionPerformed

    private void tuestoggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tuestoggleActionPerformed
        if (tuestoggle.isSelected()) {
            tuesavail = false;
            labeltues.setForeground(Color.gray);
            TuesdayEdit.setEnabled(false);
            tuestoggle.setText("Off");
            if (tuescount == 0) {
                if (ah.countforeditthenoff_tues != 0) {
                    db.deleteAvailable(mlw.userid, "Tuesday");
                    db.editAvailableDay(mlw.userid, "Tuesday", false);
                } else {
                   // JOptionPane.showMessageDialog(null, "count 0");
                    AvailableDay a = new AvailableDay(mlw.userid, "Tuesday", false);
                    db.addAvailableDay(a);
                    tuesaddcount++;
                }
                tuescount++;
            } else {
             //   JOptionPane.showMessageDialog(null, "count not zero");

                if (ah.countforeditthenoff_tues != 0) {
                    db.deleteAvailable(mlw.userid, "Tuesday");
                    db.editAvailableDay(mlw.userid, "Tuesday", false);
                } else {
                    db.editAvailableDay(mlw.userid, "Tuesday", true);
                }
                tuescount++;
            }

        } else {
            //JOptionPane.showMessageDialog(null, "else lkbire");
            tuesavail = true;
            labeltues.setForeground(Color.white);
            TuesdayEdit.setEnabled(true);
            tuestoggle.setText("On");
            db.editAvailableDay(mlw.userid, "Tuesday", true);
           // JOptionPane.showMessageDialog(null, "3emel edit tues");
            if (ah.countforeditthenoff_tues != 0) {
                db.deleteAvailable(mlw.userid, "Tuesday");
               // JOptionPane.showMessageDialog(null, "times deleted of tues");
            }

        }
    }//GEN-LAST:event_tuestoggleActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
      int count=0;
        try {
            db.rs = db.statement.executeQuery("select count(*) from Availableday where Dentist_id='"+mlw.userid+"'");
            while (db.rs.next()) {
                count=db.rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dentist_Availability_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        if(count==7){
        Dentist_Main_Window amw = new Dentist_Main_Window();
        amw.setVisible(true);
        amw.pack();
        amw.setLocationRelativeTo(null);
        amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        } else 
             JOptionPane.showMessageDialog(null, "Please precise all days of work");
    }//GEN-LAST:event_submitActionPerformed

    private void SundayEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SundayEditMouseClicked
        Dayname = "Sunday";
        if (sunavail == false) {
            return;
        } else {
            Available_Hours amw = new Available_Hours();
            amw.setVisible(true);
            amw.pack();
            amw.setLocationRelativeTo(null);
            amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_SundayEditMouseClicked

    private void labelUserId2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUserId2MouseClicked

    }//GEN-LAST:event_labelUserId2MouseClicked

    private void MondayEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MondayEditMouseClicked
        Dayname = "Monday";
        if (monavail == false) {
            return;
        } else {
            Available_Hours amw = new Available_Hours();
            amw.setVisible(true);
            amw.pack();
            amw.setLocationRelativeTo(null);
            amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_MondayEditMouseClicked

    private void TuesdayEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TuesdayEditMouseClicked
        Dayname = "Tuesday";
        if (tuesavail == false) {
            return;
        } else {
            Available_Hours amw = new Available_Hours();
            amw.setVisible(true);
            amw.pack();
            amw.setLocationRelativeTo(null);
            amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_TuesdayEditMouseClicked

    private void WednesdayEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WednesdayEditMouseClicked
        Dayname = "Wednesday";
        if (wedavail == false) {
            return;
        } else {
            Available_Hours amw = new Available_Hours();
            amw.setVisible(true);
            amw.pack();
            amw.setLocationRelativeTo(null);
            amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_WednesdayEditMouseClicked

    private void ThursdayEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThursdayEditMouseClicked
        Dayname = "Thursday";
        if (thuravail == false) {
            return;
        } else {
            Available_Hours amw = new Available_Hours();
            amw.setVisible(true);
            amw.pack();
            amw.setLocationRelativeTo(null);
            amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_ThursdayEditMouseClicked

    private void FridaayEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FridaayEditMouseClicked
        Dayname = "Friday";
        if (fridavail == false) {
            return;
        } else {
            Available_Hours amw = new Available_Hours();
            amw.setVisible(true);
            amw.pack();
            amw.setLocationRelativeTo(null);
            amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_FridaayEditMouseClicked

    private void SaturdayEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaturdayEditMouseClicked
        Dayname = "Saturday";
        if (satavail == false) {
            return;
        } else {
            Available_Hours amw = new Available_Hours();
            amw.setVisible(true);
            amw.pack();
            amw.setLocationRelativeTo(null);
            amw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_SaturdayEditMouseClicked
    DataBaseManager db = new DataBaseManager();

    Available_Hours av;

    public void showpanelhours() throws SQLException {

        ArrayList<String> mon = new ArrayList<>();
        ArrayList<String> tues = new ArrayList<>();
        ArrayList<String> wed = new ArrayList<>();
        ArrayList<String> thur = new ArrayList<>();
        ArrayList<String> frid = new ArrayList<>();
        ArrayList<String> sat = new ArrayList<>();
        ArrayList<String> Sun = new ArrayList<>();

        String s;

        db.rs = db.statement.executeQuery("select * from GetAllDays('" + mlw.userid + "')");
        while (db.rs.next()) {

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Dentist_Availability_Window().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Dentist_Availability_Window.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FridaayEdit;
    private javax.swing.JLabel MondayEdit;
    private javax.swing.JPanel PanelFriday;
    private javax.swing.JPanel PanelMonday;
    private javax.swing.JPanel PanelSaturday;
    private javax.swing.JPanel PanelSunday;
    private javax.swing.JPanel PanelThursday;
    private javax.swing.JPanel PanelTuesday;
    private javax.swing.JPanel PanelWednesday;
    private javax.swing.JLabel SaturdayEdit;
    private javax.swing.JLabel SundayEdit;
    private javax.swing.JLabel ThursdayEdit;
    private javax.swing.JLabel TuesdayEdit;
    private javax.swing.JLabel WednesdayEdit;
    private javax.swing.JToggleButton fridtoggle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel labelUserId16;
    private javax.swing.JLabel labelUserId18;
    private javax.swing.JLabel labelUserId2;
    private javax.swing.JLabel labelUserId20;
    private javax.swing.JLabel labelUserId21;
    private javax.swing.JLabel labelUserId4;
    private javax.swing.JLabel labelUserId6;
    private javax.swing.JLabel labelUserId8;
    private javax.swing.JLabel labelfrid;
    private javax.swing.JLabel labelmond;
    private javax.swing.JLabel labelsat;
    private javax.swing.JLabel labelsun;
    private javax.swing.JLabel labelthur;
    private javax.swing.JLabel labeltues;
    private javax.swing.JLabel labelwed;
    private javax.swing.JToggleButton mondtoggle;
    private javax.swing.JToggleButton sattoggle;
    private javax.swing.JButton submit;
    private javax.swing.JToggleButton sundtoggle;
    private javax.swing.JToggleButton thurtoggle;
    private javax.swing.JToggleButton tuestoggle;
    private javax.swing.JToggleButton wedtoggle;
    // End of variables declaration//GEN-END:variables
}
