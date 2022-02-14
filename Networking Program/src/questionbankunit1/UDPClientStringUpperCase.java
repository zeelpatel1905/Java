/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionbankunit1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author zeelp
 */
public class UDPClientStringUpperCase {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(3333);
        byte sd[] = new byte[1024];
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        sd = msg.getBytes();
        InetAddress inet = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(sd, sd.length, inet, 2222);
        ds.send(dp);
        
        DatagramPacket rdp = new DatagramPacket(sd, sd.length);
        ds.receive(rdp);
        String reply = new String(rdp.getData());
        System.out.println(reply);
    }
}
