package view;

import controller.VetorObjetos;//generalizando a classe vetor 

public class Aula10 {

	public static void main(String[] args) {
		int i;
		VetorObjetos vetor = new VetorObjetos(3);

		System.out.println(vetor.tamanho());
		
		Contatos c1 = new Contatos("contato1", "123", "email 1");
		Contatos c2 = new Contatos("contato2", "456", "email 2");
		Contatos c3 = new Contatos("contato3", "789", "email 3");
		
		Contatos c4 = new Contatos("contato3", "789", "email 3");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println(vetor);

		int pos = vetor.busca(c4);
		
		if(pos>-1){
			//se for verdadeiro o elemento existe no vetorr 
			System.out.println("Elemento existe no vetor");
		}else{
			//se for falso, printamos que o elemento não existe no vetor 
			System.out.println("Elemento não existe");
		}
		
	}

}
