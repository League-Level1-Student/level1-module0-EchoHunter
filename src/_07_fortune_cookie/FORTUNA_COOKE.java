package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FORTUNA_COOKE implements ActionListener {
	
JFrame one = new JFrame();
JButton button = new JButton();


public void showButton() {
	one.setVisible(true);
	one.add(button);
	one.pack();
	
	button.addActionListener(this);
	
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null,"Woo,hoo");
	int rand = new Random().nextInt(5);
	if (rand==(1)) {
		JOptionPane.showMessageDialog(null, "an unlight candle scares no monkeys");
	}
	else if (rand ==(2)) {
		JOptionPane.showMessageDialog(null, "you will have great luck in the future");
		
		
	}
	else if(rand==(3)) {
		JOptionPane.showMessageDialog(null,"the love of your life will be wearing an applebees shirt");
	}
	else if (rand==(4)) {
		JOptionPane.showMessageDialog(null, "Your DND club will always be able to meet on the weekends");
	}
}


}

