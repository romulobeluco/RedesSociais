package org.example;

public class GooglePlus extends RedeSocial implements VideoConferencia,Compartilhamento {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo stream no GooglePlus");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postando foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando foto no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando comentario no GooglePlus");
    }
}
