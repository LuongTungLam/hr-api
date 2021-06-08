package com.hr.bk.dao;

import com.hr.bk.enitiy.Department;

import java.util.List;

public interface DepartmentDAO {

    List<Department> findAll();

    Department findById(int id);

    Department save(Department department);

    void remove(Department department);
}
