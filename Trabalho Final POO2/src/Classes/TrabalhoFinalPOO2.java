/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import FormulariosTelas.formLogin;

/**
 *
 * @author zebodexx
 */
public class TrabalhoFinalPOO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DadosFacade dadosCarregar = new DadosFacade();
        
        formLogin telaLogin = new formLogin();
        telaLogin.carregarDados(dadosCarregar);
        telaLogin.setVisible(true);
    }
    
}
