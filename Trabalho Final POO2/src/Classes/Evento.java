/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author zebodexx
 */
public class Evento {

    private String nomeEvento;
    private float valorIngresso;
    private String descricaoEvento;
    private boolean maiorIdade;
    private int qntdIngressos;

    private Evento(String nomeEvento, float valorIngresso, String descricaoEvento, boolean maiorIdade, int qntdIngressos) {
        this.nomeEvento = nomeEvento;
        this.valorIngresso = valorIngresso;
        this.descricaoEvento = descricaoEvento;
        this.maiorIdade = maiorIdade;
        this.qntdIngressos = qntdIngressos;
    }

    public static class EventoBuilder
    {
        private String nomeEvento;
        private float valorIngresso;
        private String descricaoEvento;
        private boolean maiorIdade;
        private int qntdIngressos;
        
        public EventoBuilder()
        {
            
        }
        public EventoBuilder nomeEvento(String nomeEvento)
        {
            this.nomeEvento = nomeEvento;
            return this;
        }
        public EventoBuilder valorIngresso(float valorIngresso)
        {
            this.valorIngresso = valorIngresso;
            return this;
        }
        public EventoBuilder descricaoEvento(String descricaoEvento)
        {
            this.descricaoEvento = descricaoEvento;
            return this;
        }
        public EventoBuilder maiorIdade(boolean maiorIdade)
        {
            this.maiorIdade = maiorIdade;
            return this;
        }
        public EventoBuilder qntdIngressos(int qntdIngressos)
        {
            this.qntdIngressos = qntdIngressos;
            return this;
        }
        public Evento criarEvento()
        {
            return new Evento(nomeEvento, valorIngresso, descricaoEvento, maiorIdade, qntdIngressos);
        }
    }
    
    public int getQntdIngressos() {
        return qntdIngressos;
    }

    public void setQntdIngressos(int qntdIngressos) {
        this.qntdIngressos = qntdIngressos;
    }

    public boolean isMaiorIdadeBool() {
        if (maiorIdade) {
            return true;
        } else {
            return false;
        }
    }

    public String isMaiorIdade() {
        if (maiorIdade) {
            return "Evento para maiores de 18 anos.";
        } else {
            return "Evento para todos os publicos.";
        }
    }

    public void setMaiorIdade(boolean maiorIdade) {
        this.maiorIdade = maiorIdade;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

}
