package com.unydevelopernetwork.simplemp3player;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.Format;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.media.PlugInManager;
import javax.media.Time;
import javax.media.format.AudioFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



/**
 *
 * @author M. Irfan Luthfi
 */
public class Main extends javax.swing.JFrame {
    
    private static int counter = 0;
    private static int counterX = 0;
    private static int statePlay = 0;
    private static int loopPlay = 0;
    private static int enterPlay = 0;
    private int max = 10; 
    private final int min = 0; 
    private int ranges = 0; 
    private int randomization = 0;
    private int headache = 0;
    private MediaLocator ml;
    
    private static int currentTimers = 0;
    private final boolean running = true;
    
    private int playedTracks = 0;
    private float gain = 0;
    
    private Time resume;
    
    private static final String[] SongUri = new String[5000];
    private static final String[] SongFileName = new String[5000];
    private static final String[] SongTitle = new String[5000];
    private static final String[] SongArtist = new String[5000];
    private static final String[] SongComposer = new String[5000];
    private static final String[] SongGenre = new String[5000];
    private static final String[] SongAlbum = new String[5000];
    private static final String[] SongBits = new String[5000];
    private static final String[] SongTime = new String[5000];
    private static final Format input1 = new AudioFormat(AudioFormat.MPEGLAYER3);
    private static final Format input2 = new AudioFormat(AudioFormat.MPEG);
    private static final Format output = new AudioFormat(AudioFormat.LINEAR);
    private static Player player;
    private static Thread thread;
   
    public Main() {
        initComponents();
        initLevel0();
        initLevel1();
        initLevel2();
        playSeekBar();
    }
    
    private void initLevel0(){
        setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo_square.png")));
    }
    
    private void initLevel1(){
        seekbar.setValue(0);
        openMusic.setMultiSelectionEnabled(true);
    }
    
