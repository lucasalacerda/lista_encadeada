package lista;

public class Opcao {

	private String nomeOpcao;

	public Opcao(String string) {
		nomeOpcao = string ;  
}
	
	public String getNomeOpcao() {
		return nomeOpcao;
	}

	public String toString(){
		
		return getNomeOpcao();
	}
	
}
