package com.springlearning.springlearning.repository;

import com.springlearning.springlearning.entity.Department;
import com.springlearning.springlearning.service.DepartmentService;
import com.springlearning.springlearning.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    public Department findByDepartmentNameIgnoreCase(String departmentName);


}
