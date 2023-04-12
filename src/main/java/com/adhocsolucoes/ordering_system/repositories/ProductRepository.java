package com.adhocsolucoes.ordering_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adhocsolucoes.ordering_system.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
