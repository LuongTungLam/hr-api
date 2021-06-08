package com.hr.bk.controller;

import com.hr.bk.model.HeaderModel;
import com.hr.bk.repository.DepartmentRepository;
import com.hr.bk.repository.TemplateRepository;
import com.hr.bk.repository.UserRepository;
import com.hr.bk.repository.VacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/dashboard"})
@CrossOrigin("*")
public class DashboardController {
    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    TemplateRepository templateRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    VacancyRepository vacancyRepository;

    @GetMapping
    public HeaderModel dashboard() {
        HeaderModel model = new HeaderModel();
        model.setCountUser(userRepository.count());
        model.setCountDepartment(departmentRepository.count());
        model.setCountTemplate(templateRepository.count());
        model.setCountVacancies(vacancyRepository.count());

        return model;
    }
}
