package bytebankHerdado;

public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Guilherme");
		g1.setCpf("321313");
		g1.setSalario(5000.0);
		
		g1.setSenha(7784);
		boolean autenticou = g1.autentica(7784);
		System.out.println(autenticou);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		System.out.println(g1.getBonificacao());
	}
}
