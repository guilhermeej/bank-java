package bytebankHerdado;
// Criando a classe Conta
public class Conta {
	
	//Atributos da classe Conta
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //static -> um atributo da classe
	
	// Setando o default da conta
	public Conta(int agencia, int numero) {
		System.out.println("O total de contas abertas é " + total);
		this.saldo = 0;
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
		System.out.println("Estamos criando uma nova conta!");
	}
	// Método para depositar
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	// Metodo para sacar
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	// Método para transferir
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	// Metodo para acessar o saldo da conta
	public double getSaldo() {
		return this.saldo;
	}
	
	// Metodo para acessar o numero da conta
	public int getNumero() {
		return this.numero;
	}
	
	// Metodo para setar o numero da conta
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Somente valores maiores que zero");
			return;
		}
		this.numero = numero;
		 
	}
	
	// Método para setar a agencia da conta
	public void setAgencia(int agencia){
		if(agencia <= 0) {
			System.out.println("Somente valores maiores que zero.");
			return;
		}
		this.agencia = agencia;
	}
	
	// Método para acessar a agencia da conta
	public int getAgencia() {
		return this.agencia;
	}
	
	// Método para setar o titular da conta
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	// Método para acessar o titular da conta
	public Cliente getTitular() {
		return titular;
	}
	
	// Método para verificacao de quantas contas estão abertas
	public static int getTotal() {
		return Conta.total;
	}
}
