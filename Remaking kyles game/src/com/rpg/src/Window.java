package com.rpg.src;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;

public class Window extends Canvas {
	
	Container con;

	Font titleFont = new Font("Times New Roman", Font.PLAIN, 40);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
	
	
	private static final long serialVersionUID = -5922699393947104149L;

	public Window(int width, int height, String title, MainClass game) {
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		con = frame.getContentPane();
		
		
	}
	
	
}
