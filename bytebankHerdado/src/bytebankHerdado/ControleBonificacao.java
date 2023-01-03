package bytebankHerdado;
// Criando a classe Controle de Bonificacao
public class ControleBonificacao {
	
	// Atributos da classe ControleBonificacao
	private double soma;
	
	// Método para registrar a bonificacao do Funcionario
	public void registra(Funcionario f) { 
		double boni = f.getBonificacao();
		this.soma += boni;
	}

	// Metodo para acessar a soma total de bonificacao do Funcionario
	public double getSoma() {
		return soma;
	}
}
