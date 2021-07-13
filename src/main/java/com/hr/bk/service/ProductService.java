package com.hr.bk.service;

import com.hr.bk.enitiy.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    Product save(Product product);

    Product findById(int id);

    boolean remove(Product product);
}
