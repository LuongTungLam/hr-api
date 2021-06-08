package com.hr.bk.service;

import com.hr.bk.dao.TemplateDAO;
import com.hr.bk.enitiy.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateServiceImpl implements TemplateService {

    @Autowired
    TemplateDAO templateDAO;

    @Override
    public Template findById(int id) {
        return templateDAO.findById(id);
    }

    @Override
    public List<Template> findAll() {
        return templateDAO.findAll();
    }

    @Override
    public Template save(Template template) {
        return templateDAO.save(template);
    }

    @Override
    public void remove(Template template) {
        templateDAO.remove(template);
    }

    @Override
    public List<Template> findAllByDepartmentId(int depId) {
        return templateDAO.findAllByDepartmentId(depId);
    }
}
