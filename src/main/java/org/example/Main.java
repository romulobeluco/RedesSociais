package org.example;

import org.example.exceptions.NullRedeSocialException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Facebook facebook = new Facebook("13012", 12);
        Twitter twitter = new Twitter("13451", 13);
        GooglePlus googlePlus = new GooglePlus("asdck", 491);
        Instagram instagram = new Instagram("akscae", 32);

        RedeSocial[] redeSociais = new RedeSocial[2];
        redeSociais[0] = twitter;
        redeSociais[1] = instagram;

        Usuario usuario = new Usuario(redeSociais);


        usuario.setNome("Romulo");
        usuario.setEmail("skcalq@gmail.com");


        try {

            if (usuario.getRedesSociais()[0] != null) {
                usuario.getRedesSociais()[0].postarVideo();
                usuario.getRedesSociais()[0].postarFoto();
            } else {
                throw new NullRedeSocialException("Primeira rede social é nula.");
            }

            
            if (usuario.getRedesSociais()[1] != null) {
                usuario.getRedesSociais()[1].postarComentario();
                usuario.getRedesSociais()[1].curtirPublicacao();
            } else {
                throw new NullRedeSocialException("Segunda rede social é nula.");
            }

        } catch (NullRedeSocialException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        }


    }

    }
