package com.haa.webappthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.haa.webappthymeleaf.model.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    private List<Employee> employeeList;

    @PostConstruct
    private void loadData() {
        employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Ezazul", "Haq", "ezaz.haa@gmail.com"));
        employeeList.add(new Employee(2, "Abdul", "Shaik", "abdul.shaik@gmail.com"));
        employeeList.add(new Employee(3, "Haq", "Abdul", "haq.abdul@gmail.com"));
        employeeList.add(new Employee(4, "Heena", "Haq", "heena.haq@gmail.com"));
    }

    @GetMapping("/employee")
    public String employeeDetails(Model theModel) {

        theModel.addAttribute("employees", employeeList);

        return "list-employee";
    }
}
