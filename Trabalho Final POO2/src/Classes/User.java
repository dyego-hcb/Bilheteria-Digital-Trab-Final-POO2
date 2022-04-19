/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author zebodexx
 */
public class User {
    private  String user;
    private  String nomeCompletoUser;
    private  String senha;
    private ArrayList<Evento> meusEventos = new ArrayList<Evento>();
    

    public User(String user, String nomeCompletoUser, String senha) {
        this.user = user;
        this.nomeCompletoUser = nomeCompletoUser;
        this.senha = senha;
    }

    public ArrayList<Evento> getMeusEventos() {
        return meusEventos;
    }

    public void setMeusEventos(Evento meusEventos) {
        this.meusEventos.add(meusEventos);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNomeCompletoUser() {
        return nomeCompletoUser;
    }

    public void setNomeCompletoUser(String nomeCompletoUser) {
        this.nomeCompletoUser = nomeCompletoUser;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
