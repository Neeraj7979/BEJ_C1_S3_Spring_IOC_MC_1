package com.niit.bej.domain;

public class Employee {
    private String employeeName;
    private int employeeId;
    private Department department;

    public Employee(String employeeName, int employeeId, Department department) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.department = department;
    }

    public Employee() {

    }
    
}
