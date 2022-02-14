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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author zeelp
 */
public class TCPServerPalidromeOrNot {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2222);
        while(true){
            Socket s = ss.accept();
            
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            String str = dis.readUTF();            
            StringBuffer sb = new StringBuffer(str);
            String st = sb.reverse().toString();
            if(st.equals(str)){
                dos.writeUTF("String is Palindrome");
            }
            else{
                dos.writeUTF("String is not Palindrome");
            }
            

            
            
            is.close();
            dis.close();
            dos.close();
            os.close();
            s.close();
        }
    }
    
}
