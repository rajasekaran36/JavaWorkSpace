import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


public class Main {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket();
		
		String data = "Hello Client";
		
		InetAddress ipAddress = InetAddress.getByName("localhost");
		
		DatagramPacket dp = new DatagramPacket(data.getBytes(), data.length(), ipAddress, 3000);
		
		ds.send(dp);
		

	}

}
