package com.example.demoW25.controller;

import com.example.demoW25.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController // para definir una clase como un controlador rest
public class Controller {

    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hola " + name;
    }


    @GetMapping("/numero/romano/convertir/{number}")
    public String convertirNumero(@PathVariable int number){
        String mensaje = "Tu número convertido a romano es: ";
        Map<Integer,String> numerosRomanos = new HashMap<>();

        numerosRomanos.put(1, "I"); // se usa 3 veces
        numerosRomanos.put(5, "V"); // se usa 1 vez
        numerosRomanos.put(10, "X"); // se usa 3 veces
        numerosRomanos.put(50, "L"); // se usa 1 vez
        numerosRomanos.put(100, "C"); // se usa 3 veces
        numerosRomanos.put(500, "D"); // se 1 vez
        numerosRomanos.put(1000, "M"); // se 3 veces

        List<Integer> keys = new ArrayList<>();
        keys.addAll(numerosRomanos.keySet());
        // keys.stream().sorted(Comparator.comparing());

        if (numerosRomanos.containsKey(number)) return (mensaje += numerosRomanos.get(number));

        for ( int i = 0; i < keys.size(); i++ ){
            System.out.println("El número es:" + keys.get(i));

        }

        return "Tu numero convertido a romano es:";
    }

}
