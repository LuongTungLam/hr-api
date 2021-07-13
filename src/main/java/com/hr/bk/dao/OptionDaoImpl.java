package com.hr.bk.dao;

import com.hr.bk.enitiy.Option;
import com.hr.bk.repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OptionDaoImpl implements OptionDAO {

    @Autowired
    OptionRepository optionRepository;

    @Override
    public Option save(Option option) {
        return optionRepository.save(option);
    }

    @Override
    public Option findById(int id) {
        return optionRepository.findById(id).get();
    }

    @Override
    public List<Option> findAll() {
        return optionRepository.findAll();
    }

    @Override
    public boolean remove(Option option) {
        optionRepository.delete(option);
        return true;
    }
}
