package org.example.MailServices;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailHandler {
    private String messege,subject;

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    void sendMail()  {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host","smtp.gmail.com"); //smtp server
        properties.put("mail.smtp.port","465"); //server port
        properties.put("mail.smtp.ssl.enable","true"); //ssl -secure socket layer
        properties.put("mail.smtp.auth","true"); //authentication - auth

        Authenticator mailAut=new MyAuthenticator();

        Session mailSession = Session.getInstance(properties,mailAut);


        //build the mail
        //Mime message

        MimeMessage mailMessage = new MimeMessage(mailSession);

        try {
            mailMessage.setFrom(Credentials.getFrom());
            mailMessage.setSubject(subject);
            mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(Credentials.getTo()));
            mailMessage.setText(messege);
            Transport.send(mailMessage);

            System.out.println("Mail sent !!!");
        }
        catch(Exception ex)
        {
            System.out.println("Some error while preparing mail body!!!!");
            System.out.println(ex);

        }
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
