import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class client
{
	public static void main(String[]args) throws Exception
	{
		Scanner sc= new Scanner(System.in);
		DatagramSocket ds= new DatagramSocket();
		InetAddress ip=InetAddress.getLocalHost();
		byte buffer[]=null;
			String s1=sc.nextLine();
			buffer=s1.getBytes();
			DatagramPacket dsend=new DatagramPacket(buffer,buffer.length,ip,8080);
			ds.send(dsend);
		}
	}