package com.developer.department.controller;

import com.developer.department.entity.Department;
import com.developer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside the saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public  Department findDepartmentById(@PathVariable("id")  Long departmentId){
        log.info("Inside the findDepartmentById of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }
}
