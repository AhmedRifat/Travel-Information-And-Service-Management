package travelinformationandservicemanagement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UserDashboardTravelInfo2 extends javax.swing.JFrame {

    private ImageIcon icon;
    private String username, password, firstName, lastName, nid, phoneNo, passport, email, gender;

    public UserDashboardTravelInfo2() {
        initComponents();

        icon = new ImageIcon(getClass().getResource("/assets/4153125-02.png"));
        this.setIconImage(icon.getImage());
    }

    public UserDashboardTravelInfo2(String username, String password, String email, String firstName, String lastName, String gender, String phoneNo, String nid, String passport, int part) {
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

        coxsBazar.setVisible(false);
        sylhet.setVisible(false);
        rangamati.setVisible(false);
        sajek.setVisible(false);
        india.setVisible(false);
        dubai.setVisible(false);
        paris.setVisible(false);
        switch (part) {
            case 1:
                coxsBazar.setVisible(true);
                break;
            case 2:
                sylhet.setVisible(true);
                break;
            case 3:
                rangamati.setVisible(true);
                break;
            case 4:
                sajek.setVisible(true);
                break;
            case 5:
                india.setVisible(true);
                break;
            case 6:
                dubai.setVisible(true);
                break;
            case 7:
                paris.setVisible(true);
                break;
            default:
                break;
        }
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
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        coxsBazar = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        sylhet = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        rangamati = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        sajek = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        india = new javax.swing.JPanel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        dubai = new javax.swing.JPanel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jLabel253 = new javax.swing.JLabel();
        paris = new javax.swing.JPanel();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();

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

        jScrollPane1.setBackground(new java.awt.Color(153, 255, 51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        coxsBazar.setBackground(new java.awt.Color(255, 255, 255));
        coxsBazar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(30, 39, 76));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BeachBig.jpeg"))); // NOI18N
        coxsBazar.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 230));

        jLabel40.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(30, 39, 76));
        jLabel40.setText("DHAKA TO COX’S BAZAR");
        coxsBazar.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 210, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("3. Spiritual ramu tour");
        coxsBazar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 300, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Cox’s Bazar is a town on the southeast coast of Bangladesh. It's");
        coxsBazar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 350, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("known for its very long, sandy beachfront, stretching from Sea");
        coxsBazar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 350, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(30, 39, 76));
        jLabel7.setText("Package:");
        coxsBazar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("2. Marine drive");
        coxsBazar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 300, 20));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(30, 39, 76));
        jLabel11.setText("Things to do:");
        coxsBazar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("-10,678 BDT per day/night. ");
        coxsBazar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 200, 20));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Non AC - 300 BDT");
        coxsBazar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 300, 20));

        jLabel15.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("1. Blu-Radisson Bay");
        coxsBazar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 160, 20));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel16.setText("Hanif");
        coxsBazar.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 70, 20));

        jLabel41.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("AC - 400 BDT");
        coxsBazar.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 300, 20));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Non AC - 300 BDT");
        coxsBazar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 20));

        jLabel19.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel19.setText("ENA");
        coxsBazar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 70, 20));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("AC - 400 BDT");
        coxsBazar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 300, 20));

        jLabel22.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel22.setText("1. Bus:");
        coxsBazar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, 20));

        jLabel23.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel23.setText("Shohag");
        coxsBazar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, 20));

        jLabel24.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel24.setText("PREMIUM");
        coxsBazar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 60, 20));

        jLabel25.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(30, 39, 76));
        jLabel25.setText("Ticket:");
        coxsBazar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel27.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("1. Enjoy at sea beach");
        coxsBazar.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 300, 20));

        jLabel28.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("AC - 400 BDT");
        coxsBazar.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 20));

        jLabel29.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText(" 2. Western Alliance");
        coxsBazar.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 160, 20));

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("9,600 BDT ");
        coxsBazar.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 120, 20));

        jLabel31.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel31.setText("NON-PREMIUM");
        coxsBazar.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 90, 20));

        jLabel32.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("3. Hotel Saint-Martin");
        coxsBazar.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 160, 20));

        jLabel33.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("-5,000 BDT per day/night. ");
        coxsBazar.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 200, 20));

        jLabel34.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("4. TGB Cottage");
        coxsBazar.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 160, 20));

        jLabel35.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("-3,000 BDT per day/night. ");
        coxsBazar.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 200, 20));
        coxsBazar.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 620, 30));

        jLabel148.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(51, 51, 51));
        jLabel148.setText("Non AC - 300 BDT");
        coxsBazar.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 300, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Beach in the north to Kolatoli Beach in the south termed the  ");
        coxsBazar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 350, 20));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("\"longest natural unbroken sea beach\" in the world.");
        coxsBazar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 350, 20));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("(For 3 days 2 nights)");
        coxsBazar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, 20));

        jLabel26.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel26.setText("6500 BDT (Business class) ");
        coxsBazar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 150, 20));

        jLabel149.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel149.setText("2. Plane:");
        coxsBazar.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 70, 20));

        jLabel150.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel150.setText("4000 BDT (Economy class) ");
        coxsBazar.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 150, 20));

        jLabel151.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(30, 39, 76));
        jLabel151.setText("Hotels:");
        coxsBazar.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel152.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel152.setText("PREMIUM");
        coxsBazar.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 60, 20));

        jLabel153.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel153.setText("NON-PREMIUM");
        coxsBazar.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 90, 20));

        jLabel154.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(51, 51, 51));
        jLabel154.setText("-6,100 BDT per day/night. ");
        coxsBazar.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 200, 20));

        jLabel155.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(51, 51, 51));
        jLabel155.setText("26,300 BDT ");
        coxsBazar.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 120, 20));

        jLabel156.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(51, 51, 51));
        jLabel156.setText("(Plane tickets will be provided by Biman BD)");
        coxsBazar.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 240, 20));

        jPanel5.add(coxsBazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        sylhet.setBackground(new java.awt.Color(255, 255, 255));
        sylhet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(30, 39, 76));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sylhetBig.jpg"))); // NOI18N
        sylhet.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 230));

        jLabel38.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(30, 39, 76));
        jLabel38.setText("DHAKA TO SYLHET");
        sylhet.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 160, 20));

        jLabel42.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setText("Sylhet is a city in eastern Bangladesh, on the Surma River.  It’s");
        sylhet.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 350, 20));

        jLabel43.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(51, 51, 51));
        jLabel43.setText("known for its Sufi shrines, like the ornate tomb and mosque  of ");
        sylhet.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 350, 20));

        jLabel44.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(51, 51, 51));
        jLabel44.setText("14th-century saint Hazrat Shah Jalal, now a major pilgrimage ");
        sylhet.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 350, 20));

        jLabel45.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(30, 39, 76));
        jLabel45.setText("Hotels:");
        sylhet.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel46.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("most of Bangladesh's yield.");
        sylhet.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 350, 20));

        jLabel47.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setText("2. Ratargul & Bichanakandi ");
        sylhet.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 300, 20));

        jLabel48.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel48.setText("6500 BDT (Business class)");
        sylhet.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 150, 20));

        jLabel49.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(30, 39, 76));
        jLabel49.setText("Things to do:");
        sylhet.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel50.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(51, 51, 51));
        jLabel50.setText("-12,100 BDT per day/night. ");
        sylhet.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 200, 20));

        jLabel51.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel51.setText("2. Plane:");
        sylhet.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 70, 20));

        jLabel52.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setText("Non AC - 400 BDT");
        sylhet.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 300, 20));

        jLabel53.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("1. Nazimgar Resort ");
        sylhet.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 160, 20));

        jLabel54.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel54.setText("Hanif");
        sylhet.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 70, 20));

        jLabel55.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 51, 51));
        jLabel55.setText("AC - 600 BDT");
        sylhet.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 300, 20));

        jLabel56.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(51, 51, 51));
        jLabel56.setText(" (Plane tickets will be provided by Biman BD)");
        sylhet.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 260, 20));

        jLabel57.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel57.setText("ENA");
        sylhet.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 70, 20));

        jLabel58.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(51, 51, 51));
        jLabel58.setText("AC - 400 BDT");
        sylhet.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 300, 20));

        jLabel59.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setText("Non AC - 300 BDT");
        sylhet.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 300, 20));

        jLabel60.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel60.setText("1. Bus:");
        sylhet.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, 20));

        jLabel61.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel61.setText("Shohag");
        sylhet.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, 20));

        jLabel62.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel62.setText("PREMIUM");
        sylhet.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 60, 20));

        jLabel63.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(30, 39, 76));
        jLabel63.setText("Ticket:");
        sylhet.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel64.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel64.setText("3200 BDT (Economy class) ");
        sylhet.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 150, 20));

        jLabel65.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 51));
        jLabel65.setText("1. Teagarden and Rainforest tour in Sreemangal. ");
        sylhet.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 300, 20));

        jLabel66.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(51, 51, 51));
        jLabel66.setText("AC - 500 BDT");
        sylhet.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 20));

        jLabel67.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(51, 51, 51));
        jLabel67.setText(" 2. Grand Sylhet Resort");
        sylhet.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 160, 20));

        jLabel68.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(51, 51, 51));
        jLabel68.setText("-6,500 BDT per day/night. ");
        sylhet.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 200, 20));

        jLabel69.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel69.setText("NON-PREMIUM");
        sylhet.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 90, 20));

        jLabel70.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(51, 51, 51));
        jLabel70.setText("3. Rose View Hotel");
        sylhet.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 160, 20));

        jLabel71.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 51, 51));
        jLabel71.setText("-4,000 BDT per day/night. ");
        sylhet.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 200, 20));

        jLabel72.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(51, 51, 51));
        jLabel72.setText("4. Hotel East");
        sylhet.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 160, 20));

        jLabel73.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(51, 51, 51));
        jLabel73.setText("-3,000 BDT per day/night. ");
        sylhet.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 200, 20));
        sylhet.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 620, 40));

        jLabel75.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(51, 51, 51));
        jLabel75.setText("site near Dargah Gate. Tea estates southeast of Sylhet provide ");
        sylhet.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 350, 20));

        jLabel76.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(51, 51, 51));
        jLabel76.setText("Non AC - 500 BDT");
        sylhet.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 20));

        jLabel77.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(30, 39, 76));
        jLabel77.setText("Package:");
        sylhet.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jLabel157.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel157.setText("PREMIUM");
        sylhet.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 60, 20));

        jLabel158.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(51, 51, 51));
        jLabel158.setText("25,900 BDT ");
        sylhet.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 120, 20));

        jLabel159.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(51, 51, 51));
        jLabel159.setText("9,600 BDT ");
        sylhet.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 120, 20));

        jLabel160.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(51, 51, 51));
        jLabel160.setText("(For 3 days 2 nights)");
        sylhet.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, 20));

        jLabel161.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel161.setText("NON-PREMIUM");
        sylhet.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 90, 20));

        jPanel5.add(sylhet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        rangamati.setBackground(new java.awt.Color(255, 255, 255));
        rangamati.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel78.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(30, 39, 76));
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rangamatiBig.jpg"))); // NOI18N
        rangamati.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 230));

        jLabel79.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(30, 39, 76));
        jLabel79.setText("DHAKA TO RANGAMATI");
        rangamati.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 210, 20));

        jLabel80.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(51, 51, 51));
        jLabel80.setText("3. Sheikh Russel Aviary & Eco Park");
        rangamati.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 300, 20));

        jLabel81.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(51, 51, 51));
        jLabel81.setText("Rangamati is famous for Kaptai lake, hydraulic Power Plant");
        rangamati.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 350, 20));

        jLabel82.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(51, 51, 51));
        jLabel82.setText("at Kaptai and Terrestrial Earth Satellite at Betbunia, Kawkhli.");
        rangamati.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 350, 20));

        jLabel83.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(30, 39, 76));
        jLabel83.setText("Hotels:");
        rangamati.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel84.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(51, 51, 51));
        jLabel84.setText("2. Parjatan Hanging Bridge");
        rangamati.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 300, 20));

        jLabel85.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(30, 39, 76));
        jLabel85.setText("Things to do:");
        rangamati.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel86.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(51, 51, 51));
        jLabel86.setText("-7,000 BDT per day/night. ");
        rangamati.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 200, 20));

        jLabel87.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(51, 51, 51));
        jLabel87.setText("Non AC - 450 BDT");
        rangamati.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 300, 20));

        jLabel88.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(51, 51, 51));
        jLabel88.setText("1. Grand Shanghai Resort");
        rangamati.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 160, 20));

        jLabel89.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel89.setText("Hanif");
        rangamati.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 70, 20));

        jLabel90.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(51, 51, 51));
        jLabel90.setText("AC - 650 BDT");
        rangamati.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 300, 20));

        jLabel91.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(51, 51, 51));
        jLabel91.setText("Non AC - 560 BDT");
        rangamati.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 20));

        jLabel92.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel92.setText("ENA");
        rangamati.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 70, 20));

        jLabel93.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(51, 51, 51));
        jLabel93.setText("AC - 400 BDT");
        rangamati.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 300, 20));

        jLabel94.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel94.setText("1. Bus:");
        rangamati.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, 20));

        jLabel95.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel95.setText("Shohag");
        rangamati.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, 20));

        jLabel96.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel96.setText("PREMIUM");
        rangamati.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 60, 20));

        jLabel97.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(30, 39, 76));
        jLabel97.setText("Ticket:");
        rangamati.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel98.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(51, 51, 51));
        jLabel98.setText("1. Kaptai Lake & Waterfalls");
        rangamati.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 300, 20));

        jLabel99.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(51, 51, 51));
        jLabel99.setText("AC - 550 BDT");
        rangamati.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 20));

        jLabel100.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(51, 51, 51));
        jLabel100.setText(" 2. Hotel South Hint");
        rangamati.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 160, 20));

        jLabel101.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(51, 51, 51));
        jLabel101.setText("-6,000 BDT per day/night. ");
        rangamati.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 200, 20));

        jLabel102.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel102.setText("NON-PREMIUM");
        rangamati.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 90, 20));

        jLabel103.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(51, 51, 51));
        jLabel103.setText("3. Holiday Resort");
        rangamati.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 160, 20));

        jLabel104.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(51, 51, 51));
        jLabel104.setText("-3,000 BDT per day/night. ");
        rangamati.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 200, 20));

        jLabel105.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(51, 51, 51));
        jLabel105.setText("4. Lake View Resort");
        rangamati.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 160, 20));

        jLabel106.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(51, 51, 51));
        jLabel106.setText("-3,000 BDT per day/night. ");
        rangamati.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 200, 20));
        rangamati.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 620, 40));

        jLabel108.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(51, 51, 51));
        jLabel108.setText("Non AC - 320 BDT");
        rangamati.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 300, 20));
        rangamati.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 506, 370, 30));

        jLabel162.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(30, 39, 76));
        jLabel162.setText("Package:");
        rangamati.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jLabel163.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel163.setText("PREMIUM");
        rangamati.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 60, 20));

        jLabel164.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(51, 51, 51));
        jLabel164.setText("19,300 BDT ");
        rangamati.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 120, 20));

        jLabel165.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(51, 51, 51));
        jLabel165.setText("9,640 BDT ");
        rangamati.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 120, 20));

        jLabel166.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(51, 51, 51));
        jLabel166.setText("(For 3 days 2 nights)");
        rangamati.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, 20));

        jLabel167.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel167.setText("NON-PREMIUM");
        rangamati.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 90, 20));

        jPanel5.add(rangamati, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        sajek.setBackground(new java.awt.Color(255, 255, 255));
        sajek.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel110.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(30, 39, 76));
        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sajekBig.jpg"))); // NOI18N
        sajek.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 230));

        jLabel111.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(30, 39, 76));
        jLabel111.setText("DHAKA TO SAJEK");
        sajek.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 150, 20));

        jLabel112.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(51, 51, 51));
        jLabel112.setText("3. Risang Waterfall and Alutila Cave");
        sajek.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 300, 20));

        jLabel113.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(51, 51, 51));
        jLabel113.setText("Sajek Valley is one of the most popular tourist spots in ");
        sajek.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 350, 20));

        jLabel114.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(51, 51, 51));
        jLabel114.setText("Bangladesh situated among the hills of the Kasalong range of");
        sajek.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 350, 20));

        jLabel115.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(30, 39, 76));
        jLabel115.setText("Hotels:");
        sajek.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel116.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(51, 51, 51));
        jLabel116.setText("2. Horticulture Heritage Park");
        sajek.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 300, 20));

        jLabel117.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(30, 39, 76));
        jLabel117.setText("Things to do:");
        sajek.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel118.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(51, 51, 51));
        jLabel118.setText("-8,000 BDT per day/night. ");
        sajek.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 200, 20));

        jLabel119.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(51, 51, 51));
        jLabel119.setText("Non AC - 450 BDT");
        sajek.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 300, 20));

        jLabel120.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(51, 51, 51));
        jLabel120.setText("1. Echo Resort");
        sajek.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 160, 20));

        jLabel121.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel121.setText("Hanif");
        sajek.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 70, 20));

        jLabel122.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(51, 51, 51));
        jLabel122.setText("AC - 650 BDT");
        sajek.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 300, 20));

        jLabel123.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(51, 51, 51));
        jLabel123.setText("Non AC - 550 BDT");
        sajek.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 20));

        jLabel124.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel124.setText("ENA");
        sajek.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 70, 20));

        jLabel125.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(51, 51, 51));
        jLabel125.setText("AC - 400 BDT");
        sajek.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 300, 20));

        jLabel126.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel126.setText("1. Bus:");
        sajek.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, 20));

        jLabel127.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel127.setText("Shohag");
        sajek.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, 20));

        jLabel128.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel128.setText("PREMIUM");
        sajek.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 60, 20));

        jLabel129.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(30, 39, 76));
        jLabel129.setText("Ticket:");
        sajek.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel130.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(51, 51, 51));
        jLabel130.setText("1. Lushai Heritage Village");
        sajek.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 300, 20));

        jLabel131.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(51, 51, 51));
        jLabel131.setText("AC - 550 BDT");
        sajek.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 20));

        jLabel132.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(51, 51, 51));
        jLabel132.setText(" 2. Cloud Jumper Resort");
        sajek.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 160, 20));

        jLabel133.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(51, 51, 51));
        jLabel133.setText("-6,000 BDT per day/night. ");
        sajek.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 200, 20));

        jLabel134.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel134.setText("NON-PREMIUM");
        sajek.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 90, 20));

        jLabel135.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(51, 51, 51));
        jLabel135.setText("3. Sajek cottage and Resort");
        sajek.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 160, 20));

        jLabel136.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(51, 51, 51));
        jLabel136.setText("-3,000 BDT per day/night. ");
        sajek.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 200, 20));

        jLabel137.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(51, 51, 51));
        jLabel137.setText("4. TGB Cottage");
        sajek.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 160, 20));

        jLabel138.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(51, 51, 51));
        jLabel138.setText("-3,000 BDT per day/night. ");
        sajek.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 200, 20));
        sajek.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 620, 40));

        jLabel140.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(51, 51, 51));
        jLabel140.setText("Non AC - 320 BDT");
        sajek.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 300, 20));

        jLabel141.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(51, 51, 51));
        jLabel141.setText("mountains in Sajek union. Sajek valley is known for its natural ");
        sajek.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 350, 20));

        jLabel142.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(51, 51, 51));
        jLabel142.setText("environment and is surrounded by mountains, dense forest, and");
        sajek.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 350, 20));

        jLabel143.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(51, 51, 51));
        jLabel143.setText("grassland hill tracks. ");
        sajek.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 350, 20));

        jLabel144.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(51, 51, 51));
        jLabel144.setText("(Plane tickets will be provided by Biman BD)");
        sajek.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 240, 20));

        jLabel145.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel145.setText("6500 BDT (Business class) ");
        sajek.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 150, 20));

        jLabel146.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel146.setText("2. Plane:");
        sajek.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 70, 20));

        jLabel147.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel147.setText("4000 BDT (Economy class) ");
        sajek.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 150, 20));

        jLabel168.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(30, 39, 76));
        jLabel168.setText("Package:");
        sajek.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jLabel169.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel169.setText("PREMIUM");
        sajek.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 60, 20));

        jLabel170.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(51, 51, 51));
        jLabel170.setText("26,000 BDT ");
        sajek.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 120, 20));

        jLabel171.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(51, 51, 51));
        jLabel171.setText("9,600 BDT ");
        sajek.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 120, 20));

        jLabel172.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(51, 51, 51));
        jLabel172.setText("(For 3 days 2 nights)");
        sajek.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, 20));

        jLabel173.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel173.setText("NON-PREMIUM");
        sajek.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 90, 20));

        jPanel5.add(sajek, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        india.setBackground(new java.awt.Color(255, 255, 255));
        india.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel174.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(30, 39, 76));
        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/IndiaBig.jpg"))); // NOI18N
        india.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 230));

        jLabel175.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(30, 39, 76));
        jLabel175.setText("DHAKA TO INDIA");
        india.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 150, 20));

        jLabel176.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(51, 51, 51));
        jLabel176.setText("3. Golden Temple ");
        india.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 300, 20));

        jLabel177.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(51, 51, 51));
        jLabel177.setText("India is an enormous country, filled with incredible people and");
        india.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 350, 20));

        jLabel178.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(51, 51, 51));
        jLabel178.setText("an amazing diversity of traditions, cuisines and religions.  Every");
        india.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 350, 20));

        jLabel179.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(30, 39, 76));
        jLabel179.setText("Hotels:");
        india.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel180.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(51, 51, 51));
        jLabel180.setText("2. Qutub Mina");
        india.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 300, 20));

        jLabel181.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(30, 39, 76));
        jLabel181.setText("Things to do:");
        india.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel182.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(51, 51, 51));
        jLabel182.setText("-12,640 BDT per day/night. ");
        india.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 200, 20));

        jLabel183.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(51, 51, 51));
        jLabel183.setText("Business - 7,500 BDT");
        india.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 300, 20));

        jLabel184.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(51, 51, 51));
        jLabel184.setText("1. ITC Royal");
        india.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 160, 20));

        jLabel185.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel185.setText("Air India");
        india.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 70, 20));

        jLabel186.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(51, 51, 51));
        jLabel186.setText("Economy -  6,850 BDT");
        india.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 300, 20));

        jLabel187.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(51, 51, 51));
        jLabel187.setText("Business - 7,500 BDT");
        india.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 20));

        jLabel188.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel188.setText("Biman BD");
        india.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 70, 20));

        jLabel189.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(51, 51, 51));
        jLabel189.setText("Economy -  6,850 BDT");
        india.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 300, 20));

        jLabel190.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel190.setText("Plane:");
        india.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, 20));

        jLabel191.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel191.setText("Indigo");
        india.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, 20));

        jLabel192.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel192.setText("PREMIUM");
        india.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 60, 20));

        jLabel193.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(30, 39, 76));
        jLabel193.setText("Ticket:");
        india.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel194.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(51, 51, 51));
        jLabel194.setText("1. Taj Mahal ");
        india.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 300, 20));

        jLabel195.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(51, 51, 51));
        jLabel195.setText("Economy -  6,850 BDT");
        india.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 20));

        jLabel196.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(51, 51, 51));
        jLabel196.setText(" 2. Hyatt Regency");
        india.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 160, 20));

        jLabel197.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(51, 51, 51));
        jLabel197.setText("-11,380 BDT per day/night. ");
        india.add(jLabel197, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 200, 20));

        jLabel198.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel198.setText("NON-PREMIUM");
        india.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 90, 20));

        jLabel199.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(51, 51, 51));
        jLabel199.setText("3. Alt Air");
        india.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 160, 20));

        jLabel200.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(51, 51, 51));
        jLabel200.setText("-9,560 BDT per day/night. ");
        india.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 200, 20));

        jLabel201.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel201.setForeground(new java.awt.Color(51, 51, 51));
        jLabel201.setText("4. The Sonnet");
        india.add(jLabel201, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 160, 20));

        jLabel202.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(51, 51, 51));
        jLabel202.setText("-9,220 BDT per day/night. ");
        india.add(jLabel202, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 200, 20));
        india.add(jLabel203, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 620, 40));

        jLabel204.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(51, 51, 51));
        jLabel204.setText("Business - 7,500 BDT");
        india.add(jLabel204, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 300, 20));

        jLabel205.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel205.setForeground(new java.awt.Color(51, 51, 51));
        jLabel205.setText("traveller who visits India quickly falls in love with the friendly");
        india.add(jLabel205, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 350, 20));

        jLabel206.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel206.setForeground(new java.awt.Color(51, 51, 51));
        jLabel206.setText("locals, the ancient spirituality and of course, the traditional ");
        india.add(jLabel206, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 350, 20));

        jLabel207.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(51, 51, 51));
        jLabel207.setText("Indian food!");
        india.add(jLabel207, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 350, 20));

        jLabel208.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(30, 39, 76));
        jLabel208.setText("Package:");
        india.add(jLabel208, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jLabel209.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel209.setText("PREMIUM");
        india.add(jLabel209, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 60, 20));

        jLabel210.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(51, 51, 51));
        jLabel210.setText("94,600 BDT ");
        india.add(jLabel210, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 120, 20));

        jLabel211.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel211.setForeground(new java.awt.Color(51, 51, 51));
        jLabel211.setText("9,600 BDT ");
        india.add(jLabel211, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 120, 20));

        jLabel212.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel212.setForeground(new java.awt.Color(51, 51, 51));
        jLabel212.setText("(For 7 days 6 nights)");
        india.add(jLabel212, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, 20));

        jLabel213.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel213.setText("NON-PREMIUM");
        india.add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 90, 20));

        jPanel5.add(india, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dubai.setBackground(new java.awt.Color(255, 255, 255));
        dubai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel214.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel214.setForeground(new java.awt.Color(30, 39, 76));
        jLabel214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/DubaiBig.jpg"))); // NOI18N
        dubai.add(jLabel214, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 230));

        jLabel215.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel215.setForeground(new java.awt.Color(30, 39, 76));
        jLabel215.setText("DHAKA TO DUBAI");
        dubai.add(jLabel215, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 150, 20));

        jLabel216.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel216.setForeground(new java.awt.Color(51, 51, 51));
        jLabel216.setText("3. Atlantis aquaventure waterpark");
        dubai.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 300, 20));

        jLabel217.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel217.setForeground(new java.awt.Color(51, 51, 51));
        jLabel217.setText("Dubai is a city of skyscrapers, ports, and beaches, where big");
        dubai.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 350, 20));

        jLabel218.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(51, 51, 51));
        jLabel218.setText("business takes place alongside sun-seeking tourism. Because");
        dubai.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 350, 20));

        jLabel219.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel219.setForeground(new java.awt.Color(30, 39, 76));
        jLabel219.setText("Hotels:");
        dubai.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel220.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel220.setForeground(new java.awt.Color(51, 51, 51));
        jLabel220.setText("2. Dubai fountain ");
        dubai.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 300, 20));

        jLabel221.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel221.setForeground(new java.awt.Color(30, 39, 76));
        jLabel221.setText("Things to do:");
        dubai.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel222.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(51, 51, 51));
        jLabel222.setText("-24,130 BDT per day/night. ");
        dubai.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 200, 20));

        jLabel223.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel223.setForeground(new java.awt.Color(51, 51, 51));
        jLabel223.setText("Business - 48,294 BDT");
        dubai.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 300, 20));

        jLabel224.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(51, 51, 51));
        jLabel224.setText("1.  Hilton Dubai");
        dubai.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 160, 20));

        jLabel225.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel225.setText("Fly Dubai ");
        dubai.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 70, 20));

        jLabel226.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel226.setForeground(new java.awt.Color(51, 51, 51));
        jLabel226.setText("Economy -  44,857 BDT");
        dubai.add(jLabel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 300, 20));

        jLabel227.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel227.setForeground(new java.awt.Color(51, 51, 51));
        jLabel227.setText("Business - 49,857 BDT");
        dubai.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 20));

        jLabel228.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel228.setText("Biman BD");
        dubai.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 70, 20));

        jLabel229.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel229.setForeground(new java.awt.Color(51, 51, 51));
        jLabel229.setText("Economy -  37,573 BDT");
        dubai.add(jLabel229, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 300, 20));

        jLabel230.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel230.setText("Plane:");
        dubai.add(jLabel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, 20));

        jLabel231.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel231.setText("Arab Emirates");
        dubai.add(jLabel231, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 90, 20));

        jLabel232.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel232.setText("PREMIUM");
        dubai.add(jLabel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 60, 20));

        jLabel233.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel233.setForeground(new java.awt.Color(30, 39, 76));
        jLabel233.setText("Ticket:");
        dubai.add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel234.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel234.setForeground(new java.awt.Color(51, 51, 51));
        jLabel234.setText("1. Red dunes sandsurf");
        dubai.add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 300, 20));

        jLabel235.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel235.setForeground(new java.awt.Color(51, 51, 51));
        jLabel235.setText("Economy -  43,294 BDT");
        dubai.add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 20));

        jLabel236.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel236.setForeground(new java.awt.Color(51, 51, 51));
        jLabel236.setText(" 2. Grand Hyatt");
        dubai.add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 160, 20));

        jLabel237.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel237.setForeground(new java.awt.Color(51, 51, 51));
        jLabel237.setText("-25,630 BDT per day/night. ");
        dubai.add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 200, 20));

        jLabel238.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel238.setText("NON-PREMIUM");
        dubai.add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 90, 20));

        jLabel239.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel239.setForeground(new java.awt.Color(51, 51, 51));
        jLabel239.setText("3. Mercure Dubai Barsha");
        dubai.add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 160, 20));

        jLabel240.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel240.setForeground(new java.awt.Color(51, 51, 51));
        jLabel240.setText("-9,770 BDT per day/night. ");
        dubai.add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 200, 20));

        jLabel241.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel241.setForeground(new java.awt.Color(51, 51, 51));
        jLabel241.setText("4. Emirates Grand");
        dubai.add(jLabel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 160, 20));

        jLabel242.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel242.setForeground(new java.awt.Color(51, 51, 51));
        jLabel242.setText("-7,980 BDT per day/night. ");
        dubai.add(jLabel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 200, 20));
        dubai.add(jLabel243, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 620, 40));

        jLabel244.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel244.setForeground(new java.awt.Color(51, 51, 51));
        jLabel244.setText("Business - 42,573 BDT");
        dubai.add(jLabel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 300, 20));

        jLabel245.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel245.setForeground(new java.awt.Color(51, 51, 51));
        jLabel245.setText("of its large expatriate population, it feels like a Middle Eastern");
        dubai.add(jLabel245, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 350, 20));

        jLabel246.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel246.setForeground(new java.awt.Color(51, 51, 51));
        jLabel246.setText("melting pot, and the atmosphere is generally tolerant. Religious");
        dubai.add(jLabel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 350, 20));

        jLabel247.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel247.setForeground(new java.awt.Color(51, 51, 51));
        jLabel247.setText("affiliations are not a prominent aspect of city life.");
        dubai.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 350, 20));

        jLabel248.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel248.setForeground(new java.awt.Color(30, 39, 76));
        jLabel248.setText("Package:");
        dubai.add(jLabel248, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jLabel249.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel249.setText("PREMIUM");
        dubai.add(jLabel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 60, 20));

        jLabel250.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel250.setForeground(new java.awt.Color(51, 51, 51));
        jLabel250.setText("2,54,056 BDT ");
        dubai.add(jLabel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 120, 20));

        jLabel251.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel251.setForeground(new java.awt.Color(51, 51, 51));
        jLabel251.setText("9,600 BDT ");
        dubai.add(jLabel251, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 120, 20));

        jLabel252.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel252.setForeground(new java.awt.Color(51, 51, 51));
        jLabel252.setText("(For 7 days 6 nights)");
        dubai.add(jLabel252, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, 20));

        jLabel253.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel253.setText("NON-PREMIUM");
        dubai.add(jLabel253, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 90, 20));

        jPanel5.add(dubai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        paris.setBackground(new java.awt.Color(255, 255, 255));
        paris.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel254.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel254.setForeground(new java.awt.Color(30, 39, 76));
        jLabel254.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ParisBig.jpg"))); // NOI18N
        paris.add(jLabel254, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, 230));

        jLabel255.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel255.setForeground(new java.awt.Color(30, 39, 76));
        jLabel255.setText("DHAKA TO PARIS");
        paris.add(jLabel255, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 150, 20));

        jLabel256.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel256.setForeground(new java.awt.Color(51, 51, 51));
        jLabel256.setText("3. Eiffel Tour ");
        paris.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 300, 20));

        jLabel257.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel257.setForeground(new java.awt.Color(51, 51, 51));
        jLabel257.setText("Paris, France's capital, is a major European city and a global");
        paris.add(jLabel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 350, 20));

        jLabel258.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel258.setForeground(new java.awt.Color(51, 51, 51));
        jLabel258.setText("center for art, fashion, gastronomy and culture. Its 19th century");
        paris.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 350, 20));

        jLabel259.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel259.setForeground(new java.awt.Color(30, 39, 76));
        jLabel259.setText("Hotels:");
        paris.add(jLabel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel260.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel260.setForeground(new java.awt.Color(51, 51, 51));
        jLabel260.setText("2. Versailles bike tour");
        paris.add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 300, 20));

        jLabel261.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel261.setForeground(new java.awt.Color(30, 39, 76));
        jLabel261.setText("Things to do:");
        paris.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel262.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel262.setForeground(new java.awt.Color(51, 51, 51));
        jLabel262.setText("-45,780 BDT per day/night. ");
        paris.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 200, 20));

        jLabel263.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel263.setForeground(new java.awt.Color(51, 51, 51));
        jLabel263.setText("Business - 84,200 BDT");
        paris.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 300, 20));

        jLabel264.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel264.setForeground(new java.awt.Color(51, 51, 51));
        jLabel264.setText("1. Le Grand Intercontinental Paris");
        paris.add(jLabel264, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 160, 20));

        jLabel265.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel265.setText("Indigo ");
        paris.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 70, 20));

        jLabel266.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel266.setForeground(new java.awt.Color(51, 51, 51));
        jLabel266.setText("Economy -  65,000 BDT");
        paris.add(jLabel266, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 300, 20));

        jLabel267.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel267.setForeground(new java.awt.Color(51, 51, 51));
        jLabel267.setText("Business - 70,045 BDT");
        paris.add(jLabel267, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 20));

        jLabel268.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel268.setText("Jazeera Airways");
        paris.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 100, 20));

        jLabel269.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel269.setForeground(new java.awt.Color(51, 51, 51));
        jLabel269.setText("Economy -  57,400 BDT");
        paris.add(jLabel269, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 300, 20));

        jLabel270.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel270.setText("Plane:");
        paris.add(jLabel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, 20));

        jLabel271.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel271.setText("Biman BD");
        paris.add(jLabel271, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 100, 20));

        jLabel272.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel272.setText("PREMIUM");
        paris.add(jLabel272, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 60, 20));

        jLabel273.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel273.setForeground(new java.awt.Color(30, 39, 76));
        jLabel273.setText("Ticket:");
        paris.add(jLabel273, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel274.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel274.setForeground(new java.awt.Color(51, 51, 51));
        jLabel274.setText("1. Louvre museum");
        paris.add(jLabel274, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 300, 20));

        jLabel275.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel275.setForeground(new java.awt.Color(51, 51, 51));
        jLabel275.setText("Economy -  80,050 BDT");
        paris.add(jLabel275, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 20));

        jLabel276.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel276.setForeground(new java.awt.Color(51, 51, 51));
        jLabel276.setText(" 2. Novotel Paris");
        paris.add(jLabel276, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 160, 20));

        jLabel277.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel277.setForeground(new java.awt.Color(51, 51, 51));
        jLabel277.setText("-29,400 BDT per day/night. ");
        paris.add(jLabel277, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 200, 20));

        jLabel278.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel278.setText("NON-PREMIUM");
        paris.add(jLabel278, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 90, 20));

        jLabel279.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel279.setForeground(new java.awt.Color(51, 51, 51));
        jLabel279.setText("3. Passy Eiffel");
        paris.add(jLabel279, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 160, 20));

        jLabel280.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel280.setForeground(new java.awt.Color(51, 51, 51));
        jLabel280.setText("-20,400 BDT per day/night. ");
        paris.add(jLabel280, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 200, 20));

        jLabel281.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel281.setForeground(new java.awt.Color(51, 51, 51));
        jLabel281.setText("4. Citadines Tour Eiffel Paris");
        paris.add(jLabel281, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 160, 20));

        jLabel282.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel282.setForeground(new java.awt.Color(51, 51, 51));
        jLabel282.setText("-19,530 BDT per day/night. ");
        paris.add(jLabel282, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 200, 20));
        paris.add(jLabel283, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 620, 40));

        jLabel284.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel284.setForeground(new java.awt.Color(51, 51, 51));
        jLabel284.setText("Business - 61,800 BDT");
        paris.add(jLabel284, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 300, 20));

        jLabel285.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel285.setForeground(new java.awt.Color(51, 51, 51));
        jLabel285.setText("cityscape is crisscrossed by wide boulevards and the River ");
        paris.add(jLabel285, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 350, 20));

        jLabel286.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel286.setForeground(new java.awt.Color(51, 51, 51));
        jLabel286.setText("Seine. Beyond such landmarks as the Eiffel Tower and the 12th");
        paris.add(jLabel286, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 350, 20));

        jLabel287.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel287.setForeground(new java.awt.Color(51, 51, 51));
        jLabel287.setText("cafe and boutiques along the Rue du Faubourg Saint-Honoré.");
        paris.add(jLabel287, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 350, 20));

        jLabel288.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel288.setForeground(new java.awt.Color(30, 39, 76));
        jLabel288.setText("Package:");
        paris.add(jLabel288, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jLabel289.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel289.setText("PREMIUM");
        paris.add(jLabel289, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 60, 20));

        jLabel290.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel290.setForeground(new java.awt.Color(51, 51, 51));
        jLabel290.setText("3,29,400 BDT ");
        paris.add(jLabel290, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 120, 20));

        jLabel291.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel291.setForeground(new java.awt.Color(51, 51, 51));
        jLabel291.setText("9,600 BDT ");
        paris.add(jLabel291, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 120, 20));

        jLabel292.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel292.setForeground(new java.awt.Color(51, 51, 51));
        jLabel292.setText("(For 7 days 6 nights)");
        paris.add(jLabel292, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, -1, 20));

        jLabel293.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel293.setText("NON-PREMIUM");
        paris.add(jLabel293, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 90, 20));

        jLabel294.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel294.setForeground(new java.awt.Color(51, 51, 51));
        jLabel294.setText("century, Gothic Notre-Dame cathedral, the city is known for its");
        paris.add(jLabel294, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 350, 20));

        jPanel5.add(paris, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setViewportView(jPanel5);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 710, 400));

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
        new UserDashboardTravelInfo1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void bookTripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTripMouseClicked
        new UserDashboardBookTrip1(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_bookTripMouseClicked

    private void myBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myBookingMouseClicked
        try {
            new UserDashboardMyBooking(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(UserDashboardTravelInfo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_myBookingMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        new UserDashboardSettings(username, password, email, firstName, lastName, gender, phoneNo, nid, passport).setVisible(true);
        dispose();
    }//GEN-LAST:event_settingsMouseClicked

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
            java.util.logging.Logger.getLogger(UserDashboardTravelInfo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDashboardTravelInfo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDashboardTravelInfo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDashboardTravelInfo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDashboardTravelInfo2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookTrip;
    private javax.swing.JPanel coxsBazar;
    private javax.swing.JPanel dubai;
    private javax.swing.JPanel india;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoText;
    private javax.swing.JLabel myBooking;
    private javax.swing.JPanel paris;
    private javax.swing.JLabel profile;
    private javax.swing.JPanel rangamati;
    private javax.swing.JPanel sajek;
    private javax.swing.JLabel settings;
    private javax.swing.JPanel sylhet;
    private javax.swing.JLabel travelInfo;
    // End of variables declaration//GEN-END:variables
}
