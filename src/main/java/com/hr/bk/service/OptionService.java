package com.hr.bk.service;

import com.hr.bk.enitiy.Option;

import java.util.List;

public interface OptionService {
    Option save(Option option);

    Option findById(int id);

    List<Option> findAll();

    boolean remove(Option option);
}
