package Sistemaacademico;

import javax.swing.JOptionPane;

public class Login {
	
	private boolean logado = false;
	private final String USUARIO_ADMINISTRADOR = "daniel";
	private final String USUARIO_SENHA = "1234";
	
    public int executarLogin() {
    	// Se logado com sucesso, vai retornar 10
    	// Se n�o, retorna 0;
    	int tentativa = 1;
        String usuario = JOptionPane.showInputDialog(null,"Digite o Usu�rio: ");
        int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a Senha: "));
        	
        if (USUARIO_ADMINISTRADOR.equals(usuario) && senha == Integer.valueOf(USUARIO_SENHA)){
        	this.logado = true;
        	JOptionPane.showMessageDialog(null, "Seja Bem vindo !! Voc� est� Conectado !!");
        	return 10;
        } else {
        	JOptionPane.showMessageDialog(null, "Usu�rio ou Senha Incorreto ! Tente Novamente !");
        }
        
        return 0;
    }
   
    public boolean isLogado() {
    	return this.logado;
    }
    
    public void setLogado(boolean logado) {
    	this.logado = logado;
    }
    
}