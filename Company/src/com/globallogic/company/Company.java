package com.globallogic.company;
import java.util.Arrays;

public class Company {

    private String name;
    private String address;
    private String phone;
    private long minSalary;
    public Employee[] employees;

    public Company(String name, String address, String phone, Employee[] employees, long minSalary) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.employees = employees;
        this.minSalary = minSalary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String[] listOfAllEmployees() {
        String[] employeeName = new String[employees.length];

        for (int i = 0; i < employees.length; i++) {
            employeeName[i] = employees[i].getName();
        }

        return employeeName;
    }

    public boolean ifEmployeeExists(String name) {
        for (String item:listOfAllEmployees()) {
            if (name.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public String findMaxSalaryEmployeeName() {
        if (employees.length == 0) {
            return "No employee";
        }

        long maxSalary = 0;
        Employee maxSalaryEmployee = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee.getName();
    }

    public boolean addNewEmployee(Employee employee) {
        if (checkSalary(employee.getSalary())) {
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
            return true;
        }
        return false;
    }

    public void removeEmployee(Employee employeeToRemove) {
        removeEmployeeByName(employeeToRemove.getName());
    }

    public boolean removeEmployeeByName(String name) {
        if (ifEmployeeExists(name)) {
            Employee[] employeesWithRemoved = Arrays.copyOf(employees, employees.length - 1);
            for (int i = 0, j = 0; i < employees.length; i++) {
                if (employees[i].getName() != name) {
                    employeesWithRemoved[j] = employees[i];
                    j++;
                }
            }
            employees = employeesWithRemoved;
            return true;
        }

        return false;
    }

    public long findSalarySum() {
        long salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            salarySum += employees[i].getSalary();
        }
        return salarySum;
    }

    public double salaryAverage() {
        double salAverage = (double)findSalarySum() / employees.length;
        return salAverage;
    }

    public boolean checkSalary(long salary) {
        boolean salaryOK = salary >= minSalary;
        return salaryOK;
    }
}
