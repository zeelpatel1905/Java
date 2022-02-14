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
import java.util.Date;

/**
 *
 * @author zeelp
 */
public class TCPServerDateTimeRequest {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2222);
        while(true){
            Socket s = ss.accept();
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            Date d = new Date();
            long l = d.getTime();
            Date dd = new Date(l);
            String dt = dd.toString();
            dos.writeUTF(dt);
            
            is.close();
            dis.close();
            dos.close();
            os.close();
            s.close();
        }
    }    
    
}
