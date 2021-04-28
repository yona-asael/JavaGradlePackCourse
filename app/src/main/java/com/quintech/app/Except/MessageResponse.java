package com.quintech.app.Except;

public class MessageResponse extends Message {
    private String module;

    public MessageResponse(String clas, String message, String module) {
        super(clas, message);
        this.module = module;
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Override
    public String toString() {
        return String.format("The class %s, message: %s, module: %s", this.clas, this.message, this.module);
    }
    
}
