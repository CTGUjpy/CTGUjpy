package QQDemo.qqclient.service;

import QQDemo.qqcomon.Message;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class MessageClientService {

    public void sendMessageToOne(String content,String senderId,String getterId){
        Message message = new Message();
        message.setContent(content);
        message.setGetter(getterId);
        message.setSender(senderId);
        message.setSendTime(new java.util.Date().toString());
        System.out.println(senderId + "对" + getterId + " 说" + content);

    }
}
