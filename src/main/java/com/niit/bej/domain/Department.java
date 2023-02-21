package com.niit.bej.domain;

public class Department {
    private int departmentId;
    private String departmentName;
    private String departmentLocation;

    public Department(int departmentId, String departmentName, String departmentLocation) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentLocation = departmentLocation;
    }

    public Department() {
    }
}
