package view;

import controller.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		int i;
		Vetor vetor = new Vetor(10);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);
		
		vetor.adiciona(0, "A");
		
		System.out.println(vetor);

	}

}
