package bytebankHerdado;

public abstract class FuncionarioAutenticavel extends Funcionario {

	
		private int senha;
		
		// Método para setar a senha do FuncinoarioAutenticavel
		public void setSenha(int senha) {
			this.senha = senha;
		}
		
		// Método para autenticar a senha do FuncionarioAutenticavel
		public boolean autentica(int senha) {
			if(this.senha == senha) {
				return true;
			} else {
				return false;
			}
		}
		
}
