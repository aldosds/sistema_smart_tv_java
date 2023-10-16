package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	
	// Atriduto
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
			
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	// Efetuando Testes
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		// Verificando a lista
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		// Adicionando tarefa e verificando a lista
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		// Removendo tarefas e confirmando se foi removida todas, pois existe duplicidade de descrição
		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		
		// Obtendo descrição de tarefas
		listaTarefa.obterDescricoesTarefas();
	}
}
