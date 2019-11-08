package Sistemaacademico;

public class Professor extends Pessoa {

    private String registro, 
    disciplinas;
    

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