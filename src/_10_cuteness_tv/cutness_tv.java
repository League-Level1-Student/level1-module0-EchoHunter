package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutness_tv implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel= new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public void run() {
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
		frame.setVisible(true);		
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			showDucks();
		}
		if(e.getSource() == button1) {
			showFrog();
		}
		if(e.getSource() == button2) {
			showFluffyUnicorns();
		}
		
	}
}
