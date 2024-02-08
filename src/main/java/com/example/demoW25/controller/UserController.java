package com.example.demoW25.controller;

import com.example.demoW25.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Para definir que esto es un controller
@RequestMapping("/v1/users") // para definir la ruta desde la cual va estar pegando el controler
public class UserController {

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hola " + name;
    }

    public List<User> getAllUsers() {
        return loadUser();
    }
    private List<User> loadUser () {
        return List.of(new User("Lucho", "Rodriguez"),
                new User("Tomi", "Rodriguez"));
    }
}
