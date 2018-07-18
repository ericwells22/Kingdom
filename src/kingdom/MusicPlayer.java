/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom;

import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

/**
 *
 * @author Eric
 */
public class MusicPlayer implements Runnable {  
    
    private ArrayList<String> musicFiles;
    private int currentSongIndex;
    
    public MusicPlayer(String... files){
        musicFiles = new ArrayList<String>();

        
        
//        for (String file: files)    
        
    }
    private static void playSound(String fileName){
    
        
        try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(fileName).getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
//        FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);       
//        gainControl.setValue(-10);
        
        
        clip.start();

    } catch(Exception e) {
        System.out.println("Error playing sound!");
    }
        
    }
    @Override
    public void run() {
        File file = new File("src\\kingdom\\audio\\main_menu_soundtrack.wav");
        String path = file.getAbsolutePath();
        
        playSound(path);
    }      
    public void Hov() {
        File file = new File("src\\kingdom\\audio\\click_hov.wav"); 
        String path = file.getAbsolutePath();
        
        playSound(path);
    
    } 
    

    
//    

//    @Override
//    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
