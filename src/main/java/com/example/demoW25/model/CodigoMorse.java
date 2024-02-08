package com.example.demoW25.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CodigoMorse {

    Map<Character, String> morseCodeDictonary;

    public CodigoMorse () {
        this.morseCodeDictonary = new HashMap<>();
        cargarCodigo();
    }

    public String codificar (String palabra) {
        char[] letras = palabra.toCharArray();
        String palabraCodificada = "";
        for(char letra : letras) {
            palabraCodificada += morseCodeDictonary.get(Character.toUpperCase(letra));
        }
        return "La palabra codificada es: " + palabraCodificada;
    }

    public String decodificar (String codigo) {
        String[] codigos = codigo.split(" ");
        System.out.println("Este es el codigo: " + codigo);
        String resultado = "";
        for(String c : codigos) {
            System.out.println("Este es el valor: " + c);
            for(Map.Entry<Character, String> entry : morseCodeDictonary.entrySet()){
                if (entry.getValue() == c) {
                    System.out.println("Entreeee");
                    System.out.println(entry.getValue());
                    System.out.println(c);
                    resultado += entry.getKey();
                }
                else continue;
            }
        }

        return "La palabra decodificada es: " + resultado;
    }

    private void cargarCodigo () {
        morseCodeDictonary.put('A', ".-");
        morseCodeDictonary.put('B', "-...");
        morseCodeDictonary.put('C', "-.-.");
        morseCodeDictonary.put('D', "-..");
        morseCodeDictonary.put('E', ".");
        morseCodeDictonary.put('F', "..-.");
        morseCodeDictonary.put('G', "--.");
        morseCodeDictonary.put('H', "....");
        morseCodeDictonary.put('I', "..");
        morseCodeDictonary.put('J', ".---");
        morseCodeDictonary.put('K', "-.-");
        morseCodeDictonary.put('L', ".-..");
        morseCodeDictonary.put('M', "--");
        morseCodeDictonary.put('N', "-.");
        morseCodeDictonary.put('O', "---");
        morseCodeDictonary.put('P', ".--.");
        morseCodeDictonary.put('Q', "--.-");
        morseCodeDictonary.put('R', ".-.");
        morseCodeDictonary.put('S', "...");
        morseCodeDictonary.put('T', "-");
        morseCodeDictonary.put('U', "..-");
        morseCodeDictonary.put('V', "...-");
        morseCodeDictonary.put('W', ".--");
        morseCodeDictonary.put('X', "-..-");
        morseCodeDictonary.put('Y', "-.--");
        morseCodeDictonary.put('Z', "--..");
    }

}
