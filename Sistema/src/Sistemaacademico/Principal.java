package Sistemaacademico;

public class Principal {

	public static void main(String[] args) {
		Sistemaacademico sistemaAcademico = new Sistemaacademico();
		
		sistemaAcademico.carregarOpcoesPublicas();
		if (sistemaAcademico.getLogin().isLogado()) {
			sistemaAcademico.carregarOpcoesAdministador();
		}
	}
	
}
