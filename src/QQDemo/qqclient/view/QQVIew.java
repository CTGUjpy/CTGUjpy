package QQDemo.qqclient.view;

import org.testng.annotations.Test;

import java.util.Scanner;

public class QQVIew {
    public boolean loop = true;
    public static void main(String[] args) {
        new QQVIew().QQView();
    }
    @Test
    public void QQView(){
        Scanner scanner = new Scanner(System.in);
        //不停的弹出，所有程序走完还要回到这个地方
        while(true){

            System.out.println("1、登陆系统");
            System.out.println("9、退出系统");
            String key = scanner.nextLine();
            switch(key){
                case "1" :

                case "9" :

            }
        }
    }
}
