/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionbankunit1;

import java.net.URL;

/**
 *
 * @author zeelp
 */
//Use of the URL class.
public class URLClass {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.google.com:8080/search?source=hp");
        System.out.println(url.getClass());
        System.out.println(url.getPort());
        System.out.println(url.getDefaultPort());
        System.out.println(url.getProtocol());
        System.out.println(url.getFile());
        
        String protocol = "ftp" , host = "www.google.com" , file = "/search?source=dell";
        int port = 2345;
        URL url1 = new URL(protocol,host,port,file);
        System.out.println(url1.getClass());
        System.out.println(url1.getPort());
        System.out.println(url1.getDefaultPort());
        System.out.println(url1.getProtocol());
        System.out.println(url1.getFile());
    }
}
