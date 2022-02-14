/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionbankunit1;

import java.net.InetAddress;

/**
 *
 * @author zeelp
 */
public class FIndMachineIPAddress {
    public static void main(String[] args) throws Exception{
        InetAddress inet = InetAddress.getLocalHost();
        System.out.println("Machine Address is: " + inet.getHostAddress());
    }
}
