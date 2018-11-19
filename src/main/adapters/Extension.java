package main.adapters;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public abstract class Extension {

	protected boolean active = true;
	
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void tick() {}
	public void render(Graphics g) {}
	
	public void activate() { active = true; }
	public void deactivate() { active = false; }
}
