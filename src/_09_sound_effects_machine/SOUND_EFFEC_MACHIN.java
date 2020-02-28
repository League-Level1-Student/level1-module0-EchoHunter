package _09_sound_effects_machine;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SOUND_EFFEC_MACHIN {
JFrame frame = new JFrame();
JPanel panel= new JPanel();
JButton button = new JButton();
JButton button1 = new JButton();
JButton button2 = new JButton();

	

button.addActionListener(this);


public void run() {
	
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}

}
