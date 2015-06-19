package javadrawing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Main implements ActionListener {
	Circle c = new Circle();
	Timer t = new Timer(1000,this);
	JFrame jf = new JFrame();
public static void main(String[] args) {
	Main m = new Main();
}
public Main() {
	
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setVisible(true);
	jf.add(c);
	t.start();
}
@Override
public void actionPerformed(ActionEvent e) {
	System.out.println("Tick");
	c.mousex+=1;
	c.repaint();
	jf.repaint();
}
}
