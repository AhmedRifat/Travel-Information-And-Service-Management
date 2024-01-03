package travelinformationandservicemanagement;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UserDashboardBookTrip1 extends javax.swing.JFrame {

    private ImageIcon icon;
    private String username, password, firstName, lastName, nid, phoneNo, passport, email, gender;

    String opt = "", opt2 = "", opt3 = "";
    String date = "", rDate = "";
    double price = 0;

    public UserDashboardBookTrip1() {
        initComponents();

        icon = new ImageIcon(getClass().getResource("/assets/4153125-02.png"));
        this.setIconImage(icon.getImage());

        Date date = new Date();
        jDateChooser1.setMinSelectableDate(date);
        jDateChooser2.setMinSelectableDate(date);

        local.setVisible(true);
        international.setVisible(true);

        destination.setVisible(false);
        from.setVisible(false);
        dhaka.setVisible(false);
        to.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        medium.setVisible(false);
        bus.setVisible(false);
        plane.setVisible(false);
        jLabel15.setVisible(false);

        journeyDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        busType.setVisible(false);
        planeType.setVisible(false);
        jLabel27.setVisible(false);

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jLabel19.setVisible(true);
    }

    public UserDashboardBookTrip1(String username, String password, String email, String firstName, String lastName, String gender, String phoneNo, String nid, String passport) {
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
        jDateChooser2.setMinSelectableDate(date);

        local.setVisible(true);
        international.setVisible(true);

        destination.setVisible(false);
        from.setVisible(false);
        dhaka.setVisible(false);
        to.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        medium.setVisible(false);
        bus.setVisible(false);
        plane.setVisible(false);
        jLabel15.setVisible(false);

        journeyDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        busType.setVisible(false);
        planeType.setVisible(false);
        jLabel27.setVisible(false);

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jLabel19.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
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
        jLabel17 = new javax.swing.JLabel();
        local = new javax.swing.JRadioButton();
        international = new javax.swing.JRadioButton();
        transportationLocal = new javax.swing.JPanel();
        destination = new javax.swing.JLabel();
        from = new javax.swing.JLabel();
        dhaka = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        localLocation = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        medium = new javax.swing.JLabel();
        bus = new javax.swing.JRadioButton();
        plane = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        journeyDate = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        busType = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        busName = new javax.swing.JLabel();
        acBusCoxs = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        tripType = new javax.swing.JLabel();
        roundWay = new javax.swing.JRadioButton();
        oneWay = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        person = new javax.swing.JLabel();
        personNum = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        returnDate = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        nonacBusCoxs = new javax.swing.JComboBox<>();
        acBusSylhet = new javax.swing.JComboBox<>();
        acBusRangamati = new javax.swing.JComboBox<>();
        acBusSajek = new javax.swing.JComboBox<>();
        nonacBusSylhet = new javax.swing.JComboBox<>();
        nonacBusRangamati = new javax.swing.JComboBox<>();
        nonacBusSajek = new javax.swing.JComboBox<>();
        planeType = new javax.swing.JComboBox<>();
        planeName = new javax.swing.JLabel();
        ecoPlaneCoxs = new javax.swing.JComboBox<>();
        ecoPlaneSylhet = new javax.swing.JComboBox<>();
        ecoPlaneSajek = new javax.swing.JComboBox<>();
        busiPlaneCoxs = new javax.swing.JComboBox<>();
        busiPlaneSylhet = new javax.swing.JComboBox<>();
        busiPlaneSajek = new javax.swing.JComboBox<>();
        internationalLocation = new javax.swing.JComboBox<>();
        ecoPlaneIndia = new javax.swing.JComboBox<>();
        ecoPlaneDubai = new javax.swing.JComboBox<>();
        ecoPlaneParis = new javax.swing.JComboBox<>();
        busiPlaneIndia = new javax.swing.JComboBox<>();
        busiPlaneDubai = new javax.swing.JComboBox<>();
        busiPlaneParis = new javax.swing.JComboBox<>();
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

        bookTrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/book-trip-select.png"))); // NOI18N
        bookTrip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookTrip.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jLabel1.setText("Book Trip");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 39, 76));
        jLabel2.setText("Book for required travel destination");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 280, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow-left.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, 35));

        buttonGroup1.add(local);
        local.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        local.setForeground(new java.awt.Color(51, 51, 51));
        local.setText("Local");
        local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localActionPerformed(evt);
            }
        });
        jPanel4.add(local, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 60, -1));

        buttonGroup1.add(international);
        international.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        international.setForeground(new java.awt.Color(51, 51, 51));
        international.setText("International");
        international.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internationalActionPerformed(evt);
            }
        });
        jPanel4.add(international, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 110, -1));

        transportationLocal.setBackground(new java.awt.Color(255, 255, 255));
        transportationLocal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        destination.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        destination.setForeground(new java.awt.Color(30, 39, 76));
        destination.setText("Destination");
        transportationLocal.add(destination, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 80, 30));

        from.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        from.setForeground(new java.awt.Color(51, 51, 51));
        from.setText("From");
        transportationLocal.add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 40, 30));

        dhaka.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        dhaka.setForeground(new java.awt.Color(30, 39, 76));
        dhaka.setText("Dhaka");
        transportationLocal.add(dhaka, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 60, 30));

        to.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        to.setForeground(new java.awt.Color(51, 51, 51));
        to.setText("To");
        transportationLocal.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 20, 30));

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

        medium.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        medium.setForeground(new java.awt.Color(30, 39, 76));
        medium.setText("Medium");
        transportationLocal.add(medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 80, 30));

        buttonGroup2.add(bus);
        bus.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        bus.setForeground(new java.awt.Color(51, 51, 51));
        bus.setText("Bus");
        bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busActionPerformed(evt);
            }
        });
        transportationLocal.add(bus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        buttonGroup2.add(plane);
        plane.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        plane.setForeground(new java.awt.Color(51, 51, 51));
        plane.setText("Plane");
        plane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planeActionPerformed(evt);
            }
        });
        transportationLocal.add(plane, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 610, -1));

        journeyDate.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        journeyDate.setForeground(new java.awt.Color(30, 39, 76));
        journeyDate.setText("Journey Date");
        transportationLocal.add(journeyDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 90, 30));

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

        busType.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        busType.setForeground(new java.awt.Color(30, 39, 76));
        busType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "AC", "Non-AC" }));
        busType.setToolTipText("");
        busType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busTypeActionPerformed(evt);
            }
        });
        transportationLocal.add(busType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, -1));

        jLabel27.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 102, 102));
        jLabel27.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 610, -1));

        busName.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        busName.setForeground(new java.awt.Color(30, 39, 76));
        busName.setText("Bus ");
        transportationLocal.add(busName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, 30));

        acBusCoxs.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        acBusCoxs.setForeground(new java.awt.Color(30, 39, 76));
        acBusCoxs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Shohag - 400 BDT", "Hanif - 400 BDT", "Ena - 400 BDT" }));
        acBusCoxs.setToolTipText("");
        acBusCoxs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acBusCoxsActionPerformed(evt);
            }
        });
        transportationLocal.add(acBusCoxs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        jLabel23.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 610, -1));

        tripType.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        tripType.setForeground(new java.awt.Color(30, 39, 76));
        tripType.setText("Trip Type");
        transportationLocal.add(tripType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 90, 30));

        buttonGroup3.add(roundWay);
        roundWay.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        roundWay.setForeground(new java.awt.Color(51, 51, 51));
        roundWay.setText("Round Way");
        roundWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundWayActionPerformed(evt);
            }
        });
        transportationLocal.add(roundWay, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 100, -1));

        buttonGroup3.add(oneWay);
        oneWay.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        oneWay.setForeground(new java.awt.Color(51, 51, 51));
        oneWay.setText("One Way");
        oneWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneWayActionPerformed(evt);
            }
        });
        transportationLocal.add(oneWay, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel26.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 610, -1));

        person.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        person.setForeground(new java.awt.Color(30, 39, 76));
        person.setText("Person");
        transportationLocal.add(person, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 30));

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

        returnDate.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        returnDate.setForeground(new java.awt.Color(30, 39, 76));
        returnDate.setText("Return Date");
        transportationLocal.add(returnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 30));

        jDateChooser2.setMinSelectableDate(new java.util.Date(-62135701135000L));
        transportationLocal.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, 30));

        jButton2.setText("Ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        transportationLocal.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 50, 30));

        jLabel24.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("_________________________________________________________________________________________________________________________");
        transportationLocal.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 610, -1));

        nonacBusCoxs.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonacBusCoxs.setForeground(new java.awt.Color(30, 39, 76));
        nonacBusCoxs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Shohag - 300 BDT", "Hanif - 300 BDT", "Ena - 300 BDT" }));
        nonacBusCoxs.setToolTipText("");
        nonacBusCoxs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonacBusCoxsActionPerformed(evt);
            }
        });
        transportationLocal.add(nonacBusCoxs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        acBusSylhet.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        acBusSylhet.setForeground(new java.awt.Color(30, 39, 76));
        acBusSylhet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Shohag - 500 BDT", "Hanif - 600 BDT", "Ena - 400 BDT" }));
        acBusSylhet.setToolTipText("");
        acBusSylhet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acBusSylhetActionPerformed(evt);
            }
        });
        transportationLocal.add(acBusSylhet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        acBusRangamati.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        acBusRangamati.setForeground(new java.awt.Color(30, 39, 76));
        acBusRangamati.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Shohag - 550 BDT", "Hanif - 650 BDT", "Ena - 400 BDT" }));
        acBusRangamati.setToolTipText("");
        acBusRangamati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acBusRangamatiActionPerformed(evt);
            }
        });
        transportationLocal.add(acBusRangamati, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        acBusSajek.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        acBusSajek.setForeground(new java.awt.Color(30, 39, 76));
        acBusSajek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Shohag - 550 BDT", "Hanif - 650 BDT", "Ena - 400 BDT" }));
        acBusSajek.setToolTipText("");
        acBusSajek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acBusSajekActionPerformed(evt);
            }
        });
        transportationLocal.add(acBusSajek, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        nonacBusSylhet.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonacBusSylhet.setForeground(new java.awt.Color(30, 39, 76));
        nonacBusSylhet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Shohag - 400 BDT", "Hanif - 500 BDT", "Ena - 300 BDT" }));
        nonacBusSylhet.setToolTipText("");
        nonacBusSylhet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonacBusSylhetActionPerformed(evt);
            }
        });
        transportationLocal.add(nonacBusSylhet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        nonacBusRangamati.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonacBusRangamati.setForeground(new java.awt.Color(30, 39, 76));
        nonacBusRangamati.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Shohag - 450 BDT", "Hanif - 560 BDT", "Ena - 320 BDT" }));
        nonacBusRangamati.setToolTipText("");
        nonacBusRangamati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonacBusRangamatiActionPerformed(evt);
            }
        });
        transportationLocal.add(nonacBusRangamati, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        nonacBusSajek.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        nonacBusSajek.setForeground(new java.awt.Color(30, 39, 76));
        nonacBusSajek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Shohag - 450 BDT", "Hanif - 550 BDT", "Ena - 320 BDT" }));
        nonacBusSajek.setToolTipText("");
        nonacBusSajek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonacBusSajekActionPerformed(evt);
            }
        });
        transportationLocal.add(nonacBusSajek, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        planeType.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        planeType.setForeground(new java.awt.Color(30, 39, 76));
        planeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Economy", "Business" }));
        planeType.setToolTipText("");
        planeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planeTypeActionPerformed(evt);
            }
        });
        transportationLocal.add(planeType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 130, -1));

        planeName.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        planeName.setForeground(new java.awt.Color(30, 39, 76));
        planeName.setText("Plane");
        transportationLocal.add(planeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, 30));

        ecoPlaneCoxs.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        ecoPlaneCoxs.setForeground(new java.awt.Color(30, 39, 76));
        ecoPlaneCoxs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Biman BD - 4000 BDT" }));
        ecoPlaneCoxs.setToolTipText("");
        ecoPlaneCoxs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoPlaneCoxsActionPerformed(evt);
            }
        });
        transportationLocal.add(ecoPlaneCoxs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        ecoPlaneSylhet.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        ecoPlaneSylhet.setForeground(new java.awt.Color(30, 39, 76));
        ecoPlaneSylhet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Biman BD - 3200 BDT" }));
        ecoPlaneSylhet.setToolTipText("");
        ecoPlaneSylhet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoPlaneSylhetActionPerformed(evt);
            }
        });
        transportationLocal.add(ecoPlaneSylhet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        ecoPlaneSajek.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        ecoPlaneSajek.setForeground(new java.awt.Color(30, 39, 76));
        ecoPlaneSajek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Biman BD - 4000 BDT" }));
        ecoPlaneSajek.setToolTipText("");
        ecoPlaneSajek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoPlaneSajekActionPerformed(evt);
            }
        });
        transportationLocal.add(ecoPlaneSajek, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        busiPlaneCoxs.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        busiPlaneCoxs.setForeground(new java.awt.Color(30, 39, 76));
        busiPlaneCoxs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Biman BD - 6500 BDT" }));
        busiPlaneCoxs.setToolTipText("");
        busiPlaneCoxs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busiPlaneCoxsActionPerformed(evt);
            }
        });
        transportationLocal.add(busiPlaneCoxs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        busiPlaneSylhet.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        busiPlaneSylhet.setForeground(new java.awt.Color(30, 39, 76));
        busiPlaneSylhet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Biman BD - 6000 BDT" }));
        busiPlaneSylhet.setToolTipText("");
        busiPlaneSylhet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busiPlaneSylhetActionPerformed(evt);
            }
        });
        transportationLocal.add(busiPlaneSylhet, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        busiPlaneSajek.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        busiPlaneSajek.setForeground(new java.awt.Color(30, 39, 76));
        busiPlaneSajek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Biman BD - 6500 BDT" }));
        busiPlaneSajek.setToolTipText("");
        busiPlaneSajek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busiPlaneSajekActionPerformed(evt);
            }
        });
        transportationLocal.add(busiPlaneSajek, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

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

        ecoPlaneIndia.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        ecoPlaneIndia.setForeground(new java.awt.Color(30, 39, 76));
        ecoPlaneIndia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Indigo - 6,800 BDT", "Air India - 6,795 BDT", "BIman BD - 7,100 BDT" }));
        ecoPlaneIndia.setToolTipText("");
        ecoPlaneIndia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoPlaneIndiaActionPerformed(evt);
            }
        });
        transportationLocal.add(ecoPlaneIndia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        ecoPlaneDubai.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        ecoPlaneDubai.setForeground(new java.awt.Color(30, 39, 76));
        ecoPlaneDubai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Arab Emirates - 43,294 BDT", "Fly Dubai - 44,857 BDT", "Biman BD - 37,573 BDT" }));
        ecoPlaneDubai.setToolTipText("");
        ecoPlaneDubai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoPlaneDubaiActionPerformed(evt);
            }
        });
        transportationLocal.add(ecoPlaneDubai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        ecoPlaneParis.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        ecoPlaneParis.setForeground(new java.awt.Color(30, 39, 76));
        ecoPlaneParis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Biman BD - 80,050 BDT", "Indigo - 65,000 BDT", "Jazeera Airways - 57,400 BDT" }));
        ecoPlaneParis.setToolTipText("");
        ecoPlaneParis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecoPlaneParisActionPerformed(evt);
            }
        });
        transportationLocal.add(ecoPlaneParis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        busiPlaneIndia.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        busiPlaneIndia.setForeground(new java.awt.Color(30, 39, 76));
        busiPlaneIndia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Indigo - 7,500 BDT", "Air India - 7,500 BDT", "Biman BD - 8,000 BDT" }));
        busiPlaneIndia.setToolTipText("");
        busiPlaneIndia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busiPlaneIndiaActionPerformed(evt);
            }
        });
        transportationLocal.add(busiPlaneIndia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        busiPlaneDubai.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        busiPlaneDubai.setForeground(new java.awt.Color(30, 39, 76));
        busiPlaneDubai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Arab Emirates - 48,294 BDT", "Fly Dubai - 49,857 BDT", "Biman BD - 42,573 BDT" }));
        busiPlaneDubai.setToolTipText("");
        busiPlaneDubai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busiPlaneDubaiActionPerformed(evt);
            }
        });
        transportationLocal.add(busiPlaneDubai, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        busiPlaneParis.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        busiPlaneParis.setForeground(new java.awt.Color(30, 39, 76));
        busiPlaneParis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One", "Biman BD - 84,200 BDT", "Indigo - 70,045 BDT", "Jazeera Airways - 61,800 BDT" }));
        busiPlaneParis.setToolTipText("");
        busiPlaneParis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busiPlaneParisActionPerformed(evt);
            }
        });
        transportationLocal.add(busiPlaneParis, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 240, -1));

        jPanel4.add(transportationLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 690, 300));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tour.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 20, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/transportation.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 20, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hotel.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 20, 30));

        tour.setFont(new java.awt.Font("Lovelo Black", 0, 14)); // NOI18N
        tour.setForeground(new java.awt.Color(30, 39, 76));
        tour.setText("Tour");
        tour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tourMouseClicked(evt);
            }
        });
        jPanel4.add(tour, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 60, 30));

        transportation.setFont(new java.awt.Font("Lovelo Black", 0, 14)); // NOI18N
        transportation.setForeground(new java.awt.Color(30, 39, 76));
        transportation.setText("Transportation");
        transportation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transportation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transportationMouseClicked(evt);
            }
        });
        jPanel4.add(transportation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, 30));

        hotels.setFont(new java.awt.Font("Lovelo Black", 0, 14)); // NOI18N
        hotels.setForeground(new java.awt.Color(30, 39, 76));
        hotels.setText("Hotels");
        hotels.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hotels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotelsMouseClicked(evt);
            }
        });
        jPanel4.add(hotels, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 60, 30));

        jLabel14.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("_______________");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 100, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("_________________");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 110, -1));

        jLabel19.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("_______________________________");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, -1));

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

    }//GEN-LAST:event_bookTripMouseEntered

    private void bookTripMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTripMouseExited

    }//GEN-LAST:event_bookTripMouseExited

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

    private void travelInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelInfoMouseClicked
        new UserDashboardTravelInfo1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_travelInfoMouseClicked

    private void localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localActionPerformed
        destination.setVisible(false);
        from.setVisible(false);
        dhaka.setVisible(false);
        to.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        medium.setVisible(false);
        bus.setVisible(false);
        plane.setVisible(false);
        jLabel15.setVisible(false);

        journeyDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        busType.setVisible(false);
        jLabel27.setVisible(false);

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (local.isSelected()) {
            destination.setVisible(true);
            from.setVisible(true);
            dhaka.setVisible(true);
            to.setVisible(true);
            localLocation.setVisible(true);
            jLabel20.setVisible(true);
        }
    }//GEN-LAST:event_localActionPerformed

    private void internationalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internationalActionPerformed
        destination.setVisible(false);
        from.setVisible(false);
        dhaka.setVisible(false);
        to.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        medium.setVisible(false);
        bus.setVisible(false);
        plane.setVisible(false);
        jLabel15.setVisible(false);

        journeyDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        busType.setVisible(false);
        planeType.setVisible(false);
        jLabel27.setVisible(false);

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (international.isSelected()) {
            opt = "international";

            destination.setVisible(true);
            from.setVisible(true);
            dhaka.setVisible(true);
            to.setVisible(true);
            internationalLocation.setVisible(true);
            jLabel20.setVisible(true);
        }
    }//GEN-LAST:event_internationalActionPerformed

    private void acBusCoxsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acBusCoxsActionPerformed
        opt3 = (String) acBusCoxs.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Shohag - 400 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 400;
        } else if (opt3.equalsIgnoreCase("Hanif - 400 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 400;
        } else if (opt3.equalsIgnoreCase("Ena - 400 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 400;
        } else {

        }
    }//GEN-LAST:event_acBusCoxsActionPerformed

    private void planeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planeActionPerformed
        type.setVisible(false);
        busType.setVisible(false);
        planeType.setVisible(false);
        jLabel27.setVisible(false);

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (plane.isSelected()) {
            opt2 = "plane";

            journeyDate.setVisible(true);
            jDateChooser1.setVisible(true);
            jButton1.setVisible(true);
            jLabel22.setVisible(true);

        }
    }//GEN-LAST:event_planeActionPerformed

    private void localLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localLocationActionPerformed
        opt = (String) localLocation.getSelectedItem();

        medium.setVisible(false);
        bus.setVisible(false);
        plane.setVisible(false);
        jLabel15.setVisible(false);

        journeyDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        busType.setVisible(false);
        planeType.setVisible(false);
        jLabel27.setVisible(false);

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt.equalsIgnoreCase("cox's bazar")) {
            medium.setVisible(true);
            bus.setVisible(true);
            plane.setVisible(true);
            jLabel15.setVisible(true);
        } else if (opt.equalsIgnoreCase("sylhet")) {
            medium.setVisible(true);
            bus.setVisible(true);
            plane.setVisible(true);
            jLabel15.setVisible(true);
        } else if (opt.equalsIgnoreCase("rangamati")) {
            medium.setVisible(true);
            bus.setVisible(true);
            jLabel15.setVisible(true);
        } else if (opt.equalsIgnoreCase("sajek")) {
            medium.setVisible(true);
            bus.setVisible(true);
            plane.setVisible(true);
            jLabel15.setVisible(true);
        }
    }//GEN-LAST:event_localLocationActionPerformed

    private void busTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busTypeActionPerformed
        opt3 = (String) busType.getSelectedItem();

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("AC")) {
            busName.setVisible(true);
            if (opt.equalsIgnoreCase("cox's bazar")) {
                acBusCoxs.setVisible(true);
            } else if (opt.equalsIgnoreCase("sylhet")) {
                acBusSylhet.setVisible(true);
            } else if (opt.equalsIgnoreCase("rangamati")) {
                acBusSylhet.setVisible(true);
            } else if (opt.equalsIgnoreCase("sajek")) {
                acBusSylhet.setVisible(true);
            }
            jLabel23.setVisible(true);

        } else if (opt3.equalsIgnoreCase("Non-AC")) {
            busName.setVisible(true);
            if (opt.equalsIgnoreCase("cox's bazar")) {
                nonacBusCoxs.setVisible(true);
            } else if (opt.equalsIgnoreCase("sylhet")) {
                nonacBusSylhet.setVisible(true);
            } else if (opt.equalsIgnoreCase("rangamati")) {
                nonacBusSylhet.setVisible(true);
            } else if (opt.equalsIgnoreCase("sajek")) {
                nonacBusSylhet.setVisible(true);
            }
            jLabel23.setVisible(true);

        }
    }//GEN-LAST:event_busTypeActionPerformed

    private void roundWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundWayActionPerformed
        if (roundWay.isSelected()) {
            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            returnDate.setVisible(true);
            jDateChooser2.setVisible(true);
            jButton2.setVisible(true);
            jLabel24.setVisible(true);

            cancel.setVisible(false);
            confirm.setVisible(false);

            opt3 = "round";
        }
    }//GEN-LAST:event_roundWayActionPerformed

    private void oneWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneWayActionPerformed
        if (oneWay.isSelected()) {
            person.setVisible(true);
            personNum.setVisible(true);
            jLabel30.setVisible(true);

            returnDate.setVisible(false);
            jDateChooser2.setVisible(false);
            jButton2.setVisible(false);
            jLabel24.setVisible(false);

            cancel.setVisible(true);
            confirm.setVisible(true);

            opt3 = "one";
        }
    }//GEN-LAST:event_oneWayActionPerformed

    private void personNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personNumActionPerformed

    }//GEN-LAST:event_personNumActionPerformed

    private void personNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_personNumKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_personNumKeyTyped

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new UserDashboardBookTrip1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try {
            
            price = price * (double) Integer.parseInt(personNum.getText());
            if (opt3.equals("round")) {
                price = price * 2;
            } else if (opt3.equals("one")) {
            }
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
                fw.append(opt2 + "(" + opt3 + ")" + "\t/ ");
                fw.append(personNum.getText() + "\t/ ");
                fw.append(price + "\t/ ");
                fw.append("pending\t/ ");
                if (opt3.equals("one")) {
                    fw.append(date + "\n");
                }
                if (opt3.equals("round")) {
                    fw.append(date + "," + rDate + "\n");
                }
                fw.close();

                JOptionPane.showMessageDialog(null, "Booked successfully!", "Success", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/assets/done_64px.png")));

                new UserDashboardBookTrip1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
                dispose();
            } catch (IOException e) {
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter Person number!", "Error!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void transportationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transportationMouseClicked
        jLabel19.setVisible(true);
        transportation.setVisible(true);
        local.setVisible(true);
        international.setVisible(true);

        destination.setVisible(false);
        from.setVisible(false);
        dhaka.setVisible(false);
        to.setVisible(false);
        localLocation.setVisible(false);
        internationalLocation.setVisible(false);
        jLabel20.setVisible(false);

        medium.setVisible(false);
        bus.setVisible(false);
        plane.setVisible(false);
        jLabel15.setVisible(false);

        journeyDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        busType.setVisible(false);
        planeType.setVisible(false);
        jLabel27.setVisible(false);

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

    }//GEN-LAST:event_transportationMouseClicked

    private void busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busActionPerformed
        type.setVisible(false);
        busType.setVisible(false);
        planeType.setVisible(false);
        jLabel27.setVisible(false);

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (bus.isSelected()) {
            opt2 = "bus";

            journeyDate.setVisible(true);
            jDateChooser1.setVisible(true);
            jButton1.setVisible(true);
            jLabel22.setVisible(true);
        }
    }//GEN-LAST:event_busActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        type.setVisible(false);
        busType.setVisible(false);
        jLabel27.setVisible(false);

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            date = sdf.format(jDateChooser1.getDate());

            type.setVisible(true);
            if (opt2.equals("bus")) {
                busType.setVisible(true);
            } else if (opt2.equals("plane")) {
                planeType.setVisible(true);
            }
            jLabel27.setVisible(true);

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            rDate = sdf.format(jDateChooser2.getDate());

            // back date 
            String h1[] = rDate.split("-");

            // going date
            String h2[] = date.split("-");

            if (Integer.parseInt(h2[2]) == Integer.parseInt(h1[2])) {
                if (Integer.parseInt(h2[1]) == Integer.parseInt(h1[1])) {
                    if (Integer.parseInt(h1[0]) > Integer.parseInt(h2[0])) {
                        cancel.setVisible(true);
                        confirm.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Select Correct Date!", "Error!", JOptionPane.WARNING_MESSAGE);
                    }
                } else if (Integer.parseInt(h2[1]) < Integer.parseInt(h1[1])) {
                    cancel.setVisible(true);
                    confirm.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Select Correct Date!", "Error!", JOptionPane.WARNING_MESSAGE);
                }
            } else if (Integer.parseInt(h2[2]) < Integer.parseInt(h1[2])) {
                cancel.setVisible(true);
                confirm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Select Correct Date!", "Error!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nonacBusCoxsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonacBusCoxsActionPerformed
        opt3 = (String) nonacBusCoxs.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Shohag - 300 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 300;
        } else if (opt3.equalsIgnoreCase("Hanif - 300 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 300;
        } else if (opt3.equalsIgnoreCase("Ena - 300 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 300;
        } else {

        }
    }//GEN-LAST:event_nonacBusCoxsActionPerformed

    private void acBusSylhetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acBusSylhetActionPerformed
        opt3 = (String) acBusSylhet.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Shohag - 500 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 500;
        } else if (opt3.equalsIgnoreCase("Hanif - 600 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 600;
        } else if (opt3.equalsIgnoreCase("Ena - 400 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 400;
        } else {
        }
    }//GEN-LAST:event_acBusSylhetActionPerformed

    private void acBusRangamatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acBusRangamatiActionPerformed
        opt3 = (String) acBusRangamati.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Shohag - 550 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 550;
        } else if (opt3.equalsIgnoreCase("Hanif - 650 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 650;
        } else if (opt3.equalsIgnoreCase("Ena - 400 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 400;
        } else {

        }
    }//GEN-LAST:event_acBusRangamatiActionPerformed

    private void acBusSajekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acBusSajekActionPerformed
        opt3 = (String) acBusSajek.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Shohag - 550 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 550;
        } else if (opt3.equalsIgnoreCase("Hanif - 650 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 650;
        } else if (opt3.equalsIgnoreCase("Ena - 400 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 400;
        } else {

        }
    }//GEN-LAST:event_acBusSajekActionPerformed

    private void nonacBusSylhetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonacBusSylhetActionPerformed
        opt3 = (String) nonacBusSylhet.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Shohag - 400 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 400;
        } else if (opt3.equalsIgnoreCase("Hanif - 500 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 500;
        } else if (opt3.equalsIgnoreCase("Ena - 300 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 300;
        } else {

        }
    }//GEN-LAST:event_nonacBusSylhetActionPerformed

    private void nonacBusRangamatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonacBusRangamatiActionPerformed
        opt3 = (String) nonacBusRangamati.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Shohag - 450 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 450;
        } else if (opt3.equalsIgnoreCase("Hanif - 560 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 560;
        } else if (opt3.equalsIgnoreCase("Ena - 320 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 320;
        } else {

        }
    }//GEN-LAST:event_nonacBusRangamatiActionPerformed

    private void nonacBusSajekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonacBusSajekActionPerformed
        opt3 = (String) nonacBusRangamati.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Shohag - 450 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 450;
        } else if (opt3.equalsIgnoreCase("Hanif - 550 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 550;
        } else if (opt3.equalsIgnoreCase("Ena - 320 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 320;
        } else {

        }
    }//GEN-LAST:event_nonacBusSajekActionPerformed

    private void myBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingMouseClicked
        try {
            new UserDashboardMyBooking(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        } catch (Exception ex) {
        }
        dispose();
    }//GEN-LAST:event_myBookingMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        new UserDashboardSettings(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_settingsMouseClicked

    private void planeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planeTypeActionPerformed
        opt3 = (String) planeType.getSelectedItem();

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Economy")) {
            planeName.setVisible(true);
            if (opt.equalsIgnoreCase("cox's bazar")) {
                ecoPlaneCoxs.setVisible(true);
            } else if (opt.equalsIgnoreCase("sylhet")) {
                ecoPlaneSylhet.setVisible(true);
            } else if (opt.equalsIgnoreCase("sajek")) {
                ecoPlaneSajek.setVisible(true);
            } else if (opt.equalsIgnoreCase("india")) {
                ecoPlaneIndia.setVisible(true);
            } else if (opt.equalsIgnoreCase("dubai")) {
                ecoPlaneDubai.setVisible(true);
            } else if (opt.equalsIgnoreCase("paris")) {
                ecoPlaneParis.setVisible(true);
            }
            jLabel23.setVisible(true);

        } else if (opt3.equalsIgnoreCase("Business")) {
            planeName.setVisible(true);
            if (opt.equalsIgnoreCase("cox's bazar")) {
                busiPlaneCoxs.setVisible(true);
            } else if (opt.equalsIgnoreCase("sylhet")) {
                busiPlaneSylhet.setVisible(true);
            } else if (opt.equalsIgnoreCase("sajek")) {
                busiPlaneSajek.setVisible(true);
            } else if (opt.equalsIgnoreCase("india")) {
                busiPlaneIndia.setVisible(true);
            } else if (opt.equalsIgnoreCase("dubai")) {
                busiPlaneDubai.setVisible(true);
            } else if (opt.equalsIgnoreCase("paris")) {
                busiPlaneParis.setVisible(true);
            }
            jLabel23.setVisible(true);

        }
    }//GEN-LAST:event_planeTypeActionPerformed

    private void ecoPlaneCoxsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoPlaneCoxsActionPerformed
        opt3 = (String) ecoPlaneCoxs.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Biman BD - 4000 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 4000;
        } else {
        }
    }//GEN-LAST:event_ecoPlaneCoxsActionPerformed

    private void ecoPlaneSylhetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoPlaneSylhetActionPerformed
        opt3 = (String) ecoPlaneSylhet.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Biman BD - 3200 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 3200;
        } else {
        }
    }//GEN-LAST:event_ecoPlaneSylhetActionPerformed

    private void ecoPlaneSajekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoPlaneSajekActionPerformed
        opt3 = (String) ecoPlaneSajek.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Biman BD - 4000 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 4000;
        } else {
        }
    }//GEN-LAST:event_ecoPlaneSajekActionPerformed

    private void busiPlaneCoxsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busiPlaneCoxsActionPerformed
        opt3 = (String) busiPlaneCoxs.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Biman BD - 6500 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 6500;
        } else {
        }
    }//GEN-LAST:event_busiPlaneCoxsActionPerformed

    private void busiPlaneSylhetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busiPlaneSylhetActionPerformed
        opt3 = (String) busiPlaneSylhet.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Biman BD - 6000 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 6000;
        } else {
        }
    }//GEN-LAST:event_busiPlaneSylhetActionPerformed

    private void busiPlaneSajekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busiPlaneSajekActionPerformed
        opt3 = (String) busiPlaneSajek.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Biman BD - 6500 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 6500;
        } else {
        }
    }//GEN-LAST:event_busiPlaneSajekActionPerformed

    private void internationalLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internationalLocationActionPerformed
        opt = (String) internationalLocation.getSelectedItem();

        medium.setVisible(false);
        bus.setVisible(false);
        plane.setVisible(false);
        jLabel15.setVisible(false);

        journeyDate.setVisible(false);
        jDateChooser1.setVisible(false);
        jButton1.setVisible(false);
        jLabel22.setVisible(false);

        type.setVisible(false);
        busType.setVisible(false);
        planeType.setVisible(false);
        jLabel27.setVisible(false);

        busName.setVisible(false);
        planeName.setVisible(false);
        acBusCoxs.setVisible(false);
        nonacBusCoxs.setVisible(false);
        acBusSylhet.setVisible(false);
        nonacBusSylhet.setVisible(false);
        acBusRangamati.setVisible(false);
        nonacBusRangamati.setVisible(false);
        acBusSajek.setVisible(false);
        nonacBusSajek.setVisible(false);
        ecoPlaneCoxs.setVisible(false);
        busiPlaneCoxs.setVisible(false);
        ecoPlaneSylhet.setVisible(false);
        busiPlaneSylhet.setVisible(false);
        ecoPlaneSajek.setVisible(false);
        busiPlaneSajek.setVisible(false);
        ecoPlaneIndia.setVisible(false);
        ecoPlaneDubai.setVisible(false);
        ecoPlaneParis.setVisible(false);
        busiPlaneIndia.setVisible(false);
        busiPlaneDubai.setVisible(false);
        busiPlaneParis.setVisible(false);
        jLabel23.setVisible(false);

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt.equalsIgnoreCase("india")) {
            medium.setVisible(true);
            plane.setVisible(true);
            jLabel15.setVisible(true);
        } else if (opt.equalsIgnoreCase("dubai")) {
            medium.setVisible(true);
            plane.setVisible(true);
            jLabel15.setVisible(true);
        } else if (opt.equalsIgnoreCase("paris")) {
            medium.setVisible(true);
            plane.setVisible(true);
            jLabel15.setVisible(true);
        }
    }//GEN-LAST:event_internationalLocationActionPerformed

    private void ecoPlaneIndiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoPlaneIndiaActionPerformed
        opt3 = (String) ecoPlaneIndia.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Indigo - 6,800 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 6800;
        } else if (opt3.equalsIgnoreCase("Air India - 6,795 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 6795;
        } else if (opt3.equalsIgnoreCase("Biman BD - 7,100 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 7100;
        } else {
        }
    }//GEN-LAST:event_ecoPlaneIndiaActionPerformed

    private void ecoPlaneDubaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoPlaneDubaiActionPerformed
        opt3 = (String) ecoPlaneDubai.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Arab Emirates - 43,294 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 43294;
        } else if (opt3.equalsIgnoreCase("Fly Dubai - 44,857 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 44857;
        } else if (opt3.equalsIgnoreCase("Biman BD - 37,573 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 37573;
        } else {
        }
    }//GEN-LAST:event_ecoPlaneDubaiActionPerformed

    private void ecoPlaneParisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecoPlaneParisActionPerformed
        opt3 = (String) ecoPlaneParis.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Biman BD - 80,050 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 80050;
        } else if (opt3.equalsIgnoreCase("Indigo - 65,000 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 65000;
        } else if (opt3.equalsIgnoreCase("Jazeera Airways - 57,400 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 57400;
        } else {
        }
    }//GEN-LAST:event_ecoPlaneParisActionPerformed

    private void busiPlaneIndiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busiPlaneIndiaActionPerformed
        opt3 = (String) busiPlaneIndia.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Indigo - 7,500 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 7500;
        } else if (opt3.equalsIgnoreCase("Air India - 7,500 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 7500;
        } else if (opt3.equalsIgnoreCase("Biman BD - 8,000 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 8000;
        } else {
        }
    }//GEN-LAST:event_busiPlaneIndiaActionPerformed

    private void busiPlaneDubaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busiPlaneDubaiActionPerformed
        opt3 = (String) busiPlaneDubai.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Arab Emirates - 48,294 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 48294;
        } else if (opt3.equalsIgnoreCase("Fly Dubai - 49,857 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 49857;
        } else if (opt3.equalsIgnoreCase("Biman BD - 42,573 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 42573;
        } else {
        }
    }//GEN-LAST:event_busiPlaneDubaiActionPerformed

    private void busiPlaneParisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busiPlaneParisActionPerformed
        opt3 = (String) busiPlaneParis.getSelectedItem();

        tripType.setVisible(false);
        roundWay.setVisible(false);
        oneWay.setVisible(false);
        jLabel26.setVisible(false);

        person.setVisible(false);
        personNum.setVisible(false);
        personNum.setText("");
        jLabel30.setVisible(false);

        returnDate.setVisible(false);
        jDateChooser2.setVisible(false);
        jButton2.setVisible(false);
        jLabel24.setVisible(false);

        cancel.setVisible(false);
        confirm.setVisible(false);

        if (opt3.equalsIgnoreCase("Biman BD - 84,200 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 84200;
        } else if (opt3.equalsIgnoreCase("Indigo - 70,045 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 70045;
        } else if (opt3.equalsIgnoreCase("Jazeera Airways - 61,800 BDT")) {
            tripType.setVisible(true);
            roundWay.setVisible(true);
            oneWay.setVisible(true);
            jLabel26.setVisible(true);

            price = 61800;
        } else {
        }
    }//GEN-LAST:event_busiPlaneParisActionPerformed

    private void hotelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotelsMouseClicked
        new UserDashboardBookTrip2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_hotelsMouseClicked

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
            java.util.logging.Logger.getLogger(UserDashboardBookTrip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboardBookTrip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboardBookTrip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboardBookTrip1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboardBookTrip1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acBusCoxs;
    private javax.swing.JComboBox<String> acBusRangamati;
    private javax.swing.JComboBox<String> acBusSajek;
    private javax.swing.JComboBox<String> acBusSylhet;
    private javax.swing.JLabel bookTrip;
    private javax.swing.JRadioButton bus;
    private javax.swing.JLabel busName;
    private javax.swing.JComboBox<String> busType;
    private javax.swing.JComboBox<String> busiPlaneCoxs;
    private javax.swing.JComboBox<String> busiPlaneDubai;
    private javax.swing.JComboBox<String> busiPlaneIndia;
    private javax.swing.JComboBox<String> busiPlaneParis;
    private javax.swing.JComboBox<String> busiPlaneSajek;
    private javax.swing.JComboBox<String> busiPlaneSylhet;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton cancel;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel destination;
    private javax.swing.JLabel dhaka;
    private javax.swing.JComboBox<String> ecoPlaneCoxs;
    private javax.swing.JComboBox<String> ecoPlaneDubai;
    private javax.swing.JComboBox<String> ecoPlaneIndia;
    private javax.swing.JComboBox<String> ecoPlaneParis;
    private javax.swing.JComboBox<String> ecoPlaneSajek;
    private javax.swing.JComboBox<String> ecoPlaneSylhet;
    private javax.swing.JLabel from;
    private javax.swing.JLabel hotels;
    private javax.swing.JRadioButton international;
    private javax.swing.JComboBox<String> internationalLocation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel journeyDate;
    private javax.swing.JRadioButton local;
    private javax.swing.JComboBox<String> localLocation;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoText;
    private javax.swing.JLabel medium;
    private javax.swing.JLabel myBooking;
    private javax.swing.JComboBox<String> nonacBusCoxs;
    private javax.swing.JComboBox<String> nonacBusRangamati;
    private javax.swing.JComboBox<String> nonacBusSajek;
    private javax.swing.JComboBox<String> nonacBusSylhet;
    private javax.swing.JRadioButton oneWay;
    private javax.swing.JLabel person;
    private javax.swing.JTextField personNum;
    private javax.swing.JRadioButton plane;
    private javax.swing.JLabel planeName;
    private javax.swing.JComboBox<String> planeType;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel returnDate;
    private javax.swing.JRadioButton roundWay;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel to;
    private javax.swing.JLabel tour;
    private javax.swing.JLabel transportation;
    private javax.swing.JPanel transportationLocal;
    private javax.swing.JLabel travelInfo;
    private javax.swing.JLabel tripType;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
