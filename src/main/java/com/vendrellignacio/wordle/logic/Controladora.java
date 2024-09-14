
package com.vendrellignacio.wordle.logic;

import java.util.ArrayList;
import java.util.List;


public class Controladora {
    
    
    
    public void insertarPalabras(){
        List<Palabra> listaPalabras = new ArrayList<>();
        String[] palabras = {
                "crema", "punto", "luzco", "rocas", "llave", "orden", "mango", "calle", "vigor", "fruta",
                "nieve", "plazo", "ritmo", "notar", "salud", "pegar", "trato", "vuelo", "rumbo", "salto",
                "tarde", "calor", "costo", "jugar", "ducha", "baile", "filme", "corte", "padre", "bebes",
                "botar", "final", "hojas", "canto", "votar", "gente", "libro", "lento", "trama", "perro",
                "huevo", "dieta", "marca", "pilar", "pista", "vuela", "mujer", "nacer", "cesta", "subir"
        };
        System.out.println(palabras.length);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(i);
            listaPalabras.add(new Palabra(i+1, palabras[i]));
        }
    }
    
    
    
    
}
