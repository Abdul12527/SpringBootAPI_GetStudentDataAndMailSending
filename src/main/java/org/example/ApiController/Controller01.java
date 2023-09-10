package org.example.ApiController;

import org.example.RapperServices.Service01;
import org.example.StudentProperties.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller01 {
    @Autowired
    Service01 sv1;

    @GetMapping("/v1/getStudent")
    Student getStudent(){
        sv1.SemdMail();
        return sv1.getStudent1();
    }
}
