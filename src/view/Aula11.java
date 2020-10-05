package view;

import controller.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<Contatos> lista = new Lista<Contatos>(1);// definindo como do tipo Contatos a classe lista 
		
		Contatos c1 = new Contatos("contato1", "123", "email 1");
		Contatos c2 = new Contatos("contato2", "456", "email 2");
		Contatos c3 = new Contatos("contato3", "789", "email 3");
		
		lista.adiciona(c1);
		
		System.out.println(lista);
		

	}

}
