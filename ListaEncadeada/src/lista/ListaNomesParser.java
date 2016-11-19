package lista;

import java.util.Scanner;

public class ListaNomesParser implements Parser<ListaNomes> {
	
	public ListaNomes parse(String dados) {
		
		Scanner arquivo = new Scanner(dados);
		
		arquivo.useDelimiter(";");
		String nome = arquivo.next();
		
		ListaNomes list = new ListaNomes(nome);
		
		arquivo.close();
		return list;
	}
	
}
