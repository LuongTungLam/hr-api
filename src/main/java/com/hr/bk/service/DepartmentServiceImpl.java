package com.hr.bk.service;

import com.hr.bk.dao.DepartmentDAO;
import com.hr.bk.enitiy.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentDAO departmentDAO;

    @Override
    public List<Department> findAll() {
        return departmentDAO.findAll();
    }

    @Override
    public Department findById(int id) {
        return departmentDAO.findById(id);
    }

    @Override
    public Department save(Department department) {
        return departmentDAO.save(department);
    }

    @Override
    public void remove(Department department) {
        departmentDAO.remove(department);
    }
}
