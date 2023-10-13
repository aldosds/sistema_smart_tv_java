package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		System.out.println("-> Processo Seletivo <-");
		
		// Cases práticos - 1
		/*analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);*/
		
		// Cases práticos - 2
		//selecaoCandidatos();
		
		// Cases práticos - 3
		imprimirSelecionados();
	}
	
	// Cases práticos - 3
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO", "AUGUSTO"};
		
		System.out.println("Imprimindo a lista de cadidatos informando o indice do elemento");
		
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de Nº " + (indice + 1) + " é " + candidatos[indice]);
		}
		System.out.println("Forma abreviada de interação For/Each");
		
		for(String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	
	// Cases práticos - 2
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA","PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido + ".");
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	// Cases práticos - 1
	static void analisarCandidato(double salarioPretendido) {
		
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato.");
			
		} else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta.");
			
		} else {
			System.out.println("Aguardando o resultado dos demais candidatos.");
		}
	}
}
