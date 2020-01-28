/*
<applet code="mousedemo.class" name="first" width=300 height=300></applet>
*/
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
public class mousedemo extends Applet implements MouseMotionListener
{
	int x,y;
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString("x : "+x+" y : "+y,10,10);
	}
	public void mouseMoved(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
		repaint();
	}
}