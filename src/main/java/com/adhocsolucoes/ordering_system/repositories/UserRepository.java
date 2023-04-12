package com.adhocsolucoes.ordering_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adhocsolucoes.ordering_system.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
