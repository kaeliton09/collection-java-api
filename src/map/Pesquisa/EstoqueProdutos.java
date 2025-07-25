package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos
    private Map<Long, Produto> estoqueMap;

    public EstoqueProdutos() {
        this.estoqueMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, double preco, int quantidade){
        estoqueMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueMap);
    }

    public double calcularValorTotaldoEstoque(){
        double valorTotal = 0;
        if(!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()){
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaiscaro = new Produto(null, Double.MIN_VALUE, 0);
        if(!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()){
                if(p.getPreco() > produtoMaiscaro.getPreco()) produtoMaiscaro = p;
            }
        }
        return produtoMaiscaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = new Produto(null, Double.MAX_VALUE, 0);
        if(!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()){
                if(p.getPreco() < produtoMaisBarato.getPreco()) produtoMaisBarato = p;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoDeMaiorValorTotal(){
        Produto produtodeMaiorValor = new Produto(null, Double.MIN_VALUE, 0);
        if(!estoqueMap.isEmpty()){
            for(Produto p : estoqueMap.values()){
                if((p.getPreco() * p.getQuantidade()) > (produtodeMaiorValor.getPreco() * produtodeMaiorValor.getQuantidade())) produtodeMaiorValor = p;
            }
        }
        return produtodeMaiorValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "lolo", 1.50d, 4);
        estoque.adicionarProduto(2L, "coca", 1.45d, 4);
        estoque.adicionarProduto(4L, "cola", 1.51d, 4);

        estoque.exibirProdutos();

        System.out.println(estoque.calcularValorTotaldoEstoque());
        System.out.println(estoque.obterProdutoDeMaiorValorTotal());
        System.out.println(estoque.obterProdutoMaisBarato());
        System.out.println(estoque.obterProdutoMaisCaro());

    }
}
