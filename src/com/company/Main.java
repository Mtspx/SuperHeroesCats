package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SuperPoder superpoder1 = new SuperPoder("Raio de Fogo",4,10);
        SuperPoder superpoder2 = new SuperPoder("Raio de Agua",1,7);
        SuperPoder superpoder3 = new SuperPoder("Raio de Terra",2,4);
        SuperPoder superpoder4 = new SuperPoder("Raio de Vento",3,8);
        SuperPoder superpoder5 = new SuperPoder("Raio de Agua",1,10);

        ArrayList<SuperPoder> superPoderes1 = new ArrayList<>();
        superPoderes1.add(superpoder1);
        superPoderes1.add(superpoder2);
        superPoderes1.add(superpoder3);
        superPoderes1.add(superpoder4);
        superPoderes1.add(superpoder5);

        ArrayList<SuperPoder> superPoderes2 = new ArrayList<>();
        superPoderes2.add(superpoder1);
        superPoderes2.add(superpoder4);
        superPoderes2.add(superpoder5);



        Historia historia1 = new Historia("A lenda do cavaleiro da morte","bla bla bla ","link.com/historiadocavaleirodamote");

        Armadura armadura = new Armadura();
        armadura.setCusto(500);
        armadura.setTotalDefesa(6);

        Arma arma = new Arma();
        arma.setCusto(800);
        arma.setTotalAtaque(44);
        arma.setElemento(2);

        Escudo escudo = new Escudo();
        escudo.setCusto(400);
        escudo.setTotalDefesa(22);

        ArrayList<Item> itens = new ArrayList<>();
        itens.add(armadura);
        itens.add(arma);
        itens.add(escudo);

        // SUPER HEROI SEM ITENS
        SuperHerois  superheroi1 = new SuperHerois();
        superheroi1.setNome("Caveleiro da Morte");
        superheroi1.setAnoSurgimento("800 a.C");
        superheroi1.setHistoria(historia1);
        superheroi1.setTotalAtaque(57);
        superheroi1.setTotalDefesa(15);


        // SUPER HEROI COM ITENS E PODERES
        superheroi1.setItem(itens);
        superheroi1.setSuperPoderes(superPoderes2);
        //superheroi1.podeAdicionarPoder(superheroi1.getSuperPoderes());
        superheroi1.setTotalAtaque(arma.aumentarAtaque(superheroi1.getTotalAtaque()));
        superheroi1.setTotalDefesa(escudo.aumentarDefesa(superheroi1.getTotalDefesa()));
        superheroi1.setTotalDefesa(armadura.aumentarDefesa(superheroi1.getTotalDefesa()));

        System.out.println(
                "Relatório geral do SuperHeroi"
                +"\nNome : "+superheroi1.getNome()
                +"\nAno Surgimento : "+superheroi1.getAnoSurgimento()
                +"\nHistoria: "+superheroi1.getHistoria().getTitulo()
                +"\n\n"
                +"Ataque total: "+superheroi1.getTotalAtaque()
                +"\nDefesa total: "+superheroi1.getTotalDefesa()+"\n"
                +"\nLista de Poderes: "+ "\n"
        );
        for(int i=0;i<superheroi1.getSuperPoderes().size(); i++){
            System.out.println(1+i+"."+superheroi1.getSuperPoderes().get(i).getNome()
                                +"\nElemento: "+superheroi1.indentificarElemento(superheroi1.getSuperPoderes().get(i).getElemento())
                                +"\nNivel: "+superheroi1.getSuperPoderes().get(i).getNivel()+"\n"
            );
        }

    }
}
