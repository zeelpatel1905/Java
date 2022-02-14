/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionbankunit1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

/**
 *
 * @author zeelp
 */
//Write a sample code for client send a “Hello” message to server
public class UDPClientHello {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket();
        byte sd[] = new byte[1024];
        String msg = "Hello";
        sd = msg.getBytes();
        InetAddress inet = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(sd, sd.length, inet, 2222);
        ds.send(dp);
    }
}
