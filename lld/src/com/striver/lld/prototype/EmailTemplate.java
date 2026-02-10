package com.striver.lld.prototype;

public interface EmailTemplate extends Cloneable{

    EmailTemplate clone(); // Recommended to perform deep copy
    void setContent(String content);
    void send(String to);
}
