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

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", department=" + department +
                '}';
    }
}
