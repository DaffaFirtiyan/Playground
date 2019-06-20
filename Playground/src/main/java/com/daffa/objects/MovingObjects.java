package main.java.com.daffa.objects;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

@SuppressWarnings("serial")
public class MovingObjects extends JPanel implements ActionListener{
	Timer t = new Timer(5, this);
	double x = 0;
	double y = 0;
	double vX = 2;
	double vY = 2;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D square = new Rectangle2D.Double(x, y, 40, 40);
		
		g2.fill(square);
		t.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		// keep ball from going off screen
		if(x < 0 || x > 540) { vX = -vX; }
		if(y < 0 || y > 320) { vY = -vY; }
		
		x += vX;
		y += vY;
		
		// redraw every t time which is 5 millisecond
		repaint();
	}
	
	
}