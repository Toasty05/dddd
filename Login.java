package Sistemaacademico;

import javax.swing.JOptionPane;

public class Login {
	
	private boolean logado = false;
	private final String USUARIO_ADMINISTRADOR = "admin";
	private final String USUARIO_SENHA = "admin";
	
    public int executarLogin() {
    	// Se logado com sucesso, vai retornar 10
    	// Se não, retorna 0;
    	int tentativa = 1;
        String usuario = JOptionPane.showInputDialog(null,"Digite o usuário: ");
        String senha = JOptionPane.showInputDialog("Digite a senha: ");
        	
        if (USUARIO_ADMINISTRADOR.equals(usuario) && senha.equals(USUARIO_SENHA)){
        	this.logado = true;
        	JOptionPane.showMessageDialog(null, "Seja Bem vindo! Você está conectado!");
        	return 10;
        } else {
        	JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto! Tente novamente!");
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