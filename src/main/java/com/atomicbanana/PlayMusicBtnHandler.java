package com.atomicbanana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PlayMusicBtnHandler implements ActionListener {

    SoundEffect mu;
    boolean musicOn = false;
    JButton button;

    public PlayMusicBtnHandler(JButton button) {
        this.button = button;
        mu = new SoundEffect();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(musicOn == false){
            mu.setSoundEffect("file_example_WAV_10MG.wav");
            mu.play();
            mu.loop();
            musicOn = true;
            button.setText("Stop Music");
        } else {
            mu.stop();
            musicOn = false;
            button.setText("Play Music");
        }
    }
    
}
