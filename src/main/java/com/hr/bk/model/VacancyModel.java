package com.hr.bk.model;

import com.hr.bk.enitiy.Vacancy;
import lombok.Data;

import java.sql.Date;


@Data
public class VacancyModel {
    private int id;

    private String userName;

    private String templateTitle;

    private String emailCreator;

    private String position;

    private Date startDate;

    private Date endDate;

    private int amount;

    private int status;

    public VacancyModel(Vacancy vacancy) {
        this.id = vacancy.getId();
        this.userName = vacancy.getUserName();
        this.templateTitle = vacancy.getTemplate().getTitle();
        this.emailCreator = vacancy.getEmailCreator();
        this.position = vacancy.getPosition();
        this.startDate = vacancy.getTemplate().getCreatedDate();
        this.endDate = vacancy.getTemplate().getEndDate();
        this.amount = vacancy.getTemplate().getAmount();
        this.status = vacancy.getStatus();
    }
}
