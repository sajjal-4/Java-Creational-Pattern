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

public class WifiConnection {
    private static WifiConnection wifiConnectionInstance = new WifiConnection();
    
    private WifiConnection() {
        
    }

    public static WifiConnection getWifiConnectionInstance() {
        return wifiConnectionInstance;
    }

    public void connect() {
        System.out.println("Connected to Wi-Fi.");
    }

    public void disconnect() {
        System.out.println("Disconnected from Wi-Fi.");
    }
}
