package controller;

import java.util.Arrays;

public class Vetor {
	private String [] elementos;
	private static int tamanho;
	public Vetor(int capacidade ) {
		this.elementos = new String [capacidade];
		this.tamanho=0;
	}
	
//	public void adiciona (String elemento){
//		
//		 int tamanho = this.elementos.length;
//		 
//		 for(int i=0; i<tamanho;i++){
//			 
//			 if(this.elementos[i]== null){
//				 this.elementos[i]= elemento;
//				 break;
//			 }
//		 }
//	}
	
//	metodo retornando exception
//	public void adiciona (String elemento) throws Exception{
//		int capacidade = this.elementos.length;
//		if(tamanho < capacidade){
//		this.elementos[this.tamanho]= elemento;
//		tamanho++;
//		}else{
//			throw new Exception (" Vetor já está cheio");
//		}
//	}
	
	//metodo retornando um boleano 
	public boolean adiciona (String elemento) {
		aumentaCapacidade();
		
		int capacidade = this.elementos.length;
		if(tamanho < capacidade){
		this.elementos[this.tamanho]= elemento;
		tamanho++;
		return true;
		}
		return false;
	}
	
	//metodo adiciona verificando se a posição que o elemento será adicionadp é valido 
	public boolean adiciona (int posicao, String elemento) {
		
		aumentaCapacidade();
		
		if(!(posicao>=0 && posicao<this.tamanho)){
			throw new IllegalArgumentException("Posção invalida!");
		}
		
		//B C D E F G  = elementos do vetor 
		//0 1 2 3 4 5 + + 
		
		//movendo os elementos 
		for(int i=this.tamanho-1;i>=posicao; i--){
			this.elementos[i+1]= this.elementos[i];
		}
		//adicionando o elemento a posição desejada 
		this.elementos[posicao]= elemento;
		tamanho++;
		return true;
		
	}
	
	//retorna o tamanho real do vetor 
	public int tamanho(){
		return this.tamanho;
	}
	
	
	//retorna todos os elementos do vetor 
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		
		for(int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
	if(this.tamanho>0){
		s.append( this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		return s.toString();
	}
	
	// busca um elemento no vetor e retorna sua posição 
	public String busca(int posicao) {
		
		if(!(posicao>=0 && posicao<this.tamanho)){
			throw new IllegalArgumentException("Posção invalida!");
		}
		return this.elementos[posicao];
	}
	
	public int busca(String elemento){
		
		for(int i=0; i<this.tamanho; i++){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
		
		
	}
	
	//metodo que aumenta a capacidade do vetor 
	private void aumentaCapacidade(){
		
		if(this.tamanho== this.elementos.length){
			String[] elementosNovos = new String [this.elementos.length * 2];
			for(int i =0; i<this.tamanho;i++){
				elementosNovos[i] = this.elementos[i];
			}	
			this.elementos = elementosNovos;
		}
		
	}
	
	//metodo remove 
	public void remove(int posicao){
		
		//verifica se a posição é valida 
		if(!(posicao>=0 && posicao<this.tamanho)){
			throw new IllegalArgumentException("Posção invalida!");
		}
		
		for( int i = posicao; i<this.tamanho-1; i++){
			this.elementos[i]=this.elementos[i+1];
		}
		
		this.tamanho--;
		}
	
}
