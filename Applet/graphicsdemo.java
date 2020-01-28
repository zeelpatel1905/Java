/*
<applet code="graphicsdemo.class" width=500 height=300></applet>
*/
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class graphicsdemo extends Applet
{
	public void init()
	{
		setSize(500,500);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.gray);
		g.drawString("hello applet......",60,20);
		
		//rectangle
		g.setColor(Color.blue);
		g.fillRect(150,50,100,70);
		
		//square
		g.setColor(Color.green);
		g.fillRect(260,50,70,70);
		
		//circle
		g.setColor(Color.pink);
		g.fillOval(340,50,70,70);
		
		//triangle
		g.setColor(Color.red);
		int xp[] = {20,40,140,50};
		int yp[] = {10,170,80,25};
		int np = 4;
		g.fillPolygon(xp,yp,np);
		
		//polygon
		g.setColor(Color.yellow);
		int x[] = {200,120,280,240};
		int y[] = {260,370,370,270};
		int n = 4;
		g.fillPolygon(x,y,n);
	}
}