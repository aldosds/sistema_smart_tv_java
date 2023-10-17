package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	// Atributo
	private List<Livro> livroList;
	
	// Construtor
	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	// Metodos
	// Adicionar
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}

	// Remover
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livroPorAutor = new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livroPorAutor.add(l);
				}
			}
		}
		return livroPorAutor;
	}
	
	// Lista por intervalo de anos
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		
		return livrosPorIntervaloAnos;
	}
	
	// Pesquisa por titulo
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPoTitulo = null;
		
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPoTitulo = l;
					break;
				}
			}
		}
		return livroPoTitulo;
	}
	
	// Testes	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		catalogoLivros.adicionarLivro("Livro 1", "Ator 1", 2020);
		catalogoLivros.adicionarLivro("Livro 1", "Ator 2", 2021);
		catalogoLivros.adicionarLivro("Livro 2", "Ator 2", 2022);
		catalogoLivros.adicionarLivro("Livro 3", "Ator 3", 2023);
		catalogoLivros.adicionarLivro("Livro 4", "Ator 4", 1994);
		
		// Pesquisando por autor
		System.out.println(catalogoLivros.pesquisarPorAutor("Ator 4"));
		
		// Pesquisar por intervalo de ano
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
		
		// Pesquisar por titulo
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
		
	}
}
