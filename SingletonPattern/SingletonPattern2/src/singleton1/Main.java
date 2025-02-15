/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton1;

/**
 *
 * @author Lenovo
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class Main {
    public static void main(String[] args) {
        WifiConnection wifiConnection1 = WifiConnection.getWifiConnectionInstance();
      
        System.out.println("Wi-Fi Connection Instance 1: " + wifiConnection1);
        
        WifiConnection wifiConnection2 = WifiConnection.getWifiConnectionInstance();
        
        System.out.println("Wi-Fi Connection Instance 2: " + wifiConnection2);
        
        wifiConnection1.connect();
        wifiConnection1.disconnect();
    }
}
