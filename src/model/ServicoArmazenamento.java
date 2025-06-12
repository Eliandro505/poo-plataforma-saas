package model;

import enums.Ambiente;

public class ServicoArmazenamento extends Servico {
    private int capacidadeGB;
    private boolean redundancia;

    public ServicoArmazenamento(String nome, double custoHora, boolean status, Ambiente ambiente, int capacidadeGB, boolean redundancia) {
        super(nome, custoHora, status, ambiente);
        this.capacidadeGB = capacidadeGB;
        this.redundancia = redundancia;
    }

    @Override
    public double calcularCusto(int horas) {
        return (1.5 * capacidadeGB) + (5.9 * horas);
    }

    @Override
    public String gerarRelatorio() {
        StringBuilder builder = new StringBuilder();
        builder.append("Custo total pelos gigas: ");
        builder.append(1.5 * capacidadeGB);
        builder.append("\nRedundância do sistema: ");
        builder.append(redundancia);
        return builder.toString();
    }

    public boolean isRedundante() {
        return redundancia;
    }
}
