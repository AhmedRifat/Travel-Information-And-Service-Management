package travelinformationandservicemanagement;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UserDashboardBookTrip2 extends javax.swing.JFrame {

    private ImageIcon icon;
    private String username, password, firstName, lastName, nid, phoneNo, passport, email, gender;

    static int cnt = 0;
    
    String opt = "", opt2 = "", opt3 = "";
    String date = "";
    double price = 0;

    public UserDashboardBookTrip2() {
        initComponents();

        icon = new ImageIcon(getClass().getResource("/assets/4153125-02.png"));
        this.setIconImage(icon.getImage());

        Date date = new Date();
        jDateChooser1.setMinSelectableDate(date);

        local.setVisible(true);
        international.setVisible(true);

        place.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        hotelType.setVisible(false);
        jLabel27.setVisible(false);

        hotelName.setVisible(false);
        premiumHotelCoxs.setVisible(false);
        premiumHotelSylhet.setVisible(false);
        premiumHotelRangamati.setVisible(false);
        premiumHotelDubai.setVisible(false);
        premiumHotelSajek.setVisible(false);
        premiumHotelParis.setVisible(false);
        premiumHotelIndia.setVisible(false);
        nonpremiumHotelCoxs.setVisible(false);
        nonpremiumHotelSylhet.setVisible(false);
        nonpremiumHotelIndia.setVisible(false);
        nonpremiumHotelRangamati.setVisible(false);
        nonpremiumHotelDubai.setVisible(false);
        nonpremiumHotelSajek.setVisible(false);
        nonpremiumHotelParis.setVisible(false);
        jLabel23.setVisible(false);

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        jLabel14.setVisible(false);
        jLabel16.setVisible(true);
        jLabel19.setVisible(false);
    }

    public UserDashboardBookTrip2(String username, String password, String email, String firstName, String lastName, String gender, String phoneNo, String nid, String passport) {
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
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        hotelType.setVisible(false);
        jLabel27.setVisible(false);

        hotelName.setVisible(false);
        premiumHotelCoxs.setVisible(false);
        premiumHotelSylhet.setVisible(false);
        premiumHotelRangamati.setVisible(false);
        premiumHotelDubai.setVisible(false);
        premiumHotelSajek.setVisible(false);
        premiumHotelParis.setVisible(false);
        premiumHotelIndia.setVisible(false);
        nonpremiumHotelCoxs.setVisible(false);
        nonpremiumHotelSylhet.setVisible(false);
        nonpremiumHotelIndia.setVisible(false);
        nonpremiumHotelRangamati.setVisible(false);
        nonpremiumHotelDubai.setVisible(false);
        nonpremiumHotelSajek.setVisible(false);
        nonpremiumHotelParis.setVisible(false);
        jLabel23.setVisible(false);

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        jLabel14.setVisible(false);
        jLabel16.setVisible(true);
        jLabel19.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        hotelType = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        day = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        person = new javax.swing.JLabel();
        dayNum = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        hotelName = new javax.swing.JLabel();
        premiumHotelCoxs = new javax.swing.JComboBox<>();
        premiumHotelSylhet = new javax.swing.JComboBox<>();
        premiumHotelRangamati = new javax.swing.JComboBox<>();
        premiumHotelSajek = new javax.swing.JComboBox<>();
        premiumHotelIndia = new javax.swing.JComboBox<>();
        premiumHotelDubai = new javax.swing.JComboBox<>();
        premiumHotelParis = new javax.swing.JComboBox<>();
        nonpremiumHotelCoxs = new javax.swing.JComboBox<>();
        nonpremiumHotelSylhet = new javax.swing.JComboBox<>();
        nonpremiumHotelRangamati = new javax.swing.JComboBox<>();
        nonpremiumHotelSajek = new javax.swing.JComboBox<>();
        nonpremiumHotelIndia = new javax.swing.JComboBox<>();
        nonpremiumHotelDubai = new javax.swing.JComboBox<>();
        nonpremiumHotelParis = new javax.swing.JComboBox<>();
        internationalLocation = new javax.swing.JComboBox<>();
        personNum = new javax.swing.JTextField();
        night = new javax.swing.JLabel();
        nightNum = new javax.swing.JTextField();
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

        buttonGroup1.add(local);
        local.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        local.setForeground(new java.awt.Color(51, 51, 51));
        local.setText("Local");
        local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localActionPerformed(evt);
            }
        });
        jPanel8.add(local, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 60, -1));

        buttonGroup1.add(international);
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
        transportationLocal.add(localLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 130, -1));

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

        hotelType.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        hotelType.setForeground(new java.awt.Color(30, 39, 76));
        hotelType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Premium", "Non-premium" }));
        hotelType.setToolTipText("");
        hotelType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelTypeActionPerformed(evt);
            }
        });
        transportationLocal.add(hotelType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, -1));

        jLabel27.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 610, -1));

        jLabel23.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 610, -1));

        day.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        day.setForeground(new java.awt.Color(30, 39, 76));
        day.setText("Day");
        transportationLocal.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 30));

        jLabel26.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 610, -1));

        person.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        person.setForeground(new java.awt.Color(30, 39, 76));
        person.setText("Person");
        transportationLocal.add(person, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 30));

        dayNum.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        dayNum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dayNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayNumActionPerformed(evt);
            }
        });
        dayNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dayNumKeyTyped(evt);
            }
        });
        transportationLocal.add(dayNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, 20));

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

        hotelName.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        hotelName.setForeground(new java.awt.Color(30, 39, 76));
        hotelName.setText("Hotel Name");
        transportationLocal.add(hotelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, 30));

        premiumHotelCoxs.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumHotelCoxs.setForeground(new java.awt.Color(30, 39, 76));
        premiumHotelCoxs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Blu-Radisson Bay - 10,678 BDT per day/night", "Western Alliance - 6,100 BDT per day/night" }));
        premiumHotelCoxs.setToolTipText("");
        premiumHotelCoxs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumHotelCoxsActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumHotelCoxs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        premiumHotelSylhet.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumHotelSylhet.setForeground(new java.awt.Color(30, 39, 76));
        premiumHotelSylhet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Nazimgar Resort - 12,100 BDT per day/night", "Grand Sylhet Resort - 6,500 BDT per day/night" }));
        premiumHotelSylhet.setToolTipText("");
        premiumHotelSylhet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumHotelSylhetActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumHotelSylhet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        premiumHotelRangamati.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumHotelRangamati.setForeground(new java.awt.Color(30, 39, 76));
        premiumHotelRangamati.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Grand Shanghai Resort - 7,000 BDT per day/night", "Hotel South Hint - 6,000 BDT per day/night" }));
        premiumHotelRangamati.setToolTipText("");
        premiumHotelRangamati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumHotelRangamatiActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumHotelRangamati, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        premiumHotelSajek.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumHotelSajek.setForeground(new java.awt.Color(30, 39, 76));
        premiumHotelSajek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Echo Resort - 8,000 BDT per day/night", "Cloud Jumper Resort - 6,000 BDT per day/night" }));
        premiumHotelSajek.setToolTipText("");
        premiumHotelSajek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumHotelSajekActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumHotelSajek, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        premiumHotelIndia.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumHotelIndia.setForeground(new java.awt.Color(30, 39, 76));
        premiumHotelIndia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "ITC Royal - 12,640 BDT per day/night", "Hyatt Regency - 11,380 BDT per day/night" }));
        premiumHotelIndia.setToolTipText("");
        premiumHotelIndia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumHotelIndiaActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumHotelIndia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        premiumHotelDubai.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumHotelDubai.setForeground(new java.awt.Color(30, 39, 76));
        premiumHotelDubai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Hilton Dubai - 24,130 BDT per day/night", "Grand Hyatt - 25,630 BDT per day/night" }));
        premiumHotelDubai.setToolTipText("");
        premiumHotelDubai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumHotelDubaiActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumHotelDubai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        premiumHotelParis.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        premiumHotelParis.setForeground(new java.awt.Color(30, 39, 76));
        premiumHotelParis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Le Grand Intercontinental Paris - 45,780 BDT per day/night", "Novotel Paris - 29,400 BDT per day/night" }));
        premiumHotelParis.setToolTipText("");
        premiumHotelParis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumHotelParisActionPerformed(evt);
            }
        });
        transportationLocal.add(premiumHotelParis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        nonpremiumHotelCoxs.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumHotelCoxs.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumHotelCoxs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Hotel Saint-Martin - 5,000 BDT per day/night", "Hotel Asia - 3,000 BDT per day/night" }));
        nonpremiumHotelCoxs.setToolTipText("");
        nonpremiumHotelCoxs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumHotelCoxsActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumHotelCoxs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        nonpremiumHotelSylhet.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumHotelSylhet.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumHotelSylhet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Rose View Hotel - 4,000 BDT per day/night", "Hotel East - 3,000 BDT per day/night" }));
        nonpremiumHotelSylhet.setToolTipText("");
        nonpremiumHotelSylhet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumHotelSylhetActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumHotelSylhet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        nonpremiumHotelRangamati.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumHotelRangamati.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumHotelRangamati.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Holiday Resort - 3,000 BDT per day/night", "Lake View Resort - 3,000 BDT per day/night" }));
        nonpremiumHotelRangamati.setToolTipText("");
        nonpremiumHotelRangamati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumHotelRangamatiActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumHotelRangamati, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        nonpremiumHotelSajek.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumHotelSajek.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumHotelSajek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Sajek Cottage And Resort - 3,000 BDT per day/night", "TGB Cottage - 3,000 BDT per day/night" }));
        nonpremiumHotelSajek.setToolTipText("");
        nonpremiumHotelSajek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumHotelSajekActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumHotelSajek, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        nonpremiumHotelIndia.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumHotelIndia.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumHotelIndia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Alt Air - 9,560 BDT per day/night", "The Sonnet - 9,220 BDT per day/night" }));
        nonpremiumHotelIndia.setToolTipText("");
        nonpremiumHotelIndia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumHotelIndiaActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumHotelIndia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        nonpremiumHotelDubai.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumHotelDubai.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumHotelDubai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Mercure Dubai Barsha - 9,770 BDT per day/night", "Emirates Grand - 7,980 BDT per day/night" }));
        nonpremiumHotelDubai.setToolTipText("");
        nonpremiumHotelDubai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumHotelDubaiActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumHotelDubai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        nonpremiumHotelParis.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonpremiumHotelParis.setForeground(new java.awt.Color(30, 39, 76));
        nonpremiumHotelParis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Passy Eiffel - 20,400 BDT per day/night", "Citadines Tour Eiffel Paris - 19,530 BDT per day/night" }));
        nonpremiumHotelParis.setToolTipText("");
        nonpremiumHotelParis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonpremiumHotelParisActionPerformed(evt);
            }
        });
        transportationLocal.add(nonpremiumHotelParis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, -1));

        internationalLocation.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        internationalLocation.setForeground(new java.awt.Color(30, 39, 76));
        internationalLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "India", "Dubai", "Paris" }));
        internationalLocation.setToolTipText("");
        internationalLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internationalLocationActionPerformed(evt);
            }
        });
        transportationLocal.add(internationalLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 130, -1));

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

        night.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        night.setForeground(new java.awt.Color(30, 39, 76));
        night.setText("Night");
        transportationLocal.add(night, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 90, 30));

        nightNum.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nightNum.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nightNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nightNumActionPerformed(evt);
            }
        });
        nightNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nightNumKeyTyped(evt);
            }
        });
        transportationLocal.add(nightNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 130, 20));

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
            Logger.getLogger(UserDashboardBookTrip2.class.getName()).log(Level.SEVERE, null, ex);
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
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        hotelType.setVisible(false);
        jLabel27.setVisible(false);

        hotelName.setVisible(false);
        premiumHotelCoxs.setVisible(false);
        premiumHotelSylhet.setVisible(false);
        premiumHotelRangamati.setVisible(false);
        premiumHotelDubai.setVisible(false);
        premiumHotelSajek.setVisible(false);
        premiumHotelParis.setVisible(false);
        premiumHotelIndia.setVisible(false);
        nonpremiumHotelCoxs.setVisible(false);
        nonpremiumHotelSylhet.setVisible(false);
        nonpremiumHotelIndia.setVisible(false);
        nonpremiumHotelRangamati.setVisible(false);
        nonpremiumHotelDubai.setVisible(false);
        nonpremiumHotelSajek.setVisible(false);
        nonpremiumHotelParis.setVisible(false);
        jLabel23.setVisible(false);

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (local.isSelected()) {
            place.setVisible(true);
            localLocation.setVisible(true);
            jLabel20.setVisible(true);
        }
    }//GEN-LAST:event_localActionPerformed

    private void internationalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internationalActionPerformed
        place.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        hotelType.setVisible(false);
        jLabel27.setVisible(false);

        hotelName.setVisible(false);
        premiumHotelCoxs.setVisible(false);
        premiumHotelSylhet.setVisible(false);
        premiumHotelRangamati.setVisible(false);
        premiumHotelDubai.setVisible(false);
        premiumHotelSajek.setVisible(false);
        premiumHotelParis.setVisible(false);
        premiumHotelIndia.setVisible(false);
        nonpremiumHotelCoxs.setVisible(false);
        nonpremiumHotelSylhet.setVisible(false);
        nonpremiumHotelIndia.setVisible(false);
        nonpremiumHotelRangamati.setVisible(false);
        nonpremiumHotelDubai.setVisible(false);
        nonpremiumHotelSajek.setVisible(false);
        nonpremiumHotelParis.setVisible(false);
        jLabel23.setVisible(false);

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (international.isSelected()) {
            opt = "international";

            place.setVisible(true);
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
        hotelType.setVisible(false);
        jLabel27.setVisible(false);

        hotelName.setVisible(false);
        premiumHotelCoxs.setVisible(false);
        premiumHotelSylhet.setVisible(false);
        premiumHotelRangamati.setVisible(false);
        premiumHotelDubai.setVisible(false);
        premiumHotelSajek.setVisible(false);
        premiumHotelParis.setVisible(false);
        premiumHotelIndia.setVisible(false);
        nonpremiumHotelCoxs.setVisible(false);
        nonpremiumHotelSylhet.setVisible(false);
        nonpremiumHotelIndia.setVisible(false);
        nonpremiumHotelRangamati.setVisible(false);
        nonpremiumHotelDubai.setVisible(false);
        nonpremiumHotelSajek.setVisible(false);
        nonpremiumHotelParis.setVisible(false);
        jLabel23.setVisible(false);

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

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

    private void hotelTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelTypeActionPerformed
        opt3 = (String) hotelType.getSelectedItem();

        hotelName.setVisible(false);
        premiumHotelCoxs.setVisible(false);
        premiumHotelSylhet.setVisible(false);
        premiumHotelRangamati.setVisible(false);
        premiumHotelDubai.setVisible(false);
        premiumHotelSajek.setVisible(false);
        premiumHotelParis.setVisible(false);
        premiumHotelIndia.setVisible(false);
        nonpremiumHotelCoxs.setVisible(false);
        nonpremiumHotelSylhet.setVisible(false);
        nonpremiumHotelIndia.setVisible(false);
        nonpremiumHotelRangamati.setVisible(false);
        nonpremiumHotelDubai.setVisible(false);
        nonpremiumHotelSajek.setVisible(false);
        nonpremiumHotelParis.setVisible(false);
        jLabel23.setVisible(false);

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("premium")) {
            hotelName.setVisible(true);
            if (opt.equalsIgnoreCase("cox's bazar")) {
                premiumHotelCoxs.setVisible(true);
            } else if (opt.equalsIgnoreCase("sylhet")) {
                premiumHotelSylhet.setVisible(true);
            } else if (opt.equalsIgnoreCase("rangamati")) {
                premiumHotelRangamati.setVisible(true);
            } else if (opt.equalsIgnoreCase("sajek")) {
                premiumHotelSajek.setVisible(true);
            } else if (opt.equalsIgnoreCase("india")) {
                premiumHotelIndia.setVisible(true);
            } else if (opt.equalsIgnoreCase("dubai")) {
                premiumHotelDubai.setVisible(true);
            } else if (opt.equalsIgnoreCase("paris")) {
                premiumHotelParis.setVisible(true);
            }
            jLabel23.setVisible(true);

        } else if (opt3.equalsIgnoreCase("non-premium")) {
            hotelName.setVisible(true);
            if (opt.equalsIgnoreCase("cox's bazar")) {
                nonpremiumHotelCoxs.setVisible(true);
            } else if (opt.equalsIgnoreCase("sylhet")) {
                nonpremiumHotelSylhet.setVisible(true);
            } else if (opt.equalsIgnoreCase("rangamati")) {
                nonpremiumHotelRangamati.setVisible(true);
            } else if (opt.equalsIgnoreCase("sajek")) {
                nonpremiumHotelSajek.setVisible(true);
            } else if (opt.equalsIgnoreCase("india")) {
                nonpremiumHotelIndia.setVisible(true);
            } else if (opt.equalsIgnoreCase("dubai")) {
                nonpremiumHotelDubai.setVisible(true);
            } else if (opt.equalsIgnoreCase("paris")) {
                nonpremiumHotelParis.setVisible(true);
            }
            jLabel23.setVisible(true);
        }
    }//GEN-LAST:event_hotelTypeActionPerformed

    private void premiumHotelCoxsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumHotelCoxsActionPerformed
        opt3 = (String) premiumHotelCoxs.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Blu-Radisson Bay - 10,678 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);
            
            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 10678;
        } else if (opt3.equalsIgnoreCase("Western Alliance - 6,100 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);
            
            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 6100;
        } else {

        }
    }//GEN-LAST:event_premiumHotelCoxsActionPerformed

    private void dayNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayNumActionPerformed

    }//GEN-LAST:event_dayNumActionPerformed

    private void dayNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dayNumKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_dayNumKeyTyped

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new UserDashboardBookTrip2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try {
            price = price * (double) ((Integer.parseInt(dayNum.getText() + Integer.parseInt(nightNum.getText()) * Integer.parseInt(personNum.getText()))));
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
                fw.append("hotel\t\t/ ");
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
                new UserDashboardBookTrip2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
                dispose();
            } catch (IOException e) {
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter Person/Day/Night number!", "Error!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        type.setVisible(false);
        hotelType.setVisible(false);
        jLabel27.setVisible(false);

        hotelName.setVisible(false);
        premiumHotelCoxs.setVisible(false);
        premiumHotelSylhet.setVisible(false);
        premiumHotelRangamati.setVisible(false);
        premiumHotelDubai.setVisible(false);
        premiumHotelSajek.setVisible(false);
        premiumHotelParis.setVisible(false);
        premiumHotelIndia.setVisible(false);
        nonpremiumHotelCoxs.setVisible(false);
        nonpremiumHotelSylhet.setVisible(false);
        nonpremiumHotelIndia.setVisible(false);
        nonpremiumHotelRangamati.setVisible(false);
        nonpremiumHotelDubai.setVisible(false);
        nonpremiumHotelSajek.setVisible(false);
        nonpremiumHotelParis.setVisible(false);
        jLabel23.setVisible(false);

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

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
            hotelType.setVisible(true);
            jLabel27.setVisible(true);

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void premiumHotelSylhetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumHotelSylhetActionPerformed
        opt3 = (String) premiumHotelSylhet.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Nazimgar Resort - 12,100 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 12100;
        } else if (opt3.equalsIgnoreCase("Grand Sylhet Resort - 6,500 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 6500;
        } else {

        }
    }//GEN-LAST:event_premiumHotelSylhetActionPerformed

    private void premiumHotelRangamatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumHotelRangamatiActionPerformed
        opt3 = (String) premiumHotelRangamati.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Grand Shanghai Resort - 7,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 7000;
        } else if (opt3.equalsIgnoreCase("Hotel South Hint - 6,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 6000;
        } else {
        }
    }//GEN-LAST:event_premiumHotelRangamatiActionPerformed

    private void premiumHotelSajekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumHotelSajekActionPerformed
        opt3 = (String) premiumHotelSajek.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Echo Resort - 8,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 8000;
        } else if (opt3.equalsIgnoreCase("Cloud Jumper Resort - 6,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 6000;
        } else {
        }
    }//GEN-LAST:event_premiumHotelSajekActionPerformed

    private void premiumHotelIndiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumHotelIndiaActionPerformed
        opt3 = (String) premiumHotelIndia.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("ITC Royal - 12,640 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 12640;
        } else if (opt3.equalsIgnoreCase("Hyatt Regency - 11,380 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 11380;
        } else {

        }
    }//GEN-LAST:event_premiumHotelIndiaActionPerformed

    private void premiumHotelDubaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumHotelDubaiActionPerformed
        opt3 = (String) premiumHotelDubai.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Hilton Dubai - 24,130 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 24130;
        } else if (opt3.equalsIgnoreCase("Grand Hyatt - 25,630 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 25630;
        } else {
        }
    }//GEN-LAST:event_premiumHotelDubaiActionPerformed

    private void premiumHotelParisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumHotelParisActionPerformed
        opt3 = (String) premiumHotelParis.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Le Grand Intercontinental Paris - 45,780 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 45780;
        } else if (opt3.equalsIgnoreCase("Novotel Paris - 29,400 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 29400;
        } else {
        }
    }//GEN-LAST:event_premiumHotelParisActionPerformed

    private void nonpremiumHotelCoxsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumHotelCoxsActionPerformed
        opt3 = (String) nonpremiumHotelCoxs.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Hotel Saint-Martin - 5,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 5000;
        } else if (opt3.equalsIgnoreCase("Hotel Asia - 3,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 3000;
        } else {
        }
    }//GEN-LAST:event_nonpremiumHotelCoxsActionPerformed

    private void internationalLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internationalLocationActionPerformed
        opt = (String) internationalLocation.getSelectedItem();

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        hotelType.setVisible(false);
        jLabel27.setVisible(false);

        hotelName.setVisible(false);
        premiumHotelCoxs.setVisible(false);
        premiumHotelSylhet.setVisible(false);
        premiumHotelRangamati.setVisible(false);
        premiumHotelDubai.setVisible(false);
        premiumHotelSajek.setVisible(false);
        premiumHotelParis.setVisible(false);
        premiumHotelIndia.setVisible(false);
        nonpremiumHotelCoxs.setVisible(false);
        nonpremiumHotelSylhet.setVisible(false);
        nonpremiumHotelIndia.setVisible(false);
        nonpremiumHotelRangamati.setVisible(false);
        nonpremiumHotelDubai.setVisible(false);
        nonpremiumHotelSajek.setVisible(false);
        nonpremiumHotelParis.setVisible(false);
        jLabel23.setVisible(false);

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

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

    private void transportationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transportationMouseClicked
        new UserDashboardBookTrip1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_transportationMouseClicked

    private void hotelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotelsMouseClicked
        local.setVisible(true);
        international.setVisible(true);

        place.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        bookDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        hotelType.setVisible(false);
        jLabel27.setVisible(false);

        hotelName.setVisible(false);
        premiumHotelCoxs.setVisible(false);
        premiumHotelSylhet.setVisible(false);
        premiumHotelRangamati.setVisible(false);
        premiumHotelDubai.setVisible(false);
        premiumHotelSajek.setVisible(false);
        premiumHotelParis.setVisible(false);
        premiumHotelIndia.setVisible(false);
        nonpremiumHotelCoxs.setVisible(false);
        nonpremiumHotelSylhet.setVisible(false);
        nonpremiumHotelIndia.setVisible(false);
        nonpremiumHotelRangamati.setVisible(false);
        nonpremiumHotelDubai.setVisible(false);
        nonpremiumHotelSajek.setVisible(false);
        nonpremiumHotelParis.setVisible(false);
        jLabel23.setVisible(false);

        day.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);
    }//GEN-LAST:event_hotelsMouseClicked

    private void personNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personNumActionPerformed

    }//GEN-LAST:event_personNumActionPerformed

    private void personNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_personNumKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_personNumKeyTyped

    private void nightNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nightNumActionPerformed

    }//GEN-LAST:event_nightNumActionPerformed

    private void nightNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nightNumKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_nightNumKeyTyped

    private void nonpremiumHotelSajekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumHotelSajekActionPerformed
        opt3 = (String) nonpremiumHotelSajek.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Sajek Cottage And Resort - 3,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 3000;
        } else if (opt3.equalsIgnoreCase("TGB Cottage - 3,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 3000;
        } else {
        }
    }//GEN-LAST:event_nonpremiumHotelSajekActionPerformed

    private void nonpremiumHotelIndiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumHotelIndiaActionPerformed
        opt3 = (String) nonpremiumHotelIndia.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Alt Air - 9,560 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 9560;
        } else if (opt3.equalsIgnoreCase("The Sonnet - 9,220 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 9220;
        } else {
        }
    }//GEN-LAST:event_nonpremiumHotelIndiaActionPerformed

    private void nonpremiumHotelRangamatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumHotelRangamatiActionPerformed
        opt3 = (String) nonpremiumHotelRangamati.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Holiday Resort - 3,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 3000;
        } else if (opt3.equalsIgnoreCase("Lake View Resort - 3,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 3000;
        } else {
        }
    }//GEN-LAST:event_nonpremiumHotelRangamatiActionPerformed

    private void nonpremiumHotelParisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumHotelParisActionPerformed
        opt3 = (String) nonpremiumHotelParis.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Passy Eiffel - 20,400 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 20400;
        } else if (opt3.equalsIgnoreCase("Citadines Tour Eiffel Paris - 19,530 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 19530;
        } else {
        }
    }//GEN-LAST:event_nonpremiumHotelParisActionPerformed

    private void nonpremiumHotelDubaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumHotelDubaiActionPerformed
        opt3 = (String) nonpremiumHotelDubai.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Mercure Dubai Barsha - 9,770 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 9770;
        } else if (opt3.equalsIgnoreCase("Emirates Grand - 7,980 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 7980;
        } else {
        }
    }//GEN-LAST:event_nonpremiumHotelDubaiActionPerformed

    private void nonpremiumHotelSylhetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonpremiumHotelSylhetActionPerformed
        opt3 = (String) nonpremiumHotelSylhet.getSelectedItem();

        day.setVisible(false);
        dayNum.setVisible(false);
        dayNum.setText("");
        night.setVisible(false);
        nightNum.setVisible(false);
        nightNum.setText("");
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Rose View Hotel - 4,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 4000;
        } else if (opt3.equalsIgnoreCase("Hotel East - 3,000 BDT per day/night")) {
            day.setVisible(true);
            dayNum.setVisible(true);
            night.setVisible(true);
            nightNum.setVisible(true);
            jLabel26.setVisible(true);

            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            cancel.setVisible(true);
            confirm.setVisible(true);

            price = 3000;
        } else {
        }
    }//GEN-LAST:event_nonpremiumHotelSylhetActionPerformed

    private void tourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tourMouseClicked
        new UserDashboardBookTrip3(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_tourMouseClicked

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
            java.util.logging.Logger.getLogger(UserDashboardBookTrip2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboardBookTrip2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboardBookTrip2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboardBookTrip2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboardBookTrip2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookDate;
    private javax.swing.JLabel bookTrip2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel day;
    private javax.swing.JTextField dayNum;
    private javax.swing.JLabel hotelName;
    private javax.swing.JComboBox<String> hotelType;
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
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JLabel night;
    private javax.swing.JTextField nightNum;
    private javax.swing.JComboBox<String> nonpremiumHotelCoxs;
    private javax.swing.JComboBox<String> nonpremiumHotelDubai;
    private javax.swing.JComboBox<String> nonpremiumHotelIndia;
    private javax.swing.JComboBox<String> nonpremiumHotelParis;
    private javax.swing.JComboBox<String> nonpremiumHotelRangamati;
    private javax.swing.JComboBox<String> nonpremiumHotelSajek;
    private javax.swing.JComboBox<String> nonpremiumHotelSylhet;
    private javax.swing.JLabel person;
    private javax.swing.JTextField personNum;
    private javax.swing.JLabel place;
    private javax.swing.JComboBox<String> premiumHotelCoxs;
    private javax.swing.JComboBox<String> premiumHotelDubai;
    private javax.swing.JComboBox<String> premiumHotelIndia;
    private javax.swing.JComboBox<String> premiumHotelParis;
    private javax.swing.JComboBox<String> premiumHotelRangamati;
    private javax.swing.JComboBox<String> premiumHotelSajek;
    private javax.swing.JComboBox<String> premiumHotelSylhet;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel tour;
    private javax.swing.JLabel transportation;
    private javax.swing.JPanel transportationLocal;
    private javax.swing.JLabel travelInfo;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
