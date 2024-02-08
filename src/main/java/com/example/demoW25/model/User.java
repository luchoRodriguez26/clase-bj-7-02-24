package com.example.demoW25.model;

import lombok.*;

@AllArgsConstructor // genera un contructor con todos los argumentos
@NoArgsConstructor // genera un constructor sin argumentos
@Getter
@Setter
@Data // genera getters y  setter
public class User {
    private String nombre;
    private String apellido;
}
