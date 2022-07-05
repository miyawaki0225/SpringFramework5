package com.example.chapter03;

import java.util.Calendar;
import java.util.Date;

public class MyBean implements MyBeanInterface {
    private Date date;
    private String message;

    public MyBean(){
        super();
        this.date = Calendar.getInstance().getTime();
    }
    public MyBean(String message){
        this();
        this.message = message;
    }
    public Date getDate(){
        return date;
    }
    public void setMessage(String message){
        this.message = message;
    }
    @Override
    public String toString(){
        return "MyBean [message="+ message + ", date=" + date + "]";
    }
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return message;
    }
}
