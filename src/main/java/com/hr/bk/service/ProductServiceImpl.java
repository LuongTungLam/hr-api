package com.hr.bk.service;

import com.hr.bk.dao.ProductDAO;
import com.hr.bk.enitiy.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDAO dao;


    @Override
    public List<Product> getAllProduct() {
        return dao.getAllProduct();
    }

    @Override
    public Product save(Product product) {
        return dao.save(product);
    }

    @Override
    public Product findById(int id) {
        return dao.findById(id);
    }

    @Override
    public boolean remove(Product product) {
        boolean check = dao.remove(product);
        if (check == true) {
            return true;
        } else {
            return false;
        }
    }
}
