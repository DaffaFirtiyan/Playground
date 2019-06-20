package main.java.com.daffa.autoclicker;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Clicker{
	public Clicker() {
		// https://stackoverflow.com/questions/24104313/how-do-i-make-a-delay-in-java
		final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		executorService.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				click();
			}
		}, 0, 10, TimeUnit.MILLISECONDS);
	}

	public void click() {
		Robot r;
		try {
			r = new Robot();
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public void stopProgram() {
		System.exit(0);
	}

	public static void main(String args[]) {
		new Clicker();
	}
}
