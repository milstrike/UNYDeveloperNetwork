package com.unydevelopernetwork.simplemp3player;

import java.io.File;

/**
 *
 * @author M. Irfan Luthfi
 */
public class customFilterMusicLists extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File file) {
        return file.isDirectory() || file.getAbsolutePath().endsWith(".lists");
    }

    @Override
    public String getDescription() {
        return "Lists Files (*.lists)";
    }
}
