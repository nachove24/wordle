
package com.vendrellignacio.wordle.logic;


public class LetraAdivinar {
    private char primera;
    private char segunda;
    private char tercera;
    private char cuarta;
    private char quinta;

    public LetraAdivinar() {
    }

    public LetraAdivinar(char primera, char segunda, char tercera, char cuarta, char quinta) {
        this.primera = primera;
        this.segunda = segunda;
        this.tercera = tercera;
        this.cuarta = cuarta;
        this.quinta = quinta;
    }

    public char getPrimera() {
        return primera;
    }

    public void setPrimera(char primera) {
        this.primera = primera;
    }

    public char getSegunda() {
        return segunda;
    }

    public void setSegunda(char segunda) {
        this.segunda = segunda;
    }

    public char getTercera() {
        return tercera;
    }

    public void setTercera(char tercera) {
        this.tercera = tercera;
    }

    public char getCuarta() {
        return cuarta;
    }

    public void setCuarta(char cuarta) {
        this.cuarta = cuarta;
    }

    public char getQuinta() {
        return quinta;
    }

    public void setQuinta(char quinta) {
        this.quinta = quinta;
    }
    
    
}
