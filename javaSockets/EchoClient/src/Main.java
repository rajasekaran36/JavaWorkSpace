import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket("localhost", 6667);
		System.out.println("Socket Connected");
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		String dataFromServer = "Hello";
		Scanner userInput = new Scanner(System.in);
		while(!dataFromServer.equalsIgnoreCase("Thank You !!!")){
			dataFromServer = din.readUTF();
			System.out.print(dataFromServer);
			dout.writeUTF(userInput.next());
		}
		System.out.println("Client Done");
	}

}
