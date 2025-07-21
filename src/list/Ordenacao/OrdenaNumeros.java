package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaNumeros {
    private List<Integer> listnumeros = new ArrayList<>();

    public void adicionarNumero(int numero){
        this.listnumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(listnumeros);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(listnumeros);
        Collections.sort(numerosDescendentes);
        Collections.reverse(numerosDescendentes);
        return numerosDescendentes;
    }

    public static void main(String[] args) {
        OrdenaNumeros numeros = new OrdenaNumeros();

        numeros.adicionarNumero(10);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(11);

        System.out.println(numeros.ordenarDescendente());
        System.out.println(numeros.ordenarAscendente());
    }

}

