package com.springlearning.springlearning.controller;

import com.springlearning.springlearning.entity.Department;
import com.springlearning.springlearning.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = Logger.getLogger(String.valueOf(DepartmentController.class));

    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside post mapping of department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> getDepartment(){
        LOGGER.info("Inside get mapping of department controller");
        return departmentService.getDepartment();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/department/{id}")
    public void deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
    }

    @PutMapping("/department/{id}")
    public void updateDepartmentById(@PathVariable("id") Long departmentId,@RequestBody Department department){
        departmentService.updateDepartmentById(departmentId,department);
    }

    @GetMapping("/department/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String departmentName){
        return departmentService.getDepartmentByName(departmentName);
    }

}
