package org.example;

public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou no Twitter");
    }

    @Override
    public void postarFoto() {
        System.out.println("Publicando uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando video no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando um comentario no Twitter");
    }
}
