import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class Main {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket(3000);
		
		byte[] dataBuffer = new byte[1024];
		
		DatagramPacket dp = new DatagramPacket(dataBuffer, 1024);
		
		ds.receive(dp);
		
		String dataRecived = new String(dp.getData(), 0, dp.getLength());
		
		System.out.print(dataRecived);

	}

}
