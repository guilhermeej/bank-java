package bytebankHerdado;

// Criando a classe cliente
public class Cliente { 
	
	// Atributos da classe cliente
	private String cpf;
	private String nome;
	private String profissao;
	
	// getters e setters da classe
	//Método para acessar o cpf do Cliente
	public String getCpf() {
		return cpf;
	}
	
	//Método para setar o cpf do Cliente
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//Método para acessar o nome do Cliente
	public String getNome() {
		return nome;
	}
	
	//Método para setar o cpf do Cliente
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Método para acessar a profissao do Cliente
	public String getProfissao() {
		return profissao;
	}
	
	//Método para setar a profissao do Cliente
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
