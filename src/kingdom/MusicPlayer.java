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
import static javax.sound.sampled.Clip.LOOP_CONTINUOUSLY;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

/**
 *
 * @author Eric
 */
public class MusicPlayer implements Runnable {  
    
    private ArrayList<String> musicFiles;
    private int currentSongIndex;
    AudioInputStream audioInputStream;
    Clip clip;
    FloatControl gainControl;
    
    
    public MusicPlayer(String... files){
        musicFiles = new ArrayList<String>();

        
//        for (String file: files)    
        
    }
    public void playSound(String fileName){
    
        
        try {
        audioInputStream = AudioSystem.getAudioInputStream(new File(fileName).getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);       
        

        clip.start();

        
        } catch(Exception e) {
        System.out.println("Error playing sound!");
    }
        
    }
    @Override
    public void run() {
        File file = new File("src\\kingdom\\audio\\main_menu_soundtrack.wav");
        String path = file.getAbsolutePath();
        
try {
        audioInputStream = AudioSystem.getAudioInputStream(new File(path).getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);       
        

        clip.start();
        clip.loop(LOOP_CONTINUOUSLY);

        
        } catch(Exception e) {
        System.out.println("Error playing sound!");
    }    
    
    
    
    }
    
    

    
    
    
//    Thread t = new Thread(new Runnable() {
//    @Override
//    public void run() {
//        //work here
//    }
//});
//t.start();//start thread
    
    
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
