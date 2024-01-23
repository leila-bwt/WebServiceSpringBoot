package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
//essa estrutura instancía o objeto Repository que terá varias operações para traballhar ocm o usuário
