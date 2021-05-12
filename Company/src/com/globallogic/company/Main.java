package com.globallogic.company;
import java.util.Scanner;

public class Main {
    final static String GUIDE_MESSAGE = "Hi! This program is supposed to work with different companies & their employees." + "\n" +
                "It can: " + "\n" +
                "1. Show an employee with a max salary;" + "\n" +
                "2. Add a new employee to a particular Company" + "\n" +
                "3. Remove an employee from a particular Company" + "\n" +
                "4. Show salary costs for a particular Company" + "\n" +
                "5. Show an average salary within the particular Company" + "\n" +
                "6. Stop the program and exit." + "\n";


    public static String getUserChoice() {
        Scanner userInput = new Scanner(System.in);
        String enteredNumber = userInput.nextLine();

        return enteredNumber;
    }


    public static boolean interactWithUser(Company myCompany) {
        String userChoice = getUserChoice();
        if (userChoice.equals("1")) {
            System.out.println(myCompany.findMaxSalaryEmployeeName());

        } else if (userChoice.equals("2")) {
            System.out.println("In order to add a new employee, the following info is required: name, phone, salary (in cents). Here is an example: 'Ariana, 0941283948, 2341234555234' ");
            String[] splittedData = getUserChoice().split(", ");

            if (splittedData.length == 3) {
                Employee newEmployee = new Employee(splittedData[0], splittedData[1], Long.parseLong(splittedData[2]));
                if (!myCompany.addNewEmployee(newEmployee)) {
                    System.out.println("Error!! Format is OK, but Employee details has an Error. Please, contact your administrator for details and cup of tea");
                }
            } else {
                System.out.println("Wrong data format. Please, use the following example: 'Ariana, 0941283948, 2341234555234'");
            }

        } else if (userChoice.equals("3")) {
            System.out.println("In order to remove an existing employee, please enter his name:");
            String removeEmployee = getUserChoice();
            if (!myCompany.removeEmployeeByName(removeEmployee)) {
                System.out.println("Wrong name: there is no such employee");
            }

        } else if (userChoice.equals("4")) {
            System.out.println("Total salary cost for " + myCompany.getName() + " is: "  + myCompany.findSalarySum());

        } else if (userChoice.equals("5")) {
            System.out.println("An average salary within the company " + myCompany.getName() + " is: " + myCompany.salaryAverage());

        } else if (userChoice.equals("6")) {
            return false;
        }

        return true;
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "0958034323", 4354341);
        Employee employee2 = new Employee("Max", "0958043423", 332535);
        Employee employee3 = new Employee("Ariana", "0952312323", 220007);
        Employee employee4 = new Employee("Bob", "032232323", 225445);

        Company myCompany = new Company("Globallogic", "Kyiv", "444-444-334", new Employee[] {employee1, employee2, employee3, employee4}, 100);

//      Создать метод, который находит имя сотрудника с самой большой зарплатой. Если таких несколько достаточно найти хотя бы одного
//        System.out.println(myCompany.findMaxSalaryEmployeeName());

//      Создать метод, который позволяет добавить нового сотрудника.
//      При добавлении нового сотрудника проверять не является ли его зарплата ниже разрешенной.
//        Employee employee5 = new Employee("Testing", "0952232323", 52545);
//        myCompany.addNewEmployee(employee5);
//        System.out.println(Arrays.toString(myCompany.listOfAllEmployees()));

//      Создать метод, который позволяет уволить сотрудника из компании.
//        myCompany.removeEmployee(employee4);
//        myCompany.removeEmployeeByName("Ariana");
//        System.out.println(Arrays.toString(myCompany.listOfAllEmployees()));

//      Создать метод, который вычисляет размер затрат на зарплату.
//        System.out.println(myCompany.findSalarySum());

//      Создать метод, который вычисляет среднюю зарплату в компании
//        System.out.println(myCompany.salaryAverage());

//      *Добавить возможность управление компанией через командную строку
        System.out.println(GUIDE_MESSAGE);
        do {
            System.out.println("Please, select the desired option and press the corresponding number here: ");
        } while (interactWithUser(myCompany));
    }
}
