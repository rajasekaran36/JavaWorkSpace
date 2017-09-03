import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class Main {

	public static void main(String[] args) throws IOException {
		InetAddress in = InetAddress.getByName("www.db4free.com");
		System.out.println(in.getCanonicalHostName());
		System.out.println(in.getHostAddress());
		System.out.println(in.getHostName());
		System.out.println(in.isSiteLocalAddress());
	}

}
