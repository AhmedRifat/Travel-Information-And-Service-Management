package travelinformationandservicemanagement;

import javax.swing.ImageIcon;

public class EnterAs extends javax.swing.JFrame {

    private ImageIcon icon;

    public EnterAs() {
        initComponents();
        bgImage2.setVisible(false);
        icon = new ImageIcon(getClass().getResource("/assets/4153125-02.png"));
        this.setIconImage(icon.getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        border = new javax.swing.JPanel();
        bgImage2 = new javax.swing.JLabel();
        bgImage1 = new javax.swing.JLabel();
        titleText = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GOTRIPCO");
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        border.setBackground(new java.awt.Color(30, 39, 76));
        border.setPreferredSize(new java.awt.Dimension(900, 500));

        bgImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg-02.png"))); // NOI18N

        bgImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bg-01.png"))); // NOI18N

        titleText.setBackground(new java.awt.Color(95, 179, 255));
        titleText.setFont(new java.awt.Font("Lovelo Black", 0, 48)); // NOI18N
        titleText.setForeground(new java.awt.Color(186, 208, 255));
        titleText.setText("ENTER AS");

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button1.png"))); // NOI18N
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });

        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button3.png"))); // NOI18N
        admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminMouseExited(evt);
            }
        });

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(bgImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(740, 740, 740))
            .addGroup(borderLayout.createSequentialGroup()
                .addComponent(bgImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(borderLayout.createSequentialGroup()
                .addGroup(borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borderLayout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(user))
                    .addGroup(borderLayout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(borderLayout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(titleText)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgImage2)
                .addGap(47, 47, 47)
                .addComponent(titleText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admin)
                .addGap(95, 95, 95)
                .addComponent(bgImage1)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, 1689, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, 1416, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened


    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button2.png")));
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button1.png")));
    }//GEN-LAST:event_userMouseExited

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        final int MAX_Y = 400;
        final int MIN_Y = -800;
        titleText.setVisible(false);
        bgImage1.setVisible(false);
        user.setVisible(false);
        admin.setVisible(false);
        bgImage2.setLayout(null);
        bgImage2.setVisible(true);
        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {

                int x = 0;
                int y = 500;  //label start positions
                boolean checked = true;
                while (true) {
                    if (checked) {
                        bgImage2.setLocation(x, y);
                        y -= 10;
                    } else {
                        bgImage2.setLocation(x, y);
                        y -= 10;
                    }
                    if (y < MIN_Y) {
                        checked = false;
                        bgImage2.setVisible(false);
                        dispose();
                        new UserLoginReg().setVisible(true);
                        break;
                    }
                    try {
                        Thread.sleep(5);
                    } catch (Exception e) {
                    }
                }
            }
        });
        animation.start();
    }//GEN-LAST:event_userMouseClicked

    private void adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseEntered
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button4.png")));
    }//GEN-LAST:event_adminMouseEntered

    private void adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseExited
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button3.png")));
    }//GEN-LAST:event_adminMouseExited

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        final int MAX_Y = 400;
        final int MIN_Y = -800;
        titleText.setVisible(false);
        bgImage1.setVisible(false);
        admin.setVisible(false);
        user.setVisible(false);
        bgImage2.setLayout(null);
        bgImage2.setVisible(true);
        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {

                int x = 0;
                int y = 500;  //label start positions
                boolean checked = true;
                while (true) {
                    if (checked) {
                        bgImage2.setLocation(x, y);
                        y -= 10;
                    } else {
                        bgImage2.setLocation(x, y);
                        y -= 10;
                    }
                    if (y < MIN_Y) {
                        checked = false;
                        bgImage2.setVisible(false);
                        dispose();
                        new AdminLogin().setVisible(true);
                        break;
                    }
                    try {
                        Thread.sleep(5);
                    } catch (Exception e) {
                    }
                }
            }
        });
        animation.start();
    }//GEN-LAST:event_adminMouseClicked

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
            java.util.logging.Logger.getLogger(EnterAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterAs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        EnterAs log = new EnterAs();
        log.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JLabel bgImage1;
    private javax.swing.JLabel bgImage2;
    private javax.swing.JPanel border;
    private javax.swing.JLabel titleText;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
