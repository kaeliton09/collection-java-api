package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adcionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("o numero total de tarefas e: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adcionarTarefa("estudar hoje");
        listaTarefa.adcionarTarefa("estudar hoje");
        listaTarefa.adcionarTarefa("estudar hoje 2");
        System.out.println("o numero total de tarefas e: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("estudar hoje 2");
        System.out.println("o numero total de tarefas e: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
