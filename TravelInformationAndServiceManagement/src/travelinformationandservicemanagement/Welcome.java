package travelinformationandservicemanagement;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class Welcome extends javax.swing.JFrame {

    private ImageIcon icon;

    public Welcome() {
        initComponents();
        icon = new ImageIcon(getClass().getResource("/assets/4153125-02.png"));
        this.setIconImage(icon.getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();
        loading = new javax.swing.JProgressBar();
        loadingText = new javax.swing.JLabel();
        loadingPercentage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(30, 39, 76));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/4153125-01.png"))); // NOI18N

        heading.setFont(new java.awt.Font("Roboto Black", 0, 48)); // NOI18N
        heading.setForeground(new java.awt.Color(95, 179, 255));
        heading.setText("GOTRIPCO");

        loadingText.setFont(new java.awt.Font("Roboto Black", 0, 20)); // NOI18N
        loadingText.setForeground(new java.awt.Color(95, 179, 255));
        loadingText.setText("Loading...");

        loadingPercentage.setFont(new java.awt.Font("Roboto Black", 0, 22)); // NOI18N
        loadingPercentage.setForeground(new java.awt.Color(95, 179, 255));
        loadingPercentage.setText("0 %");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(heading)))
                .addContainerGap(300, Short.MAX_VALUE))
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(loadingText, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loadingPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadingText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadingPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loading, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.put("nimbusOrange", new Color(23, 122, 235));
        Welcome wel = new Welcome();
        wel.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(60);
                wel.loadingPercentage.setText(i + " %");
                if (i > 75) {
                    wel.loadingText.setText("");
                    if (i > 80) {
                        wel.loadingText.setText("Launching Application...");
                    }
                } else if (i > 50) {
                    wel.loadingText.setText("");
                    if (i > 55) {
                        wel.loadingText.setText("Loading Modules...");
                    }
                } else if (i > 25) {
                    wel.loadingText.setText("");
                    if (i > 30) {
                        wel.loadingText.setText("Setting Assets...");
                    }
                }
                wel.loading.setValue(i);
            }
        } catch (InterruptedException ex) {
        }
        EnterAs log = new EnterAs();
        log.setVisible(true);
        wel.setVisible(false);
        wel.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel heading;
    private javax.swing.JProgressBar loading;
    private javax.swing.JLabel loadingPercentage;
    private javax.swing.JLabel loadingText;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
