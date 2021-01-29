import java.net.Socket;
import java.io.*;

public class client {

    public static void main(String[] args) {

        try {
            Socket clientEnd = new Socket("localhost", 7865);

            DataOutputStream dout = new DataOutputStream(clientEnd.getOutputStream());
            dout.writeUTF("This is message to the server..");
            dout.flush();
            dout.close();

            clientEnd.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}