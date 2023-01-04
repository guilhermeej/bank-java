package bytebankHerdado;
// Criando a classe de conta corrente
public class ContaCorrente extends Conta{
	
	// reutilizando o construtor da classe mae
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	// sobrescrevendo de forma mais especifica o metodo de saque da classe ContaCorrente
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 2.0;
		return super.saca(valorASacar);
	}
}
