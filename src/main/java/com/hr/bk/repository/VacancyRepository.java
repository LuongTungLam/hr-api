package com.hr.bk.repository;

import com.hr.bk.enitiy.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacancyRepository extends JpaRepository<Vacancy, Integer> {

    List<Vacancy> findAllByTemplateId(int tempId);
}
