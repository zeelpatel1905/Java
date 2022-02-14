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
import java.util.Arrays;

/**
 *
 * @author zeelp
 */
public class TCPTenNoSortingServer {
    public static void main(String[] args) throws Exception{
        
        ServerSocket ss = new ServerSocket(2222);
        while (true) {            
            Socket s = ss.accept();
            
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            
            int a[] = new int[10];
            for (int i = 0; i < 10; i++) {
                a[i] = dis.readInt();
                
            }
            
            Arrays.sort(a);
            
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            for (int i = 0; i < 10; i++) {
                dos.writeInt(a[i]);
            }
            
            
            dis.close();
            is.close();
            dos.close();
            os.close();
            s.close();
            }
        }    
}
