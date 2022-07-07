import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;


public class SocServer
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("s:server is started");
		ServerSocket ss = new ServerSocket(9999);
		
		System.out.println("s:waiting for client request");
		Socket socket = ss.accept();
		
		System.out.println("s:client connected");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str = br.readLine();
	
		
		System.out.println("client data: " + str);
		
		
		String nickname = str.substring(0,3);
		
		
		
	}
}
