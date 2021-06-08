package com.hr.bk.dao;

import com.hr.bk.enitiy.Template;
import com.hr.bk.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TemplateDaoImpl implements TemplateDAO {

    @Autowired
    TemplateRepository templateRepository;

    @Override
    public Template findById(int id) {
        return templateRepository.findById(id).get();
    }

    @Override
    public List<Template> findAll() {
        return templateRepository.findAll();
    }

    @Override
    public Template save(Template template) {
        return templateRepository.save(template);
    }

    @Override
    public void remove(Template template) {
        templateRepository.delete(template);
    }

    @Override
    public List<Template> findAllByDepartmentId(int depId) {
        return templateRepository.findAllByDepartmentId(depId);
    }
}
