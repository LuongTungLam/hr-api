package com.hr.bk.service;

import com.hr.bk.enitiy.Vacancy;

import java.util.List;

public interface VacancyService {
    List<Vacancy> findAll();

    Vacancy findById(int id);

    Vacancy save(Vacancy vacancy);

    void delete(Vacancy vacancy);

    List<Vacancy> findAllByTemplateId(int tempId);
}
