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

public class UserDashboardSettings extends javax.swing.JFrame {

    private ImageIcon icon;
    private String username, password, firstName, lastName, nid, phoneNo, passport, email, gender;

    public UserDashboardSettings(String username, String password, String email, String firstName, String lastName, String gender, String phoneNo, String nid, String passport) {
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
        
        jLabel19.setText(email);
        jLabel20.setText(username);

    }

    public UserDashboardSettings() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GOTRIPCO");

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

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile-option.png"))); // NOI18N
        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profileMouseExited(evt);
            }
        });
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 30));

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/settings-select.png"))); // NOI18N
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jLabel1.setText("Settings");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 100, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 39, 76));
        jLabel2.setText("Manage your email address, username and password");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Username");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 120, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Password");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 120, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Email");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, 30));

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("_______________________________________________________________________________________________________________________________________");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("_______________________________________________________________________________________________________________________________________");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("_______________________________________________________________________________________________________________________________________");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow-left.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, 35));

        jLabel18.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(30, 32, 122));
        jLabel18.setText("Change Password?");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 120, 30));

        jLabel19.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 530, 30));

        jLabel20.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 530, 30));

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
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile-option-select.png")));
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile-option.png")));
    }//GEN-LAST:event_profileMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered

    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited

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

        //System.out.println(firstName+" "+lastName+" "+phoneNo+" "+passport);
    }//GEN-LAST:event_logOutMouseEntered

    private void logOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseExited
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Shutdown1_64px.png")));
    }//GEN-LAST:event_logOutMouseExited

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        new UserDashboardProfile(username, password,email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();

    }//GEN-LAST:event_profileMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        UserDashboard userDash = new UserDashboard(username,passport);
        userDash.setFirstName(firstName);
        userDash.setLastName(lastName);
        userDash.setGender(gender);
        userDash.setPassport(passport);
        userDash.setPhoneNo(phoneNo);
        userDash.setNid(nid);

        userDash.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        UserDashboardSettingsEdit userSettingsEdit = new UserDashboardSettingsEdit(username, password,email, firstName, lastName, gender, phoneNo, nid, passport);
        userSettingsEdit.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void myBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingMouseClicked
        try {
            new UserDashboardMyBooking(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(UserDashboardSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_myBookingMouseClicked

    private void bookTripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTripMouseClicked
        new UserDashboardBookTrip1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_bookTripMouseClicked

    private void travelInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelInfoMouseClicked
        new UserDashboardTravelInfo1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_travelInfoMouseClicked

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
            java.util.logging.Logger.getLogger(UserDashboardSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboardSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboardSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboardSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboardSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookTrip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoText;
    private javax.swing.JLabel myBooking;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel travelInfo;
    // End of variables declaration//GEN-END:variables
}
