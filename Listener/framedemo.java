/*
<applet code="framedemo.class" name="first" width=300 height=300></applet>
*/
import java.applet.Applet;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Color; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
public class framedemo extends Applet implements ActionListener 
{ 
	Frame f; 
	Button b; 
	public void init()
	{
		setSize(300,300);
	}
	public framedemo() 
	{ 
		f = new Frame("Practical - 7") ; 
		b= new Button("Click"); 
		b.setBackground(Color.RED); 
		b.addActionListener(this); 
		f.add(b); 
		f.setSize(300,300); 
		f.setVisible(true); 
	} 
	public static void main(String[] args) { 
		framedemo f = new framedemo(); 
	} 
	public void actionPerformed(ActionEvent ae) 
	{ 
		if(b.getBackground() == Color.RED) 
		{ 
			b.setBackground(Color.GREEN); 
		} 
		else if(b.getBackground() == Color.GREEN) 
		{ 
			b.setBackground(Color.BLUE); 
		} 
		else 
		{ 
			b.setBackground(Color.RED); 
		}
	}
} 