package com.dominio.restapi.controller;

import com.dominio.restapi.model.UserModel;
import com.dominio.restapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/api/user/{cod}")
    public ResponseEntity consultar(@PathVariable("cod") Integer cod){
        return repository.findById(cod)
                .map (record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());

    }

    @PostMapping(path = "/api/user/save")
    public UserModel save(@RequestBody UserModel user){
        return repository.save(user);
    }

}
