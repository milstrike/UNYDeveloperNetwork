/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unydevelopernetwork.mymorse;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.Timer;


import library.JavaToast;

/**
 *
 * @author M. Irfan Luthfi
 */
public class Main extends javax.swing.JFrame {

    private String preprocessedText1 = "";
    private String postprocessedText1 = "";
    private String preprocessedText2 = "";
    private String postprocessedText2 = "";
    
    public Main() {
        initComponents();
        initLevel0();
    }
    
    private void initLevel0(){
        setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_square.png")));
    }
    
    private void clipboardCopier(String texte){
        StringSelection stringSelection = new StringSelection(texte);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }
    
    private void showToast(String message){
        final JDialog dialog = new JavaToast(Main.this, true, message);
                Timer timer = new Timer(JavaToast.LENGTH_SHORT, (ActionEvent e) -> {
                    dialog.setVisible(false);
                    dialog.dispose();
        });
                timer.setRepeats(false);
                timer.start();
 
                dialog.setVisible(true); // if modal, application will pause here
    }

    private void convertToMorse(String inputs){
        char[] preprocessed = inputs.toCharArray();
        String result = "";
        for(int i = 0; i < preprocessed.length; i++){
            result = result + MorseCode.textToMorse(Character.toString(preprocessed[i])) + " ";
        }
        displayToOutput(result);
    }
    
