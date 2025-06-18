package model;

import enums.Ambiente;

public class ServicoBancoDados extends Servico {
    private String tipoBanco;
    private int maxConexoes;

    public ServicoBancoDados(String nome, double custoHora, boolean status, Ambiente ambiente, String tipoBanco, int maxConexoes) {
        super(nome, custoHora, status, ambiente);
        this.tipoBanco = tipoBanco;
        this.maxConexoes = maxConexoes;
    }

    @Override
    public double calcularCusto(int horas) {
        return (1.5 * maxConexoes) + (5.9 * horas);
    }

    @Override
    public String gerarRelatorio() {
        StringBuilder builder = new StringBuilder();
        builder.append("Relatório do Serviço de Banco de Dados\n");
        builder.append("Tipo de banco utilizado: ");
        builder.append(tipoBanco);
        builder.append("\nNúmero máximo de conexões: ");
        builder.append(maxConexoes);
        return builder.toString();
    }

    public String getTipoBanco() {
        return tipoBanco;
    }

    public int getMaxConexoes() {
        return maxConexoes;
    }

    public void setTipoBanco(String tipoBanco) {
        this.tipoBanco = tipoBanco;
    }

    public void setMaxConexoes(int maxConexoes) {
        this.maxConexoes = maxConexoes;
    }
}
