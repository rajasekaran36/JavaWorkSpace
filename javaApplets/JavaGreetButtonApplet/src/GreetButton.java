import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GreetButton extends Applet {
	Panel aPannel;
	Button aButton;
	Label content;
	public void init(){
		System.out.println("Init Called");
		aPannel = new Panel();
		aButton = new Button("Pushme");
		content = new Label("");
		aButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				content.setText("Hello World");
				repaint();
			}
		});
		aPannel.add(aButton);
		aPannel.add(content);
		add(aPannel);
		setSize(2000,2000);
	}
	public void start() {
		System.out.println("Start Called");
	}
	public void stop() {
		System.out.println("Stop Called");
	}
	public void destroy() {
		System.out.println("Destroy Called");
	}
	
	public void paint(Graphics g) {
		System.out.println("Paint Called");
	}
}
