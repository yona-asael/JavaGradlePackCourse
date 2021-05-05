package com.quintech.app.Except;

public class MessageException extends Message{ 

    public MessageException(String clas, String message) {
        super(clas, message);
    }

    @Override
    public String toString() {
        return String.format("The class %s, message: %s", this.clas, this.message);
    }
}
