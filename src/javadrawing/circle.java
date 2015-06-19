package javadrawing;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class Circle extends JComponent implements MouseListener{
	int mousex;
	int mousey;
	public Circle()
	{
		this.setBounds(0,0,1000,1000);
	}
public void paint(Graphics g)
{
	System.out.println("It worked!");
	g.drawOval(mousex, mousey,100, 100);
}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	Point p = e.getPoint();
	mousex=(int) p.getX();
	mousey=(int) p.getY();
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
