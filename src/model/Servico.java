package model;

import enums.Ambiente;

public abstract class Servico {
    protected String nome;
    protected double custoHora;
    protected boolean status;
    protected Ambiente ambiente;

    public abstract double calcularCusto(int horas);
    public abstract String gerarRelatorio();

    public Servico(String nome, double custoHora, boolean status, Ambiente ambiente) {
        this.nome = nome;
        this.custoHora = custoHora;
        this.status = status;
        this.ambiente = ambiente;
    }

    public void ativar() {
        this.status = true;
    }

    public void desativar() {
        this.status = false;
    }

    public boolean isAtivo() {
        return status;
    }

    public String getNome() {
        return nome;
    }

    public double getCustoHora() {
        return custoHora;
    }

    public Ambiente getAmbiente(){
        return ambiente;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCustoHora(double custoHora) {
        this.custoHora = custoHora;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }
}
