package com.hr.bk.dao;

import com.hr.bk.enitiy.Template;

import java.util.List;

public interface TemplateDAO {
    Template findById(int id);

    List<Template> findAll();

    Template save(Template template);

    void remove(Template template);

    List<Template> findAllByDepartmentId(int depId);
}
