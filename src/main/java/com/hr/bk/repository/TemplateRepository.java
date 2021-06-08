package com.hr.bk.repository;

import com.hr.bk.enitiy.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TemplateRepository extends JpaRepository<Template, Integer> {
    List<Template> findAllByDepartmentId(int depId);
}
