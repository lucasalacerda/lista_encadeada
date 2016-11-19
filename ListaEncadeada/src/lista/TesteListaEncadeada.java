package lista;

public class TesteListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		lista.append("Rafael");
		lista.append("Antonio");
		lista.append("Guilherme");
		lista.append("Ivonei");
		lista.pushFront("Aline");
		
		Iterador iter = lista.iterator();
		iter.next();
		iter.next();
		iter.append("Quarto");
		iter.insert("Segundo");

		for (String s : lista) {
			System.out.println(s);
		}
		
	}
	
	

}