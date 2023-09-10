package org.example.MailServices;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MyAuthenticator extends Authenticator {
    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication(Credentials.getFrom(), Credentials.getPass());

    }

}
