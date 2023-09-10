package org.example.Config;

import org.example.MailServices.ReadFile;
import org.example.MailServices.SendMail;
import org.example.StudentProperties.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class congigurations {
    @Value("${Semd.Mail.to}")
    String to;
    @Value("${Semd.Mail.from}")
    String from;
    @Value("${Semd.Mail.passPath}")
    String passPath;
    @Bean
    SendMail CreateSendMailObj(){

        return new SendMail(to,from, ReadFile.get(passPath));
    }
    @Bean
    Student CreateStudent(){
        return new Student("chamaily","69","20","8");
    }
}
