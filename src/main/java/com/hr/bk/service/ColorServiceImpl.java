package com.hr.bk.service;

import com.hr.bk.dao.ColorDAO;
import com.hr.bk.enitiy.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    ColorDAO colorDAO;

    @Override
    public Color save(Color color) {
        return colorDAO.save(color);
    }

    @Override
    public Color findById(int id) {
        return colorDAO.findById(id);
    }

    @Override
    public List<Color> findAll() {
        return colorDAO.findAll();
    }

    @Override
    public boolean remove(Color color) {
        if (colorDAO.remove(color)) {
            return true;
        } else {
            return false;
        }
    }
}
