package core;

import model.Servico;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPlataformaSaaS {
    private List<Servico> listaServicos;

    public GerenciadorPlataformaSaaS() {
        this.listaServicos = new ArrayList<>();
    }

    public void adicionarServico(Servico servico) {
        listaServicos.add(servico);
    }

    public void ativarTodosServicos() {
        for(Servico servico : listaServicos) {
            servico.ativar();
        }
    }

    public double custoTotalServicosAtivos(int horas) {
        double custoTotal = 0;
        for(Servico servico : listaServicos) {
            if(servico.isAtivo()) custoTotal += servico.calcularCusto(horas);
        }
        return custoTotal;
    }

    public void gerarRelatoriosIndividuais() {
        for(Servico servico : listaServicos) {
            System.out.println(servico.gerarRelatorio());
            System.out.println("\n===============================\n");
        }
    }

    public void listarServicos() {
        for (Servico servico : listaServicos) {
            System.out.println(servico.getNome() + " - " + (servico.isAtivo() ? "Ativo" : "Inativo"));
        }
    }
}
