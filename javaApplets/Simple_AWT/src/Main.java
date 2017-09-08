import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class SimpleFrameAdapter extends WindowAdapter {
	SimpleFrame currentFrame;
	public SimpleFrameAdapter(SimpleFrame f){
		this.currentFrame = f;
		return currentFrame;
	}
	
	public void windowClosing(WindowEvent arg0) {
		currentFrame.dispose();
	}
}
class SimpleFrame extends Frame{
	public SimpleFrame() {
		setSize(200,200);
		setVisible(true);
		
	}
}
public class Main{
public static void main(String[] args){
	new SimpleFrame();
}
}
