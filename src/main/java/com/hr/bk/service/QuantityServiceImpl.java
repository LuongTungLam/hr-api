package com.hr.bk.service;

import com.hr.bk.dao.QuantityDAO;
import com.hr.bk.enitiy.Quantity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuantityServiceImpl implements QuantityService {

    @Autowired
    QuantityDAO quantityDAO;

    @Override
    public Quantity save(Quantity quantity) {
        return quantityDAO.save(quantity);
    }

    @Override
    public Quantity findById(int id) {
        return quantityDAO.findById(id);
    }

    @Override
    public Quantity findByProductId(int productId) {
        return quantityDAO.findByProductId(productId);
    }

    @Override
    public long countByProductId(int productId) {
        return quantityDAO.countByProductId(productId);
    }

    @Override
    public List<Quantity> findAll() {
        return quantityDAO.findAll();
    }
}
