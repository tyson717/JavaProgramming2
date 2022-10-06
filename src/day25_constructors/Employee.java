package day25_constructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name ;
    public int age;
    public char gender ;
    public String jobTitle;
    public double salary;
    public LocalDate hiredDate;

    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hiredDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hiredDate = hiredDate;
    } // allow us to set all the instance variables of the objects as soos aas the object is created

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hiredDate=" + hiredDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y") )+
                '}';
    }//allows us to print the object when its passed in the print statement
}
