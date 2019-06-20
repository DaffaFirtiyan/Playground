package main.java.com.daffa.objects;

import javax.swing.JFrame;

public class RubObject {
	public static void main(String args[]) {
		MovingObjects obj = new MovingObjects();
		JFrame f = new JFrame();
		
		f.add(obj);
		f.setVisible(true);
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Moving Ball");
	}
}
