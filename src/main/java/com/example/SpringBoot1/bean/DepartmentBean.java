package com.example.SpringBoot1.bean;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String departmentName = "Engineering";

    public String getDepartmentName() {
        return departmentName;
    }
}
