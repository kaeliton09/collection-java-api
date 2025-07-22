package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidade(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("existem " + conjuntoConvidados.contarConvidados() + " dentro do set Convidados");
        conjuntoConvidados.adicionarConvidado("irineu", 12);
        conjuntoConvidados.adicionarConvidado("irineu", 11);
        conjuntoConvidados.adicionarConvidado("irineu", 9);
        System.out.println("existem " + conjuntoConvidados.contarConvidados() + " dentro do set Convidados");
        conjuntoConvidados.adicionarConvidado("penelope", 111);
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidade(111);
        System.out.println("existem " + conjuntoConvidados.contarConvidados() + " dentro do set Convidados");

    }
}
