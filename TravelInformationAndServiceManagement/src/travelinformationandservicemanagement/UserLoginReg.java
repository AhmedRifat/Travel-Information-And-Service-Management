package travelinformationandservicemanagement;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UserLoginReg extends javax.swing.JFrame {

    private ImageIcon icon;
    String email, user, pass;

    public UserLoginReg() {
        initComponents();

        icon = new ImageIcon(getClass().getResource("/assets/4153125-02.png"));
        this.setIconImage(icon.getImage());

        jTextField1.setBackground(new java.awt.Color(0, 0, 0, 1));
        jPasswordField1.setBackground(new java.awt.Color(0, 0, 0, 1));
        jPasswordField2.setBackground(new java.awt.Color(0, 0, 0, 1));
        jTextField2.setBackground(new java.awt.Color(0, 0, 0, 1));
        jTextField3.setBackground(new java.awt.Color(0, 0, 0, 1));

        jPanel3.setVisible(false);
        jLabel23.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        disable1 = new javax.swing.JLabel();
        show1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GOTRIPCO");
        setBackground(new java.awt.Color(102, 255, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow-left.png"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 30, -1));

        jPanel3.setBackground(new java.awt.Color(30, 39, 76));
        jPanel3.setForeground(new java.awt.Color(30, 39, 76));
        jPanel3.setPreferredSize(new java.awt.Dimension(410, 500));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Lovelo Black", 0, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(186, 208, 255));
        jLabel12.setText("WELCOME TO GOTRIPCO");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, 70));

        jLabel13.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(186, 208, 255));
        jLabel13.setText("Email");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 80, -1));

        jTextField2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(186, 208, 255));
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 223, 40));

        jLabel14.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(186, 208, 255));
        jLabel14.setText("____________________________________________");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/mail.png"))); // NOI18N
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 40, 40));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(186, 208, 255));
        jLabel16.setText("Username");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jTextField3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(186, 208, 255));
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 223, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_user_20px_1.png"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 45, 39));

        jLabel17.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(186, 208, 255));
        jLabel17.setText("____________________________________________");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(186, 208, 255));
        jLabel6.setText("Password");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(186, 208, 255));
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 225, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(186, 208, 255));
        jLabel4.setText("____________________________________________");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 274, 39));

        disable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_invisible_20px_1.png"))); // NOI18N
        disable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disable1MouseClicked(evt);
            }
        });
        jPanel3.add(disable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 20, 20));

        show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_eye_20px_1_1.png"))); // NOI18N
        show1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show1MouseClicked(evt);
            }
        });
        jPanel3.add(show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 20, 20));

        jButton2.setBackground(new java.awt.Color(62, 85, 125));
        jButton2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(186, 218, 232));
        jButton2.setText("Sign Up");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 300, 40));

        jLabel24.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(186, 208, 255));
        jLabel24.setText("already a user? LOG IN");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, 31));

        jLabel22.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(186, 208, 255));
        jLabel22.setText("________");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 60, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(30, 39, 76));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lovelo Black", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(186, 208, 255));
        jLabel2.setText("Welcome Back at");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 63));

        jTextField1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(186, 208, 255));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 223, 40));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(186, 208, 255));
        jLabel7.setText("____________________________________________");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_user_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 45, 39));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(186, 208, 255));
        jLabel3.setText("Username");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 34));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(186, 208, 255));
        jLabel8.setText("need an account? SIGN UP");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, 31));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(186, 208, 255));
        jLabel10.setText("________");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 60, 60));

        jLabel11.setFont(new java.awt.Font("Lovelo Black", 0, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(186, 208, 255));
        jLabel11.setText(" GOTRIPCO");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(186, 208, 255));
        jLabel19.setText("Password");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jPasswordField2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(186, 208, 255));
        jPasswordField2.setBorder(null);
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 225, 40));

        jLabel20.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(186, 208, 255));
        jLabel20.setText("____________________________________________");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 274, 39));

        disable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_invisible_20px_1.png"))); // NOI18N
        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        jPanel2.add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 20, -1));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8_eye_20px_1_1.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 20, -1));

        jButton3.setBackground(new java.awt.Color(62, 85, 125));
        jButton3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(186, 218, 232));
        jButton3.setText("Login");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 300, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/signup-bg.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 40, 470, 410));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 410, 500));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow-left.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/login-bg.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 440, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        email = jTextField2.getText();
        user = jTextField3.getText();
        pass = jPasswordField1.getText();
        int check = 0;
        if (email.equals("") || user.equals("") || pass.equals("")) {
            check = 4;
            JOptionPane.showMessageDialog(null, "Incompleted Field...", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (check != 4) {
            try {
                File fr = new File("src/database/User.txt");
                Scanner sc = new Scanner(fr);
                String str;

                while (sc.hasNextLine()) {
                    str = sc.nextLine();
                    if (str.equals("Email: " + email)) {
                        check = 1;
                        break;
                    }
                    if (str.equals("Username: " + user)) {
                        check = 2;
                        break;
                    }
                }
                sc.close();
                if (check == 1) {
                    JOptionPane.showMessageDialog(null, "Email Already Exists...", "Error", JOptionPane.ERROR_MESSAGE);
                    jTextField2.setText("");
                } else if (check == 2) {
                    JOptionPane.showMessageDialog(null, "Enter Another Username...", "Error", JOptionPane.ERROR_MESSAGE);
                    jTextField3.setText("");
                }
            } catch (FileNotFoundException e) {
            }
            if (check == 0) {
                FileWriter fw;
                try {
                    fw = new FileWriter("src/database/User.txt", true);                 
                    fw.append("Username: " + user + "\n");
                    fw.append("Password: " + pass + "\n");
                    fw.append("Email: " + email + "\n");
                    fw.append("First Name: " + "\n");
                    fw.append("Last Name: " + "\n");
                    fw.append("Gender: " + "\n");
                    fw.append("Phone No: " + "\n");
                    fw.append("NID: " + "\n");
                    fw.append("PAssport No: " + "\n");
                    fw.append("_________________\n");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jPasswordField1.setText("");
                    ImageIcon icon = new ImageIcon(getClass().getResource("/assets/done_64px.png"));

                    JOptionPane.showMessageDialog(null, "Registered successfully!", "Success", JOptionPane.INFORMATION_MESSAGE, icon);
                    {
                        final int MAX_X = 490;
                        jTextField2.setText("");
                        jTextField3.setText("");
                        jPasswordField1.setText("");
                        jLabel12.setVisible(false);
                        jLabel13.setVisible(false);
                        jLabel14.setVisible(false);
                        jLabel15.setVisible(false);
                        jLabel16.setVisible(false);
                        jLabel17.setVisible(false);
                        jLabel18.setVisible(false);
                        jLabel22.setVisible(false);
                        jLabel24.setVisible(false);
                        jTextField2.setVisible(false);
                        jTextField3.setVisible(false);
                        jPasswordField1.setVisible(false);
                        jLabel4.setVisible(false);
                        jLabel6.setVisible(false);
                        disable1.setVisible(false);
                        jButton2.setVisible(false);
                        jLabel26.setVisible(false);
                        show1.setVisible(false);

                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {

                        }

                        jPanel3.setLayout(null);
                        jPanel3.setBounds(0, 0, 410, 500);
                        Thread animation = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                int x = 0;
                                int y = 0;  //label start positions
                                boolean checked = true;

                                while (true) {
                                    if (checked) {
                                        jPanel3.setLocation(x, y);
                                        jPanel3.setBounds(x, y, 410, 500);
                                        x += 10;
                                    }
                                    if (x > MAX_X) {
                                        checked = false;
                                        jPanel3.setBounds(490, 0, 410, 500);
                                        try {
                                            Thread.sleep(50);
                                        } catch (Exception e) {
                                        }
                                        jPanel3.setBounds(490, 0, 410, 500);
                                        jPanel2.setVisible(true);
                                        jPanel2.setBackground(new Color(30, 39, 76));
                                        jLabel23.setVisible(false);
                                        jPanel3.setVisible(false);

                                        try {
                                            Thread.sleep(50);
                                        } catch (Exception e) {
                                        }

                                        jLabel1.setVisible(true);
                                        jLabel2.setVisible(true);
                                        jLabel10.setVisible(true);
                                        disable.setVisible(true);
                                        show.setVisible(true);
                                        jLabel3.setVisible(true);
                                        jLabel5.setVisible(true);
                                        jLabel19.setVisible(true);
                                        jLabel7.setVisible(true);
                                        jLabel8.setVisible(true);
                                        jLabel20.setVisible(true);
                                        jLabel11.setVisible(true);
                                        jTextField1.setVisible(true);
                                        jPasswordField2.setVisible(true);
                                        jButton3.setVisible(true);
                                        jLabel25.setVisible(true);

                                        break;
                                    }
                                    try {
                                        Thread.sleep(10);
                                    } catch (Exception e) {

                                    }
                                }
                            }
                        });
                        animation.start();
                    }
                    fw.close();
                } catch (IOException ex) {

                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setForeground(new Color(0, 204, 255));
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setForeground(new Color(186, 208, 255));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered

    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited

    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        final int MAX_X = 0;
        jTextField1.setText("");
        jPasswordField2.setText("");
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel10.setVisible(false);
        disable.setVisible(false);
        show.setVisible(false);
        jLabel3.setVisible(false);
        jLabel5.setVisible(false);
        jLabel19.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel20.setVisible(false);
        jLabel11.setVisible(false);
        jTextField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jButton3.setVisible(false);
        jLabel25.setVisible(false);
        jLabel26.setVisible(false);
        try {

            Thread.sleep(50);
        } catch (Exception e) {

        }

        jPanel2.setLayout(null);
        jPanel2.setBounds(490, 0, 410, 500);
        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 490;
                int y = 0;  //label start positions
                boolean checked = true;

                while (true) {
                    if (checked) {
                        jPanel2.setLocation(x, y);
                        jPanel2.setBounds(x, y, 410, 500);
                        x -= 10;
                    }
                    if (x < MAX_X) {
                        checked = false;
                        jPanel2.setBounds(0, 0, 410, 500);
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                        }
                        jPanel2.setBounds(0, 0, 410, 500);
                        jPanel3.setVisible(true);
                        jPanel2.setBackground(Color.white);

                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                        }
                        jLabel23.setVisible(true);
                        jLabel12.setVisible(true);
                        jLabel13.setVisible(true);
                        jLabel14.setVisible(true);
                        jLabel15.setVisible(true);
                        jLabel16.setVisible(true);
                        jLabel17.setVisible(true);
                        jLabel18.setVisible(true);
                        jLabel22.setVisible(true);
                        jLabel24.setVisible(true);
                        jTextField2.setVisible(true);
                        jTextField3.setVisible(true);
                        jPasswordField1.setVisible(true);
                        jLabel4.setVisible(true);
                        jLabel6.setVisible(true);
                        disable1.setVisible(true);
                        show1.setVisible(true);
                        jButton2.setVisible(true);
                        jLabel26.setVisible(true);
                        break;
                    }
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {

                    }
                }
            }
        });
        animation.start();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed

    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String username = jTextField1.getText();
        String password = jPasswordField2.getText();
        boolean a = false;
        boolean match = false;
        int check = 0;
        String email;
        try {
            File fr = new File("src/database/User.txt");
            Scanner sc = new Scanner(fr);
            String str;
            while (sc.hasNextLine()) {
                str = sc.nextLine();    
                if (str.equals("Username: " + username) || str.equals("Password: " + password)) {
                    check++;
                    if (check == 2) {
                        match = true;
                        break;
                    }
                } else {
                    check = 0;
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            a = true;
            JOptionPane.showMessageDialog(null, "There is no account in database. Sign up First!", "Notice", JOptionPane.INFORMATION_MESSAGE);
        }
        if (match == true && a == false) {
            UserDashboard userDash = new UserDashboard(username, password);


            try {
                File file = new File("src/database/User.txt");
                Scanner sc = new Scanner(file);
                int at = 0;

                while (sc.hasNextLine()) {
                    String j = sc.nextLine();
                    if (j.equals("Username: " + username)) {
                        at = 1;
                        continue;
                    }
                    if(j.charAt(0)== 'E' && j.charAt(1)=='m' && at ==1){
                        String p = "Email: ";
                        ArrayList<Character> ch = new ArrayList<>();
                        for (int i = p.length(); i < j.length(); i++) {
                            ch.add(j.charAt(i));
                        }
                        String emails = "";
                        for (char c : ch) {
                            emails += c;
                        }
                        userDash.setEmail(emails);
                    }
                    if (j.charAt(0) == 'F' && j.charAt(1) == 'i' && at == 1) {
                        String p = "First Name: ";
                        ArrayList<Character> ch = new ArrayList<>();
                        for (int i = p.length(); i < j.length(); i++) {
                            ch.add(j.charAt(i));
                        }
                        String firstName = "";
                        for (char c : ch) {
                            firstName += c;
                        }
                        userDash.setFirstName(firstName);
                    }
                    if (j.charAt(0) == 'L' && j.charAt(1) == 'a' && at == 1) {
                        String p = "Last Name: ";
                        ArrayList<Character> ch = new ArrayList<>();
                        for (int i = p.length(); i < j.length(); i++) {
                            ch.add(j.charAt(i));
                        }
                        String lastName = "";
                        for (char c : ch) {
                            lastName += c;
                        }
                        userDash.setLastName(lastName);
                    }
                    if (j.charAt(0) == 'G' && j.charAt(1) == 'e' && at == 1) {
                        String p = "Gender: ";
                        ArrayList<Character> ch = new ArrayList<>();
                        for (int i = p.length(); i < j.length(); i++) {
                            ch.add(j.charAt(i));
                        }
                        String gender = "";
                        for (char c : ch) {
                            gender += c;
                        }
                        userDash.setGender(gender);
                    }
                    if (j.charAt(0) == 'P' && j.charAt(1) == 'h' && at == 1) {
                        String p = "Phone No: ";
                        ArrayList<Character> ch = new ArrayList<>();
                        for (int i = p.length(); i < j.length(); i++) {
                            ch.add(j.charAt(i));
                        }
                        String phoneNo = "";
                        for (char c : ch) {
                            phoneNo += c;
                        }
                        userDash.setPhoneNo(phoneNo);
                    }
                    if (j.charAt(0) == 'N' && j.charAt(1) == 'I' && at == 1) {
                        String p = "NID: ";
                        ArrayList<Character> ch = new ArrayList<>();
                        for (int i = p.length(); i < j.length(); i++) {
                            ch.add(j.charAt(i));
                        }
                        String nid = "";
                        for (char c : ch) {
                            nid += c;
                        }
                        userDash.setNid(nid);
                    }
                    if (j.charAt(0) == 'P' && j.charAt(1) == 'A' && at == 1) {
                        String p = "PAssport No: ";
                        ArrayList<Character> ch = new ArrayList<>();
                        for (int i = p.length(); i < j.length(); i++) {
                            ch.add(j.charAt(i));
                        }
                        String passport = "";
                        for (char c : ch) {
                            passport += c;
                        }
                        userDash.setPassport(passport);
                        at = 2;
                    }
                    if (at == 2) {
                        break;
                    }
                }
                sc.close();
            } catch (FileNotFoundException e) {
            }
            userDash.setVisible(true);
            dispose();
        } else if (match == false && a == false) {
            JOptionPane.showMessageDialog(null, "Invalid Username or Password!", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        final int MAX_X = 490;
        jTextField2.setText("");
        jTextField3.setText("");
        jPasswordField1.setText("");
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel22.setVisible(false);
        jLabel24.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jPasswordField1.setVisible(false);
        jLabel4.setVisible(false);
        jLabel6.setVisible(false);
        disable1.setVisible(false);
        jButton2.setVisible(false);
        jLabel26.setVisible(false);
        show1.setVisible(false);
        try {
            Thread.sleep(50);
        } catch (Exception e) {

        }

        jPanel3.setLayout(null);
        jPanel3.setBounds(0, 0, 410, 500);
        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 0;
                int y = 0;  //label start positions
                boolean checked = true;

                while (true) {
                    if (checked) {
                        jPanel3.setLocation(x, y);
                        jPanel3.setBounds(x, y, 410, 500);
                        x += 10;
                    }
                    if (x > MAX_X) {
                        checked = false;
                        jPanel3.setBounds(490, 0, 410, 500);
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                        }
                        jPanel3.setBounds(490, 0, 410, 500);
                        jPanel2.setVisible(true);
                        jPanel2.setBackground(new Color(30, 39, 76));
                        jLabel23.setVisible(false);
                        jPanel3.setVisible(false);

                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                        }
                        jLabel1.setVisible(true);
                        jLabel2.setVisible(true);
                        jLabel10.setVisible(true);
                        disable.setVisible(true);
                        jLabel3.setVisible(true);
                        jLabel5.setVisible(true);
                        jLabel19.setVisible(true);
                        jLabel7.setVisible(true);
                        jLabel8.setVisible(true);
                        jLabel20.setVisible(true);
                        jLabel11.setVisible(true);
                        jTextField1.setVisible(true);
                        jPasswordField2.setVisible(true);
                        jButton3.setVisible(true);
                        jLabel25.setVisible(true);
                        show.setVisible(true);
                        break;
                    }
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {

                    }
                }
            }
        });
        animation.start();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        jLabel24.setForeground(new Color(0, 204, 255));
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        jLabel24.setForeground(new Color(186, 208, 255));
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered

    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited

    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        new EnterAs().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        new EnterAs().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel26MouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        jPasswordField2.setEchoChar((char)0);
        disable.setVisible(false);
        disable.setEnabled(false);
        show.setEnabled(true);
        show.setEnabled(true);
    }//GEN-LAST:event_disableMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        jPasswordField2.setEchoChar('*');
        disable.setVisible(true);
        disable.setEnabled(true);
        show.setEnabled(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void disable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disable1MouseClicked
        jPasswordField1.setEchoChar((char)0);
        disable1.setVisible(false);
        disable1.setEnabled(false);
        show1.setEnabled(true);
        show1.setEnabled(true);
    }//GEN-LAST:event_disable1MouseClicked

    private void show1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show1MouseClicked
        jPasswordField1.setEchoChar('*');
        disable1.setVisible(true);
        disable1.setEnabled(true);
        show1.setEnabled(false);
        show1.setEnabled(false);
    }//GEN-LAST:event_show1MouseClicked

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
            java.util.logging.Logger.getLogger(UserLoginReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel disable;
    private javax.swing.JLabel disable1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel show;
    private javax.swing.JLabel show1;
    // End of variables declaration//GEN-END:variables
}
