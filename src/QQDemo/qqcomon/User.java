package QQDemo.qqcomon;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name ;
    private String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
