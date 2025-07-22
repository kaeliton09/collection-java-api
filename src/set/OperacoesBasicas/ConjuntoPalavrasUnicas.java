package set.OperacoesBasicas;

import java.lang.foreign.PaddingLayout;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributos
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        conjuntoPalavras.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        boolean encontrou = false;
        for(String p : conjuntoPalavras){
            if(p.equalsIgnoreCase(palavra)){
                encontrou = true;
                break;
            }
        }
        return encontrou;
    }

    public void exibirPalavras(){
        System.out.println(conjuntoPalavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("amor");
        palavras.adicionarPalavra("amor");
        palavras.adicionarPalavra("amor1");

        palavras.exibirPalavras();
        System.out.println(palavras.verificarPalavra("amore"));
        System.out.println(palavras.verificarPalavra("amor1"));

    }
}
