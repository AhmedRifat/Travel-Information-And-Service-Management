package travelinformationandservicemanagement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER;

public class UserDashboardTravelInfo1 extends javax.swing.JFrame {

    private ImageIcon icon;
    private String username, password, firstName, lastName, nid, phoneNo, passport, email, gender;

    public UserDashboardTravelInfo1() {
        initComponents();

        icon = new ImageIcon(getClass().getResource("/assets/4153125-02.png"));
        this.setIconImage(icon.getImage());

        search.setVisible(false);
        searchIcon.setVisible(false);
        searchBar.setVisible(false);

        coxsBazarScroll.setVisible(false);
        sylhetScroll.setVisible(false);
        rangamatiScroll.setVisible(false);
        sajekScroll.setVisible(false);

        indiaScroll.setVisible(false);
        dubaiScroll.setVisible(false);
        parisScroll.setVisible(false);

        coxsBazar.setVisible(false);
        sylhet.setVisible(false);
        rangamati.setVisible(false);
        sajek.setVisible(false);

        india.setVisible(false);
        dubai.setVisible(false);
        paris.setVisible(false);

        jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
    }
    String option = "";

    public UserDashboardTravelInfo1(String username, String password, String email, String firstName, String lastName, String gender, String phoneNo, String nid, String passport) {

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

        search.setVisible(false);
        searchIcon.setVisible(false);
        searchBar.setVisible(false);

        coxsBazarScroll.setVisible(false);
        sylhetScroll.setVisible(false);
        rangamatiScroll.setVisible(false);
        sajekScroll.setVisible(false);

        indiaScroll.setVisible(false);
        dubaiScroll.setVisible(false);
        parisScroll.setVisible(false);

        coxsBazar.setVisible(false);
        sylhet.setVisible(false);
        rangamati.setVisible(false);
        sajek.setVisible(false);

        india.setVisible(false);
        dubai.setVisible(false);
        paris.setVisible(false);

        jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
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
        search = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        searchIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        sajek = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        rangamati = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        sylhet = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        coxsBazar = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        coxsBazarScroll = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sylhetScroll = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        sajekScroll = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        rangamatiScroll = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        parisScroll = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        dubaiScroll = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        indiaScroll = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        dubai = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        paris = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        india = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();

        jPanel13.setBackground(new java.awt.Color(40, 51, 93));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Beach.png"))); // NOI18N
        jPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel14.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(186, 218, 232));
        jLabel14.setText("Seabeach Fun at Cox's Bazar!");
        jPanel13.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel15.setText("sdsd");
        jPanel13.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 140, 40));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*Click for more info ");
        jPanel13.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

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

        travelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/travel-info-selected.png"))); // NOI18N
        travelInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        travelInfo.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jLabel1.setText("Travel Info");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 39, 76));
        jLabel2.setText("Travel location of places locally and internationally");
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
        jPanel4.add(local, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, -1));

        buttonGroup1.add(international);
        international.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        international.setForeground(new java.awt.Color(51, 51, 51));
        international.setText("International");
        international.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internationalActionPerformed(evt);
            }
        });
        jPanel4.add(international, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 110, -1));

        search.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(30, 39, 76));
        search.setText("Search");
        jPanel4.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 50, 30));
        jPanel4.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 360, 30));

        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search_50px(1).png"))); // NOI18N
        searchIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchIconMouseClicked(evt);
            }
        });
        jPanel4.add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 30, 30));

        jScrollPane1.setBackground(new java.awt.Color(153, 255, 51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sajek.setBackground(new java.awt.Color(40, 51, 93));
        sajek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sajek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sajekMouseClicked(evt);
            }
        });
        sajek.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sajek.png"))); // NOI18N
        sajek.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel46.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 0, 0));
        jLabel46.setText("*Click for more info ");
        sajek.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel47.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(186, 218, 232));
        jLabel47.setText("Float with clouds at Sajek!");
        sajek.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel48.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(186, 218, 232));
        jLabel48.setText("Starting from");
        sajek.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jLabel49.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(186, 218, 232));
        jLabel49.setText("BDT 9,600");
        sajek.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jPanel5.add(sajek, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 670, 170));

        rangamati.setBackground(new java.awt.Color(40, 51, 93));
        rangamati.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rangamati.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rangamatiMouseClicked(evt);
            }
        });
        rangamati.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(186, 218, 232));
        jLabel40.setText("Hillsides of rangamati!");
        rangamati.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rangamati.png"))); // NOI18N
        rangamati.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel42.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 0, 0));
        jLabel42.setText("*Click for more info ");
        rangamati.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel43.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(186, 218, 232));
        jLabel43.setText("BDT 9,640");
        rangamati.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel44.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(186, 218, 232));
        jLabel44.setText("Starting from");
        rangamati.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(rangamati, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 670, -1));

        sylhet.setBackground(new java.awt.Color(40, 51, 93));
        sylhet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sylhet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sylhetMouseClicked(evt);
            }
        });
        sylhet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 0));
        jLabel35.setText("*Click for more info ");
        sylhet.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sylhet.png"))); // NOI18N
        sylhet.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel37.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(186, 218, 232));
        jLabel37.setText("Tour at Sylhet!");
        sylhet.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel38.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(186, 218, 232));
        jLabel38.setText("BDT 9,600");
        sylhet.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel39.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(186, 218, 232));
        jLabel39.setText("Starting from");
        sylhet.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(sylhet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 670, -1));

        coxsBazar.setBackground(new java.awt.Color(40, 51, 93));
        coxsBazar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coxsBazar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coxsBazarMouseClicked(evt);
            }
        });
        coxsBazar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Beach.png"))); // NOI18N
        coxsBazar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel19.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(186, 218, 232));
        jLabel19.setText("Seabeach Fun at Cox's Bazar!");
        coxsBazar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel20.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("*Click for more info ");
        coxsBazar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel21.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(186, 218, 232));
        jLabel21.setText("BDT 9,600");
        coxsBazar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel29.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(186, 218, 232));
        jLabel29.setText("Starting from");
        coxsBazar.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(coxsBazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 670, 170));

        coxsBazarScroll.setBackground(new java.awt.Color(40, 51, 93));
        coxsBazarScroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        coxsBazarScroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coxsBazarScrollMouseClicked(evt);
            }
        });
        coxsBazarScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Beach.png"))); // NOI18N
        coxsBazarScroll.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel23.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(186, 218, 232));
        jLabel23.setText("Seabeach Fun at Cox's Bazar!");
        coxsBazarScroll.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel24.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("*Click for more info ");
        coxsBazarScroll.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(186, 218, 232));
        jLabel6.setText("BDT 9,600");
        coxsBazarScroll.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(186, 218, 232));
        jLabel7.setText("Starting from");
        coxsBazarScroll.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(coxsBazarScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 670, 170));

        sylhetScroll.setBackground(new java.awt.Color(40, 51, 93));
        sylhetScroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sylhetScroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sylhetScrollMouseClicked(evt);
            }
        });
        sylhetScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*Click for more info ");
        sylhetScroll.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sylhet.png"))); // NOI18N
        sylhetScroll.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel11.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(186, 218, 232));
        jLabel11.setText("Tour at Sylhet!");
        sylhetScroll.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(186, 218, 232));
        jLabel5.setText("BDT 9,600");
        sylhetScroll.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel25.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(186, 218, 232));
        jLabel25.setText("Starting from");
        sylhetScroll.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(sylhetScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 670, 170));

        sajekScroll.setBackground(new java.awt.Color(40, 51, 93));
        sajekScroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sajekScroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sajekScrollMouseClicked(evt);
            }
        });
        sajekScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sajek.png"))); // NOI18N
        sajekScroll.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel31.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setText("*Click for more info ");
        sajekScroll.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel32.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(186, 218, 232));
        jLabel32.setText("Float with clouds at Sajek!");
        sajekScroll.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel33.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(186, 218, 232));
        jLabel33.setText("Starting from");
        sajekScroll.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jLabel34.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(186, 218, 232));
        jLabel34.setText("BDT 9,600");
        sajekScroll.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jPanel5.add(sajekScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 670, 170));

        rangamatiScroll.setBackground(new java.awt.Color(40, 51, 93));
        rangamatiScroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rangamatiScroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rangamatiScrollMouseClicked(evt);
            }
        });
        rangamatiScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(186, 218, 232));
        jLabel26.setText("Hillsides of rangamati!");
        rangamatiScroll.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rangamati.png"))); // NOI18N
        rangamatiScroll.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel28.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("*Click for more info ");
        rangamatiScroll.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(186, 218, 232));
        jLabel10.setText("BDT 9,640");
        rangamatiScroll.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(186, 218, 232));
        jLabel8.setText("Starting from");
        rangamatiScroll.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(rangamatiScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 670, -1));

        parisScroll.setBackground(new java.awt.Color(40, 51, 93));
        parisScroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        parisScroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parisScrollMouseClicked(evt);
            }
        });
        parisScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(186, 218, 232));
        jLabel50.setText("Romance in paris!");
        parisScroll.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Paris.png"))); // NOI18N
        parisScroll.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel52.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 0, 0));
        jLabel52.setText("*Click for more info ");
        parisScroll.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel53.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(186, 218, 232));
        jLabel53.setText("BDT 2,51,510");
        parisScroll.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel54.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(186, 218, 232));
        jLabel54.setText("Starting from");
        parisScroll.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(parisScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 670, -1));

        dubaiScroll.setBackground(new java.awt.Color(40, 51, 93));
        dubaiScroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dubaiScroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dubaiScrollMouseClicked(evt);
            }
        });
        dubaiScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 0, 0));
        jLabel55.setText("*Click for more info ");
        dubaiScroll.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Dubai.png"))); // NOI18N
        dubaiScroll.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel57.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(186, 218, 232));
        jLabel57.setText("Skyscrapers in dubai!");
        dubaiScroll.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel58.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(186, 218, 232));
        jLabel58.setText("BDT 1,31,006");
        dubaiScroll.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel59.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(186, 218, 232));
        jLabel59.setText("Starting from");
        dubaiScroll.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(dubaiScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 670, 170));

        indiaScroll.setBackground(new java.awt.Color(40, 51, 93));
        indiaScroll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        indiaScroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indiaScrollMouseClicked(evt);
            }
        });
        indiaScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/India.png"))); // NOI18N
        indiaScroll.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel61.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(186, 218, 232));
        jLabel61.setText("Wonders at India!");
        indiaScroll.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel62.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 0, 0));
        jLabel62.setText("*Click for more info ");
        indiaScroll.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel63.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(186, 218, 232));
        jLabel63.setText("BDT 78,130");
        indiaScroll.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel64.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(186, 218, 232));
        jLabel64.setText("Starting from");
        indiaScroll.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(indiaScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 670, 170));

        dubai.setBackground(new java.awt.Color(40, 51, 93));
        dubai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dubai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dubaiMouseClicked(evt);
            }
        });
        dubai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Dubai.png"))); // NOI18N
        dubai.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel76.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(186, 218, 232));
        jLabel76.setText("Skyscrapers in dubai!");
        dubai.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel77.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 0, 0));
        jLabel77.setText("*Click for more info ");
        dubai.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel78.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(186, 218, 232));
        jLabel78.setText("BDT 1,31,006");
        dubai.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel79.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(186, 218, 232));
        jLabel79.setText("Starting from");
        dubai.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(dubai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 670, 170));

        paris.setBackground(new java.awt.Color(40, 51, 93));
        paris.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parisMouseClicked(evt);
            }
        });
        paris.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Paris.png"))); // NOI18N
        paris.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel71.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(186, 218, 232));
        jLabel71.setText("Romance in paris!");
        paris.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel72.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 0, 0));
        jLabel72.setText("*Click for more info ");
        paris.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel73.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(186, 218, 232));
        jLabel73.setText("BDT 2,51,510");
        paris.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel74.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(186, 218, 232));
        jLabel74.setText("Starting from");
        paris.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(paris, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 670, 170));

        india.setBackground(new java.awt.Color(40, 51, 93));
        india.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        india.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indiaMouseClicked(evt);
            }
        });
        india.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/India.png"))); // NOI18N
        india.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 170));

        jLabel66.setFont(new java.awt.Font("Lovelo Black", 0, 24)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(186, 218, 232));
        jLabel66.setText("Wonders at India!");
        india.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel67.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 0, 0));
        jLabel67.setText("*Click for more info ");
        india.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, 20));

        jLabel68.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(186, 218, 232));
        jLabel68.setText("BDT 78,130");
        india.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 120, 30));

        jLabel69.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(186, 218, 232));
        jLabel69.setText("Starting from");
        india.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 20));

        jPanel5.add(india, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 670, 170));

        jScrollPane1.setViewportView(jPanel5);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 710, 320));

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

    }//GEN-LAST:event_travelInfoMouseEntered

    private void travelInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelInfoMouseExited

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

    private void localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localActionPerformed
        if (local.isSelected()) {
            option = "local";
            search.setVisible(true);
            searchIcon.setVisible(true);
            searchBar.setVisible(true);
            searchBar.setText("");

            coxsBazarScroll.setVisible(false);
            sylhetScroll.setVisible(false);
            rangamatiScroll.setVisible(false);
            sajekScroll.setVisible(false);

            indiaScroll.setVisible(false);
            dubaiScroll.setVisible(false);
            parisScroll.setVisible(false);

            coxsBazar.setVisible(false);
            sylhet.setVisible(false);
            rangamati.setVisible(false);
            sajek.setVisible(false);

            india.setVisible(false);
            dubai.setVisible(false);
            paris.setVisible(false);

            jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
        }
    }//GEN-LAST:event_localActionPerformed

    private void internationalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internationalActionPerformed
        if (international.isSelected()) {
            option = "international";
            search.setVisible(true);
            searchIcon.setVisible(true);
            searchBar.setVisible(true);
            searchBar.setText("");

            coxsBazarScroll.setVisible(false);
            sylhetScroll.setVisible(false);
            rangamatiScroll.setVisible(false);
            sajekScroll.setVisible(false);

            indiaScroll.setVisible(false);
            dubaiScroll.setVisible(false);
            parisScroll.setVisible(false);

            coxsBazar.setVisible(false);
            sylhet.setVisible(false);
            rangamati.setVisible(false);
            sajek.setVisible(false);

            india.setVisible(false);
            dubai.setVisible(false);
            paris.setVisible(false);

            jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
        }
    }//GEN-LAST:event_internationalActionPerformed
    String f = "";
    private void searchIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseClicked
        if (option.equals("local")) {
            f = searchBar.getText();
            if (f.length() == 0) {
            } else {
                if (f.equalsIgnoreCase("cox's bazar")) {
                    jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);

                    coxsBazarScroll.setVisible(false);
                    sylhetScroll.setVisible(false);
                    rangamatiScroll.setVisible(false);
                    sajekScroll.setVisible(false);

                    indiaScroll.setVisible(false);
                    dubaiScroll.setVisible(false);
                    parisScroll.setVisible(false);

                    coxsBazar.setVisible(true);
                    sylhet.setVisible(false);
                    rangamati.setVisible(false);
                    sajek.setVisible(false);

                    india.setVisible(false);
                    dubai.setVisible(false);
                    paris.setVisible(false);
                } else if (f.equalsIgnoreCase("sylhet")) {
                    jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);

                    coxsBazarScroll.setVisible(false);
                    sylhetScroll.setVisible(false);
                    rangamatiScroll.setVisible(false);
                    sajekScroll.setVisible(false);

                    indiaScroll.setVisible(false);
                    dubaiScroll.setVisible(false);
                    parisScroll.setVisible(false);

                    coxsBazar.setVisible(false);
                    sylhet.setVisible(true);
                    rangamati.setVisible(false);
                    sajek.setVisible(false);

                    india.setVisible(false);
                    dubai.setVisible(false);
                    paris.setVisible(false);
                } else if (f.equalsIgnoreCase("rangamati")) {
                    jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);

                    coxsBazarScroll.setVisible(false);
                    sylhetScroll.setVisible(false);
                    rangamatiScroll.setVisible(false);
                    sajekScroll.setVisible(false);

                    indiaScroll.setVisible(false);
                    dubaiScroll.setVisible(false);
                    parisScroll.setVisible(false);

                    coxsBazar.setVisible(false);
                    sylhet.setVisible(false);
                    rangamati.setVisible(true);
                    sajek.setVisible(false);

                    india.setVisible(false);
                    dubai.setVisible(false);
                    paris.setVisible(false);
                } else if (f.equalsIgnoreCase("sajek")) {
                    jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);

                    coxsBazarScroll.setVisible(false);
                    sylhetScroll.setVisible(false);
                    rangamatiScroll.setVisible(false);
                    sajekScroll.setVisible(false);

                    indiaScroll.setVisible(false);
                    dubaiScroll.setVisible(false);
                    parisScroll.setVisible(false);

                    coxsBazar.setVisible(false);
                    sylhet.setVisible(false);
                    rangamati.setVisible(false);
                    sajek.setVisible(true);

                    india.setVisible(false);
                    dubai.setVisible(false);
                    paris.setVisible(false);
                } else {
                    jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);

                    coxsBazarScroll.setVisible(true);
                    sylhetScroll.setVisible(true);
                    rangamatiScroll.setVisible(true);
                    sajekScroll.setVisible(true);

                    indiaScroll.setVisible(false);
                    dubaiScroll.setVisible(false);
                    parisScroll.setVisible(false);

                    coxsBazar.setVisible(false);
                    sylhet.setVisible(false);
                    rangamati.setVisible(false);
                    sajek.setVisible(false);

                    india.setVisible(false);
                    dubai.setVisible(false);
                    paris.setVisible(false);
                }
            }
        } else if (option.equals("international")) {
            f = searchBar.getText();
            if (f.length() != 0) {
                if (f.equalsIgnoreCase("india")) {
                    jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);

                    coxsBazarScroll.setVisible(false);
                    sylhetScroll.setVisible(false);
                    rangamatiScroll.setVisible(false);
                    sajekScroll.setVisible(false);

                    indiaScroll.setVisible(false);
                    dubaiScroll.setVisible(false);
                    parisScroll.setVisible(false);

                    coxsBazar.setVisible(false);
                    sylhet.setVisible(false);
                    rangamati.setVisible(false);
                    sajek.setVisible(false);

                    india.setVisible(true);
                    dubai.setVisible(false);
                    paris.setVisible(false);
                } else if (f.equalsIgnoreCase("dubai")) {
                    jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);

                    coxsBazarScroll.setVisible(false);
                    sylhetScroll.setVisible(false);
                    rangamatiScroll.setVisible(false);
                    sajekScroll.setVisible(false);

                    indiaScroll.setVisible(false);
                    dubaiScroll.setVisible(false);
                    parisScroll.setVisible(false);

                    coxsBazar.setVisible(false);
                    sylhet.setVisible(false);
                    rangamati.setVisible(false);
                    sajek.setVisible(false);

                    india.setVisible(false);
                    dubai.setVisible(true);
                    paris.setVisible(false);
                } else if (f.equalsIgnoreCase("paris")) {
                    jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);

                    coxsBazarScroll.setVisible(false);
                    sylhetScroll.setVisible(false);
                    rangamatiScroll.setVisible(false);
                    sajekScroll.setVisible(false);

                    indiaScroll.setVisible(false);
                    dubaiScroll.setVisible(false);
                    parisScroll.setVisible(false);

                    coxsBazar.setVisible(false);
                    sylhet.setVisible(false);
                    rangamati.setVisible(false);
                    sajek.setVisible(false);

                    india.setVisible(false);
                    dubai.setVisible(false);
                    paris.setVisible(true);
                } else {
                    jScrollPane1.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_AS_NEEDED);

                    coxsBazarScroll.setVisible(false);
                    sylhetScroll.setVisible(false);
                    rangamatiScroll.setVisible(false);
                    sajekScroll.setVisible(false);

                    indiaScroll.setVisible(true);
                    dubaiScroll.setVisible(true);
                    parisScroll.setVisible(true);

                    coxsBazar.setVisible(false);
                    sylhet.setVisible(false);
                    rangamati.setVisible(false);
                    sajek.setVisible(false);

                    india.setVisible(false);
                    dubai.setVisible(false);
                    paris.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_searchIconMouseClicked
    int part = 0;
    private void coxsBazarScrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coxsBazarScrollMouseClicked
        part = 1;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_coxsBazarScrollMouseClicked

    private void coxsBazarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coxsBazarMouseClicked
        part = 1;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_coxsBazarMouseClicked

    private void sylhetScrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sylhetScrollMouseClicked
        part = 2;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_sylhetScrollMouseClicked

    private void sylhetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sylhetMouseClicked
        part = 2;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_sylhetMouseClicked

    private void rangamatiScrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rangamatiScrollMouseClicked
        part = 3;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_rangamatiScrollMouseClicked

    private void rangamatiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rangamatiMouseClicked
        part = 3;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_rangamatiMouseClicked

    private void sajekScrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sajekScrollMouseClicked
        part = 4;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_sajekScrollMouseClicked

    private void sajekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sajekMouseClicked
        part = 4;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_sajekMouseClicked

    private void bookTripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTripMouseClicked
        new UserDashboardBookTrip1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_bookTripMouseClicked

    private void myBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingMouseClicked
        try {
            new UserDashboardMyBooking(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(UserDashboardTravelInfo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_myBookingMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        new UserDashboardSettings(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_settingsMouseClicked

    private void parisScrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parisScrollMouseClicked
        part = 7;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_parisScrollMouseClicked

    private void dubaiScrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dubaiScrollMouseClicked
        part = 6;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_dubaiScrollMouseClicked

    private void indiaScrollMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indiaScrollMouseClicked
        part = 5;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_indiaScrollMouseClicked

    private void indiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_indiaMouseClicked
        part = 5;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_indiaMouseClicked

    private void dubaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dubaiMouseClicked
        part = 6;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_dubaiMouseClicked

    private void parisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parisMouseClicked
        part = 7;
        UserDashboardTravelInfo2 user = new UserDashboardTravelInfo2(username, password, email, firstName, lastName, gender, phoneNo, nid, passport, part);
        user.setVisible(true);
        dispose();
    }//GEN-LAST:event_parisMouseClicked

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
            java.util.logging.Logger.getLogger(UserDashboardTravelInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboardTravelInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboardTravelInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboardTravelInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboardTravelInfo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookTrip;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel coxsBazar;
    private javax.swing.JPanel coxsBazarScroll;
    private javax.swing.JPanel dubai;
    private javax.swing.JPanel dubaiScroll;
    private javax.swing.JPanel india;
    private javax.swing.JPanel indiaScroll;
    private javax.swing.JRadioButton international;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton local;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoText;
    private javax.swing.JLabel myBooking;
    private javax.swing.JPanel paris;
    private javax.swing.JPanel parisScroll;
    private javax.swing.JLabel profile;
    private javax.swing.JPanel rangamati;
    private javax.swing.JPanel rangamatiScroll;
    private javax.swing.JPanel sajek;
    private javax.swing.JPanel sajekScroll;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel sylhet;
    private javax.swing.JPanel sylhetScroll;
    private javax.swing.JLabel travelInfo;
    // End of variables declaration//GEN-END:variables
}
