package com.quintech.app.Except;

public abstract class Message {
    protected String clas;
    protected String message;


    public Message(String clas, String message) {
        this.clas = clas;
        this.message = message;
    }

    public String getClas() {
        return this.clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
