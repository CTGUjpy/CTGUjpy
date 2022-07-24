package QQDemo.qqclient.service;

import QQDemo.qqcomon.Message;
import QQDemo.qqcomon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientConnectServeThread extends Thread{
    private Socket socket;

    public ClientConnectServeThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while(true){
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                if(message.getMesTyp().equals(MessageType.MESSAGE_LOGIN_SUCCESS)){
                    System.out.println("登录成功");
                }



            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
