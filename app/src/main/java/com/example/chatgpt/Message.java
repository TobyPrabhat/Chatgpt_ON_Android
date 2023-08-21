package com.example.chatgpt;

public class Message {
    public static String sent_by_me = "me";
    public static String sent_by_bot = "bot";

    String message;
    String sent_By;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSent_By() {
        return sent_By;
    }

    public void setSent_By(String sent_By) {
        this.sent_By = sent_By;
    }

    public Message(String message, String sent_By) {
        this.message = message;
        this.sent_By = sent_By;
    }
}
