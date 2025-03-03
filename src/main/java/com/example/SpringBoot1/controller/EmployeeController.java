package com.example.SpringBoot1.controller;

import com.example.SpringBoot1.bean.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeBean employeeBean;

    @GetMapping("/employee")
    public String getEmployeeInfo() {
        return employeeBean.getEmployeeDetails();
    }
}
