package com.company;

public class Historia {
    private String titulo;
    private String enredo;
    private String link;

    public Historia(String titulo,String enredo,String link){
        this.titulo = titulo;
        this.enredo = enredo;
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEnredo() {
        return enredo;
    }

    public String getLink() {
        return link;
    }
}
