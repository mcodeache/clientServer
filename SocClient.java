import java.net.*;
import java.io.*;

public class SocClient  
{
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{ 
		
		
		Socket socket = new Socket("localhost",9999);
		String str = "aryan\n";
		
		
		/*converts data into stream format and from where to send data*/
		
		OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
		PrintWriter out = new PrintWriter(os);
		out.write(str);
		out.flush();
		}

}
