package com.hr.bk.dao;

import com.hr.bk.enitiy.Product;
import com.hr.bk.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDAO {

    @Autowired
    ProductRepository repository;

    @Override
    public List<Product> getAllProduct() {
        return repository.findAll();
    }

    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public Product findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public boolean remove(Product product) {
        repository.delete(product);
        return true;
    }
}
