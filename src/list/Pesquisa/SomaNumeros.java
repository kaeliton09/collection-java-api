package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerolist;

    public SomaNumeros() {
        this.numerolist = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerolist.add(numero);
    }

    public int calcularSoma(){
        int valorFinal = 0;
        for(int i : numerolist){
            valorFinal += i;
        }
        return valorFinal;
    }

    public int encontrarMaiorNumero(){
        int maiorValor = 0;
        for(int i : numerolist){
            if(i > maiorValor) maiorValor = i;
        }
        return maiorValor;
    }

    public int encontrarMenorNumero(){
        int menorValor = 1000000;
        for(int i : numerolist){
            if(i < menorValor) menorValor = i;
        }
        return menorValor;
    }

    public void exibirNumeros(){
        System.out.println(numerolist);
    }

    @Override
    public String toString() {
        return "SomaNumeros{" + numerolist;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(5);
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.calcularSoma());
        somaNumeros.exibirNumeros();
    }

}
