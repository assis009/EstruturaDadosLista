package controller;

public class Lista<T> {// criando uma classe generica que pode receber qualquer
						// tipo
	private T[] elementos;
	private static int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	// metodo retornando um boleano
	public boolean adiciona(T elemento) {
		aumentaCapacidade();

		int capacidade = this.elementos.length;
		if (tamanho < capacidade) {
			this.elementos[this.tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}

	// metodo adiciona verificando se a posição que o elemento será adicionadp é
	// valido
	public boolean adiciona(int posicao, T elemento) {

		aumentaCapacidade();

		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posção invalida!");
		}

		// B C D E F G = elementos do vetor
		// 0 1 2 3 4 5 + +

		// movendo os elementos
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		// adicionando o elemento a posição desejada
		this.elementos[posicao] = elemento;
		tamanho++;
		return true;

	}

	// retorna o tamanho real do vetor
	public int tamanho() {
		return this.tamanho;
	}

	// retorna todos os elementos do vetor
	public String toString() {
		StringBuilder s = new StringBuilder();

		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");
		return s.toString();
	}
	
	public T obetem(int posicao){
		return busca(posicao);
	}

	// busca um elemento pelo indice e retorna o elemento 
	public T busca(int posicao) {

		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posção invalida!");
		}
		return this.elementos[posicao];
	}
	
	// busca um elemento no vetor e retorna sua posição
	public int busca(T elemento) {

		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;

	}
	
	// retorna o ultimo indice do elemento
	public int ultimoIndice(T elemento) {
		int ultimo=-1;
		for (int i = this.tamanho-1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return ultimo = i;
			}
		}
		return ultimo;

	}

	// metodo busca retornando um booelano
	public boolean contem(T elemento) {

		int contem = busca(elemento);
		if (contem > -1) {
			return true;
		} else {
			return false;
		}

	}

	// metodo que aumenta a capacidade do vetor
	private void aumentaCapacidade() {

		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.tamanho; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}

	}

	// metodo remove
	public void remove(int posicao) {

		// verifica se a posição é valida
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posção invalida!");
		}

		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}

		this.tamanho--;
	}
	
	public void remove(T elemento){
		
		int posicao = busca(elemento);//verifica se o elemento existe, se sim pega seu indice 
		if(posicao>-1){
			remove(posicao);
			System.out.println("Elemento removido com sucesso");
			
		}
		
	}
	
	public void limpar(){
		
//		//opção 1 
//		this.elementos = (T[]) new Object [this.elementos.length];
//		this.tamanho=0;
//		
//		//opção 2 
//		this.tamanho = 0;
//		 
//		//opção 3 
		for(int i=0; i<this.tamanho; i++){
			
			this.elementos[i] = null;
		}
		this.tamanho =0;
	}
}
