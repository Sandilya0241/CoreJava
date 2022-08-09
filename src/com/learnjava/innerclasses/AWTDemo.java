/*
 * 
 * Best example for Anonymous Inner class
 * 
 */
package com.learnjava.innerclasses;
import java.awt.*;
import java.awt.event.*;

public class AWTDemo {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				for (int i = 0; i < 10; i++) {
					System.out.println("I'm closing");
				}				
				System.exit(0);
			}
		});
		f.add(new Label("My Screen"));
		f.setSize(500, 500);
		f.setVisible(true);
	}
}
