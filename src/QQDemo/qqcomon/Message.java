package QQDemo.qqcomon;

public class Message {
    private String sender;
    private String sendTime;
    private String getter;
    private String content;
    private String mesTyp;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMesTyp() {
        return mesTyp;
    }

    public void setMesTyp(String mesTyp) {
        this.mesTyp = mesTyp;
    }
}