    private void displayToOutput(String results){
        postprocessedText1 = results + "";
        outputTeks1.setText(results + "");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputTeks1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTeks1 = new javax.swing.JTextArea();
        playButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputTeks2 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        outputTeks2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNYDeveloperNetwork - MyMorse");
        setResizable(false);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(java.awt.SystemColor.controlDkShadow);
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "[ KELUARAN ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        outputTeks1.setEditable(false);
        outputTeks1.setBackground(java.awt.SystemColor.control);
        outputTeks1.setColumns(20);
        outputTeks1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        outputTeks1.setForeground(new java.awt.Color(0, 0, 0));
        outputTeks1.setLineWrap(true);
        outputTeks1.setRows(5);
        outputTeks1.setWrapStyleWord(true);
        outputTeks1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jScrollPane2.setViewportView(outputTeks1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "[ MASUKAN ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        inputTeks1.setBackground(java.awt.SystemColor.control);
        inputTeks1.setColumns(20);
        inputTeks1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        inputTeks1.setForeground(new java.awt.Color(0, 0, 0));
        inputTeks1.setLineWrap(true);
        inputTeks1.setRows(5);
        inputTeks1.setToolTipText("<html>\nUntuk mempaste hasil copyan, gunakan CTRL + V.\n</html>");
        inputTeks1.setWrapStyleWord(true);
        inputTeks1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        inputTeks1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputTeks1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(inputTeks1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        playButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        playButton.setText("<html>\n&#9658;\n</html>");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton2.setText("Salin Hasil Konversi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html>\nTeks Biasa &#8594; Kode / Sandi Morse\n</html>", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "[ MASUKAN ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jScrollPane3.setToolTipText("<html>\n<p align=\"justify\">\nUntuk memisahkan antar sandi morse, gunakan satu spasi.\n<br/>Untuk memisahkan antar kata, gunakan dua spasi.\n<br/><br/>Untuk mempaste hasil copyan, gunakan CTRL + V.\n</p>\n</html>");

        inputTeks2.setBackground(java.awt.SystemColor.control);
        inputTeks2.setColumns(20);
        inputTeks2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        inputTeks2.setForeground(new java.awt.Color(0, 0, 0));
        inputTeks2.setLineWrap(true);
        inputTeks2.setRows(5);
        inputTeks2.setToolTipText("<html>\nUntuk memisahkan antar sandi morse, gunakan satu spasi.\n<br/>Untuk memisahkan antar kata, gunakan dua spasi.\n<br/>\n<br/>\nUntuk mempaste hasil copyan, gunakan CTRL + V.\n</html>");
        inputTeks2.setWrapStyleWord(true);
        inputTeks2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        inputTeks2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputTeks2KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(inputTeks2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "[ KELUARAN ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));

        outputTeks2.setEditable(false);
        outputTeks2.setBackground(java.awt.SystemColor.control);
        outputTeks2.setColumns(20);
        outputTeks2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        outputTeks2.setForeground(new java.awt.Color(0, 0, 0));
        outputTeks2.setLineWrap(true);
        outputTeks2.setRows(5);
        outputTeks2.setWrapStyleWord(true);
        outputTeks2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jScrollPane4.setViewportView(outputTeks2);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton3.setText("Konversikan!");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton4.setText("Bantuan");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton5.setText("Salin Hasil Konversi");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("<html>\nKode / Sandi Morse &#8594; Teks Biasa\n</html>", jPanel4);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "[ KODE / SANDI YANG DIDUKUNG ]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), java.awt.SystemColor.textText)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.windowText);
        jLabel1.setText("<html>\nW &nbsp; • – –\n<br/>X &nbsp; – • • –\n<br/>Y &nbsp; – • – –\n<br/>Z &nbsp; – – • •\n<br/>\n<br/><b><u>ANGKA</u></b>\n<br/>1 &nbsp; • – – – –\n<br/>2 &nbsp; • • – – –\n<br/>3 &nbsp; • • • – –\n<br/>4 &nbsp; • • • • –\n<br/>5 &nbsp; • • • • •\n<br/>6 &nbsp; – • • • •\n<br/>7 &nbsp; – – • • •\n<br/>8 &nbsp; – – – • •\n<br/>9 &nbsp; – – – – •\n<br/>0 &nbsp; – – – – –\n<br/>\n<br/><b><u>TANDA BACA</u></b>\n<br/>. &nbsp; • − • − • − \n<br/>, &nbsp; − − • • − − \n<br/>? &nbsp; • • − − • • \n<br/>' &nbsp; • − − − − • \n</html>");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setForeground(java.awt.SystemColor.windowText);
        jLabel2.setText("<html>\nA &nbsp; • –\n<br/>B &nbsp; – • • •\n<br/>C &nbsp; – • – •\n<br/>D &nbsp; – • •\n<br/>E &nbsp; •\n<br/>F &nbsp; • • – •\n<br/>G &nbsp; – – •\n<br/>H &nbsp; • • • •\n<br/>I &nbsp; • •\n<br/>J &nbsp; • – – –\n<br/>K &nbsp; – • –\n<br/>L &nbsp; • – • •\n<br/>M &nbsp; – –\n<br/>N &nbsp; – •\n<br/>O &nbsp; – – –\n<br/>P &nbsp; • – – •\n<br/>Q &nbsp; – – • –\n<br/>R &nbsp; • – •\n<br/>S &nbsp; • • •\n<br/>T &nbsp; –\n<br/>U &nbsp; • • –\n<br/>V &nbsp; • • • –\n</html>");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setForeground(java.awt.SystemColor.windowText);
        jLabel3.setText("<html>\n! &nbsp; − • − • − −\n<br/>/ &nbsp; − • • − • \n<br/>& &nbsp; • − • • • \n<br/>: &nbsp; − − − • • •\n<br/>; &nbsp; − • − • − • \n<br/>= &nbsp; − • • • − \n<br/>+ &nbsp; • − • − • \n<br/>- &nbsp; − • • • • − \n<br/>_ &nbsp; • • − − • − \n<br/>\" &nbsp; • − • • − • \n<br/>$ &nbsp; • • • − • • − \n<br/>@ &nbsp; • − − • − • \n</html>");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Kode / Sandi Morse yang Didukung", jPanel7);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputTeks1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTeks1KeyReleased
        preprocessedText1 = (inputTeks1.getText() + "").toUpperCase();
        inputTeks1.setText(preprocessedText1);
        convertToMorse(preprocessedText1);
    }//GEN-LAST:event_inputTeks1KeyReleased

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        char[] extractChara = postprocessedText1.toCharArray();
        for(int a = 0; a < extractChara.length; a++){
            try {
                String n = Character.toString(extractChara[a]);
                AudioPlayer.playAudio(n+"");
                TimeUnit.MILLISECONDS.sleep(135);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_playButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clipboardCopier(outputTeks1.getText());
        showToast("Output telah disalin!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inputTeks2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputTeks2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTeks2KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        char [] characterius = (inputTeks2.getText() + "").toCharArray();
        String nanochar = "";
        for(int x = 0; x < characterius.length; x++){
            String alpha = Character.toString(characterius[x]);
            if(alpha.equals(" ")){
                String yen = MorseCode.morseToText(nanochar);
                preprocessedText2 = preprocessedText2 + yen;
                nanochar = "";
                System.out.print(yen);
            }
            else{
                nanochar = nanochar + alpha;
                //System.out.println(nanochar);
            }
        }
        
        char [] characniom = preprocessedText2.toCharArray();
        int xenesys = 0;
        preprocessedText2 = "";
        for(int gacha = 0; gacha < characniom.length; gacha++){
            String omega = Character.toString(characniom[gacha]);
            if(omega.equals(" ")){
                if(xenesys < 1){
                    preprocessedText2 = preprocessedText2 + " ";
                    xenesys++;
                }
                else if(xenesys > 0 & xenesys < 3){
                    xenesys++;
                }
                else{
                    xenesys = 0;
                }
            }
            else{
                preprocessedText2 = preprocessedText2 + omega;
                xenesys = 0;
            }
        }
        displayToOutput2(preprocessedText2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clipboardCopier(outputTeks2.getText());
        showToast("Output telah disalin!");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Bantuan().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void displayToOutput2(String results){
        postprocessedText2 = results;
        outputTeks2.setText(postprocessedText2 + "");
        preprocessedText2 = "";
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea inputTeks1;
    private javax.swing.JTextArea inputTeks2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea outputTeks1;
    private javax.swing.JTextArea outputTeks2;
    private javax.swing.JButton playButton;
    // End of variables declaration//GEN-END:variables
}
