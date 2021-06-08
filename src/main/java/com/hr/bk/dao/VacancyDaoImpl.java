package com.hr.bk.dao;

import com.hr.bk.enitiy.Vacancy;
import com.hr.bk.repository.VacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VacancyDaoImpl implements VacancyDAO {
    @Autowired
    VacancyRepository vacancyRepository;

    @Override
    public List<Vacancy> findAll() {
        return vacancyRepository.findAll();
    }

    @Override
    public Vacancy findById(int id) {
        return vacancyRepository.findById(id).get();
    }

    @Override
    public Vacancy save(Vacancy vacancy) {
        return vacancyRepository.save(vacancy);
    }

    @Override
    public List<Vacancy> findAllByTemplateId(int tempId) {
        return vacancyRepository.findAllByTemplateId(tempId);
    }

    @Override
    public void delete(Vacancy vacancy) {
        vacancyRepository.delete(vacancy);
    }
}
