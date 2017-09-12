import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;


public class AppletSounds extends Applet{

AudioClip clip;
String no_of_times;
public void init(){
	clip = getAudioClip(getCodeBase(), "drum.wav");
	no_of_times = getParameter("limit");
}
public void start(){
	for(int i=0;i<3;i++)
		clip.play();
}
public void paint(Graphics g) {
	g.drawString(no_of_times, 20, 20);
}
}
