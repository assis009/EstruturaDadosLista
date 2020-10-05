package controller;

public class VetorObjetos {
	private Object [] elementos;
	private static int tamanho;
	public VetorObjetos(int capacidade ) {
		this.elementos = new Object [capacidade];
		this.tamanho=0;
	}
	
	//metodo retornando um boleano 
	public boolean adiciona (Object elemento) {
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
	public boolean adiciona (int posicao, Object elemento) {
		
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
	public Object busca(int posicao) {
		
		if(!(posicao>=0 && posicao<this.tamanho)){
			throw new IllegalArgumentException("Posção invalida!");
		}
		return this.elementos[posicao];
	}
	
	public int busca(Object elemento){
		
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
			Object[] elementosNovos = new Object [this.elementos.length * 2];
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
