package com.hr.bk.dao;

import com.hr.bk.enitiy.Option;

import java.util.List;

public interface OptionDAO {
    Option save(Option option);

    Option findById(int id);

    List<Option> findAll();

    boolean remove(Option option);
}
