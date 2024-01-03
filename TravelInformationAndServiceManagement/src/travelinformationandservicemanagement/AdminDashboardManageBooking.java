package travelinformationandservicemanagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminDashboardManageBooking extends javax.swing.JFrame {

    private ImageIcon icon;

    public AdminDashboardManageBooking() throws IOException {
        initComponents();

        icon = new ImageIcon(getClass().getResource("/assets/4153125-02.png"));
        this.setIconImage(icon.getImage());

        int match = 0;
        String FrstName = "";
        String LasTName = "";
        String UserName = "";
        String destination = "";
        String Status = "";
        String schedule = "";
        String type = "";
        String person = "";

        try {
            File oldFile;
            oldFile = new File("src/database/Info.txt");
            File newFile = new File("src/database/temp2.txt");
            newFile.createNewFile();
            FileReader reader = new FileReader(oldFile);

            BufferedReader bufReader = new BufferedReader(reader);

            FileWriter fw = new FileWriter(newFile, false);
            BufferedWriter bf = new BufferedWriter(fw);
            String readline = bufReader.readLine();

            while ((readline = bufReader.readLine()) != null) {
                String[] cutter = readline.split("/");
                FrstName = cutter[0];
                LasTName = cutter[1];
                UserName = cutter[2];
                destination = cutter[3];
                type = cutter[4];
                person = cutter[5];
                String payment = cutter[6];
                Status = cutter[7];
                schedule = cutter[8];
                //for (String cutter1 : cutter) {
                    //if (UserNam.getText().trim().equalsIgnoreCase(cutter[2].trim()) && Nam1.getText().trim().equalsIgnoreCase(cutter[0].trim()) && Nam2.getText().trim().equalsIgnoreCase(cutter[1].trim())) {
                    // match++;
                    bf.write(cutter[0] + "  / " + cutter[1] + "  / " + cutter[2] + "  / " + cutter[3] + "  / " + cutter[4] + "  / " + cutter[5] + "  / " + cutter[6] + "  / " + cutter[7] + "  / " + cutter[8] + "\n");
                    //}
                    //break;
                //}
            }
            bf.flush();
            fw.flush();
            bf.close();

            fw.close();
            reader.close();
            bufReader.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        

        try {
            File newFile = new File("src/database/temp2.txt");
            FileReader reader = new FileReader(newFile);

            BufferedReader bufReader = new BufferedReader(reader);
            String[] ColumbName = {"First Name", "Last Name", "Username", "Destination", "Type", "Person", "Payment", "Payment Status", "Schedule"};
            String[] rows;
            DefaultTableModel m1 = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jTable1.setModel(m1);
            Object[] tableLines = bufReader.lines().toArray();
            m1.setColumnIdentifiers(ColumbName);

            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim();
                rows = line.split("/");
                m1.addRow(rows);
            }
            int cnt = 0;

            reader.close();
            bufReader.close();
            Files.delete(Paths.get("src/database/temp2.txt"));
        } catch (FileNotFoundException ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoText = new javax.swing.JLabel();
        userBookList = new javax.swing.JLabel();
        manageBooking = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        logOut = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

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

        userBookList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user-booklist.png"))); // NOI18N
        userBookList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userBookList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userBookListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userBookListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userBookListMouseExited(evt);
            }
        });
        jPanel1.add(userBookList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 30));

        manageBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/manage-booking-selected.png"))); // NOI18N
        manageBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageBookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageBookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageBookingMouseExited(evt);
            }
        });
        jPanel1.add(manageBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 210, 30));

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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 39, 76));
        jLabel1.setText("Manage Booking");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 160, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 80, 690, 370));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 39, 76));
        jLabel3.setText("See the bookings, payment status of all users");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 280, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/arrow-left.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, 35));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 800, 460));

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

    private void userBookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBookListMouseClicked
        new AdminDashboardUserBookList1().setVisible(true);
        dispose();
    }//GEN-LAST:event_userBookListMouseClicked

    private void userBookListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBookListMouseEntered
        userBookList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user-booklist-selected.png")));
    }//GEN-LAST:event_userBookListMouseEntered

    private void userBookListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBookListMouseExited
        userBookList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user-booklist.png")));
    }//GEN-LAST:event_userBookListMouseExited

    private void manageBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBookingMouseClicked

    }//GEN-LAST:event_manageBookingMouseClicked

    private void manageBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBookingMouseEntered

    }//GEN-LAST:event_manageBookingMouseEntered

    private void manageBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageBookingMouseExited

    }//GEN-LAST:event_manageBookingMouseExited

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

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        new AdminDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboardManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboardManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboardManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboardManageBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminDashboardManageBooking().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AdminDashboardManageBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoText;
    private javax.swing.JLabel manageBooking;
    private javax.swing.JLabel userBookList;
    // End of variables declaration//GEN-END:variables
}
