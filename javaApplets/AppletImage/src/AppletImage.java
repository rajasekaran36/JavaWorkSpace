import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class AppletImage extends Applet {
	Image im;
	URL url;
	public void init(){
		im = getImage(getCodeBase(),"flower.jpg");
		setSize(200,200);
	}
	public void paint(Graphics g){
		g.drawImage(im,30,30,this);
		System.out.println(getCodeBase());
	}
}
