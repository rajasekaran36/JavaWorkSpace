import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(6666);
		System.out.print("Server Started");
		Socket s = ss.accept();
		System.out.print("Server Accepted");
		DataInputStream din = (DataInputStream) s.getInputStream();
		DataOutputStream dout = (DataOutputStream) s.getOutputStream();
		dout.writeUTF("Hello");
	}

}
