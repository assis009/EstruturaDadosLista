package view;

import controller.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		int i;
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 01");
		vetor.adiciona("elemento 02");
		vetor.adiciona("elemento 03");

		System.out.println(vetor.busca(2));
	}

}
