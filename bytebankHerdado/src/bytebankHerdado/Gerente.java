package bytebankHerdado;

// Criando a classe Gerente, usando a Classe FuncionarioAutenticavel como classe mãe
public class Gerente extends FuncionarioAutenticavel {


	// Método para acessar a bonificacao do Gerente
	public double getBonificacao() {
		return + 200;
	}
	
}
