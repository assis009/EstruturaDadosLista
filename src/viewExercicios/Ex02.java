package viewExercicios;

import controller.Lista;

public class Ex02 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		lista.adiciona("A");
		
		System.out.println(lista.ultimoIndice("A"));
		

	}

}
