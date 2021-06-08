package com.hr.bk.controller;

import com.hr.bk.enitiy.Template;
import com.hr.bk.model.TemplateModel;
import com.hr.bk.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/templates"})
@CrossOrigin("*")
public class TemplateController {

    @Autowired
    TemplateService templateService;

    @GetMapping
    public List<TemplateModel> findAll() {
        List<TemplateModel> templateModels = new ArrayList<>();
        List<Template> list = templateService.findAll();
        for (Template template : list) {
            TemplateModel tmp = new TemplateModel(template);
            templateModels.add(tmp);
        }
        return templateModels;
    }

    @PostMapping
    public boolean saveTemplate(@RequestBody Template template) {
        Template save = templateService.save(template);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @GetMapping("/{id}")
    public TemplateModel findById(@PathVariable(value = "id") Integer id) {
        TemplateModel tmp = new TemplateModel(templateService.findById(id));
        return tmp;
    }

    @PostMapping("/delete/{id}")
    public void remove(@PathVariable(value = "id") Integer id) {
        Template template = templateService.findById(id);
        templateService.remove(template);
    }

    @PutMapping("/{id}")
    public boolean updateTemplate(@PathVariable(value = "id") Integer id, @RequestBody Template template) {
        Template update = templateService.findById(id);
        if (update != null) {
            update.setTitle(template.getTitle());
            update.setAmount(template.getAmount());
            update.setCreatedDate(template.getCreatedDate());
            update.setEndDate(template.getEndDate());
            update.setStatus(template.getStatus());
            update.setDepartment(template.getDepartment());
            templateService.save(update);
            return true;
        } else {
            return false;
        }
    }
}
