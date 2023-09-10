package org.example.StudentProperties;

public class Student {
    private String name;
    private String roll_no;
    private String age;
    private String grades;

    public Student(String name, String roll_no, String age, String grades) {

        this.name = name;
        this.roll_no = roll_no;
        this.age = age;
        this.grades = grades;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public String toString(){
        return "name="+this.name+" roll_no="+this.roll_no+" age="+this.age+" grade="+this.grades;
    }
}
