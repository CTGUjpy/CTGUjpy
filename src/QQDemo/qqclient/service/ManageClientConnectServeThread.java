package QQDemo.qqclient.service;

import java.net.Socket;
import java.util.HashMap;

public class ManageClientConnectServeThread {
    HashMap<String, Socket> map  = new HashMap<>();
    public void setClientConnectServeThread(String sender,Socket socket){
        map.put(sender, socket);
    }
    public Socket getClientConnectServeThread(String sender){
        return map.get(sender);
    }
}
