package com.hr.bk.repository;

import com.hr.bk.enitiy.Quantity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuantityRepository extends JpaRepository<Quantity, Integer> {
    Quantity findQuantityByProductId(int productId);
}
