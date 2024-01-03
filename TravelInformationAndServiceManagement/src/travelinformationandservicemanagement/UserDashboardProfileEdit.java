package travelinformationandservicemanagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UserDashboardProfileEdit extends javax.swing.JFrame {

    private ImageIcon icon;
    private String username, password, firstName, lastName, nid, phoneNo, passport, email, gender;

    public UserDashboardProfileEdit() {
        initComponents();
        jTextField1.setText("lll");
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public UserDashboardProfileEdit(String username, String password, String email, String firstName, String lastName, String gender, String phoneNo, String nid, String passport) {

        initComponents();
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNo = phoneNo;
        this.nid = nid;
        this.passport = passport;

        icon = new ImageIcon(getClass().getResource("/assets/4153125-02.png"));
        this.setIconImage(icon.getImage());

        jTextField1.setBackground(new java.awt.Color(0, 0, 0, 1));
        jTextField2.setBackground(new java.awt.Color(0, 0, 0, 1));
        jTextField3.setBackground(new java.awt.Color(0, 0, 0, 1));
        jTextField4.setBackground(new java.awt.Color(0, 0, 0, 1));
        jTextField5.setBackground(new java.awt.Color(0, 0, 0, 1));

        jTextField4.setText(firstName);
        jTextField3.setText(lastName);
        jTextField1.setText(phoneNo);
        jTextField2.setText(nid);
        jTextField5.setText(passport);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoText = new javax.swing.JLabel();
        bookTrip = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        travelInfo = new javax.swing.JLabel();
        myBooking = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        logOut = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GOTRIPCO");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(30, 39, 76));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Dashboard-logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 120));

        logoText.setFont(new java.awt.Font("Lovelo Black", 0, 18)); // NOI18N
        logoText.setForeground(new java.awt.Color(95, 179, 255));
        logoText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoText.setText("GOTRIPCO");
        jPanel1.add(logoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, -1));

        bookTrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/book-trip.png"))); // NOI18N
        bookTrip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookTrip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTripMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookTripMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookTripMouseExited(evt);
            }
        });
        jPanel1.add(bookTrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 210, 30));

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile-option-select.png"))); // NOI18N
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 30));

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/settings.png"))); // NOI18N
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        jPanel1.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 210, 30));

        travelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/travel-info.png"))); // NOI18N
        travelInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        travelInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                travelInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                travelInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                travelInfoMouseExited(evt);
            }
        });
        jPanel1.add(travelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 210, 30));

        myBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/my-booking.png"))); // NOI18N
        myBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myBookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myBookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myBookingMouseExited(evt);
            }
        });
        jPanel1.add(myBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 500));

        jPanel3.setBackground(new java.awt.Color(30, 39, 76));

        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Shutdown1_64px.png"))); // NOI18N
        logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(861, Short.MAX_VALUE)
                .addComponent(logOut)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOut, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 39, 76));
        jLabel1.setText("Edit Profile");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 39, 76));
        jLabel2.setText("Basic info, for a faster booking experience");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Last Name");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 120, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Gender");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 120, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Phone Number");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 120, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("NID Number");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 120, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Passport Number");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 120, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("First Name");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, 30));

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("_______________________________________________________________________________________________________________________________________");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("_______________________________________________________________________________________________________________________________________");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("_______________________________________________________________________________________________________________________________________");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("_______________________________________________________________________________________________________________________________________");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("_______________________________________________________________________________________________________________________________________");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("_______________________________________________________________________________________________________________________________________");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jTextField1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setText("01000000000");
        jTextField1.setBorder(null);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 520, 30));

        jTextField2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setText("ABC11111");
        jTextField2.setBorder(null);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 520, 30));

        jTextField3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setText("Last Name");
        jTextField3.setBorder(null);
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 520, 30));

        jTextField4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 51, 51));
        jTextField4.setText("First Name");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 90, 520, 30));

        jTextField5.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 51, 51));
        jTextField5.setText("AAAA-BBBB-CCCC");
        jTextField5.setBorder(null);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 520, 30));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save_64px.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 30, 30));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(30, 39, 76));
        jLabel16.setText("Save");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 40, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 800, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookTripMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTripMouseEntered
        bookTrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/book-trip-select.png")));
    }//GEN-LAST:event_bookTripMouseEntered

    private void bookTripMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTripMouseExited
        bookTrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/book-trip.png")));
    }//GEN-LAST:event_bookTripMouseExited

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered

    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited

    }//GEN-LAST:event_profileMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/settings-select.png")));
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/settings.png")));
    }//GEN-LAST:event_settingsMouseExited

    private void travelInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelInfoMouseEntered
        travelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/travel-info-selected.png")));
    }//GEN-LAST:event_travelInfoMouseEntered

    private void travelInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelInfoMouseExited
        travelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/travel-info.png")));
    }//GEN-LAST:event_travelInfoMouseExited

    private void myBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingMouseEntered
        myBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/my-booking-select.png")));
    }//GEN-LAST:event_myBookingMouseEntered

    private void myBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingMouseExited
        myBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/my-booking.png")));
    }//GEN-LAST:event_myBookingMouseExited

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/done_64px.png"));
        JOptionPane.showMessageDialog(null, "Log Out Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE, icon);
        new EnterAs().setVisible(true);
        dispose();
    }//GEN-LAST:event_logOutMouseClicked

    private void logOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseEntered
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Shutdown_64px.png")));
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Shutdown1_64px.png")));
    }//GEN-LAST:event_logOutMouseExited

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            gender = "male";
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected()) {
            gender = "female";
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        firstName = jTextField4.getText();
        lastName = jTextField3.getText();
        phoneNo = jTextField1.getText();
        nid = jTextField2.getText();
        passport = jTextField5.getText();
        FileWriter file2;
        File file = new File("src/database/User.txt");
        int match = 0;
        try {
            file2 = new FileWriter("src/database/temp.txt", true);
            file2.write("");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.equals("Username: " + username)) {
                    file2.append("Username: " + username + "\n");
                    match = 1;
                }
                if (match == 0) {
                    file2.append(line + "\n");
                    continue;
                }
                if (line.charAt(0) == 'P' && line.charAt(1) == 'a' && match == 1) {
                    file2.append("Password: " + password + "\n");
                    continue;
                }
                if (line.charAt(0) == 'E' && line.charAt(1) == 'm' && match == 1) {
                    file2.append("Email: " + email + "\n");
                    continue;
                }
                if (line.charAt(0) == 'F' && line.charAt(1) == 'i' && match == 1) {
                    file2.append("First Name: " + firstName + "\n");
                    continue;
                }
                if (line.charAt(0) == 'L' && line.charAt(1) == 'a' && match == 1) {
                    file2.append("Last Name: " + lastName + "\n");
                    continue;
                }
                if (line.charAt(0) == 'G' && line.charAt(1) == 'e' && match == 1) {
                    file2.append("Gender: " + gender + "\n");
                    continue;
                }
                if (line.charAt(0) == 'P' && line.charAt(1) == 'h' && match == 1) {
                    file2.append("Phone No: " + phoneNo + "\n");
                    continue;
                }
                if (line.charAt(0) == 'N' && line.charAt(1) == 'I' && match == 1) {
                    file2.append("NID: " + nid + "\n");
                    continue;
                }
                if (line.charAt(0) == 'P' && line.charAt(1) == 'A' && match == 1) {
                    file2.append("PAssport No: " + passport + "\n");
                    match = 0;
                }
            }
            File ll = new File("src/database/temp.txt");

            sc.close();
            file2.close();
            file.delete();
            ll.renameTo(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        UserDashboardProfile user = new UserDashboardProfile(username, password,email, firstName, lastName, gender, phoneNo, nid, passport);

        user.setVisible(true);

        dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        firstName = jTextField4.getText();
        lastName = jTextField3.getText();
        phoneNo = jTextField1.getText();
        nid = jTextField2.getText();
        passport = jTextField5.getText();

        FileWriter file2;
        File file = new File("src/database/User.txt");
        int match = 0;
        try {
            file2 = new FileWriter("src/database/temp.txt", true);
            file2.write("");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.equals("Username: " + username)) {
                    file2.append("Username: " + username + "\n");
                    match = 1;
                }
                if (match == 0) {
                    file2.append(line + "\n");
                    continue;
                }
                if (line.charAt(0) == 'P' && line.charAt(1) == 'a' && match == 1) {
                    file2.append("Password: " + password + "\n");
                    continue;
                }
                if (line.charAt(0) == 'E' && line.charAt(1) == 'm' && match == 1) {
                    file2.append("Email: " + email + "\n");
                    continue;
                }
                if (line.charAt(0) == 'F' && line.charAt(1) == 'i' && match == 1) {
                    file2.append("First Name: " + firstName + "\n");
                    continue;
                }
                if (line.charAt(0) == 'L' && line.charAt(1) == 'a' && match == 1) {
                    file2.append("Last Name: " + lastName + "\n");
                    continue;
                }
                if (line.charAt(0) == 'G' && line.charAt(1) == 'e' && match == 1) {
                    file2.append("Gender: " + gender + "\n");
                    continue;
                }
                if (line.charAt(0) == 'P' && line.charAt(1) == 'h' && match == 1) {
                    file2.append("Phone No: " + phoneNo + "\n");
                    continue;
                }
                if (line.charAt(0) == 'N' && line.charAt(1) == 'I' && match == 1) {
                    file2.append("NID: " + nid + "\n");
                    continue;
                }
                if (line.charAt(0) == 'P' && line.charAt(1) == 'A' && match == 1) {
                    file2.append("PAssport No: " + passport + "\n");
                    match = 0;
                }
            }
            File ll = new File("src/database/temp.txt");

            sc.close();
            file2.close();
            file.delete();
            ll.renameTo(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        UserDashboardProfile user = new UserDashboardProfile(username, password,email, firstName, lastName, gender, phoneNo, nid, passport);

        user.setVisible(true);

        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        new UserDashboardSettings(username, password,email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_settingsMouseClicked

    private void travelInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelInfoMouseClicked
        new UserDashboardTravelInfo1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_travelInfoMouseClicked

    private void bookTripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTripMouseClicked
        new UserDashboardBookTrip1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_bookTripMouseClicked

    private void myBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingMouseClicked
        try {
            new UserDashboardMyBooking(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(UserDashboardProfileEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_myBookingMouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserDashboardProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboardProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboardProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboardProfileEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboardProfileEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookTrip;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoText;
    private javax.swing.JLabel myBooking;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel travelInfo;
    // End of variables declaration//GEN-END:variables
}
