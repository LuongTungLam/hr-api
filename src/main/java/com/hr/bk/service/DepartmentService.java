package com.hr.bk.service;

import com.hr.bk.enitiy.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> findAll();

    Department findById(int id);

    Department save(Department department);

    void remove(Department department);
}
