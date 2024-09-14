
package com.vendrellignacio.wordle.logic;


public class Palabra {
    private int id;
    private String palabra;

    public Palabra() {
    }

    public Palabra(int id, String palabra) {
        this.id = id;
        this.palabra = palabra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Palabra{" + "id=" + id + ", palabra=" + palabra + '}';
    }
    
    
}
