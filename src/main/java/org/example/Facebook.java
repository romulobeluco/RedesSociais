package org.example;

public class Facebook extends RedeSocial implements VideoConferencia{
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo uma stream no facebook");
    }


    @Override
    public void postarFoto() {
        System.out.println("Postando uma foto no facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postando um video no facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postando um comentario no facebook");
    }
}
