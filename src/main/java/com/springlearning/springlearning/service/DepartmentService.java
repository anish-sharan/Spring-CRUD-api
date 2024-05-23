package com.springlearning.springlearning.service;

import com.springlearning.springlearning.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getDepartment();

    public Department getDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId,Department department);

    public Department getDepartmentByName(String departmentName);

}
