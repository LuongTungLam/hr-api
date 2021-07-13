package com.hr.bk.service;

import com.hr.bk.dao.OptionDAO;
import com.hr.bk.enitiy.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionServiceImpl implements OptionService {

    @Autowired
    OptionDAO optionDAO;

    @Override
    public Option save(Option option) {
        return optionDAO.save(option);
    }

    @Override
    public Option findById(int id) {
        return optionDAO.findById(id);
    }

    @Override
    public List<Option> findAll() {
        return optionDAO.findAll();
    }

    @Override
    public boolean remove(Option option) {
        if (optionDAO.remove(option)) {
            return true;
        } else {
            return false;
        }
    }
}
