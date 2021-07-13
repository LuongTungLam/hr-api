package com.hr.bk.service;

import com.hr.bk.enitiy.Quantity;

import java.util.List;

public interface QuantityService {
    Quantity save(Quantity quantity);

    Quantity findById(int id);

    Quantity findByProductId(int productId);

    long countByProductId(int productId);

    List<Quantity> findAll();
}
