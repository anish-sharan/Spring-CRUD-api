package com.springlearning.springlearning.service;

import com.springlearning.springlearning.entity.Department;
import com.springlearning.springlearning.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements  DepartmentService{
   @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getDepartment(){
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long departmentId){
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId){
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartmentById(Long departmentId,Department department){
         Department depDB = departmentRepository.findById(departmentId).get();

         if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
             depDB.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            depDB.setDepartmentName(department.getDepartmentCode());
        }

        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            depDB.setDepartmentName(department.getDepartmentAddress());
        }

        return departmentRepository.save(depDB);
    }

    @Override
    public Department getDepartmentByName(String departmentName){
       return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
}
