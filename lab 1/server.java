import java.net.*;
import java.io.*;

public class server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(7865);
            Socket serverEnd = serverSocket.accept();

            DataInputStream dis = new DataInputStream(serverEnd.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("Message from the client end is :  " + str);
            serverSocket.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
