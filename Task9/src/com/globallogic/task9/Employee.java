package com.globallogic.task9;

public class Employee {

//    Create class com.globallogic.task9.Employee with fields firsName, lastName, telephone and static field numberOfEmployees.
//Class must have constructor, which will initialize class fields and increment numberOfEmployees.
//Create multiple instances of com.globallogic.task9.Employee class and the output numberOfEmployees field to console.

    private String firstName;
    private String lastName;
    private String telephone;
    private static int numberOfEmployees = 0;

    public Employee(String firstName, String lastName, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        Employee.numberOfEmployees++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }


}
