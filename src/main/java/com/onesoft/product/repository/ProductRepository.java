package com.onesoft.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	

}
