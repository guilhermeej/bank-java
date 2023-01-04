package bytebankHerdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente nico = new Gerente();
		nico.setNome("Nicolas Steppat");
		nico.setSalario(1500);
		nico.setCpf("547125485");
		
//		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
