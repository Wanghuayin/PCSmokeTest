package com.nd.www;

import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.sikuli.script.*;

public class TestSikuli {
    public static void main(String[] args) {
        Screen s = new Screen();
        try{
                s.click("imgs/ChatDialog/Input_Area.png");
                //s.write("hello world#ENTER.");
                //s.wait("imgs/firefox.png");
                //s.write("Test hello world.");
                //s.click("imgs/ChatDialog/Send_Message_Button.png");
                //s.click("imgs/windows_start01.png");
                
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                for(int i=0;i<10000;i++){
                    s.write( String.valueOf(i) );
                    System.out.println(df.format(new Date()));
                    s.click("imgs/ChatDialog/Send_Message_Button.png");
                }
                
                //App.start(arg0)
        }
        catch(FindFailed e){
                e.printStackTrace();
        }
    }
}
