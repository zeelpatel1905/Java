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
public class UDPServerStringLen {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(2222);
        byte rd[] = new byte[1024];
        DatagramPacket dp = new DatagramPacket(rd, rd.length);
        ds.receive(dp);
        String msg = new String(dp.getData());
        System.out.println(msg);
//        StringBuffer sb = new StringBuffer(msg);
        int temp=msg.length();
        String st=Integer.toString(temp);
        System.out.println(temp);
        rd = st.getBytes();
        InetAddress inet = InetAddress.getByName("localhost");
        DatagramPacket sdp = new DatagramPacket(rd, rd.length,inet,3333);
        ds.send(sdp);
    }    
    
}
