package bytebankHerdado;

public class EditorVideo extends Funcionario {
	
		private double soma;
	
		public double getBonificacao() {
			return super.getBonificacao() + 100; // super significa que preciso subir a hierarquia para poder visualizar o atributo
		}
		
		
	
}
