/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionbankunit1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author zeelp
 */
public class UDPServerStringReverseWithCamalCase {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(2222);
        byte rd[] = new byte[1024];
        DatagramPacket dp = new DatagramPacket(rd, rd.length);
        ds.receive(dp);
        String msg = new String(dp.getData());
        System.out.println(msg);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < msg.length(); i++) {
                char a = msg.charAt(i);
                if(Character.isUpperCase(a)){
                    sb.append(Character.toLowerCase(a));
                }
                else if(Character.isLowerCase(a)){
                    sb.append(Character.toUpperCase(a));
                }
                else if (Character.isWhitespace(a)){
                    sb.append(" ");
                }
        }
        String reply = sb.reverse().toString();
        System.out.println(reply);
        InetAddress inet = InetAddress.getByName("localhost");
        rd = reply.getBytes();
        DatagramPacket sdp = new DatagramPacket(rd, rd.length,inet,3333);
        ds.send(sdp);
    }
    
}
