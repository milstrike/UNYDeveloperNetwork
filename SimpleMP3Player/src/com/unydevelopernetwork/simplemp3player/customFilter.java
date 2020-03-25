package com.unydevelopernetwork.simplemp3player;

import java.io.File;

/**
 *
 * @author M. Irfan Luthfi
 */
public class customFilter extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File file) {
        return file.isDirectory() || file.getAbsolutePath().endsWith(".mp3");
    }

    @Override
    public String getDescription() {
        return "MP3 Music (*.mp3)";
    }
    
}
