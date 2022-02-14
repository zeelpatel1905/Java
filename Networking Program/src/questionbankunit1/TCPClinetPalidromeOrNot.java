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
public class TCPClinetPalidromeOrNot {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",2222);
        
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
     
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        dos.writeUTF(str);
        
        InputStream is = s.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String st = dis.readUTF();
        System.out.print(st);
        
        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
    }    
}
