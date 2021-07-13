package com.hr.bk.controller;

import com.hr.bk.enitiy.Product;
import com.hr.bk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/product"})
@CrossOrigin("*")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAllProduct() {
        List<Product> list = productService.getAllProduct();
        return list;
    }

    @PostMapping
    public boolean saveProduct(@RequestBody Product product) {
        Product save = productService.save(product);
        if (save != null) {
            return true;
        } else {
            return false;
        }
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable(value = "id") Integer id) {
        Product product = productService.findById(id);
        return product;
    }

    @PutMapping("/{id}")
    public boolean updateProduct(@PathVariable(value = "id") Integer id, @RequestBody Product product) {
        Product update = productService.findById(id);
        update.setName(product.getName());
        update.setImage(product.getImage());
        update.setDescription(product.getDescription());
        update.setPrice(product.getPrice());
        update.setQuantity(product.getQuantity());
        update.setStatus(product.getStatus());
        productService.save(update);
        return true;
    }

    @DeleteMapping("/{id}")
    public boolean removeProduct(@PathVariable(value = "id") Integer id) {
        Product detail = productService.findById(id);
        boolean delete = productService.remove(detail);
        if (delete == true) {
            return true;
        } else {
            return false;
        }
    }
}
