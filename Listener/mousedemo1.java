import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
/*
<applet code="mousedemo1.class" name="first" width=300 height=300></applet>
*/
public class mousedemo1 extends Applet implements MouseListener{
    
    String msg="";
    public void init()
    {
        addMouseListener(this);
    }
    public void paint(Graphics s)
    {
        showStatus(msg);
    }
    public void mouseClicked(MouseEvent e) {
        
    }
    public void mousePressed(MouseEvent e) {
        msg="Mouse Pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent e) {
      msg="Mouse Released";
      repaint();
    }    
	 public void mouseEntered(MouseEvent e) 
	{   
    }
	 public void mouseExited(MouseEvent e) 
	{    
    }

}
