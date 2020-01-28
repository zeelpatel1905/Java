/*
<applet code="first.class" name="first" width=500 height=300></applet>
*/
import java.applet.Applet;
import java.awt.Graphics;
public class first extends Applet
{
	public void init()
	{
		setSize(500,300);
	}
	public void paint(Graphics g)
	{
		g.drawString("Zeel",240,150);
		g.drawOval(200,100,100,100);
	}
}