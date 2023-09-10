package org.example.Config;

import org.example.MailServices.ReadFile;
import org.example.MailServices.SendMail;
import org.example.StudentProperties.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class congigurations {
    @Bean
    SendMail CreateSendMailObj(){
        return new SendMail("abdul123arj@gmail.com","abdul123arj@gmail.com", ReadFile.get("C:\\Users\\abdul\\OneDrive\\Desktop\\passforjava.txt"));
    }
    @Bean
    Student CreateStudent(){
        return new Student("chamaily","69","20","8");
    }
}
