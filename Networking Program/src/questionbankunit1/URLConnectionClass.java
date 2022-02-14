/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionbankunit1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

/**
 *
 * @author zeelp
 */
public class URLConnectionClass {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://www.google.com/search?source=dell");
        java.net.URLConnection urlcon = url.openConnection();
        System.out.println(urlcon.getExpiration());
        System.out.println(urlcon.getDate());
        long d = urlcon.getDate();
        System.out.println(new Date(d));
        System.out.println(urlcon.getContentType());
        System.out.println(urlcon.getContentLength());
        
    }    
}
