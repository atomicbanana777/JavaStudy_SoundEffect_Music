package com.atomicbanana;

import java.io.BufferedInputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class SoundEffect {
    
    Clip clip;

    public SoundEffect setSoundEffect(String soundFileName){
        try (AudioInputStream sound = AudioSystem.getAudioInputStream(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream(soundFileName)));){
            clip = AudioSystem.getClip();
            clip.open(sound);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public void play(){     
        clip.start(); 
    }

    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop(){
        clip.stop();
        clip.close();
    }
    
}
