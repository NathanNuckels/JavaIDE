package com.phoenix.dev;
import java.awt.*;
import javax.swing.*;

public class Window extends JFrame{
	public Window() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Phoenix IDE");
		setPreferredSize(new Dimension(1280,720));
		ProjectPanel pp = new ProjectPanel();
		TopBar tb = new TopBar();
		EditPanel ep = new EditPanel();
		add(tb);
		add(pp);
		add(ep);
		pack();
	}
}
