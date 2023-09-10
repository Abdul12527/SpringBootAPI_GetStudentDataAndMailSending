package org.example.MailServices;

public class Credentials {
    private static String to;
    private static String from;
    private static String pass;

    public static String getTo() {
        return to;
    }

    public static void setTo(String to) {
        Credentials.to = to;
    }

    public static String getFrom() {
        return from;
    }

    public static void setFrom(String from) {
        Credentials.from = from;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        Credentials.pass = pass;
    }
}

