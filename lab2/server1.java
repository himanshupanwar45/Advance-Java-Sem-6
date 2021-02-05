import java.io.*;
import java.net.*;

public class server1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8080);
            Socket s = ss.accept(); // establishes connection

            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("Message from the Client=" + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}