package com.atomicbanana;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ControlPanel extends JFrame {
    JPanel panel;
    JButton button, button2;
    PlayMusicBtnHandler playMusicBtnHandler;

    public ControlPanel() {
        super("Music Player");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(50, 50, 400, 400);
        panel.setLayout(new GridLayout(4,1));

        
        button = new JButton("Play Sound");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SoundEffect().setSoundEffect("buttonSE.wav")
                    .play();
            }
        });

        button2 = new JButton("Play Music");
        playMusicBtnHandler = new PlayMusicBtnHandler(button2);
        button2.addActionListener(playMusicBtnHandler);

        add(panel);
        panel.add(button);
        panel.add(button2);
    }
}