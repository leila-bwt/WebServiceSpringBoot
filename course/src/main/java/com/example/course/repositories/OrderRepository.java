package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
//essa estrutura instancía o objeto Repository que terá varias operações para traballhar ocm o usuário