    private void initLevel2(){
        Format[] formatIn = new Format[2];
        formatIn[0] = input1;
        formatIn[1] = input2;
        
        Format[] out = new Format[1];
        out[0] = output;
        PlugInManager.addPlugIn(
            "com.sun.media.codec.audio.mp3.JavaDecoder",
            formatIn,
            out,
            PlugInManager.CODEC
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openMusic = new javax.swing.JFileChooser();
        saveList = new javax.swing.JFileChooser();
        openList = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        viewTimeTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        viewTimeLapsed = new javax.swing.JLabel();
        playStatus = new javax.swing.JLabel();
        seekbar = new javax.swing.JSlider();
        viewMusicTitle = new javax.swing.JLabel();
        viewAlbumName = new javax.swing.JLabel();
        viewBits = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        volumeRocker = new javax.swing.JSlider();
        randomizerStatus = new javax.swing.JLabel();
        loopStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMusic = new javax.swing.JList();
        btnPlay = new javax.swing.JButton();
        btnFastForward = new javax.swing.JButton();
        btnFastBackward = new javax.swing.JButton();
        btnNextTrack = new javax.swing.JButton();
        btnPrevTrack = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnRemoveMusic = new javax.swing.JButton();
        btnAddMusic = new javax.swing.JButton();
        btnSavePlaylist = new javax.swing.JButton();
        btnLoadPlaylist = new javax.swing.JButton();
        btnRandomTrack = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        btnLoop = new javax.swing.JToggleButton();

        openMusic.setApproveButtonText("Buka Musik");
        openMusic.setDialogTitle("Buka File Musik");
        openMusic.setFileFilter(new customFilter());

        saveList.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        saveList.setApproveButtonText("Simpan");
        saveList.setDialogTitle("Simpan Daftar Putar");
        saveList.setFileFilter(new customFilterMusicLists());

        openList.setApproveButtonText("Buka Daftar");
        openList.setDialogTitle("Buka Daftar Putar");
        openList.setFileFilter(new customFilterMusicLists());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UDN - SIJAMP");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "[ PANEL INFORMASI ]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        viewTimeTotal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        viewTimeTotal.setText("00:00");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("/");

        viewTimeLapsed.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        viewTimeLapsed.setText("00:00");

        playStatus.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        playStatus.setText("BERHENTI");

        viewMusicTitle.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        viewMusicTitle.setText("Judul: ");

        viewAlbumName.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        viewAlbumName.setText("Album:");

        viewBits.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        viewBits.setText("Sample Rate:");

        jLabel1.setFont(new java.awt.Font("Webdings", 1, 14)); // NOI18N
        jLabel1.setText("");

        volumeRocker.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumeRockerStateChanged(evt);
            }
        });

        randomizerStatus.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N

        loopStatus.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seekbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(volumeRocker, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewTimeLapsed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewTimeTotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewMusicTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(randomizerStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loopStatus))
                            .addComponent(viewBits)
                            .addComponent(viewAlbumName, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playStatus)
                    .addComponent(randomizerStatus)
                    .addComponent(loopStatus))
                .addGap(0, 0, 0)
                .addComponent(viewMusicTitle)
                .addGap(0, 0, 0)
                .addComponent(viewAlbumName)
                .addGap(0, 0, 0)
                .addComponent(viewBits)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(seekbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(volumeRocker, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viewTimeTotal)
                        .addComponent(jLabel2)
                        .addComponent(viewTimeLapsed))
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "[ ANTRIAN MUSIK ]", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        listMusic.setFont(new java.awt.Font("Arial Unicode MS", 0, 11)); // NOI18N
        listMusic.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Belum Ada Musik..." };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listMusic.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMusicMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listMusic);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        btnPlay.setFont(new java.awt.Font("Webdings", 1, 11)); // NOI18N
        btnPlay.setText("");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnFastForward.setFont(new java.awt.Font("Webdings", 1, 11)); // NOI18N
        btnFastForward.setText("");
        btnFastForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFastForwardActionPerformed(evt);
            }
        });

        btnFastBackward.setFont(new java.awt.Font("Webdings", 1, 11)); // NOI18N
        btnFastBackward.setText("");
        btnFastBackward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFastBackwardActionPerformed(evt);
            }
        });

        btnNextTrack.setFont(new java.awt.Font("Webdings", 1, 11)); // NOI18N
        btnNextTrack.setText("");
        btnNextTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextTrackActionPerformed(evt);
            }
        });

        btnPrevTrack.setFont(new java.awt.Font("Webdings", 1, 11)); // NOI18N
        btnPrevTrack.setText("");
        btnPrevTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevTrackActionPerformed(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Webdings", 0, 11)); // NOI18N
        btnStop.setText("");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnRemoveMusic.setText("Hapus Musik");
        btnRemoveMusic.setEnabled(false);
        btnRemoveMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveMusicActionPerformed(evt);
            }
        });

        btnAddMusic.setText("Tambah Musik");
        btnAddMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMusicActionPerformed(evt);
            }
        });

        btnSavePlaylist.setText("Simpan Daftar Putar");
        btnSavePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePlaylistActionPerformed(evt);
            }
        });

        btnLoadPlaylist.setText("Muat Daftar Putar");
        btnLoadPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadPlaylistActionPerformed(evt);
            }
        });

        btnRandomTrack.setFont(new java.awt.Font("Wingdings 3", 1, 11)); // NOI18N
        btnRandomTrack.setText("");
        btnRandomTrack.setToolTipText("Acak antrian musik.");
        btnRandomTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomTrackActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Webdings", 1, 11)); // NOI18N
        jButton2.setText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnLoop.setFont(new java.awt.Font("Wingdings 3", 1, 11)); // NOI18N
        btnLoop.setText("");
        btnLoop.setToolTipText("Putar musik berulang-ulang");
        btnLoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemoveMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddMusic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSavePlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLoadPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRandomTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnPrevTrack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFastBackward)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFastForward)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNextTrack)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNextTrack)
                    .addComponent(btnFastForward)
                    .addComponent(btnPlay)
                    .addComponent(btnStop)
                    .addComponent(btnFastBackward)
                    .addComponent(btnPrevTrack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRandomTrack)
                            .addComponent(btnLoop))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddMusic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveMusic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSavePlaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoadPlaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(7, 7, 7)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMusicActionPerformed
        int returnVal = openMusic.showOpenDialog(this);
        if (returnVal == openMusic.APPROVE_OPTION) {
            File[] file = openMusic.getSelectedFiles();
            for(int a = 0; a < file.length; a++){
                SongUri[counter] = file[a].getAbsolutePath();
                SongFileName[counter] = file[a].getName();
            
                System.out.println(file[a].getAbsolutePath());
                try {
                InputStream input = new FileInputStream(new File(SongUri[counter]));
                DefaultHandler handler = new DefaultHandler();
                Metadata metadata = new Metadata();
                Parser parser = new Mp3Parser();
                ParseContext parseCtx = new ParseContext();
                parser.parse(input, handler, metadata, parseCtx);
                input.close();

                // List all metadata
                String[] metadataNames = metadata.names();

                for(String name : metadataNames){
                    System.out.println(name + ": " + metadata.get(name));
                }

                // Retrieve the necessary info from metadata
                // Names - title, xmpDM:artist etc. - mentioned below may differ based
                System.out.println("----------------------------------------------");
                System.out.println("Title: " + metadata.get("title"));
                SongTitle[counter] = metadata.get("title");
                System.out.println("Artists: " + metadata.get("xmpDM:artist"));
                SongArtist[counter] = metadata.get("xmpDM:artist");
                System.out.println("Composer : "+metadata.get("xmpDM:composer"));
                SongComposer[counter] = metadata.get("xmpDM:composer");
                System.out.println("Genre : "+metadata.get("xmpDM:genre"));
                SongGenre[counter] = metadata.get("xmpDM:genre");
                System.out.println("Album : "+metadata.get("xmpDM:album"));
                SongAlbum[counter] = metadata.get("xmpDM:album");
                System.out.println("samplerate : "+metadata.get("samplerate"));
                SongBits[counter] = metadata.get("samplerate");
                System.out.println("SongTime : "+metadata.get("xmpDM:duration"));
                SongTime[counter] = metadata.get("xmpDM:duration");
                
                counter++;

                } catch (FileNotFoundException e) {
                } catch (IOException e) {
                } catch (SAXException | TikaException e) {
                }
            }
            loadMusicToList();
        }
        else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btnAddMusicActionPerformed

    private void btnRemoveMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveMusicActionPerformed
        int selectedIndex = listMusic.getSelectedIndex();
        if(player != null & playedTracks == selectedIndex){
            fullstopTrack();
            for(int z = selectedIndex; z < counter; z++){
                SongUri[z] = SongUri[z+1];
                SongFileName[z] = SongFileName[z+1];
                SongTitle[z] = SongTitle[z+1];
                SongArtist[z] = SongArtist[z+1];
                SongComposer[z] = SongComposer[z+1];
                SongGenre[z] = SongGenre[z+1];
                SongAlbum[z] = SongAlbum[z+1];
                SongBits[z] = SongBits[z+1];
            SongTime[z] = SongTime[z+1];
            }
            counter--;
            loadMusicToList();
            btnRemoveMusic.setEnabled(false);
        }
        else{
            for(int z = selectedIndex; z < counter; z++){
                SongUri[z] = SongUri[z+1];
                SongFileName[z] = SongFileName[z+1];
                SongTitle[z] = SongTitle[z+1];
                SongArtist[z] = SongArtist[z+1];
                SongComposer[z] = SongComposer[z+1];
                SongGenre[z] = SongGenre[z+1];
                SongAlbum[z] = SongAlbum[z+1];
                SongBits[z] = SongBits[z+1];
                SongTime[z] = SongTime[z+1];
            }
            counter--;
            loadMusicToList();
            btnRemoveMusic.setEnabled(false);
        }
    }//GEN-LAST:event_btnRemoveMusicActionPerformed

    private void btnSavePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePlaylistActionPerformed
        String listofMusic = "";
        for(int aa = 0; aa < counter; aa++){
            if(aa != (counter-1)){
                listofMusic = listofMusic + SongUri[aa] + ";";
            }
            else{
                listofMusic = listofMusic + SongUri[aa];
            }
            
        }
        int returnVal = saveList.showSaveDialog(jLabel2);
        if (returnVal == saveList.APPROVE_OPTION) {
            File file = saveList.getSelectedFile();
            try {
                try(FileWriter fw = new FileWriter(file+".lists")) {
                    fw.write(listofMusic);
                }
                JOptionPane.showMessageDialog(null, "Daftar musik berhasil disimpan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } 
            catch (IOException ex) {
                System.out.println("problem accessing file"+file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btnSavePlaylistActionPerformed

    private void btnLoadPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadPlaylistActionPerformed
        String alphaLists = "";
        int returnVal = openList.showOpenDialog(jLabel2);
        if (returnVal == openList.APPROVE_OPTION) {
            try {
                File file = openList.getSelectedFile();
                BufferedReader in;
                in = new BufferedReader(new FileReader(file));
                String line = null;
                try {
                    line = in.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                while (line != null) {
                    alphaLists = alphaLists + line;
                    try {
                        line = in.readLine();
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(alphaLists);
            songListBreaker(alphaLists);
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btnLoadPlaylistActionPerformed

    private void playClicked(){
        if(enterPlay == 0){
            if(counter != 0){
                playStatus.setText("MEMAINKAN: ");
                int nanoMusic = listMusic.getSelectedIndex();
                String URIMusic = SongUri[nanoMusic];
                File mp3file = new File(URIMusic);
                playMusic(nanoMusic, mp3file);
                btnPlay.setText("");
                enterPlay = 1;
            }
        }
        else{
            if(statePlay == 1){
                playStatus.setText("MEMAINKAN: ");
                btnPlay.setText("");
                long yex = resume.getNanoseconds();
                player.setMediaTime(new Time(yex));
                player.start();
                statePlay = 0;
                thread.resume();
            }
            else{
                btnPlay.setText("");
                playStatus.setText("JEDA");
                resume = player.getMediaTime();
                player.stop();
                statePlay = 1;
                thread.suspend();
            }
        }
    }
     
    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        playClicked();
    }//GEN-LAST:event_btnPlayActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        fullstopTrack();
        enterPlay = 0;
        btnPlay.setText("");
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnNextTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextTrackActionPerformed
        if(player == null){
            listMusic.setSelectedIndex(listMusic.getSelectedIndex() + 1);
            setInformationDisplay(listMusic.getSelectedIndex());
        }
        else{
            nextTrack();
        }
    }//GEN-LAST:event_btnNextTrackActionPerformed

    private void btnFastForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFastForwardActionPerformed
        long mediaNanos = (long)(player.getMediaTime().getNanoseconds() + (10 * 1000000000) + (10 * 1000000000));
        loopPlay = loopPlay + 2;
        player.stop();
        player.setMediaTime(new Time(mediaNanos));
        player.start();
    }//GEN-LAST:event_btnFastForwardActionPerformed

    private void btnPrevTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevTrackActionPerformed
        prevTrack();
    }//GEN-LAST:event_btnPrevTrackActionPerformed

    private void volumeRockerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumeRockerStateChanged
        gain = (float) volumeRocker.getValue();
        System.out.println(gain);
        volumeChanger(gain);
    }//GEN-LAST:event_volumeRockerStateChanged

    private void btnFastBackwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFastBackwardActionPerformed
        long mediaNanos = (long)(player.getMediaTime().getNanoseconds() - (10 * 1000000000) - (10 * 1000000000));
        loopPlay = loopPlay - 2;
        player.stop();
        player.setMediaTime(new Time(mediaNanos));
        player.start();
    }//GEN-LAST:event_btnFastBackwardActionPerformed

    private void btnRandomTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomTrackActionPerformed
        if(btnRandomTrack.isSelected()){
            randomization = 1;
            randomizerStatus.setText("ACAK ANTRIAN MUSIK");
        }
        else{
            randomization = 0;
            randomizerStatus.setText("");
        }
    }//GEN-LAST:event_btnRandomTrackActionPerformed

    private void btnLoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoopActionPerformed
        if(btnLoop.isSelected()){
            headache = 1;
            loopStatus.setText("DIPUTAR BERULANG-ULANG");
        }
        else{
            headache = 0;
            loopStatus.setText("");
        }
    }//GEN-LAST:event_btnLoopActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void listMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMusicMouseClicked
        if(evt.getClickCount() == 1){
            if(player != null){
                btnRemoveMusic.setEnabled(true);
            }
            else{
                setInformationDisplay(listMusic.getSelectedIndex());
                btnRemoveMusic.setEnabled(true);
                counterX = listMusic.getSelectedIndex();
            }
        }
        else if(evt.getClickCount() == 2){
            if(player != null){
                fullstopTrack();
                setInformationDisplay(listMusic.getSelectedIndex());
                counterX = listMusic.getSelectedIndex();
                btnRemoveMusic.setEnabled(true);
                playClicked();
            }
            else{
                setInformationDisplay(listMusic.getSelectedIndex());
                btnRemoveMusic.setEnabled(true);
                counterX = listMusic.getSelectedIndex();
                playClicked();
            }
        }
    }//GEN-LAST:event_listMusicMouseClicked

    private void volumeChanger(float ff){
        player.getGainControl().setLevel(ff/100);
    }
    
    private void fullstopTrack(){
        playStatus.setText("BERHENTI");
        player.stop();
        player = null;
        thread.suspend();
        loopPlay = 0;
        counterX = 0;
        viewTimeLapsed.setText("00:00");
        seekbar.setValue(loopPlay);
        playedTracks = 0;
        enterPlay = 0;
        btnPlay.setText("");
    }
    
    private void stopTrack(){
        playStatus.setText("BERHENTI");
        player.stop();
        player = null;
       loopPlay = 0;
        counterX = 0;
        viewTimeLapsed.setText("00:00");
        seekbar.setValue(loopPlay);
    }
    
    private void nextTrack(){
        if(randomization == 1){
            stopTrack();
            playStatus.setText("MEMAINKAN: ");
            if(headache == 1){
                listMusic.setSelectedIndex(listMusic.getSelectedIndex());
            }
            else{
                listMusic.setSelectedIndex(trackRandomizer());
            }
            setInformationDisplay(listMusic.getSelectedIndex());
            int nanoMusic = listMusic.getSelectedIndex();
            counterX = nanoMusic;
            String URIMusic = SongUri[nanoMusic];
            File mp3file = new File(URIMusic);
            playMusic(nanoMusic, mp3file); 
        }
        else{
            if(listMusic.getSelectedIndex() == counter-1){
                fullstopTrack();
            }
            else{
                stopTrack();
                playStatus.setText("MEMAINKAN: ");
                if(headache == 1){
                    listMusic.setSelectedIndex(listMusic.getSelectedIndex());
                }
                else{
                    listMusic.setSelectedIndex(listMusic.getSelectedIndex() + 1);
                }
                setInformationDisplay(listMusic.getSelectedIndex());
                int nanoMusic = listMusic.getSelectedIndex();
                counterX = nanoMusic;
                String URIMusic = SongUri[nanoMusic];
                File mp3file = new File(URIMusic);
                playMusic(nanoMusic, mp3file); 
            }
                
        }
    }
    
    private void prevTrack(){
        if(randomization == 1){
            stopTrack();
            playStatus.setText("MEMAINKAN: ");
            if(headache == 1){
                listMusic.setSelectedIndex(listMusic.getSelectedIndex());
            }
            else{
                listMusic.setSelectedIndex(trackRandomizer());
            }
            setInformationDisplay(listMusic.getSelectedIndex());
            int nanoMusic = listMusic.getSelectedIndex();
            counterX = nanoMusic;
            String URIMusic = SongUri[nanoMusic];
            File mp3file = new File(URIMusic);
            playMusic(nanoMusic, mp3file); 
        }
        else{
            if(listMusic.getSelectedIndex() == counter-1){
                fullstopTrack();
            }
            else{
                stopTrack();
                playStatus.setText("MEMAINKAN: ");
                if(headache == 1){
                    listMusic.setSelectedIndex(listMusic.getSelectedIndex());
                }
                else{
                    listMusic.setSelectedIndex(listMusic.getSelectedIndex() - 1);
                }
                setInformationDisplay(listMusic.getSelectedIndex());
                int nanoMusic = listMusic.getSelectedIndex();
                counterX = nanoMusic;
                String URIMusic = SongUri[nanoMusic];
                File mp3file = new File(URIMusic);
                playMusic(nanoMusic, mp3file); 
            }
                
        }
    }
    
    private void playSeekBar(){
        thread = new Thread(){
            @Override
            public void run(){
                while(running){
                    try {
                        seekbar.setValue(loopPlay++);
                        if(loopPlay == currentTimers){
                            nextTrack();
                        }
                        else{
                            System.out.println(loopPlay);
                            playTimeLapsed(loopPlay);
                            sleep(1000);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        thread.start();
        thread.suspend();
    }
    
    private void playTimeLapsed(int loops){
        int loopT = loops;
        int loopS = loopT%60;
        int loopM = (loopT - loopS) / 60;
        String loopVM = "";
        String loopVS = "";
        if(loopM < 10){
            loopVM = "0" + loopM;
        }
        else{
            loopVM = loopM + "";
        }
        
        if(loopS < 10){
            loopVS = "0" + loopS;
        }
        else{
            loopVS = loopS + "";
        }
        
        viewTimeLapsed.setText(loopVM + ":" + loopVS);
    }
            
    private void playMusic(int played, File URI){
        playedTracks = played;
        try{
            if(player == null){
                ml = new MediaLocator(URI.toURI().toURL());
                player = Manager.createRealizedPlayer(ml);
                //durating = player.getDuration().getSeconds();
                player.start();
                thread.resume();
            }
            else{
                stopTrack();
                ml = new MediaLocator(URI.toURI().toURL());
                player = Manager.createRealizedPlayer(ml);
                player.start();
                thread.resume();
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    private void songListBreaker(String listofMusic){
        String[] arrOfMusic = listofMusic.split(";"); 
        for(int oa = 0; oa < arrOfMusic.length; oa++){
            File filex = new File(arrOfMusic[oa]);
            SongUri[counter] = filex.getAbsolutePath();
                SongFileName[counter] = filex.getName();
            
                System.out.println(filex.getAbsolutePath());
                try {
                InputStream input = new FileInputStream(new File(SongUri[counter]));
                DefaultHandler handler = new DefaultHandler();
                Metadata metadata = new Metadata();
                Parser parser = new Mp3Parser();
                ParseContext parseCtx = new ParseContext();
                parser.parse(input, handler, metadata, parseCtx);
                input.close();

                // List all metadata
                String[] metadataNames = metadata.names();

                for(String name : metadataNames){
                    System.out.println(name + ": " + metadata.get(name));
                }

                // Retrieve the necessary info from metadata
                // Names - title, xmpDM:artist etc. - mentioned below may differ based
                System.out.println("----------------------------------------------");
                System.out.println("Title: " + metadata.get("title"));
                SongTitle[counter] = metadata.get("title");
                System.out.println("Artists: " + metadata.get("xmpDM:artist"));
                SongArtist[counter] = metadata.get("xmpDM:artist");
                System.out.println("Composer : "+metadata.get("xmpDM:composer"));
                SongComposer[counter] = metadata.get("xmpDM:composer");
                System.out.println("Genre : "+metadata.get("xmpDM:genre"));
                SongGenre[counter] = metadata.get("xmpDM:genre");
                System.out.println("Album : "+metadata.get("xmpDM:album"));
                SongAlbum[counter] = metadata.get("xmpDM:album");
                System.out.println("samplerate : "+metadata.get("samplerate"));
                SongBits[counter] = metadata.get("samplerate");
                System.out.println("SongTime : "+metadata.get("xmpDM:duration"));
                SongTime[counter] = metadata.get("xmpDM:duration");
                
                counter++;

                } catch (FileNotFoundException e) {
                } catch (IOException e) {
                } catch (SAXException | TikaException e) {
                }
        }
        loadMusicToList();
    }
    
    private void setInformationDisplay(int index){
        if(SongTitle[index] == null || SongTitle[index].equals("")){
            viewMusicTitle.setText("Judul: Tidak Diketahui");
        }
        else{
            char[] MusicTitleChara = SongTitle[index].toCharArray();
            if(MusicTitleChara.length > 20){
                viewMusicTitle.setText("Judul: " + SongTitle[index].substring(0, Math.min(SongTitle[index].length(), 20)) + "...");
            }
            else{
                viewMusicTitle.setText("Judul: " + SongTitle[index]);
            }
            
        }
        
        if(SongAlbum[index] == null || SongAlbum[index].equals("")){
            viewAlbumName.setText("Album: Tidak Diketahui");
        }
        else{
            char[] MusicAlbumChara = SongAlbum[index].toCharArray();
            if(MusicAlbumChara.length > 20){
                viewAlbumName.setText("Album: " + SongAlbum[index].substring(0, Math.min(SongAlbum[index].length(), 20)) + "...");
            }
            else{
                viewAlbumName.setText("Album: " + SongAlbum[index]);
            }
        }
        
        if(SongBits[index] == null){
            viewBits.setText("Sample Rate: Tidak Diketahui");
        }
        else{
            viewBits.setText("Sample Rate: " + SongBits[index]);
        }
        
        System.out.println(SongTime[index]);
        float preimer = Float.parseFloat(SongTime[index]);
        int totaltimer = (int)(Math.round(preimer / 1000));
        currentTimers = totaltimer;
        
        int reduceSeconds = totaltimer%60;
        int upperSeconds = (totaltimer - reduceSeconds) / 60;
        System.out.println(upperSeconds + " Minutes and " + reduceSeconds + " Seconds");
        
        String minutex = "00";
        String secontex = "00";
        
        if(upperSeconds < 10){
            minutex = "0" + upperSeconds;
        }
        else{
            minutex = upperSeconds + "";
        }
        
        if(reduceSeconds < 10){
            secontex = "0" + reduceSeconds;
        }
        else{
            secontex = reduceSeconds + "";
        }
        
        viewTimeTotal.setText(minutex + ":" + secontex);
        seekbar.setMaximum(totaltimer);
        
    }
    
    private void clearMusicList(){
        listMusic.setListData(new Object[0]);
    }
    
    private int trackRandomizer(){
        return (int)(Math.random() * ranges) + min; 
    }
    
    private void loadMusicToList(){
        clearMusicList();
        DefaultListModel listModel = new DefaultListModel();
        for(int i = 0; i < counter; i++){
            listModel.addElement((i+1) + ". " + SongFileName[i]);
        }
        listMusic.setModel(listModel);
        max = counter - 1;
        ranges = (max - min) + 1;
        
        
        if(player != null){
            listMusic.setSelectedIndex(counterX);
            setInformationDisplay(listMusic.getSelectedIndex());
        }
        else{
            listMusic.setSelectedIndex(counterX);
            setInformationDisplay(listMusic.getSelectedIndex());
        }
    }
    
    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMusic;
    private javax.swing.JButton btnFastBackward;
    private javax.swing.JButton btnFastForward;
    private javax.swing.JButton btnLoadPlaylist;
    private javax.swing.JToggleButton btnLoop;
    private javax.swing.JButton btnNextTrack;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnPrevTrack;
    private javax.swing.JToggleButton btnRandomTrack;
    private javax.swing.JButton btnRemoveMusic;
    private javax.swing.JButton btnSavePlaylist;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listMusic;
    private javax.swing.JLabel loopStatus;
    private javax.swing.JFileChooser openList;
    private javax.swing.JFileChooser openMusic;
    private javax.swing.JLabel playStatus;
    private javax.swing.JLabel randomizerStatus;
    private javax.swing.JFileChooser saveList;
    private javax.swing.JSlider seekbar;
    private javax.swing.JLabel viewAlbumName;
    private javax.swing.JLabel viewBits;
    private javax.swing.JLabel viewMusicTitle;
    private javax.swing.JLabel viewTimeLapsed;
    private javax.swing.JLabel viewTimeTotal;
    private javax.swing.JSlider volumeRocker;
    // End of variables declaration//GEN-END:variables
}
