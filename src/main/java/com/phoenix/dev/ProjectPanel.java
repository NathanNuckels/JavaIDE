package com.phoenix.dev;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class ProjectPanel extends JPanel{
	public ProjectPanel() {
		setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		setSize(new Dimension(320,700));
		setBackground(Color.BLUE);
	}

}
