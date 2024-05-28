package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private String nome;
    private String email;

    Set<RedeSocial> redeSocial = new HashSet<>();
    public Usuario(RedeSocial[] redes){
        this.redeSocial = new HashSet<>();
        Collections.addAll(this.redeSocial, redes);
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }

    public RedeSocial[] getRedesSociais(){
        return this.redeSocial.toArray(new RedeSocial[0]);
    }


    public String getEmail(){
        return this.email;
    }
}

