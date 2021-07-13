package com.hr.bk.dao;

import com.hr.bk.enitiy.Color;
import com.hr.bk.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ColorDaoImpl implements ColorDAO {

    @Autowired
    ColorRepository colorRepository;

    @Override
    public Color save(Color color) {
        return colorRepository.save(color);
    }

    @Override
    public Color findById(int id) {
        return colorRepository.findById(id).get();
    }

    @Override
    public List<Color> findAll() {
        return colorRepository.findAll();
    }

    @Override
    public boolean remove(Color color) {
        colorRepository.delete(color);
        return true;
    }
}
