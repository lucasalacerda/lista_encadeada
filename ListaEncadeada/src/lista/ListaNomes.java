package lista;

public class ListaNomes {

	private String nome;

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ListaNomes(String nome){
		setNome(nome);
		
	}
	
	public String toString(){
		
		return "Nome: "+getNome();
	}
}
