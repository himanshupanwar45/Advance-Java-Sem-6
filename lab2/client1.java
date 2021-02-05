import java.io.*;
import java.net.*;

public class client1 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("192.168.43.143", 8080);

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}