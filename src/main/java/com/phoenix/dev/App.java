package com.phoenix.dev;

import javax.swing.SwingUtilities;

public class App {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Window w = new Window();
				w.setVisible(true);
			}
		});
	}
}
