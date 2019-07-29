package com.example.AutoBell.Bean;

public class My_ChatBean {

    String message,type,senderid,reciverid,message_type;

    public My_ChatBean(String message, String type, String senderid, String reciverid, String message_type) {
        this.message = message;
        this.type = type;
        this.senderid = senderid;
        this.reciverid = reciverid;
        this.message_type = message_type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSenderid() {
        return senderid;
    }

    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    public String getReciverid() {
        return reciverid;
    }

    public void setReciverid(String reciverid) {
        this.reciverid = reciverid;
    }

    public String getMessage_type() {
        return message_type;
    }

    public void setMessage_type(String message_type) {
        this.message_type = message_type;
    }
}
