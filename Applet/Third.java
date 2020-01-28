/*
<applet code="Third.class" name="first" width=300 height=500></applet>
*/
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class Third extends Applet
{
	public void init()
	{
		setSize(350,350);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		int x=100,y=100,h=50;
		g.drawRect(100,100,100,50);
		for(x=100;x<200;x+=5)
		{
			try
			{
				Thread.sleep(1000);	
				g.fillRect(x,y,5,h);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}