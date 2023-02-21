package com.niit.bej.beans;

import com.niit.bej.domain.Department;
import com.niit.bej.domain.Employee;
import org.springframework.context.annotation.Bean;

public class ConfigBean {
    @Bean("Employee")
    public Employee getEmployeeDetails() {
        Employee employee = new Employee();
        employee.setEmployeeId(115);
        employee.setEmployeeName("Neeraj kumar");
        return employee;
    }

    public Department getDepartmentDetails() {
        Department department = new Department();
        department.setDepartmentId(52);
        department.setDepartmentName("Mechanical Engineering");
        return department;
    }
}
