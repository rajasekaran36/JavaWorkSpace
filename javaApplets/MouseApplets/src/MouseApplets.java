import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseApplets extends Applet implements MouseListener{
boolean flag = false;
int x1,x2,y1,y2;
public void init() {
	x1=x2=y1=y2=0;
	addMouseListener(this);
}
public void paint(Graphics g){
	update(g);
}
public void update(Graphics g){
	if(flag)
		g.drawLine(x1, y1, x2, y2);
}
public void mouseClicked(MouseEvent arg0) {
	
	
	
}

public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}

public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	x1 = arg0.getX();
	y1 = arg0.getY();
}

public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	x2 = arg0.getX();
	y2 = arg0.getY();
	flag = true;
	repaint();
}
}
