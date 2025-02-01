package com.springboot.backend.jesus.usersapp.users_backend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.jesus.usersapp.users_backend.entities.User;

// Usamos la interfaz CrudRepository para poder hacer operaciones CRUD
// long es el tipo de dato de la llave primaria de la entidad User


public interface UserRepository extends CrudRepository<User, Long> { 

}
