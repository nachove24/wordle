
package com.vendrellignacio.wordle;

import com.vendrellignacio.wordle.igu.Principal;
import com.vendrellignacio.wordle.logic.Controladora;
import com.vendrellignacio.wordle.logic.LetraAdivinar;




public class Wordle {

    public static void main(String[] args) {
        LetraAdivinar letras;
        Controladora control = new Controladora();
        //obtengo la palabra del día
        String palabra = control.obtenerPalabra();
        System.out.println(palabra);
        //llamo un metodo que pasa a char cada letra del string 
        char[] caracteres = control.stringToChar(palabra);
        //inicializa un OBJ al cual le agrega cada caracter
        letras = control.crearLetrasAdi(caracteres);
        //abrimos la interfaz
        Principal princ = new Principal(letras);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
         
    }
}
