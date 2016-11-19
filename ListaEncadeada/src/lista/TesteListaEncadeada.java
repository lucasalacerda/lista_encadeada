package lista;

import java.io.FileNotFoundException;

public class TesteListaEncadeada {

	Menu menu = new Menu();
	ListaEncadeada lista = new ListaEncadeada();

	
	public static void main(String[] args) {
		try {
			(new TesteListaEncadeada()).run();
		} catch (FileNotFoundException e) {
			System.err.println("Nao encontrou arquivo.");
			System.err.println(e.getMessage());
		}
	}//===============================FINAL MAIN

	private void run() throws FileNotFoundException {
		leitorCSV();
		
		Opcao listaNomes = new Opcao("===== Lista nomes ====");
		menu.addOpcao(listaNomes);
		
		arvoreMenu();
		
		
	}
	private void arvoreMenu() {

		while(true){
			menu.mostraOpcao();
			switch(menu.getOption()){
			case 1:
				listaCSV();
				break;
			}
		}
	}
	
	public void listaCSV(){
		lista.print();
	}
	
	
	public void leitorCSV() throws FileNotFoundException{
		
		Parser<ListaNomes> parser = new ListaNomesParser(); 
		LeitorArquivo<ListaNomes> leitor = new LeitorArquivo<>("src/arquivos/Lista_Nomes.csv", parser);
		
		while (leitor.hasNext()) {
			ListaNomes dados = leitor.readObject();
			lista.append(dados.getNome()); 
		}
		leitor.close();
		//lista.print();
	
	}
}