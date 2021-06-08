package com.hr.bk.controller;

import com.hr.bk.enitiy.Vacancy;
import com.hr.bk.model.VacancyModel;
import com.hr.bk.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/vacancy"})
@CrossOrigin("*")
public class VacancyController {

    @Autowired
    VacancyService vacancyService;

    @GetMapping
    public List<VacancyModel> findAll() {
        List<VacancyModel> vacancyModels = new ArrayList<>();
        List<Vacancy> list = vacancyService.findAll();
        for (Vacancy vacancy : list) {
            VacancyModel vacancyModel = new VacancyModel(vacancy);
            vacancyModels.add(vacancyModel);
        }
        return vacancyModels;
    }

    @PostMapping
    public boolean saveVacancy(@RequestBody Vacancy vacancy) {
        Vacancy save = vacancyService.save(vacancy);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @GetMapping("/{id}")
    public VacancyModel findById(@PathVariable(value = "id") Integer id) {
        VacancyModel model = new VacancyModel(vacancyService.findById(id));
        return model;
    }

    @PutMapping("/{id}")
    public boolean updateVacancy(@PathVariable(value = "id") Integer id, @RequestBody Vacancy vacancy) {
        Vacancy update = vacancyService.findById(id);
        if (update != null) {
            update.setStatus(vacancy.getStatus());
            vacancyService.save(update);
            return true;
        } else {
            return false;
        }
    }

    @PostMapping("/delete/{id}")
    public boolean deleteVacancy(@PathVariable(value = "id") Integer id) {
        Vacancy delete = vacancyService.findById(id);
        if (delete != null) {
            vacancyService.delete(delete);
            return true;
        } else {
            return false;
        }
    }
}
