package com.thursdayactivityjan12.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thursdayactivityjan12.productentity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
