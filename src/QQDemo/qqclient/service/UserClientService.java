package QQDemo.qqclient.service;

import QQDemo.qqcomon.Message;
import QQDemo.qqcomon.MessageType;
import QQDemo.qqcomon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UserClientService {
    private User u = new User();
    private Socket socket;
    //检查用户和密码
    public boolean checkPw(String username,String password){
        u.setName(username);
        u.setPasswd(password);
        try {
            //发送给服务器
            socket = new Socket(InetAddress.getLocalHost(),9999);//连接9999端口
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            //从服务器端接收数据
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message message = (Message)ois.readObject();
            if(message.getMesTyp().equals(MessageType.MESSAGE_LOGIN_SUCCESS)){

            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
