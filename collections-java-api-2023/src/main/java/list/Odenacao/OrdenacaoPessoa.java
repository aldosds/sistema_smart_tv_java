package main.java.list.Odenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	
	// Atributo
	private List<Pessoa> pessoaList;

	// Construtor sem uma lista de pessoas e iniciando o ArrayLiust vazio
	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	// Metodos
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	
	// Método main
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
		ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
		ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);
		
		// Com ordenação por idade e altura
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
		
		// Sem ordenação por idade e altura
		System.out.println(ordenacaoPessoa.pessoaList);
	}
}
