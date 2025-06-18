package app;

import core.GerenciadorPlataformaSaaS;
import enums.Ambiente;
import model.Servico;
import model.ServicoArmazenamento;
import model.ServicoBancoDados;
import model.ServicoComputacao;

public class Main {
    public static void main(String[] args) {
        Servico armazenamento = new ServicoArmazenamento("Storage Pro", 0.12, false, Ambiente.DEV, 500, true);
        Servico computacao = new ServicoComputacao("Compute X", 0.25, true, Ambiente.PROD, 8, "t3.large");
        Servico bancoDados = new ServicoBancoDados("DB Flex", 0.30, false, Ambiente.HOMOLOG, "PostgreSQL", 100);

        GerenciadorPlataformaSaaS gerenciador = new GerenciadorPlataformaSaaS();

        gerenciador.adicionarServico(armazenamento);
        gerenciador.adicionarServico(computacao);
        gerenciador.adicionarServico(bancoDados);

        gerenciador.ativarTodosServicos();

        System.out.println("=== Relatórios dos Serviços ===\n");
        gerenciador.gerarRelatoriosIndividuais();

        int horas = 24;
        double custoTotal = gerenciador.custoTotalServicosAtivos(horas);
        System.out.printf("Custo total dos serviços ativos para %d horas: R$ %.2f%n", horas, custoTotal);

        System.out.println();
        System.out.println("Ambiente do serviço de armazenamento: " + armazenamento.getAmbiente());
        System.out.println("Ambiente do serviço de computação: " + computacao.getAmbiente());
        System.out.println("Ambiente do serviço de banco de dados: " + bancoDados.getAmbiente());
    }
}
