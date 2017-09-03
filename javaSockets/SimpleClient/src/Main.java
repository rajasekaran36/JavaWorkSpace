import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class Main {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s = new Socket("localhost",6666);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		System.out.println(din.readUTF());

	}

}
