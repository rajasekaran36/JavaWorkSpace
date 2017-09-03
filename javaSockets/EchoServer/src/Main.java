import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(6667);
		System.out.println("Waiting For Connection");
		Socket s = ss.accept();
		System.out.println("Socket Connected from server");
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF("Welcome To Echo Server");
		String dataFromClient = "Hello";
		while(!dataFromClient.equalsIgnoreCase("stop")){
			dataFromClient = din.readUTF();
			dout.writeUTF(dataFromClient);
		}
		dout.writeUTF("Thank You !!!");
		System.out.println("Reply Done");
	}

}
