package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String obama = "https://i.redd.it/5rm35mgas7j31.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component image = createImage(obama);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		
		quizWindow.setSize(523,480);
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What character is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("obama")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("WRONG");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		String devito = "https://m.media-amazon.com/images/M/MV5BMTE5MjM5MzM3M15BMl5BanBnXkFtZTYwOTEzOTY0._V1_UY317_CR6,0,214,317_AL_.jpg";
		// 11. add the second image to the quiz window
		Component image1 = createImage(devito);
		quizWindow.add(image1);
		// 12. pack the quiz window
		quizWindow.setSize(523,480);
		quizWindow.pack();
		// 13. ask another question
		answer = JOptionPane.showInputDialog("What character is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answer.equals("Danny Devito")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("WRONG");
		}

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
