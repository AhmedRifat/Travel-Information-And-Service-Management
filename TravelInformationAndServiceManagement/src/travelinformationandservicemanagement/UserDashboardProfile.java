package travelinformationandservicemanagement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UserDashboardProfile extends javax.swing.JFrame {

    private ImageIcon icon;
    private String username, password, firstName = "", lastName = "", nid = "", phoneNo = "", passport = "", email = "", gender = "";

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String passsword) {
        this.password = passsword;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNid() {
        return nid;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getPassport() {
        return passport;
    }

    public String getEmail() {
        return email;
    }

    public UserDashboardProfile() {
        initComponents();
    }

    public UserDashboardProfile(String username, String password, String email, String firstName, String lastName, String gender, String phoneNo, String nid, String passport) {

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

        firstnamebox.setText(firstName);
        lastnamebox.setText(lastName);
        genderbox.setText(gender);
        phonenumberbox.setText(phoneNo);
        nidnumberbox.setText(nid);
        passportnumberbox.setText(passport);

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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lastnamebox = new javax.swing.JLabel();
        genderbox = new javax.swing.JLabel();
        phonenumberbox = new javax.swing.JLabel();
        nidnumberbox = new javax.swing.JLabel();
        passportnumberbox = new javax.swing.JLabel();
        firstnamebox = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

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
        jLabel1.setText("Profile");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 60, 30));

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

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Edit.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 30, 30));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(30, 39, 76));
        jLabel16.setText("Edit");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 50, 30));

        lastnamebox.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        lastnamebox.setForeground(new java.awt.Color(51, 51, 51));
        lastnamebox.setText("Last Name");
        jPanel4.add(lastnamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 520, 30));

        genderbox.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        genderbox.setForeground(new java.awt.Color(51, 51, 51));
        genderbox.setText("Gender");
        jPanel4.add(genderbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 520, 30));

        phonenumberbox.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        phonenumberbox.setForeground(new java.awt.Color(51, 51, 51));
        phonenumberbox.setText("01000000000");
        jPanel4.add(phonenumberbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 520, 30));

        nidnumberbox.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        nidnumberbox.setForeground(new java.awt.Color(51, 51, 51));
        nidnumberbox.setText("ABC11111");
        jPanel4.add(nidnumberbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 520, 30));

        passportnumberbox.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        passportnumberbox.setForeground(new java.awt.Color(51, 51, 51));
        passportnumberbox.setText("AAAA-BBBB-CCCC");
        jPanel4.add(passportnumberbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 520, 30));

        firstnamebox.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        firstnamebox.setForeground(new java.awt.Color(51, 51, 51));
        firstnamebox.setText("First Name");
        jPanel4.add(firstnamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 520, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow-left.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, 35));

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

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        UserDashboardProfileEdit edit = new UserDashboardProfileEdit(username, password, email, firstName, lastName, gender, phoneNo, nid, passport);

        edit.setVisible(true);

        dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        UserDashboardProfileEdit edit = new UserDashboardProfileEdit(username, password, email, firstName, lastName, gender, phoneNo, nid, passport);

        edit.setVisible(true);

        dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        UserDashboard userDash = new UserDashboard(username, passport);
        userDash.setFirstName(firstName);
        userDash.setLastName(lastName);
        userDash.setGender(gender);
        userDash.setPassport(passport);
        userDash.setPhoneNo(phoneNo);
        userDash.setNid(nid);

        userDash.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

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
            Logger.getLogger(UserDashboardProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_myBookingMouseClicked

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
            java.util.logging.Logger.getLogger(UserDashboardProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboardProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboardProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboardProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UserDashboardProfile().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookTrip;
    private javax.swing.JLabel firstnamebox;
    private javax.swing.JLabel genderbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel lastnamebox;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoText;
    private javax.swing.JLabel myBooking;
    private javax.swing.JLabel nidnumberbox;
    private javax.swing.JLabel passportnumberbox;
    private javax.swing.JLabel phonenumberbox;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel travelInfo;
    // End of variables declaration//GEN-END:variables
}
