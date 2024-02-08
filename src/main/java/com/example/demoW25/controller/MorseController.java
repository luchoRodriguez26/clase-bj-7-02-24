package com.example.demoW25.controller;

import com.example.demoW25.model.CodigoMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    CodigoMorse traductor = new CodigoMorse();

    @GetMapping("/codigo/morse/codificar/{palabra}")
    public String codificar (@PathVariable String palabra) {
        return traductor.codificar(palabra);
    }

    @GetMapping("/codigo/morse/decodificar/{codigo}")
    public String decodificar (@PathVariable String codigo) {
        return traductor.decodificar(codigo);
    }



}
