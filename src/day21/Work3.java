package day21;

import java.io.IOException;
import java.net.*;

public class Work3 {
    public static void main(String[] args) throws IOException {
        String msg = "同桌你好";
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        byte[] bytes = msg.getBytes();
        InetAddress targetIP = InetAddress.getByName("192.168.8.33");
        int port = 8888;
        DatagramPacket sendpacket = new DatagramPacket(bytes,0,targetIP,port);
        datagramSocket.send(sendpacket);
        datagramSocket.close();
    }
}
