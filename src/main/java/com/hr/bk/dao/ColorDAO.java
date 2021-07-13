package com.hr.bk.dao;

import com.hr.bk.enitiy.Color;

import java.util.List;

public interface ColorDAO {
    Color save(Color color);

    Color findById(int id);

    List<Color> findAll();

    boolean remove(Color color);
}
