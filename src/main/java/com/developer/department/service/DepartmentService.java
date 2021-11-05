package com.developer.department.service;

import com.developer.department.entity.Department;
import com.developer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside the saveDepartment method of the Department Service");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside the findDepartmentById method of the Department Service");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
