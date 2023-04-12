package com.adhocsolucoes.ordering_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adhocsolucoes.ordering_system.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
