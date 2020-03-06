package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SOUND_EFFEC_MACHIN implements ActionListener {
JFrame frame = new JFrame();
JPanel panel= new JPanel();
JButton button = new JButton();
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
JButton button5 = new JButton();



public void run() {
	panel.add(button);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	frame.add(panel);
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
frame.pack();
frame.setVisible(true);
}


private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button){
		playSound("sawing-wood-daniel_simon.wav");
	}
	if(e.getSource()==button1){
		playSound("M1 Garand Single-SoundBible.com-1941178963.wav");
	}
	if(e.getSource()==button2){
		playSound("death-Roman_K-1190383229.wav");
	}
	if(e.getSource()==button3){
		playSound("fire-truck-air-horn_daniel-simion.wav");
	}
	if(e.getSource()==button4){
		playSound("Bomb_Exploding-Sound_Explorer-68256487.wav");
	}
	if(e.getSource()==button5){
		playSound("Civil War Drummer -SoundBible.com-700036269.wav");
	}
}

}
