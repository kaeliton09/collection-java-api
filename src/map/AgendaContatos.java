package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaMap;

    public AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        agendaMap.put(nome, numero);
    }

    public void removerContato(String nome){
        if(!agendaMap.isEmpty()){
            agendaMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaMap.isEmpty()){
            numeroPorNome = agendaMap.remove(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("bituca", 40028992);
        agenda.adicionarContato("luiz", 90909090);
        agenda.adicionarContato("amor", 10101010);

        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("bituca"));

        agenda.removerContato("luiz");

        agenda.exibirContatos();
    }
}
