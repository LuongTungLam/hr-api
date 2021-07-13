package com.hr.bk.service;

import com.hr.bk.enitiy.Color;

import java.util.List;

public interface ColorService {
    Color save(Color color);

    Color findById(int id);

    List<Color> findAll();

    boolean remove(Color color);
}
