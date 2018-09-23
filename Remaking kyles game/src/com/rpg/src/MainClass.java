package com.rpg.src;

import java.awt.Canvas;

public class MainClass extends Canvas implements Runnable {

	private static final long serialVersionUID = 7048281950860447201L;

	public static final int WIDTH = 1000, HEIGHT = 600;
	
	public MainClass() {
		new Window(WIDTH, HEIGHT, "RPG of the Century", this);
	
		
	}
	
	public synchronized void start() {
		
	}
	
	public void run() {
		
	}
	
	public static void main(String args[]) {
		new MainClass();
	}
}
