package com.example.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
