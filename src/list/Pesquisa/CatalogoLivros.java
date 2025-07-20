package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalagoLivros;

    public CatalogoLivros() {
        this.catalagoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicaco){
        catalagoLivros.add(new Livro(titulo, autor, anoPublicaco));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosEncontrados = new ArrayList<>();
        if(!catalagoLivros.isEmpty()) {//se nao estiver vazia
            for (Livro i : catalagoLivros) {
                if (i.getAutor().equalsIgnoreCase(autor)) {
                    livrosEncontrados.add(i);
                }
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervalosAnos(int anoInicial, int anoFinal){
        List<Livro> livrosEncontrados = new ArrayList<>();
        if(!catalagoLivros.isEmpty()){
            for(Livro i : catalagoLivros){
                if(i.getAnoPublicacao() >= anoInicial && i.getAnoPublicacao() <= anoFinal){
                    livrosEncontrados.add(i);
                }
            }
        }
        return livrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroEncontrado = null;
        if(!catalagoLivros.isEmpty()){
            for(Livro i : catalagoLivros){
                if(i.getTitulo().equalsIgnoreCase(titulo)){
                    livroEncontrado = i;
                    break;
                }
            }
        }
        return livroEncontrado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("o rei das cinzas", "penelope", 2010);
        catalogoLivros.adicionarLivro("o rei das marroms", "penelope", 2011);
        catalogoLivros.adicionarLivro("o rei das brancas", "penelope", 2012);
        catalogoLivros.adicionarLivro("o contra rei das cinzas", "juju", 2013);
        catalogoLivros.adicionarLivro("o contra rei das pretas", "jhenifer", 2014);

        System.out.println(catalogoLivros.pesquisarPorAutor("penelope"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("O rei das brancas"));
        System.out.println(catalogoLivros.pesquisarPorIntervalosAnos(2012, 2015));
    }
}
