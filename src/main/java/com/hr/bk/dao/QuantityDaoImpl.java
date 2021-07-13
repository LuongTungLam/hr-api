package com.hr.bk.dao;

import com.hr.bk.enitiy.Quantity;
import com.hr.bk.repository.QuantityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuantityDaoImpl implements QuantityDAO{

    @Autowired
    QuantityRepository quantityRepository;

    @Override
    public Quantity save(Quantity quantity) {
        return quantityRepository.save(quantity);
    }

    @Override
    public Quantity findById(int id) {
        return quantityRepository.findById(id).get();
    }

    @Override
    public Quantity findByProductId(int productId) {
        return quantityRepository.findQuantityByProductId(productId);
    }

    @Override
    public long countByProductId(int productId) {
        return quantityRepository.count();
    }

    @Override
    public List<Quantity> findAll() {
        return quantityRepository.findAll();
    }
}
