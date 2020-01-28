import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class checkboxdemo extends Checkbox implements ItemListener
{
	public Checkbox c1,c2,c3;
	int r=0,b=0,g=0;
	Color clr;
	Canvas ca = new Canvas();
	checkboxdemo()
	{
		c1 = new Checkbox("Red");
		c2 = new Checkbox("Green");
		c3 = new Checkbox("Blue");
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		ca.setSize(30,30);
		ca.setBackground(Color.black);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(c1.getState())
			r=255;
		else
			r=0;
		if(c2.getState())
			g=255;
		else
			g=0;
		if(c3.getState())
			b=255;
		else
			b=0;
		clr = new Color(r,g,b);
		Color col = this.getcolor();
		ca.setBackground(col);
	}
	public Color getcolor()
	{
		System.out.println("r"+r+"b"+b+"g"+g);
		return clr;
	}
}