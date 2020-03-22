/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unydevelopernetwork.mymorse;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author M. Irfan Luthfi
 */
public class AudioPlayer {
    
    public static void playAudio(String characs){
        
        if(characs.equalsIgnoreCase(".")){
            System.out.println("short");
            try{
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(new File("short.wav")));
                clip.start();
            }
            catch (Exception exc)
            {
                exc.printStackTrace(System.out);
            }
        }
        else if(characs.equalsIgnoreCase("-")){
            System.out.println("long");
            try{
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(new File("long.wav")));
                clip.start();
            }
            catch (Exception exc)
            {
                exc.printStackTrace(System.out);
            }
        }
        else{
            System.out.println("unidentified");
        }
    
    }
}
