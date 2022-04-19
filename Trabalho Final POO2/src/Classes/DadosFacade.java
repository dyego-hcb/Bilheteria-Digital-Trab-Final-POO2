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
public class DadosFacade implements Interfaces.IngressosMediator{
    private ArrayList<User> usuarios = new ArrayList<User>();
    private ArrayList<Evento> eventos = new ArrayList<Evento>();

    public DadosFacade() {

    }

    // COD EVENTOS
    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public boolean verificaNomeEvento(String nomeEvento) {
        boolean cad = false;
        for (int i = 0; i < eventos.size(); i++) {
            if (eventos.get(i).getNomeEvento().equals(nomeEvento)) {
                System.out.println("EVENTO JA EXISTE, PORTANTO NAO E POSSIVEL CADASTRAR!!");
                cad = true;
                break;
            }
        }
        if (!cad) {
            System.out.println("CADASTRO FEITO COM SUCESSO!");
        }
        return cad;
    }

    public void cadastrarEvento(Evento newEvento) {
        eventos.add(newEvento);
    }

    @Override
    public void compraIngresso(int idIngresso, int idUser) {
        if (eventos.get(idIngresso).getQntdIngressos() > 1) {
            Evento ingressoComprado = new Evento.EventoBuilder()
                    .nomeEvento(eventos.get(idIngresso).getNomeEvento())
                    .valorIngresso(eventos.get(idIngresso).getValorIngresso())
                    .descricaoEvento(eventos.get(idIngresso).getDescricaoEvento())
                    .maiorIdade(eventos.get(idIngresso).isMaiorIdadeBool())
                    .qntdIngressos(1)
                    .criarEvento();
            ingressoComprado.setQntdIngressos(1);
            usuarios.get(idUser).setMeusEventos(ingressoComprado);
            eventos.get(idIngresso).setQntdIngressos(eventos.get(idIngresso).getQntdIngressos() - 1);
            System.out.println("COMPRA DO INGRESSO FEITA COM SUCESSO!");
        }
        else if(eventos.get(idIngresso).getQntdIngressos() == 1)
        {
            Evento ingressoComprado = new Evento.EventoBuilder()
                    .nomeEvento(eventos.get(idIngresso).getNomeEvento())
                    .valorIngresso(eventos.get(idIngresso).getValorIngresso())
                    .descricaoEvento(eventos.get(idIngresso).getDescricaoEvento())
                    .maiorIdade(eventos.get(idIngresso).isMaiorIdadeBool())
                    .qntdIngressos(1)
                    .criarEvento();
            ingressoComprado.setQntdIngressos(1);
            usuarios.get(idUser).setMeusEventos(ingressoComprado);
            eventos.remove(idIngresso);
            System.out.println("COMPRA DO INGRESSO FEITA COM SUCESSO!");
            System.out.println("INGRESSOS ESGOTADOS");
        }
    }

    public void alterarDadosExemplo(Evento newEvento) {
        for (int i = 0; i < eventos.size(); i++) {
            if (eventos.get(i).getNomeEvento().equals(newEvento.getNomeEvento())) {
                eventos.get(i).setDescricaoEvento(newEvento.getDescricaoEvento());
                eventos.get(i).setValorIngresso(newEvento.getValorIngresso());
                eventos.get(i).setQntdIngressos(newEvento.getQntdIngressos());
                eventos.get(i).setMaiorIdade(newEvento.isMaiorIdadeBool());
                System.out.println("DADOS DO EVENTO ALTERADOS COM SUCESSO!!");
                break;
            }
        }
    }

    // COD USER
    public ArrayList<User> getUsers() {
        return usuarios;
    }

    public boolean verificaUser(String username) {
        boolean cad = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUser().equals(username)) {
                System.out.println("USUARIO JA EXISTE, PORTANTO NAO E POSSIVEL CADASTRAR!!");
                cad = true;
                break;
            }
        }
        if (!cad) {
            System.out.println("CADASTRO FEITO COM SUCESSO!");
        }
        return cad;
    }

    public int indexUser(String username) {
        int indexUser = -1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUser().equals(username)) {
                indexUser = i;
                System.out.println("USUARIO ENCONTRADO!!");
                break;
            }
        }
        return indexUser;
    }

    public void cadastrarUsuario(User newUser) {
        usuarios.add(newUser);
    }

    public void alterarSenha(String userAltSenha, String novaSenha) {
        boolean trocou = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUser().equals(userAltSenha)) {
                usuarios.get(i).setSenha(novaSenha);
                trocou = true;
                System.out.println("SENHA ALTERADA COM SUCESSO!!");
                break;
            }
        }
        if (!trocou) {
            System.out.println("NAO FOI POSSIVEL ALTERAR A SENHA!!");
        }
    }

    // LOGIN COD
    public boolean validarLogin(String username, String password) {
        boolean valido = false;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUser().equals(username) && usuarios.get(i).getSenha().equals(password)) {
                System.out.println("LOGIN FEITO COM SUCESSO!!");
                valido = true;
            } else {
                System.out.println("NOME DE USUARIO OU SENHA INCORRETOS!!");
            }
        }
        return valido;
    }
}
