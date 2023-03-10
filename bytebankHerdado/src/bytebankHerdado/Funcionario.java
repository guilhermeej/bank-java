package bytebankHerdado;
// nao pode instanciar dessa classe, pq é abstrata
// Criando a classe Funcionário
public abstract class Funcionario { 
	
	// Atributos da Classe Funcionario
	private String nome;
	private String cpf;
	private double salario; 
	
	// Método para acessar a bonificacao do funcionario
	// metodo sem corpo, nao há implementacao aqui
	public abstract double getBonificacao();
	
	// Método para acessar o nome do funcionario
	public String getNome() {
		return nome;
	}
	
	// Método para setar o nome do funcionario
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Método para acessar o cpf do funcionario
	public String getCpf() {
		return cpf;
	}
	
	// Método para setar o cpf do funcionario
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	// Método para acessar o salario do funcionario
	public double getSalario() {
		return salario;
	}
	
	// Método para setar o salario do funcionario
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
