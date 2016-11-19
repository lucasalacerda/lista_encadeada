package lista;

import com.senac.SimpleJava.Console;

public class Menu {

	private Opcao opcaoMenu[] = new Opcao[5];
	private int indiceOpcao = 1;
	
	
	
	public void addOpcao(Opcao opcao){
		opcaoMenu[indiceOpcao] = opcao;
		indiceOpcao++;
	}
	
	public void mostraOpcao(){
		for (int i = 1; i < indiceOpcao; i++) {
			System.out.println("["+i+"]"+" "+opcaoMenu[i]);
		}
	}
	public int getOption() {
		int opcao = Console.readInt();
		return opcao;		
}
}
