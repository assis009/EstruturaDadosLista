package view;

import controller.Vetor;

public class Aula08 {

	public static void main(String[] args) {
		int i;
		Vetor vetor = new Vetor(3);

		System.out.println(vetor.tamanho());
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		

		System.out.println(vetor);
		
		System.out.println(vetor.tamanho());

	}

}
