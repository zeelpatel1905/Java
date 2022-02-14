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
public class TCPServerDIGITandCharCounter {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(2222);
        while(true)
        {
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String str = dis.readUTF();
            int c =0;
            int d =0;
            int w =0;
            
            for (int i = 0; i < str.length(); i++) {
                char a = str.charAt(i);
                if(Character.isLetter(a)){
                    c = c+1;
                }
                else if(Character.isDigit(a)){
                    d = d+1;
                }
                else if (Character.isWhitespace(a)){
                    w = w+1;
                }
            }
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeInt(c);
            dos.writeInt(d);
            dos.writeInt(w);
            
            dos.close();
            os.close();
            dis.close();
            is.close();
            s.close();
        }
    }
}
