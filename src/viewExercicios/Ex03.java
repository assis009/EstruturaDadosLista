package viewExercicios;

import controller.Lista;
public class Ex03 {

	public static void main(String[] args) {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		lista.adiciona("A");
		
		System.out.println(lista);
		
		lista.remove("A");
		
		System.out.println(lista);
		

	}

}
