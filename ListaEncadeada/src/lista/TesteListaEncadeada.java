package lista;

import java.io.FileNotFoundException;

public class TesteListaEncadeada {

	
	public static void main(String[] args) {
		try {
			(new TesteListaEncadeada()).run();
		} catch (FileNotFoundException e) {
			System.err.println("Nao encontrou arquivo.");
			System.err.println(e.getMessage());
		}
	}//===============================FINAL MAIN

	private void run() throws FileNotFoundException {
		
		
		listagemCSV();
		
	}
	ListaEncadeada lista = new ListaEncadeada();

	public void listagemCSV() throws FileNotFoundException{
		
		Parser<ListaNomes> parser = new ListaNomesParser(); 
		LeitorArquivo<ListaNomes> leitor = new LeitorArquivo<>("src/arquivos/Lista_Nomes.csv", parser);
		
		
		while (leitor.hasNext()) {
			ListaNomes dados = leitor.readObject();
			lista.append(dados.getNome()); 
		}
		leitor.close();
		lista.print();
	
	}
}