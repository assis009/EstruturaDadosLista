package view;

import controller.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		int i;
		Vetor vetor = new Vetor(3);

		System.out.println(vetor.tamanho());
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");

		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		//busca o elemento H no vetor e pega o seu indice
		int pos = vetor.busca("H");
		
		//verifica se o indice � maior que -1, pois n�o existe indice negativo no vetor 
		//se for -1 o elemento n�o existe 
		if(pos>-1){
			//se for maior, removemos o elemento com a sua posi��o no vetor 
			vetor.remove(pos);
		}else{
			//se for falso, printamos que o elemento n�o existe 
			System.out.println("Elemento n�o existe");
		}
		
		//printa o vetor para verificarr se foi removido algo do vetor 
		System.out.println(vetor);
		
		

	}

}
