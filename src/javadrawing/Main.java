package javadrawing;

import javax.swing.JFrame;

public class Main {
	circle c = new circle();
public static void main(String[] args) {
	Main m = new Main();
}
public Main() {
	JFrame jf = new JFrame();
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setVisible(true);
	jf.add(c);
}
}
