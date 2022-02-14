/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionbankunit1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author zeelp
 */
public class TCPClientDIGITandCharCounter {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost",2222);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        Scanner sc = new Scanner(System.in);
        dos.writeUTF(sc.nextLine());
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        int c = dis.readInt();
        int d = dis.readInt();
        int w = dis.readInt();
        
        System.out.println("No of Alphabets : "+c);
        System.out.println("No. of Numbers : "+d);
        System.out.println("No. of WhiteSpace : "+w); 
        System.out.println("Total Character : " + (c+d+w));
        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();
    }
}
