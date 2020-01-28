/*
<applet code="buttondemo.class" name="first" width=300 height=300></applet>
*/
import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class buttondemo extends Applet implements ActionListener
{
	Button b = new Button();
	public void init()
	{
		b.setLabel("start");
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = b.getLabel();
		if(s=="start")
			b.setLabel("stop");
		else
			b.setLabel("start");
	}
}