package com.hr.bk.controller;

import com.hr.bk.enitiy.Department;
import com.hr.bk.enitiy.Template;
import com.hr.bk.enitiy.Vacancy;
import com.hr.bk.service.DepartmentService;
import com.hr.bk.service.TemplateService;
import com.hr.bk.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/departments"})
@CrossOrigin("*")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @Autowired
    TemplateService templateService;

    @Autowired
    VacancyService vacancyService;

    @GetMapping
    public List<Department> findAll() {
        List<Department> list = departmentService.findAll();
        return list;
    }

    @PostMapping
    public boolean saveDepartment(@RequestBody Department department) {
        Department save = departmentService.save(department);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @PutMapping("/{id}")
    public Department update(@PathVariable(value = "id") Integer id, @RequestBody Department department) {
        Department update = departmentService.findById(id);
        update.setName(department.getName());
        update.setStatus(department.getStatus());
        departmentService.save(update);
        return update;
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable(value = "id") Integer id) {
        Department department = departmentService.findById(id);
        return department;
    }

    @PostMapping("/delete/{id}")
    public void remove(@PathVariable(value = "id") Integer id) {
        Department department = departmentService.findById(id);
        List<Template> list = templateService.findAllByDepartmentId(department.getId());
        for (Template template : list) {
            List<Vacancy> vacancies = vacancyService.findAllByTemplateId(template.getId());
            for (Vacancy vacancy : vacancies) {
                vacancyService.delete(vacancy);
            }
            if (vacancies.size() == 0) {
                templateService.remove(template);
            }
        }
        if (list.size() == 0) {
            departmentService.remove(department);
        }
    }
}
