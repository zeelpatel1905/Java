/*
<applet code="Second.class" name="first" width=300 height=500></applet>
*/
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class Second extends Applet
{
	public void init()
	{
		setSize(300,500);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		for(int i=0;i<10;i++)
			g.fillOval(10,(i*5)*10,50,50);
	}
}