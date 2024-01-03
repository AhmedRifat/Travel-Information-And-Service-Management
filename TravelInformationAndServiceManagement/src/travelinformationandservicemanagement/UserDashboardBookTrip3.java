package travelinformationandservicemanagement;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UserDashboardBookTrip3 extends javax.swing.JFrame {

    private ImageIcon icon;
    private String username, password, firstName, lastName, nid, phoneNo, passport, email, gender;
    
    String opt = "", opt2 = "", opt3 = "";
    String date = "";
    double price = 0;

    public UserDashboardBookTrip3() {
        initComponents();

        icon = new ImageIcon(getClass().getResource("/assets/4153125-02.png"));
        this.setIconImage(icon.getImage());

        Date date = new Date();
        jDateChooser1.setMinSelectableDate(date);

        local.setVisible(true);
        international.setVisible(true);

        place.setVisible(false);
        from.setVisible(false);
        dhaka.setVisible(false);
        to.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        packageType.setVisible(false);
        jLabel27.setVisible(false);

        pacakgeName.setVisible(false);
        premiumPackageCoxs.setVisible(false);
        premiumPackageSylhet.setVisible(false);
        premiumPackageRangamati.setVisible(false);
        premiumPackageDubai.setVisible(false);
        premiumPackageSajek.setVisible(false);
        premiumPackageParis.setVisible(false);
        premiumPackageIndia.setVisible(false);
        nonpremiumPackageCoxs.setVisible(false);
        nonpremiumPackageSylhet.setVisible(false);
        nonpremiumPackageIndia.setVisible(false);
        nonpremiumPackageRangamati.setVisible(false);
        nonpremiumPackageDubai.setVisible(false);
        nonpremiumPackageSajek.setVisible(false);
        nonpremiumPackageParis.setVisible(false);
        jLabel23.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        jLabel14.setVisible(true);
        jLabel16.setVisible(false);
        jLabel19.setVisible(false);
    }

    public UserDashboardBookTrip3(String username, String password, String email, String firstName, String lastName, String gender, String phoneNo, String nid, String passport) {
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

        Date date = new Date();
        jDateChooser1.setMinSelectableDate(date);

        local.setVisible(true);
        international.setVisible(true);

        place.setVisible(false);
        from.setVisible(false);
        dhaka.setVisible(false);
        to.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        packageType.setVisible(false);
        jLabel27.setVisible(false);

        pacakgeName.setVisible(false);
        premiumPackageCoxs.setVisible(false);
        premiumPackageSylhet.setVisible(false);
        premiumPackageRangamati.setVisible(false);
        premiumPackageDubai.setVisible(false);
        premiumPackageSajek.setVisible(false);
        premiumPackageParis.setVisible(false);
        premiumPackageIndia.setVisible(false);
        nonpremiumPackageCoxs.setVisible(false);
        nonpremiumPackageSylhet.setVisible(false);
        nonpremiumPackageIndia.setVisible(false);
        nonpremiumPackageRangamati.setVisible(false);
        nonpremiumPackageDubai.setVisible(false);
        nonpremiumPackageSajek.setVisible(false);
        nonpremiumPackageParis.setVisible(false);
        jLabel23.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        jLabel14.setVisible(true);
        jLabel16.setVisible(false);
        jLabel19.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        logoText2 = new javax.swing.JLabel();
        bookTrip2 = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        travelInfo = new javax.swing.JLabel();
        myBooking = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        logOut = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        local = new javax.swing.JRadioButton();
        international = new javax.swing.JRadioButton();
        transportationLocal = new javax.swing.JPanel();
        place = new javax.swing.JLabel();
        localLocation = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        bookDate = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        packageType = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        person = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pacakgeName = new javax.swing.JLabel();
        premiumPackageCoxs = new javax.swing.JComboBox<>();
        premiumPackageSylhet = new javax.swing.JComboBox<>();
        premiumPackageRangamati = new javax.swing.JComboBox<>();
        premiumPackageSajek = new javax.swing.JComboBox<>();
        premiumPackageIndia = new javax.swing.JComboBox<>();
        premiumPackageDubai = new javax.swing.JComboBox<>();
        premiumPackageParis = new javax.swing.JComboBox<>();
        nonpremiumPackageCoxs = new javax.swing.JComboBox<>();
        nonpremiumPackageSylhet = new javax.swing.JComboBox<>();
        nonpremiumPackageRangamati = new javax.swing.JComboBox<>();
        nonpremiumPackageSajek = new javax.swing.JComboBox<>();
        nonpremiumPackageIndia = new javax.swing.JComboBox<>();
        nonpremiumPackageDubai = new javax.swing.JComboBox<>();
        nonpremiumPackageParis = new javax.swing.JComboBox<>();
        internationalLocation = new javax.swing.JComboBox<>();
        personNum = new javax.swing.JTextField();
        dhaka = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        from = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tour = new javax.swing.JLabel();
        transportation = new javax.swing.JLabel();
        hotels = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GOTRIPCO");
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(30, 39, 76));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Dashboard-logo.png"))); // NOI18N
        jPanel6.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 120));

        logoText2.setFont(new java.awt.Font("Lovelo Black", 0, 18)); // NOI18N
        logoText2.setForeground(new java.awt.Color(95, 179, 255));
        logoText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoText2.setText("GOTRIPCO");
        jPanel6.add(logoText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, -1));

        bookTrip2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/book-trip-select.png"))); // NOI18N
        bookTrip2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookTrip2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookTrip2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookTrip2MouseExited(evt);
            }
        });
        jPanel6.add(bookTrip2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 210, 30));

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
        jPanel6.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 30));

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
        jPanel6.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 210, 30));

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
        jPanel6.add(travelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 210, 30));

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
        jPanel6.add(myBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 30));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 500));

        jPanel7.setBackground(new java.awt.Color(30, 39, 76));

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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(861, Short.MAX_VALUE)
                .addComponent(logOut)
                .addGap(14, 14, 14))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logOut, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 39, 76));
        jLabel1.setText("Book Trip");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 39, 76));
        jLabel2.setText("Book for required travel destination");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 280, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow-left.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, 35));

        local.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        local.setForeground(new java.awt.Color(51, 51, 51));
        local.setText("Local");
        local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localActionPerformed(evt);
            }
        });
        jPanel8.add(local, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 60, -1));

        international.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        international.setForeground(new java.awt.Color(51, 51, 51));
        international.setText("International");
        international.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internationalActionPerformed(evt);
            }
        });
        jPanel8.add(international, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 110, -1));

        transportationLocal.setBackground(new java.awt.Color(255, 255, 255));
        transportationLocal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        place.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        place.setForeground(new java.awt.Color(30, 39, 76));
        place.setText("Place");
        transportationLocal.add(place, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 80, 30));

        localLocation.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        localLocation.setForeground(new java.awt.Color(30, 39, 76));
        localLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Cox's Bazar", "Sylhet", "Rangamati", "Sajek" }));
        localLocation.setToolTipText("");
        localLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localLocationActionPerformed(evt);
            }
        });
        transportationLocal.add(localLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 130, -1));

        jLabel20.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 610, -1));

        bookDate.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        bookDate.setForeground(new java.awt.Color(30, 39, 76));
        bookDate.setText("Book Date");
        transportationLocal.add(bookDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 30));

        jDateChooser1.setMinSelectableDate(new java.util.Date(-62135701135000L));
        transportationLocal.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 170, 30));

        jLabel22.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 610, -1));

        type.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        type.setForeground(new java.awt.Color(30, 39, 76));
        type.setText("Type");
        transportationLocal.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 90, 30));

        packageType.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        packageType.setForeground(new java.awt.Color(30, 39, 76));
        packageType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Premium", "Non-premium" }));
        packageType.setToolTipText("");
        packageType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageTypeActionPerformed(evt);
            }
        });
        transportationLocal.add(packageType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, -1));

        jLabel27.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 610, -1));

        jLabel23.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 610, -1));

        person.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        person.setForeground(new java.awt.Color(30, 39, 76));
        person.setText("Person");
        transportationLocal.add(person, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 30));

        jLabel30.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 610, -1));

        cancel.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 0, 0));
        cancel.setText("Cancel");
        cancel.setBorder(null);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        transportationLocal.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 130, 40));

        confirm.setBackground(new java.awt.Color(62, 82, 117));
        confirm.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        transportationLocal.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 130, 40));

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        transportationLocal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 50, 30));

        pacakgeName.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        pacakgeName.setForeground(new java.awt.Color(30, 39, 76));
        pacakgeName.setText("package Name");
        transportationLocal.add(pacakgeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 100, 30));

        premiumPackageCoxs.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumPackageCoxs.setForeground(new java.awt.Color(30, 39, 76));
        premiumPackageCoxs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "26,300 BDT For 3 days 2 nights", " " }));
        premiumPackageCoxs.setToolTipText("");
        premiumPackageCoxs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumPackageCoxsActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumPackageCoxs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        premiumPackageSylhet.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumPackageSylhet.setForeground(new java.awt.Color(30, 39, 76));
        premiumPackageSylhet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "25,900 BDT For 3 days 2 nights" }));
        premiumPackageSylhet.setToolTipText("");
        premiumPackageSylhet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumPackageSylhetActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumPackageSylhet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        premiumPackageRangamati.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumPackageRangamati.setForeground(new java.awt.Color(30, 39, 76));
        premiumPackageRangamati.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "19,300 BDT For 3 days 2 nights" }));
        premiumPackageRangamati.setToolTipText("");
        premiumPackageRangamati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumPackageRangamatiActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumPackageRangamati, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        premiumPackageSajek.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumPackageSajek.setForeground(new java.awt.Color(30, 39, 76));
        premiumPackageSajek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "26,000 BDT For 3 days 2 nights" }));
        premiumPackageSajek.setToolTipText("");
        premiumPackageSajek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumPackageSajekActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumPackageSajek, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        premiumPackageIndia.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumPackageIndia.setForeground(new java.awt.Color(30, 39, 76));
        premiumPackageIndia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "94,600 BDT For 7 days 6 nights" }));
        premiumPackageIndia.setToolTipText("");
        premiumPackageIndia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumPackageIndiaActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumPackageIndia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        premiumPackageDubai.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumPackageDubai.setForeground(new java.awt.Color(30, 39, 76));
        premiumPackageDubai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "254,056 BDT For 7 days 6 nights" }));
        premiumPackageDubai.setToolTipText("");
        premiumPackageDubai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumPackageDubaiActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumPackageDubai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        premiumPackageParis.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumPackageParis.setForeground(new java.awt.Color(30, 39, 76));
        premiumPackageParis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "329,400 BDT For 7 days 6 nights" }));
        premiumPackageParis.setToolTipText("");
        premiumPackageParis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumPackageParisActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumPackageParis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        nonpremiumPackageCoxs.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumPackageCoxs.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumPackageCoxs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "9,600 BDT For 3 days 2 nights" }));
        nonpremiumPackageCoxs.setToolTipText("");
        nonpremiumPackageCoxs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumPackageCoxsActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumPackageCoxs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        nonpremiumPackageSylhet.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumPackageSylhet.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumPackageSylhet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "9,600 BDT For 3 days 2 nights" }));
        nonpremiumPackageSylhet.setToolTipText("");
        nonpremiumPackageSylhet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumPackageSylhetActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumPackageSylhet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        nonpremiumPackageRangamati.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumPackageRangamati.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumPackageRangamati.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "9,640 BDT For 3 days 2 nights" }));
        nonpremiumPackageRangamati.setToolTipText("");
        nonpremiumPackageRangamati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumPackageRangamatiActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumPackageRangamati, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        nonpremiumPackageSajek.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumPackageSajek.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumPackageSajek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "9,600 BDT For 3 days 2 nights" }));
        nonpremiumPackageSajek.setToolTipText("");
        nonpremiumPackageSajek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumPackageSajekActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumPackageSajek, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        nonpremiumPackageIndia.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumPackageIndia.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumPackageIndia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "78,130 BDT For 7 days 6 nights" }));
        nonpremiumPackageIndia.setToolTipText("");
        nonpremiumPackageIndia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumPackageIndiaActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumPackageIndia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        nonpremiumPackageDubai.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumPackageDubai.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumPackageDubai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "131,006 BDT For 7 days 6 nights" }));
        nonpremiumPackageDubai.setToolTipText("");
        nonpremiumPackageDubai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumPackageDubaiActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumPackageDubai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        nonpremiumPackageParis.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumPackageParis.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumPackageParis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "251,510 BDT For 7 days 6 nights" }));
        nonpremiumPackageParis.setToolTipText("");
        nonpremiumPackageParis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumPackageParisActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumPackageParis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));

        internationalLocation.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        internationalLocation.setForeground(new java.awt.Color(30, 39, 76));
        internationalLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "India", "Dubai", "Paris" }));
        internationalLocation.setToolTipText("");
        internationalLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internationalLocationActionPerformed(evt);
            }
        });
        transportationLocal.add(internationalLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 130, -1));

        personNum.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        personNum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        personNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personNumActionPerformed(evt);
            }
        });
        personNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                personNumKeyTyped(evt);
            }
        });
        transportationLocal.add(personNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 410, 20));

        dhaka.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        dhaka.setForeground(new java.awt.Color(30, 39, 76));
        dhaka.setText("Dhaka");
        transportationLocal.add(dhaka, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 60, 30));

        to.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        to.setForeground(new java.awt.Color(51, 51, 51));
        to.setText("To");
        transportationLocal.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 20, 30));

        from.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        from.setForeground(new java.awt.Color(51, 51, 51));
        from.setText("From");
        transportationLocal.add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 40, 30));

        jPanel8.add(transportationLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 690, 300));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tour.png"))); // NOI18N
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 20, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/transportation.png"))); // NOI18N
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 20, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hotel.png"))); // NOI18N
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 20, 30));

        tour.setFont(new java.awt.Font("Lovelo Black", 0, 14)); // NOI18N
        tour.setForeground(new java.awt.Color(30, 39, 76));
        tour.setText("Tour");
        tour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tourMouseClicked(evt);
            }
        });
        jPanel8.add(tour, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 60, 30));

        transportation.setFont(new java.awt.Font("Lovelo Black", 0, 14)); // NOI18N
        transportation.setForeground(new java.awt.Color(30, 39, 76));
        transportation.setText("Transportation");
        transportation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transportation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transportationMouseClicked(evt);
            }
        });
        jPanel8.add(transportation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, 30));

        hotels.setFont(new java.awt.Font("Lovelo Black", 0, 14)); // NOI18N
        hotels.setForeground(new java.awt.Color(30, 39, 76));
        hotels.setText("Hotels");
        hotels.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hotels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotelsMouseClicked(evt);
            }
        });
        jPanel8.add(hotels, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 60, 30));

        jLabel14.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("_______________");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 100, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("_________________");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 110, -1));

        jLabel19.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("_______________________________");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 800, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookTrip2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTrip2MouseEntered

    }//GEN-LAST:event_bookTrip2MouseEntered

    private void bookTrip2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTrip2MouseExited

    }//GEN-LAST:event_bookTrip2MouseExited

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        new UserDashboardProfile(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_profileMouseClicked

    private void profileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseEntered
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile-option-select.png")));
    }//GEN-LAST:event_profileMouseEntered

    private void profileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseExited
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profile-option.png")));
    }//GEN-LAST:event_profileMouseExited

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        new UserDashboardSettings(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_settingsMouseClicked

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/settings-select.png")));
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/settings.png")));
    }//GEN-LAST:event_settingsMouseExited

    private void travelInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelInfoMouseClicked
        new UserDashboardTravelInfo1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_travelInfoMouseClicked

    private void travelInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelInfoMouseEntered
        travelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/travel-info-selected.png")));
    }//GEN-LAST:event_travelInfoMouseEntered

    private void travelInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelInfoMouseExited
        travelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/travel-info.png")));
    }//GEN-LAST:event_travelInfoMouseExited

    private void myBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingMouseClicked
        try {
            new UserDashboardMyBooking(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(UserDashboardBookTrip3.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_myBookingMouseClicked

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

    private void localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localActionPerformed
        place.setVisible(false);
        from.setVisible(false);
        dhaka.setVisible(false);
        to.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        packageType.setVisible(false);
        jLabel27.setVisible(false);

        pacakgeName.setVisible(false);
        premiumPackageCoxs.setVisible(false);
        premiumPackageSylhet.setVisible(false);
        premiumPackageRangamati.setVisible(false);
        premiumPackageDubai.setVisible(false);
        premiumPackageSajek.setVisible(false);
        premiumPackageParis.setVisible(false);
        premiumPackageIndia.setVisible(false);
        nonpremiumPackageCoxs.setVisible(false);
        nonpremiumPackageSylhet.setVisible(false);
        nonpremiumPackageIndia.setVisible(false);
        nonpremiumPackageRangamati.setVisible(false);
        nonpremiumPackageDubai.setVisible(false);
        nonpremiumPackageSajek.setVisible(false);
        nonpremiumPackageParis.setVisible(false);
        jLabel23.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (local.isSelected()) {
            place.setVisible(true);
            from.setVisible(true);
            dhaka.setVisible(true);
            to.setVisible(true);
            localLocation.setVisible(true);
            jLabel20.setVisible(true);
        }
    }//GEN-LAST:event_localActionPerformed

    private void internationalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internationalActionPerformed
        place.setVisible(false);
        from.setVisible(false);
        dhaka.setVisible(false);
        to.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        packageType.setVisible(false);
        jLabel27.setVisible(false);

        pacakgeName.setVisible(false);
        premiumPackageCoxs.setVisible(false);
        premiumPackageSylhet.setVisible(false);
        premiumPackageRangamati.setVisible(false);
        premiumPackageDubai.setVisible(false);
        premiumPackageSajek.setVisible(false);
        premiumPackageParis.setVisible(false);
        premiumPackageIndia.setVisible(false);
        nonpremiumPackageCoxs.setVisible(false);
        nonpremiumPackageSylhet.setVisible(false);
        nonpremiumPackageIndia.setVisible(false);
        nonpremiumPackageRangamati.setVisible(false);
        nonpremiumPackageDubai.setVisible(false);
        nonpremiumPackageSajek.setVisible(false);
        nonpremiumPackageParis.setVisible(false);
        jLabel23.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (international.isSelected()) {
            place.setVisible(true);
            from.setVisible(true);
            dhaka.setVisible(true);
            to.setVisible(true);
            internationalLocation.setVisible(true);
            jLabel20.setVisible(true);
        }
    }//GEN-LAST:event_internationalActionPerformed

    private void localLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localLocationActionPerformed
        opt = (String) localLocation.getSelectedItem();

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        packageType.setVisible(false);
        jLabel27.setVisible(false);

        pacakgeName.setVisible(false);
        premiumPackageCoxs.setVisible(false);
        premiumPackageSylhet.setVisible(false);
        premiumPackageRangamati.setVisible(false);
        premiumPackageDubai.setVisible(false);
        premiumPackageSajek.setVisible(false);
        premiumPackageParis.setVisible(false);
        premiumPackageIndia.setVisible(false);
        nonpremiumPackageCoxs.setVisible(false);
        nonpremiumPackageSylhet.setVisible(false);
        nonpremiumPackageIndia.setVisible(false);
        nonpremiumPackageRangamati.setVisible(false);
        nonpremiumPackageDubai.setVisible(false);
        nonpremiumPackageSajek.setVisible(false);
        nonpremiumPackageParis.setVisible(false);
        jLabel23.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt.equalsIgnoreCase("cox's bazar")) {
            bookDate.setVisible(true);
            jDateChooser1.setVisible(true);
            jButton1.setVisible(true);
            jLabel22.setVisible(true);
        } else if (opt.equalsIgnoreCase("sylhet")) {
            bookDate.setVisible(true);
            jDateChooser1.setVisible(true);
            jButton1.setVisible(true);
            jLabel22.setVisible(true);
        } else if (opt.equalsIgnoreCase("rangamati")) {
            bookDate.setVisible(true);
            jDateChooser1.setVisible(true);
            jButton1.setVisible(true);
            jLabel22.setVisible(true);
        } else if (opt.equalsIgnoreCase("sajek")) {
            bookDate.setVisible(true);
            jDateChooser1.setVisible(true);
            jButton1.setVisible(true);
            jLabel22.setVisible(true);
        }
    }//GEN-LAST:event_localLocationActionPerformed

    private void packageTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageTypeActionPerformed
        opt3 = (String) packageType.getSelectedItem();

        pacakgeName.setVisible(false);
        premiumPackageCoxs.setVisible(false);
        premiumPackageSylhet.setVisible(false);
        premiumPackageRangamati.setVisible(false);
        premiumPackageDubai.setVisible(false);
        premiumPackageSajek.setVisible(false);
        premiumPackageParis.setVisible(false);
        premiumPackageIndia.setVisible(false);
        nonpremiumPackageCoxs.setVisible(false);
        nonpremiumPackageSylhet.setVisible(false);
        nonpremiumPackageIndia.setVisible(false);
        nonpremiumPackageRangamati.setVisible(false);
        nonpremiumPackageDubai.setVisible(false);
        nonpremiumPackageSajek.setVisible(false);
        nonpremiumPackageParis.setVisible(false);
        jLabel23.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("premium")) {
            pacakgeName.setVisible(true);
            if (opt.equalsIgnoreCase("cox's bazar")) {
                premiumPackageCoxs.setVisible(true);
            } else if (opt.equalsIgnoreCase("sylhet")) {
                premiumPackageSylhet.setVisible(true);
            } else if (opt.equalsIgnoreCase("rangamati")) {
                premiumPackageRangamati.setVisible(true);
            } else if (opt.equalsIgnoreCase("sajek")) {
                premiumPackageSajek.setVisible(true);
            } else if (opt.equalsIgnoreCase("india")) {
                premiumPackageIndia.setVisible(true);
            } else if (opt.equalsIgnoreCase("dubai")) {
                premiumPackageDubai.setVisible(true);
            } else if (opt.equalsIgnoreCase("paris")) {
                premiumPackageParis.setVisible(true);
            }
            jLabel23.setVisible(true);

        } else if (opt3.equalsIgnoreCase("non-premium")) {
            pacakgeName.setVisible(true);
            if (opt.equalsIgnoreCase("cox's bazar")) {
                nonpremiumPackageCoxs.setVisible(true);
            } else if (opt.equalsIgnoreCase("sylhet")) {
                nonpremiumPackageSylhet.setVisible(true);
            } else if (opt.equalsIgnoreCase("rangamati")) {
                nonpremiumPackageRangamati.setVisible(true);
            } else if (opt.equalsIgnoreCase("sajek")) {
                nonpremiumPackageSajek.setVisible(true);
            } else if (opt.equalsIgnoreCase("india")) {
                nonpremiumPackageIndia.setVisible(true);
            } else if (opt.equalsIgnoreCase("dubai")) {
                nonpremiumPackageDubai.setVisible(true);
            } else if (opt.equalsIgnoreCase("paris")) {
                nonpremiumPackageParis.setVisible(true);
            }
            jLabel23.setVisible(true);
        }
    }//GEN-LAST:event_packageTypeActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new UserDashboardBookTrip3(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try {
            price = price * (double) (Integer.parseInt(personNum.getText()));
            try {
                FileWriter fw = new FileWriter("src/database/Info.txt", true);
                fw.append(firstName + "\t\t/ ");
                fw.append(lastName + "\t\t/ ");
                fw.append(username + "\t\t/ ");
                if (opt.length() <= 5) {
                    fw.append(opt + "\t\t/ ");
                } else {
                    fw.append(opt + "\t/ ");
                }
                fw.append("Package\t/ ");
                fw.append(personNum.getText() + "\t/ ");
                if (opt.length() <= 5) {
                    fw.append(price + "\t\t/ ");
                } else {
                    fw.append(price + "\t/ ");
                }
                fw.append("pending\t/ ");
                fw.append(date + "\n");

                fw.close();

                JOptionPane.showMessageDialog(null, "Booked successfully!", "Success", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/assets/done_64px.png")));
                new UserDashboardBookTrip3(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
                dispose();
            } catch (IOException e) {
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter Person/Day/Night number!", "Error!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        type.setVisible(false);
        packageType.setVisible(false);
        jLabel27.setVisible(false);

        pacakgeName.setVisible(false);
        premiumPackageCoxs.setVisible(false);
        premiumPackageSylhet.setVisible(false);
        premiumPackageRangamati.setVisible(false);
        premiumPackageDubai.setVisible(false);
        premiumPackageSajek.setVisible(false);
        premiumPackageParis.setVisible(false);
        premiumPackageIndia.setVisible(false);
        nonpremiumPackageCoxs.setVisible(false);
        nonpremiumPackageSylhet.setVisible(false);
        nonpremiumPackageIndia.setVisible(false);
        nonpremiumPackageRangamati.setVisible(false);
        nonpremiumPackageDubai.setVisible(false);
        nonpremiumPackageSajek.setVisible(false);
        nonpremiumPackageParis.setVisible(false);
        jLabel23.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            date = sdf.format(jDateChooser1.getDate());

            type.setVisible(true);
            packageType.setVisible(true);
            jLabel27.setVisible(true);

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void premiumPackageCoxsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumPackageCoxsActionPerformed
        opt3 = (String) premiumPackageCoxs.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("26,300 BDT For 3 days 2 nights")) {
            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 26300;
        } else {

        }
    }//GEN-LAST:event_premiumPackageCoxsActionPerformed

    private void premiumPackageSylhetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumPackageSylhetActionPerformed
        opt3 = (String) premiumPackageSylhet.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("25,900 BDT For 3 days 2 nights")) {
            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 25900;
        } else {
        }
    }//GEN-LAST:event_premiumPackageSylhetActionPerformed

    private void premiumPackageRangamatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumPackageRangamatiActionPerformed
        opt3 = (String) premiumPackageRangamati.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("19,300 BDT For 3 days 2 nights")) {
            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 19300;
        } else {
        }
    }//GEN-LAST:event_premiumPackageRangamatiActionPerformed

    private void premiumPackageSajekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumPackageSajekActionPerformed
        opt3 = (String) premiumPackageSajek.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("26,000 BDT For 3 days 2 nights")) {

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 26000;
        } else {
        }
    }//GEN-LAST:event_premiumPackageSajekActionPerformed

    private void premiumPackageIndiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumPackageIndiaActionPerformed
        opt3 = (String) premiumPackageIndia.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("94,600 BDT For 7 days 6 nights")) {

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 94600;
        } else {
        }
    }//GEN-LAST:event_premiumPackageIndiaActionPerformed

    private void premiumPackageDubaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumPackageDubaiActionPerformed
        opt3 = (String) premiumPackageDubai.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("254,056 BDT For 7 days 6 nights")) {

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 254056;
        } else {
        }
    }//GEN-LAST:event_premiumPackageDubaiActionPerformed

    private void premiumPackageParisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumPackageParisActionPerformed
        opt3 = (String) premiumPackageParis.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("329,400 BDT For 7 days 6 nights")) {
            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 329400;
        } else {
        }
    }//GEN-LAST:event_premiumPackageParisActionPerformed

    private void nonpremiumPackageCoxsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumPackageCoxsActionPerformed
        opt3 = (String) nonpremiumPackageCoxs.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("9,600 BDT For 3 days 2 nights")) {

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 9600;
        } else {
        }
    }//GEN-LAST:event_nonpremiumPackageCoxsActionPerformed

    private void nonpremiumPackageSylhetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumPackageSylhetActionPerformed
        opt3 = (String) nonpremiumPackageSylhet.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("9,600 BDT For 3 days 2 nights")) {

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 9600;
        } else {
        }
    }//GEN-LAST:event_nonpremiumPackageSylhetActionPerformed

    private void nonpremiumPackageRangamatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumPackageRangamatiActionPerformed
        opt3 = (String) nonpremiumPackageRangamati.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("9,640 BDT For 3 days 2 nights")) {
            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 9640;
        } else {
        }
    }//GEN-LAST:event_nonpremiumPackageRangamatiActionPerformed

    private void nonpremiumPackageSajekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumPackageSajekActionPerformed
        opt3 = (String) nonpremiumPackageSajek.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("9,600 BDT For 3 days 2 nights")) {

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 9600;
        } else {
        }
    }//GEN-LAST:event_nonpremiumPackageSajekActionPerformed

    private void nonpremiumPackageIndiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumPackageIndiaActionPerformed
        opt3 = (String) nonpremiumPackageIndia.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("78,130 BDT For 7 days 6 nights")) {

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 78130;
        } else {
        }
    }//GEN-LAST:event_nonpremiumPackageIndiaActionPerformed

    private void nonpremiumPackageDubaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumPackageDubaiActionPerformed
        opt3 = (String) nonpremiumPackageDubai.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("131,006 BDT For 7 days 6 nights")) {

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 131006;
        } else {
        }
    }//GEN-LAST:event_nonpremiumPackageDubaiActionPerformed

    private void nonpremiumPackageParisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumPackageParisActionPerformed
        opt3 = (String) nonpremiumPackageParis.getSelectedItem();

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("251,510 BDT For 7 days 6 nights")) {

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 251510;
        } else {
        }
    }//GEN-LAST:event_nonpremiumPackageParisActionPerformed

    private void internationalLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internationalLocationActionPerformed
        opt = (String) internationalLocation.getSelectedItem();

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        packageType.setVisible(false);
        jLabel27.setVisible(false);

        pacakgeName.setVisible(false);
        premiumPackageCoxs.setVisible(false);
        premiumPackageSylhet.setVisible(false);
        premiumPackageRangamati.setVisible(false);
        premiumPackageDubai.setVisible(false);
        premiumPackageSajek.setVisible(false);
        premiumPackageParis.setVisible(false);
        premiumPackageIndia.setVisible(false);
        nonpremiumPackageCoxs.setVisible(false);
        nonpremiumPackageSylhet.setVisible(false);
        nonpremiumPackageIndia.setVisible(false);
        nonpremiumPackageRangamati.setVisible(false);
        nonpremiumPackageDubai.setVisible(false);
        nonpremiumPackageSajek.setVisible(false);
        nonpremiumPackageParis.setVisible(false);
        jLabel23.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt.equalsIgnoreCase("india")) {
            bookDate.setVisible(true);
            jDateChooser1.setVisible(true);
            jButton1.setVisible(true);
            jLabel22.setVisible(true);
        } else if (opt.equalsIgnoreCase("dubai")) {
            bookDate.setVisible(true);
            jDateChooser1.setVisible(true);
            jButton1.setVisible(true);
            jLabel22.setVisible(true);
        } else if (opt.equalsIgnoreCase("paris")) {
            bookDate.setVisible(true);
            jDateChooser1.setVisible(true);
            jButton1.setVisible(true);
            jLabel22.setVisible(true);
        }
    }//GEN-LAST:event_internationalLocationActionPerformed

    private void personNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personNumActionPerformed

    }//GEN-LAST:event_personNumActionPerformed

    private void personNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_personNumKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_personNumKeyTyped

    private void transportationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transportationMouseClicked
        new UserDashboardBookTrip1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_transportationMouseClicked

    private void hotelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotelsMouseClicked
        new UserDashboardBookTrip2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_hotelsMouseClicked

    private void tourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tourMouseClicked
        place.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        packageType.setVisible(false);
        jLabel27.setVisible(false);

        pacakgeName.setVisible(false);
        premiumPackageCoxs.setVisible(false);
        premiumPackageSylhet.setVisible(false);
        premiumPackageRangamati.setVisible(false);
        premiumPackageDubai.setVisible(false);
        premiumPackageSajek.setVisible(false);
        premiumPackageParis.setVisible(false);
        premiumPackageIndia.setVisible(false);
        nonpremiumPackageCoxs.setVisible(false);
        nonpremiumPackageSylhet.setVisible(false);
        nonpremiumPackageIndia.setVisible(false);
        nonpremiumPackageRangamati.setVisible(false);
        nonpremiumPackageDubai.setVisible(false);
        nonpremiumPackageSajek.setVisible(false);
        nonpremiumPackageParis.setVisible(false);
        jLabel23.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);
    }//GEN-LAST:event_tourMouseClicked

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
            java.util.logging.Logger.getLogger(UserDashboardBookTrip3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboardBookTrip3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboardBookTrip3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboardBookTrip3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboardBookTrip3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookDate;
    private javax.swing.JLabel bookTrip2;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel dhaka;
    private javax.swing.JLabel from;
    private javax.swing.JLabel hotels;
    private javax.swing.JRadioButton international;
    private javax.swing.JComboBox<String> internationalLocation;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton local;
    private javax.swing.JComboBox<String> localLocation;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logoText2;
    private javax.swing.JLabel myBooking;
    private javax.swing.JComboBox<String> nonpremiumPackageCoxs;
    private javax.swing.JComboBox<String> nonpremiumPackageDubai;
    private javax.swing.JComboBox<String> nonpremiumPackageIndia;
    private javax.swing.JComboBox<String> nonpremiumPackageParis;
    private javax.swing.JComboBox<String> nonpremiumPackageRangamati;
    private javax.swing.JComboBox<String> nonpremiumPackageSajek;
    private javax.swing.JComboBox<String> nonpremiumPackageSylhet;
    private javax.swing.JLabel pacakgeName;
    private javax.swing.JComboBox<String> packageType;
    private javax.swing.JLabel person;
    private javax.swing.JTextField personNum;
    private javax.swing.JLabel place;
    private javax.swing.JComboBox<String> premiumPackageCoxs;
    private javax.swing.JComboBox<String> premiumPackageDubai;
    private javax.swing.JComboBox<String> premiumPackageIndia;
    private javax.swing.JComboBox<String> premiumPackageParis;
    private javax.swing.JComboBox<String> premiumPackageRangamati;
    private javax.swing.JComboBox<String> premiumPackageSajek;
    private javax.swing.JComboBox<String> premiumPackageSylhet;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel to;
    private javax.swing.JLabel tour;
    private javax.swing.JLabel transportation;
    private javax.swing.JPanel transportationLocal;
    private javax.swing.JLabel travelInfo;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
