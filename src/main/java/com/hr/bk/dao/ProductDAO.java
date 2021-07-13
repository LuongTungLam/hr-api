package com.hr.bk.dao;

import com.hr.bk.enitiy.Product;

import java.util.List;

public interface ProductDAO {
    List<Product> getAllProduct();

    Product save(Product product);

    Product findById(int id);

    boolean remove(Product product);
}
