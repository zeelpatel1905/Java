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
public class TCPServerNnoAddition {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2222);
        while(true){
            Socket s = ss.accept();
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            
            int no = dis.read();
            int result =0;
            for(int i=0;i<no;i++){
                result =result+dis.read();
                
            }
            
            
            dos.write(result);
            
            is.close();
            dis.close();
            dos.close();
            os.close();
            s.close();
        }
    }
}
