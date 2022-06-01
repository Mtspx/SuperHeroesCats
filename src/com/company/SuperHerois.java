package com.company;

import java.util.ArrayList;

public class SuperHerois {
    private String nome;
    private String anoSurgimento;
    private int totalDefesa;
    private int totalAtaque;
    private Historia historia;
    private ArrayList<SuperPoder> superPoderes;
    private ArrayList<Item> itens;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoSurgimento() {
        return anoSurgimento;
    }

    public void setAnoSurgimento(String anoSurgimento) {
        this.anoSurgimento = anoSurgimento;
    }

    public int getTotalDefesa() {
        return totalDefesa;
    }

    public void setTotalDefesa(int totalDefesa) {
        this.totalDefesa = totalDefesa;
    }

    public int getTotalAtaque() {
        return totalAtaque;
    }

    public void setTotalAtaque(int totalAtaque) {
        this.totalAtaque = totalAtaque;
    }

    public Historia getHistoria() {
        return historia;
    }

    public void setHistoria(Historia historia) {
        this.historia = historia;
    }

    public void setItem(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public ArrayList<SuperPoder> getSuperPoderes() {
        return superPoderes;
    }

    public void setSuperPoderes(ArrayList<SuperPoder> superPoderes) {
        this.superPoderes = superPoderes;
    }

    public void podeAdicionarPoder(ArrayList<SuperPoder> superPoder) {
        for (int i = 0; i < superPoder.size(); i++) {
            if (this.superPoderes.get(1).getElemento() == superPoder.get(i).getElemento()) {
                this.superPoderes.add(superPoder.get(i));
            }
        }
    }

    public String indentificarElemento(int elemento) {
        String retorno;
        if (elemento == 1) {
            retorno = ("Água");
            return retorno;
        } else if (elemento == 2) {
            retorno = ("Terra");
            return retorno;
        } else if (elemento == 3) {
            retorno = ("Vento");
            return retorno;
        } else if (elemento == 4) {
            retorno = ("Fogo");
            return retorno;
        } else {
            retorno = ("Elemento Não indentificado");
            return retorno;
        }
    }

    public void validarAtk(int ataque) {
        if (this.totalAtaque + ataque <= 100) {
            this.totalAtaque = this.totalAtaque + ataque;
        } else {
            this.totalAtaque = 100;
        }
    }

    public String validarDef(int defesa) {
        String retorno;
        if (defesa <= 150) {
            this.totalDefesa = defesa;
            retorno = ("Defesa ok!");
            return retorno;
        } else {
            retorno = ("Deseja excede o limite!");
            return retorno;
        }
    }


}
