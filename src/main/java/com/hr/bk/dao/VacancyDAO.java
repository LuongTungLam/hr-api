package com.hr.bk.dao;

import com.hr.bk.enitiy.Vacancy;

import java.util.List;

public interface VacancyDAO {

    List<Vacancy> findAll();

    Vacancy findById(int id);

    Vacancy save(Vacancy vacancy);

    List<Vacancy> findAllByTemplateId(int tempId);

    void delete(Vacancy vacancy);
}
