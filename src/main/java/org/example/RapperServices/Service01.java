package org.example.RapperServices;

import org.example.MailServices.SendMail;
import org.example.StudentProperties.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service01 {
    @Autowired
    private SendMail sm;
    @Autowired
    private Student student1;

    public Student getStudent1(){
        return student1;
    }
    public void SemdMail(){
        sm.setMassage(student1.toString());
        sm.setSubject("Student details");
        sm.send();
    }

}
