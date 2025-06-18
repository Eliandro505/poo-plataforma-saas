package model;

import enums.Ambiente;

public class ServicoComputacao extends Servico {
    private int qntdCPUs;
    private String tipoInstancia;

    public ServicoComputacao(String nome, double custoHora, boolean status, Ambiente ambiente, int qntdCPUs, String tipoInstancia) {
        super(nome, custoHora, status, ambiente);
        this.qntdCPUs = qntdCPUs;
        this.tipoInstancia = tipoInstancia;
    }

    @Override
    public double calcularCusto(int horas) {
        return (3 * qntdCPUs) + (5.9 * horas);
    }

    @Override
    public String gerarRelatorio() {
        StringBuilder builder = new StringBuilder();
        builder.append("Relatório do Serviço de Computação\n");
        builder.append("Quantidade de gigas no sistema: ");
        builder.append(qntdCPUs);
        builder.append("\nTipo de instancia do sistema: ");
        builder.append(tipoInstancia);
        return builder.toString();
    }

    public String getTipoInstancia() {
        return tipoInstancia;
    }

    public void setTipoInstancia(String tipoInstancia) {
        this.tipoInstancia = tipoInstancia;
    }
}
