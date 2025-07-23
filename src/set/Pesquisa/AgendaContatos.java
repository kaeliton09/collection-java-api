package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(agendaContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> conatosPorNome = new HashSet<>();
        for(Contato c : agendaContatos){
            if(c.getNome().startsWith(nome)) conatosPorNome.add(c);
        }
        return conatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        if(!agendaContatos.isEmpty()){
            for(Contato c : agendaContatos){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(numero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("amor", 87654321);
        agenda.adicionarContato("penelope", 876542);
        agenda.adicionarContato("amor linda", 876543212);

        System.out.println(agenda.pesquisarPorNome("amor"));

        System.out.println(agenda.atualizarNumeroContato("amor", 03022));
        agenda.exibirContatos();


    }
}
