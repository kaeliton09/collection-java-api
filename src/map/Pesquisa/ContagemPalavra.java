package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
    //atributo
    private Map<String, Integer> contagemMap;

    public ContagemPalavra() {
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemMap.remove(palavra);
    }

    public void exibirContagemPalavra(){
        int contagemTotal = 0;
        if(!contagemMap.isEmpty()){
            for(int i : contagemMap.values()){
                contagemTotal += i;
            }
        }
        System.out.println(contagemTotal);
    }


}
