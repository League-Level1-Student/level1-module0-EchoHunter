package _08_jack_in_the_box;

import java.applet.AudioClip;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class JACK_IN_DA_BOX_ {
JFrame frame = new JFrame();
JPanel panel = new JPanel();

private void showPicture(String fileName) {
	frame.add(panel);
	frame.pack();
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

}
