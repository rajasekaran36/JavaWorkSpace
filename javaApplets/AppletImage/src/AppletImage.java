import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;


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