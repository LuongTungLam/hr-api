package com.hr.bk.model;

import com.hr.bk.enitiy.Template;
import lombok.Data;

import javax.persistence.Column;
import java.sql.Date;

@Data
public class TemplateModel {
    private int id;
    private String title;
    private int amount;
    private Date createdDate;
    private Date endDate;
    private int status;
    private String departmentName;
    private int departmentId;

    public TemplateModel(Template template) {
        this.id = template.getId();
        this.title = template.getTitle();
        this.amount = template.getAmount();
        this.createdDate = template.getCreatedDate();
        this.endDate = template.getEndDate();
        this.status = template.getStatus();
        this.departmentName = template.getDepartment().getName();
        this.departmentId = template.getDepartment().getId();
    }
}
