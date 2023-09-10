package org.example.MailServices;

public class SendMail {
    private String massage =" ",subject=" ";

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTo() {
        return Credentials.getTo();
    }

    public void setTo(String to) {
        Credentials.setTo(to);
    }

    public String getFrom() {
        return Credentials.getFrom();
    }

    public void setFrom(String from) {
        Credentials.setFrom(from);
    }

    public String getPass() {
        return Credentials.getPass();
    }

    public void setPass(String pass) {
        Credentials.setPass(pass);
    }

    public SendMail(String to, String from, String pass) {
        Credentials.setTo(to);
        Credentials.setFrom(from);
        Credentials.setPass(pass);
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
    MailHandler mh=new MailHandler();

    public void send(){
        mh.setMessege(massage);
        mh.setSubject(subject);
        mh.sendMail();
    }
}
