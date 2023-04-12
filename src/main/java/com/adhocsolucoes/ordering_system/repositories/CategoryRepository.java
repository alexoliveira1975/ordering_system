package com.adhocsolucoes.ordering_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adhocsolucoes.ordering_system.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
