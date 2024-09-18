
package com.vendrellignacio.wordle.logic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


public class Controladora {
    LetraAdivinar letra;
    LetraIntento letraInt;
    String[] palabras = {
                "crema", "punto", "luzco", "rocas", "llave", "orden", "mango", "calle", "vigor", "fruta",
                "nieve", "plazo", "ritmo", "notar", "salud", "pegar", "trato", "vuelo", "rumbo", "salto",
                "tarde", "calor", "costo", "jugar", "ducha", "baile", "filme", "corte", "padre", "bebes",
                "botar", "final", "hojas", "canto", "votar", "gente", "libro", "lento", "trama", "perro",
                "huevo", "dieta", "marca", "pilar", "pista", "vuela", "mujer", "nacer", "cesta", "subir"
        };
    List<Palabra> listaPalabras = new ArrayList<>();
    
    public String obtenerPalabra(){
        
        System.out.println(palabras.length);
        
        //Guardo las palabras en una ArrayList
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(i);
            listaPalabras.add(new Palabra(i+1, palabras[i]));
        }
        
        long diffFecha = fechaDiff();
        String palabraDelDia = palabraHoy(diffFecha); 
        
        return palabraDelDia;
        
    }

    private String palabraHoy(long diffFecha) {
        String palabraHoy = null;
        for (int i = 0; i < listaPalabras.size(); i++) {
             if (diffFecha == i) {
                 palabraHoy = listaPalabras.get(i).getPalabra();
                 return palabraHoy;
             }
        }
        return palabraHoy;
    }
    
    private long fechaDiff(){
         //FECHAS DIFF
        LocalDate fechaActual = LocalDate.now();
        // Fecha especificada en el código (por ejemplo, 2024-09-14)
        LocalDate fechaInicial = LocalDate.of(2024, 9, 14);
        // Calcular la diferencia en días entre las dos fechas
        long diferenciaDias = ChronoUnit.DAYS.between(fechaInicial, fechaActual);
        System.out.println(diferenciaDias);
        return diferenciaDias;
    }

    public char[] stringToChar(String palabra) {
        // Convertir la cadena en un array de caracteres
        char[] caracteres = palabra.toCharArray();
        return caracteres;
    }
    
    public LetraAdivinar crearLetrasAdi(char[] caracteres){
        letra = new LetraAdivinar();
        for (int i = 0; i < 5; i++) {
                switch (i+1) {
                    case 1 -> letra.setPrimera(caracteres[i]);
                    case 2 -> letra.setSegunda(caracteres[i]);
                    case 3 -> letra.setTercera(caracteres[i]);
                    case 4 -> letra.setCuarta(caracteres[i]);
                    case 5 -> letra.setQuinta(caracteres[i]);
                }
        }
        return letra;
    }

    public LetraIntento crearIntento(char[] caracteres) {
        letraInt = new LetraIntento();
        for (int i = 0; i < 5; i++) {
                switch (i+1) {
                    case 1 -> letraInt.setPrimera(caracteres[i]);
                    case 2 -> letraInt.setSegunda(caracteres[i]);
                    case 3 -> letraInt.setTercera(caracteres[i]);
                    case 4 -> letraInt.setCuarta(caracteres[i]);
                    case 5 -> letraInt.setQuinta(caracteres[i]);
                }
        }
        return letraInt;
    }

    public char[] letrasToChar(LetraIntento letrasInt) {
         char[] letrasToChar = new char[5];
         letrasToChar[0]=letrasInt.getPrimera();
         letrasToChar[1]=letrasInt.getSegunda();
         letrasToChar[2]=letrasInt.getTercera();
         letrasToChar[3]=letrasInt.getCuarta();
         letrasToChar[4]=letrasInt.getQuinta();
         return letrasToChar;
    }

    public char[] letrasAdiToChar(LetraAdivinar letras) {
         char[] letrasToChar = new char[5];
         letrasToChar[0]=letras.getPrimera();
         letrasToChar[1]=letras.getSegunda();
         letrasToChar[2]=letras.getTercera();
         letrasToChar[3]=letras.getCuarta();
         letrasToChar[4]=letras.getQuinta();
         return letrasToChar;
    }
    
    
}
