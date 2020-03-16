
package mil.system.mynavigation;

import java.awt.Toolkit;

/**
 *
 * @author M. Irfan Luthfi
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        initLevel0();
    }
    
    private void initLevel0(){
        setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_square.png")));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnJFrame1 = new javax.swing.JButton();
        btnJFrame2 = new javax.swing.JButton();
        btnJFrame3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblJFrame1 = new javax.swing.JLabel();
        lblJFrame2 = new javax.swing.JLabel();
        lblJFrame3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rdoJFrame1 = new javax.swing.JRadioButton();
        rdoJFrame2 = new javax.swing.JRadioButton();
        rdoJFrame3 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        scrJFrame = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mnuJFrame1 = new javax.swing.JMenuItem();
        mnuJFrame2 = new javax.swing.JMenuItem();
        mnuJFrame3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Navigation");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("[ Button ]"));

        btnJFrame1.setText("Jframe 1");
        btnJFrame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJFrame1ActionPerformed(evt);
            }
        });

        btnJFrame2.setText("Jframe 2");
        btnJFrame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJFrame2ActionPerformed(evt);
            }
        });

        btnJFrame3.setText("JFrame 3");
        btnJFrame3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJFrame3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnJFrame1)
                    .addComponent(btnJFrame2)
                    .addComponent(btnJFrame3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnJFrame1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJFrame2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJFrame3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("[ Label ]"));

        lblJFrame1.setText("Jframe 1");
        lblJFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJFrame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJFrame1MouseClicked(evt);
            }
        });

        lblJFrame2.setText("JFrame 2");
        lblJFrame2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJFrame2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJFrame2MouseClicked(evt);
            }
        });

        lblJFrame3.setText("Jframe 3");
        lblJFrame3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblJFrame3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJFrame3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJFrame2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblJFrame3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblJFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJFrame1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJFrame2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJFrame3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("[ Radio Button ]"));

        rdoJFrame1.setText("Jfframe 1");
        rdoJFrame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoJFrame1ActionPerformed(evt);
            }
        });

        rdoJFrame2.setText("JFrame 2");
        rdoJFrame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoJFrame2ActionPerformed(evt);
            }
        });

        rdoJFrame3.setText("Jframe 3");
        rdoJFrame3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoJFrame3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdoJFrame2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdoJFrame3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdoJFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdoJFrame1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoJFrame2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoJFrame3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("[ Combo Box ]"));

        scrJFrame.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JFrame 1", "JFrame 2", "JFrame 3" }));
        scrJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrJFrameActionPerformed(evt);
            }
        });

        jLabel4.setText("Chose JFrame:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrJFrame, 0, 76, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Navigate To ...");
        jMenu1.setToolTipText("");

        jMenu2.setText("Choose Frame     ");

        mnuJFrame1.setText("JFrame 1               ");
        mnuJFrame1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuJFrame1ActionPerformed(evt);
            }
        });
        jMenu2.add(mnuJFrame1);

        mnuJFrame2.setText("JFrame 2               ");
        mnuJFrame2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuJFrame2ActionPerformed(evt);
            }
        });
        jMenu2.add(mnuJFrame2);

        mnuJFrame3.setText("JFrame 3");
        mnuJFrame3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuJFrame3ActionPerformed(evt);
            }
        });
        jMenu2.add(mnuJFrame3);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuJFrame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuJFrame1ActionPerformed
        new MyFrame1().setVisible(true);
    }//GEN-LAST:event_mnuJFrame1ActionPerformed

    private void mnuJFrame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuJFrame2ActionPerformed
        new MyFrame2().setVisible(true);
    }//GEN-LAST:event_mnuJFrame2ActionPerformed

    private void mnuJFrame3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuJFrame3ActionPerformed
        new MyFrame3().setVisible(true);
    }//GEN-LAST:event_mnuJFrame3ActionPerformed

    private void btnJFrame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJFrame1ActionPerformed
        new MyFrame1().setVisible(true);
    }//GEN-LAST:event_btnJFrame1ActionPerformed

    private void btnJFrame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJFrame2ActionPerformed
        new MyFrame2().setVisible(true);
    }//GEN-LAST:event_btnJFrame2ActionPerformed

    private void btnJFrame3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJFrame3ActionPerformed
        new MyFrame3().setVisible(true);
    }//GEN-LAST:event_btnJFrame3ActionPerformed

    private void lblJFrame1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJFrame1MouseClicked
        new MyFrame1().setVisible(true);
    }//GEN-LAST:event_lblJFrame1MouseClicked

    private void lblJFrame2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJFrame2MouseClicked
        new MyFrame2().setVisible(true);
    }//GEN-LAST:event_lblJFrame2MouseClicked

    private void lblJFrame3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJFrame3MouseClicked
        new MyFrame3().setVisible(true);
    }//GEN-LAST:event_lblJFrame3MouseClicked

    private void radioReset(){
        rdoJFrame1.setSelected(false);
        rdoJFrame2.setSelected(false);
        rdoJFrame3.setSelected(false);
    }
    
    private void rdoJFrame1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoJFrame1ActionPerformed
        radioReset();
        rdoJFrame1.setSelected(true);
        new MyFrame1().setVisible(true);
    }//GEN-LAST:event_rdoJFrame1ActionPerformed

    private void rdoJFrame2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoJFrame2ActionPerformed
        radioReset();
        rdoJFrame2.setSelected(true);
        new MyFrame2().setVisible(true);
    }//GEN-LAST:event_rdoJFrame2ActionPerformed

    private void rdoJFrame3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoJFrame3ActionPerformed
        radioReset();
        rdoJFrame3.setSelected(true);
        new MyFrame3().setVisible(true);
    }//GEN-LAST:event_rdoJFrame3ActionPerformed

    private void scrJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrJFrameActionPerformed
        String x = scrJFrame.getSelectedItem().toString();
        switch(x){
            case "JFrame 1":
                new MyFrame1().setVisible(true);
                break;
            case "JFrame 2":
                new MyFrame2().setVisible(true);
                break;
            case "JFrame 3":
                new MyFrame3().setVisible(true);
                break;
        }
    }//GEN-LAST:event_scrJFrameActionPerformed

/* private void scrJFrameActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int x = scrJFrame.getSelectedIndex
        switch(x){
            case 0:
                new MyFrame1().setVisible(true);
                break;
            case 1:
                new MyFrame2().setVisible(true);
                break;
            case 2:
                new MyFrame3().setVisible(true);
                break;
        }
    } */  
    

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJFrame1;
    private javax.swing.JButton btnJFrame2;
    private javax.swing.JButton btnJFrame3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblJFrame1;
    private javax.swing.JLabel lblJFrame2;
    private javax.swing.JLabel lblJFrame3;
    private javax.swing.JMenuItem mnuJFrame1;
    private javax.swing.JMenuItem mnuJFrame2;
    private javax.swing.JMenuItem mnuJFrame3;
    private javax.swing.JRadioButton rdoJFrame1;
    private javax.swing.JRadioButton rdoJFrame2;
    private javax.swing.JRadioButton rdoJFrame3;
    private javax.swing.JComboBox scrJFrame;
    // End of variables declaration//GEN-END:variables
}
