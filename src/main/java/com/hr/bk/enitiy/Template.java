package com.hr.bk.enitiy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "template")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Template {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "amount")
    private int amount;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "status")
    private int status;

    @JsonBackReference(value = "template_department")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;

    @JsonBackReference(value = "vacancy")
    @OneToMany(mappedBy = "template")
    private List<Vacancy> vacancies;
}
