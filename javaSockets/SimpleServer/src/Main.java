import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(6666);
		System.out.println("Waiting For Connection");
		Socket s = ss.accept();
		System.out.println("Socket Connected "+s.getPort());
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Hello From Server");
		System.out.println("Reply Done");
	}

}
