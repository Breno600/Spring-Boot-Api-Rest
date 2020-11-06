package com.dominio.restapi.repository;

import com.dominio.restapi.model.UserModel;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
