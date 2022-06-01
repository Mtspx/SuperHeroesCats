package com.company;

public class SuperPoder {
    private String nome;
    private int elemento;
    private int nivel;


    public SuperPoder(String nome,int elemento,int nivel){
        this.nome = nome;
        this.elemento = elemento;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getElemento() {
        return elemento;
    }

    public int getNivel() {
        return nivel;
    }


}
