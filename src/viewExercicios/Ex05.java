package viewExercicios;

import controller.Lista;

public class Ex05 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		
		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);  

	}

}
