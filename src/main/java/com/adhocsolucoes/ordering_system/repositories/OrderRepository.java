package com.adhocsolucoes.ordering_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adhocsolucoes.ordering_system.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
