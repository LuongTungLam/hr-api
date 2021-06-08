package com.hr.bk.service;

import com.hr.bk.dao.VacancyDAO;
import com.hr.bk.enitiy.Vacancy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyService {

    @Autowired
    VacancyDAO vacancyDAO;

    @Override
    public List<Vacancy> findAll() {
        return vacancyDAO.findAll();
    }

    @Override
    public Vacancy findById(int id) {
        return vacancyDAO.findById(id);
    }

    @Override
    public Vacancy save(Vacancy vacancy) {
        return vacancyDAO.save(vacancy);
    }

    @Override
    public void delete(Vacancy vacancy) {
        vacancyDAO.delete(vacancy);
    }

    @Override
    public List<Vacancy> findAllByTemplateId(int tempId) {
        return vacancyDAO.findAllByTemplateId(tempId);
    }
}
