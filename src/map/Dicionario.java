package map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
        String descricaoPorPalavra = null;
        if(!dicionarioMap.isEmpty()){
            descricaoPorPalavra = dicionarioMap.get(palavra);
        }
        return descricaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("forca", "ser forte");
        dicionario.adicionarPalavra("morena", "ser morena");
        dicionario.adicionarPalavra("rua", "ser rua");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("forca");

        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("morena"));
    }
}
