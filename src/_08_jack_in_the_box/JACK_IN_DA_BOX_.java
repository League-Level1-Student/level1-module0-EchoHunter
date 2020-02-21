package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JACK_IN_DA_BOX_ implements ActionListener {
	JFrame frame = new JFrame();
	JButton panel = new JButton();
	JLabel label = new JLabel();

	private void showPicture(String fileName) {
		label.setText("SUPRISE");
		panel.add(label);
		frame.add(panel);
		panel.addActionListener(this);
	
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource("homer-woohoo.wav"));
			sound.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
		frame.pack();
	}

	private JLabel createLabelImage(String fileName) {
		try {
			java.net.URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	public void run() {
		
		showPicture("jackInTheBox.png");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}

}
