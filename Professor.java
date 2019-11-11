package Sistemaacademico;

public class Professor extends Pessoa {

    private String nome, registro, 
    disciplinas;
    

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return (registro);
    }

    public void setDisciplinasMinistradas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getDisciplinasMinistradas() {
        return (disciplinas);
    }

	
}