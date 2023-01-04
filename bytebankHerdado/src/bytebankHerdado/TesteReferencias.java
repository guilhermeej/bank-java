package bytebankHerdado;

public class TesteReferencias {
	public static void main(String[] args) {
//		Funcionario g1 = new Gerente(); //g1 aqgora é mais generico, e funciona pq um gerente é um funcionario
//		//Gerente g1 = new Funcionario(); // nao compila pq nem todo funcionario é gerente
//		
//		g1.setNome("Joanna");
//		String nome = g1.getNome();
//		
//		//g1.autentica(222); //funcionario nao tem o metodo autentica
//		
//		System.out.println(nome);
		
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);

		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
	
		
	}
}
