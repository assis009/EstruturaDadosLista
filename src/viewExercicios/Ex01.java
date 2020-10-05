package viewExercicios;

import controller.Lista;

public class Ex01 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		
		if(lista.contem("A")){
			System.out.println("O elemento existe na lista");
		}else{
			System.out.println("O elemento não existe na lista");
		}

	}

}
