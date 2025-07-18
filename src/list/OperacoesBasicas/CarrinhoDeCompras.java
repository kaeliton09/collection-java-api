package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        carrinhoDeCompras.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();
        for(Item i : carrinhoDeCompras){
            if(i.getNome().equalsIgnoreCase(nome)){
                itemRemover.add(i);
            }
        }
        carrinhoDeCompras.removeAll(itemRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item i: carrinhoDeCompras){
            valorTotal += (i.getPreco() * i.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("suco", 2.50, 4);
        System.out.println("valor total: " + carrinho.calcularValorTotal());
        carrinho.exibirItens();
        carrinho.removerItem("suco");
        System.out.println("valor total: " + carrinho.calcularValorTotal());
        carrinho.exibirItens();

    }
}
