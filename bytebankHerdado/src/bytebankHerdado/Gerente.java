package bytebankHerdado;

// Criando a classe Gerente, usando a Classe Funcionario como classe mãe
public class Gerente extends Funcionario {

	// Atributos da classe Gerente
	private int senha;
	
	// Método para setar a senha do Gerente
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	// Método para autenticar a senha do Gerente
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	// Método para acessar a bonificacao do Gerente
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
}
