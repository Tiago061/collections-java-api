package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                    }
                }
            }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
              if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                  livrosPorIntervaloAnos.add(l);
              }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo (String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2003);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 4", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 5", 2006);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 2", 2007);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2002);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2002, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
