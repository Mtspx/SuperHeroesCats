package com.company;

public class Item {
    protected String material;
    protected int totalAtaque;
    protected int totalDefesa;
    protected int custo;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTotalAtaque() {
        return totalAtaque;
    }

    public void setTotalAtaque(int totalAtaque) {
        this.totalAtaque = totalAtaque;
    }

    public int getTotalDefesa() {
        return totalDefesa;
    }

    public void setTotalDefesa(int totalDefesa) {
        this.totalDefesa = totalDefesa;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public int aumentarDefesa(int armadura) {
        if (this.getTotalDefesa() <= 10) {
            if ((this.getTotalDefesa() * armadura) + armadura <= 150) {
                armadura = (this.getTotalDefesa() * armadura) + armadura;
                return armadura;
            } else {
                armadura = 150;
                return armadura;
            }
        } else {
            this.setTotalDefesa(10);
            if ((this.getTotalDefesa() * armadura) + armadura <= 150) {
                armadura = (this.getTotalDefesa() * armadura) + armadura;
                return armadura;
            } else {
                armadura = 150;
                return armadura;
            }
        }
    }
        public int aumentarAtaque(int ataque){
            if (this.getTotalAtaque() + ataque <= 100) {
                ataque = this.getTotalAtaque() + ataque;
                return ataque;
            } else {
                ataque = 100;
                return ataque;
            }
        }

    }
