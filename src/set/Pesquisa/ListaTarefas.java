package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributo
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        tarefaSet.remove(new Tarefa(descricao));
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.isConcluido()) tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (!t.isConcluido()) tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluido(true);
                    break;
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setConcluido(false);
                    break;
                }
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet = new HashSet<>();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("ler livro");
        listaTarefas.adicionarTarefa("ver jogo");
        listaTarefas.adicionarTarefa("estudar");
        listaTarefas.adicionarTarefa("jogar");
        listaTarefas.adicionarTarefa("ler livro");

        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("estudar");
        listaTarefas.marcarTarefaConcluida("jogar");

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();

    }
}
